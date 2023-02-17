package ca.tweetzy.markets.commands;

import ca.tweetzy.flight.command.AllowedExecutor;
import ca.tweetzy.flight.command.Command;
import ca.tweetzy.flight.command.ReturnType;
import ca.tweetzy.flight.comp.enums.CompMaterial;
import ca.tweetzy.flight.settings.TranslationManager;
import ca.tweetzy.flight.utils.ItemUtil;
import ca.tweetzy.flight.utils.MathUtil;
import ca.tweetzy.flight.utils.PlayerUtil;
import ca.tweetzy.markets.Markets;
import ca.tweetzy.markets.api.market.core.Category;
import ca.tweetzy.markets.api.market.core.Market;
import ca.tweetzy.markets.api.market.core.MarketItem;
import ca.tweetzy.markets.gui.user.category.MarketCategoryEditGUI;
import ca.tweetzy.markets.impl.CategoryItem;
import ca.tweetzy.markets.model.FlagExtractor;
import ca.tweetzy.markets.settings.Settings;
import ca.tweetzy.markets.settings.Translations;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.stream.Collectors;

public final class CommandAdd extends Command {

	public CommandAdd() {
		super(AllowedExecutor.PLAYER, "add");
	}

	@Override
	protected ReturnType execute(CommandSender sender, String... args) {
		if (sender instanceof final Player player) {
			if (args.length < 2) return ReturnType.FAIL;

			final Market market = Markets.getMarketManager().getByOwner(player.getUniqueId());

			// no categories
			if (market.getCategories().isEmpty()) {
				tell(player, TranslationManager.string(player, Translations.NO_CATEGORIES));
				return ReturnType.FAIL;
			}

			if (Markets.getPlayerManager().isAtMarketItemLimit(player)) {
				tell(player, TranslationManager.string(player, Translations.AT_MAX_ITEM_LIMIT));
				return ReturnType.FAIL;
			}

			if (PlayerUtil.isHandEmpty(player)) {
				tell(player, TranslationManager.string(player, Translations.ITEM_IS_AIR));
				return ReturnType.FAIL;
			}

			final ItemStack toSell = PlayerUtil.getHand(player).clone();
			final Category category = Markets.getCategoryManager().getByName(market, args[0]);

			if (category == null) {
				tell(player, TranslationManager.string(player, Translations.INVALID_CATEGORY, "category_id", args[0]));
				return ReturnType.FAIL;
			}

			if (!MathUtil.isDouble(args[1])) {
				tell(player, TranslationManager.string(player, Translations.NOT_A_NUMBER, "value", args[1]));
				return ReturnType.FAIL;
			}

			final double price = Double.parseDouble(args[1]);
			final boolean noOffers = FlagExtractor.extract(args).containsKey("-nooffers");
			final boolean wholesale = FlagExtractor.extract(args).containsKey("-wholesale");

			final MarketItem marketItem = new CategoryItem(category.getId());
			marketItem.setPrice(price);
			marketItem.setItem(toSell);
			marketItem.setStock(toSell.getAmount());
			marketItem.setPriceIsForAll(wholesale);

			if (noOffers)
				marketItem.setIsAcceptingOffers(false);

			Markets.getCategoryItemManager().create(category, marketItem.getItem(), marketItem.getCurrency(), marketItem.getCurrencyItem(), marketItem.getPrice(), marketItem.isPriceForAll(), marketItem.isAcceptingOffers(), created -> {
				if (created) {
					player.getInventory().setItemInMainHand(CompMaterial.AIR.parseItem());

					tell(player, TranslationManager.string(player, Translations.MARKET_ITEM_ADDED_TO_CATEGORY, "item_quantity", marketItem.getStock(), "item_name", ItemUtil.getStackName(toSell), "category_display_name", category.getDisplayName()));

					if (Settings.OPEN_CATEGORY_SETTINGS_AFTER_ITEM_ADD.getBoolean())
						Markets.getGuiManager().showGUI(player, new MarketCategoryEditGUI(player, market, category));
				}
			});


		}
		return ReturnType.SUCCESS;
	}

	@Override
	protected List<String> tab(CommandSender sender, String... args) {
		final Player player = (Player) sender;
		final Market market = Markets.getMarketManager().getByOwner(player.getUniqueId());

		if (market == null) return null;
		if (market.getCategories().isEmpty()) return null;

		if (args.length == 1)
			return market.getCategories().stream().map(Category::getName).collect(Collectors.toList());

		if (args.length == 2)
			return List.of("1.00", "5.00", "10.00", "15.00", "20.00");

		if (args.length > 2)
			return List.of("-wholesale", "-nooffers");

		return null;
	}

	@Override
	public String getPermissionNode() {
		return "markets.command.add";
	}

	@Override
	public String getSyntax() {
		return "add <category> <price> [-wholesale, -nooffers]";
	}

	@Override
	public String getDescription() {
		return "Adds a new item to your market";
	}
}
