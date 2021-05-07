package ca.tweetzy.markets.settings;

import ca.tweetzy.core.compatibility.XMaterial;
import ca.tweetzy.core.configuration.Config;
import ca.tweetzy.core.configuration.ConfigSetting;
import ca.tweetzy.markets.Markets;

import java.util.Arrays;
import java.util.Collections;

/**
 * The current file has been created by Kiran Hart
 * Date Created: April 30 2021
 * Time Created: 3:30 p.m.
 * Usage of any code found within this class is prohibited unless given explicit permission otherwise
 */
public class Settings {

    static final Config config = Markets.getInstance().getCoreConfig();

    public static final ConfigSetting LANG = new ConfigSetting(config, "lang", "en_US", "Default language file");

    public static final ConfigSetting GIVE_ITEMS_ON_CATEGORY_DELETE = new ConfigSetting(config, "setting.give back items on category delete", true, "Should Markets give the player all their items from the category", "back when they click the delete button?");
    public static final ConfigSetting GIVE_ITEMS_ON_MARKET_DELETE = new ConfigSetting(config, "setting.give back items on market delete", true, "Should markets give the player all their items in all categories", "when they decide to delete their market?");
    public static final ConfigSetting LOG_TRANSACTIONS = new ConfigSetting(config, "setting.log transactions", true, "Should transactions be logged?");
    public static final ConfigSetting MAX_REQUEST_AMOUNT = new ConfigSetting(config, "setting.max amount per request", 256, "How many items can a player request per request creation?");

    public static final ConfigSetting INCREMENT_NUMBER_ONE = new ConfigSetting(config, "setting.increment one", 1, "How much should the item qty be increased by (btn 1)");
    public static final ConfigSetting INCREMENT_NUMBER_TWO = new ConfigSetting(config, "setting.increment two", 5, "How much should the item qty be increased by (btn 2)");
    public static final ConfigSetting DECREMENT_NUMBER_ONE = new ConfigSetting(config, "setting.decrement one", 1, "How much should the item qty be decreased by (btn 1)");
    public static final ConfigSetting DECREMENT_NUMBER_TWO = new ConfigSetting(config, "setting.decrement two", 5, "How much should the item qty be decreased by (btn 2)");

    /*
    =========== GLOBAL BUTTONS FOR GUIS ===========
    */
    public static final ConfigSetting GUI_BACK_BTN_ITEM = new ConfigSetting(config, "guis.global items.back button.item", "ARROW", "Settings for the back button");
    public static final ConfigSetting GUI_BACK_BTN_NAME = new ConfigSetting(config, "guis.global items.back button.name", "&e<< Back");
    public static final ConfigSetting GUI_BACK_BTN_LORE = new ConfigSetting(config, "guis.global items.back button.lore", Arrays.asList("&7Click the button to go", "&7back to the previous page."));

    public static final ConfigSetting GUI_CLOSE_BTN_ITEM = new ConfigSetting(config, "guis.global items.close button.item", "BARRIER", "Settings for the close button");
    public static final ConfigSetting GUI_CLOSE_BTN_NAME = new ConfigSetting(config, "guis.global items.close button.name", "&cClose");
    public static final ConfigSetting GUI_CLOSE_BTN_LORE = new ConfigSetting(config, "guis.global items.close button.lore", Collections.singletonList("&7Click to close this menu."));

    public static final ConfigSetting GUI_NEXT_BTN_ITEM = new ConfigSetting(config, "guis.global items.next button.item", "ARROW", "Settings for the next button");
    public static final ConfigSetting GUI_NEXT_BTN_NAME = new ConfigSetting(config, "guis.global items.next button.name", "&eNext >>");
    public static final ConfigSetting GUI_NEXT_BTN_LORE = new ConfigSetting(config, "guis.global items.next button.lore", Arrays.asList("&7Click the button to go", "&7to the next page."));

    public static final ConfigSetting GUI_MAIN_TITLE = new ConfigSetting(config, "guis.main.title", "&eMarkets");
    public static final ConfigSetting GUI_MAIN_USE_BORDER = new ConfigSetting(config, "guis.main.use border", true);
    public static final ConfigSetting GUI_MAIN_FILL_SLOTS = new ConfigSetting(config, "guis.main.fill slots", true);
    public static final ConfigSetting GUI_MAIN_GLOW_BORDER = new ConfigSetting(config, "guis.main.glow border", true);
    public static final ConfigSetting GUI_MAIN_FILL_ITEM = new ConfigSetting(config, "guis.main.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_MAIN_BORDER_ITEM = new ConfigSetting(config, "guis.main.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());

    public static final ConfigSetting GUI_MAIN_ITEMS_ALL_MARKETS_ITEM_USE_CUSTOM_HEAD = new ConfigSetting(config, "guis.main.items.all markets.item.use custom head", true);
    public static final ConfigSetting GUI_MAIN_ITEMS_ALL_MARKETS_ITEM_CUSTOM_HEAD_LINK = new ConfigSetting(config, "guis.main.items.all markets.item.custom head link", "1de9a8e5e6303cec956e37321ca0f7f7f9738211b8f570c3e76c929df5da18");
    public static final ConfigSetting GUI_MAIN_ITEMS_ALL_MARKETS_ITEM = new ConfigSetting(config, "guis.main.items.all markets.item.item", XMaterial.NETHER_STAR.name());
    public static final ConfigSetting GUI_MAIN_ITEMS_ALL_MARKETS_NAME = new ConfigSetting(config, "guis.main.items.all markets.name", "&eView all player markets");
    public static final ConfigSetting GUI_MAIN_ITEMS_ALL_MARKETS_LORE = new ConfigSetting(config, "guis.main.items.all markets.lore", Arrays.asList(
            "&7Click to view the markets of",
            "&7player's who have one."
    ));

    public static final ConfigSetting GUI_MAIN_ITEMS_YOUR_MARKET_NAME = new ConfigSetting(config, "guis.main.items.your market.name", "&eView your market");
    public static final ConfigSetting GUI_MAIN_ITEMS_YOUR_MARKET_LORE = new ConfigSetting(config, "guis.main.items.your market.lore", Arrays.asList(
            "&7Click to edit or view information",
            "&7about your market if you have one."
    ));

    public static final ConfigSetting GUI_MAIN_ITEMS_TRANSACTIONS_ITEM = new ConfigSetting(config, "guis.main.items.transactions.item", XMaterial.PAPER.name());
    public static final ConfigSetting GUI_MAIN_ITEMS_TRANSACTIONS_NAME = new ConfigSetting(config, "guis.main.items.transactions.name", "&eTransaction History");
    public static final ConfigSetting GUI_MAIN_ITEMS_TRANSACTIONS_LORE = new ConfigSetting(config, "guis.main.items.transactions.lore", Arrays.asList(
            "&7Click to view the transaction history",
            "&7for items you bought or sold."
    ));

    public static final ConfigSetting GUI_MAIN_ITEMS_REQUESTS_ITEM = new ConfigSetting(config, "guis.main.items.requests.item", XMaterial.CHEST_MINECART.name());
    public static final ConfigSetting GUI_MAIN_ITEMS_REQUESTS_NAME = new ConfigSetting(config, "guis.main.items.requests.name", "&eYour Requests");
    public static final ConfigSetting GUI_MAIN_ITEMS_REQUESTS_LORE = new ConfigSetting(config, "guis.main.items.requests.lore", Arrays.asList(
            "&7Click to view any item requests",
            "&7that you have made."
    ));

    public static final ConfigSetting GUI_MAIN_ITEMS_CHEST_SHOPS_ITEM = new ConfigSetting(config, "guis.main.items.chest shop.item", XMaterial.CHEST.name());
    public static final ConfigSetting GUI_MAIN_ITEMS_CHEST_SHOPS_NAME = new ConfigSetting(config, "guis.main.items.chest shop.name", "&eChest Shops");
    public static final ConfigSetting GUI_MAIN_ITEMS_CHEST_SHOPS_LORE = new ConfigSetting(config, "guis.main.items.chest shop.lore", Arrays.asList(
            "&7Click to view any chest shops",
            "&7you made that are currently active."
    ));

    /*
    ==================================
            MARKET EDIT GUI
    ==================================
     */

    public static final ConfigSetting GUI_MARKET_EDIT_TITLE = new ConfigSetting(config, "guis.market edit.title", "&eEditing your market");
    public static final ConfigSetting GUI_MARKET_EDIT_GLOW_BORDER = new ConfigSetting(config, "guis.market edit.glow border", true);
    public static final ConfigSetting GUI_MARKET_EDIT_FILL_ITEM = new ConfigSetting(config, "guis.market edit.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_MARKET_EDIT_BORDER_ITEM = new ConfigSetting(config, "guis.market edit.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());

    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_NAME_ITEM = new ConfigSetting(config, "guis.market edit.items.edit name.item", XMaterial.PAPER.name());
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_NAME_NAME = new ConfigSetting(config, "guis.market edit.items.edit name.name", "&eDisplay Name");
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_NAME_LORE = new ConfigSetting(config, "guis.market edit.items.edit name.lore", Arrays.asList(
            "&7Current name&F: %market_name%",
            "&7Click to change your market name."
    ));

    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_OPEN_ENABLE_ITEM = new ConfigSetting(config, "guis.market edit.items.open enabled.item", XMaterial.LIME_DYE.name());
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_OPEN_ENABLE_NAME = new ConfigSetting(config, "guis.market edit.items.open enabled.name", "&aMarket Open");
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_OPEN_ENABLE_LORE = new ConfigSetting(config, "guis.market edit.items.open enabled.lore", Collections.singletonList("&7Click to &cclose &7market"));

    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_OPEN_DISABLE_ITEM = new ConfigSetting(config, "guis.market edit.items.open disabled.item", XMaterial.RED_DYE.name());
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_OPEN_DISABLE_NAME = new ConfigSetting(config, "guis.market edit.items.open disabled.name", "&cMarket Closed");
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_OPEN_DISABLE_LORE = new ConfigSetting(config, "guis.market edit.items.open disabled.lore", Collections.singletonList("&7Click to &aOpen &7market"));

    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_ADD_CATEGORY_ITEM = new ConfigSetting(config, "guis.market edit.items.add category.item", XMaterial.NETHER_STAR.name());
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_ADD_CATEGORY_NAME = new ConfigSetting(config, "guis.market edit.items.add category.name", "&eNew Category");
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_ADD_CATEGORY_LORE = new ConfigSetting(config, "guis.market edit.items.add category.lore", Arrays.asList(
            "&7Click to add a new category",
            "&7to your market."
    ));

    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_ALL_ITEMS_ITEM = new ConfigSetting(config, "guis.market edit.items.all items.item", XMaterial.CHEST.name());
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_ALL_ITEMS_NAME = new ConfigSetting(config, "guis.market edit.items.all items.name", "&eView All Items");
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_ALL_ITEMS_LORE = new ConfigSetting(config, "guis.market edit.items.all items.lore", Collections.singletonList("&7Click to view all your market items."));

    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_DELETE_MARKET_ITEM = new ConfigSetting(config, "guis.market edit.items.delete market.item", XMaterial.FIRE_CHARGE.name());
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_DELETE_MARKET_NAME = new ConfigSetting(config, "guis.market edit.items.delete market.name", "&4Delete Market");
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_DELETE_MARKET_LORE = new ConfigSetting(config, "guis.market edit.items.delete market.lore", Arrays.asList(
            "&cClick to delete your market,",
            "&cthis action &c&lCANNOT &cbe undone!"
    ));

    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_CATEGORY_NAME = new ConfigSetting(config, "guis.market edit.items.category.name", "%category_display_name%");
    public static final ConfigSetting GUI_MARKET_EDIT_ITEMS_CATEGORY_LORE = new ConfigSetting(config, "guis.market edit.items.category.lore", Collections.singletonList("&7Click to edit this category"));

    /*
    ==================================
          CATEGORY SETTINGS GUI
    ==================================
     */
    public static final ConfigSetting GUI_CATEGORY_EDIT_TITLE = new ConfigSetting(config, "guis.category edit.title", "&eYour Market > %category_name%");
    public static final ConfigSetting GUI_CATEGORY_EDIT_GLOW_BORDER = new ConfigSetting(config, "guis.category edit.glow border", true);
    public static final ConfigSetting GUI_CATEGORY_EDIT_FILL_ITEM = new ConfigSetting(config, "guis.category edit.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_CATEGORY_EDIT_BORDER_ITEM = new ConfigSetting(config, "guis.category edit.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());

    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_NAME_ITEM = new ConfigSetting(config, "guis.category edit.items.edit name.item", XMaterial.PAPER.name());
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_NAME_NAME = new ConfigSetting(config, "guis.category edit.items.edit name.name", "&eDisplay Name");
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_NAME_LORE = new ConfigSetting(config, "guis.category edit.items.edit name.lore", Arrays.asList(
            "&7Current name&F: %category_display_name%",
            "&7Click to change this category's display name."
    ));

    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_DESCRIPTION_ITEM = new ConfigSetting(config, "guis.category edit.items.edit description.item", XMaterial.WRITABLE_BOOK.name());
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_DESCRIPTION_NAME = new ConfigSetting(config, "guis.category edit.items.edit description.name", "&eDescription");
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_DESCRIPTION_LORE = new ConfigSetting(config, "guis.category edit.items.edit description.lore", Arrays.asList(
            "&7Current Description&F:",
            "%category_description%",
            "&7Click to change this category's description."
    ));

    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_ICON_NAME = new ConfigSetting(config, "guis.category edit.items.edit icon.name", "&eIcon");
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_ICON_LORE = new ConfigSetting(config, "guis.category edit.items.edit icon.lore", Collections.singletonList(
            "&7Click to change this category's icon"
    ));

    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_EMPTY_ITEM = new ConfigSetting(config, "guis.category edit.items.empty.item", XMaterial.HOPPER.name());
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_EMPTY_NAME = new ConfigSetting(config, "guis.category edit.items.empty.name", "&eEmpty Items");
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_EMPTY_LORE = new ConfigSetting(config, "guis.category edit.items.empty.lore", Collections.singletonList("&7Click to empty all items from this category"));

    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_DELETE_ITEM = new ConfigSetting(config, "guis.category edit.items.delete.item", XMaterial.FIRE_CHARGE.name());
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_DELETE_NAME = new ConfigSetting(config, "guis.category edit.items.delete.name", "&4Delete Category");
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_DELETE_LORE = new ConfigSetting(config, "guis.category edit.items.delete.lore", Arrays.asList(
            "&cClick to delete this category,",
            "&cthis action &c&lCANNOT &cbe undone!"
    ));

    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_ITEM_NAME = new ConfigSetting(config, "guis.category edit.items.market item.name", "&e%item_name%");
    public static final ConfigSetting GUI_CATEGORY_EDIT_ITEMS_ITEM_LORE = new ConfigSetting(config, "guis.category edit.items.market item.lore", Arrays.asList(
            "&7Price&f: &a$%market_item_price%",
            "&7Price is for stack&f: &e%market_item_price_for_stack%",
            "",
            "&7Left-Click to edit price",
            "&7Middle-Click to remove item from market",
            "&7Right-Click to toggle price per stack"
    ));

    /*
   ==================================
        ALL ITEMS VIEW GUI
   ==================================
    */
    public static final ConfigSetting GUI_ALL_ITEMS_TITLE = new ConfigSetting(config, "guis.all items.title", "&e%market_name%&f > All Items");
    public static final ConfigSetting GUI_ALL_ITEMS_TITLE_EDIT = new ConfigSetting(config, "guis.all items.title edit", "&eYour Market > All Items");
    public static final ConfigSetting GUI_ALL_ITEMS_GLOW_BORDER = new ConfigSetting(config, "guis.all items.glow border", true);
    public static final ConfigSetting GUI_ALL_ITEMS_FILL_ITEM = new ConfigSetting(config, "guis.all items.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_ALL_ITEMS_BORDER_ITEM = new ConfigSetting(config, "guis.all items.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_ALL_ITEMS_ITEMS_ITEM_NAME = new ConfigSetting(config, "guis.all items.items.market item.name", "&e%item_name%");
    public static final ConfigSetting GUI_ALL_ITEMS_ITEMS_ITEM_EDIT_LORE = new ConfigSetting(config, "guis.all items.items.market item.edit lore", Arrays.asList(
            "&7Price&f: &a$%market_item_price%",
            "&7Price is for stack&f: &e%market_item_price_for_stack%",
            "",
            "&7Left-Click to edit price",
            "&7Middle-Click to remove item from market",
            "&7Right-Click to toggle price per stack"
    ));

    public static final ConfigSetting GUI_ALL_ITEMS_ITEMS_ITEM_LORE = new ConfigSetting(config, "guis.all items.items.market item.lore", Arrays.asList(
            "&7Price&f: &a$%market_item_price%",
            "&7Price is for stack&f: &e%market_item_price_for_stack%",
            "",
            "&7Click to purchase this item."
    ));

    /*
   ==================================
           MARKET VIEW GUI
   ==================================
    */
    public static final ConfigSetting GUI_MARKET_VIEW_TITLE = new ConfigSetting(config, "guis.market view.title", "&e%market_name%");
    public static final ConfigSetting GUI_MARKET_VIEW_GLOW_BORDER = new ConfigSetting(config, "guis.market view.glow border", true);
    public static final ConfigSetting GUI_MARKET_VIEW_FILL_ITEM = new ConfigSetting(config, "guis.market view.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_MARKET_VIEW_BORDER_ITEM = new ConfigSetting(config, "guis.market view.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_MARKET_VIEW_ITEMS_ALL_ITEMS_ITEM = new ConfigSetting(config, "guis.market view.items.all items.item", XMaterial.CHEST.name());
    public static final ConfigSetting GUI_MARKET_VIEW_ITEMS_ALL_ITEMS_NAME = new ConfigSetting(config, "guis.market view.items.all items.name", "&eAll Items");
    public static final ConfigSetting GUI_MARKET_VIEW_ITEMS_ALL_ITEMS_LORE = new ConfigSetting(config, "guis.market view.items.all items.lore", Collections.singletonList("&7Click to view all items."));
    public static final ConfigSetting GUI_MARKET_VIEW_ITEMS_ALL_CATEGORY_NAME = new ConfigSetting(config, "guis.market view.items.category.name", "&e%category_display_name%");
    public static final ConfigSetting GUI_MARKET_VIEW_ITEMS_ALL_CATEGORY_LORE = new ConfigSetting(config, "guis.market view.items.category.lore", Arrays.asList(
            "%category_description%",
            "",
            "&7Click to view items this in category"
    ));

    public static final ConfigSetting GUI_MARKET_LIST_TITLE = new ConfigSetting(config, "guis.market list.title", "&eOpen Markets");
    public static final ConfigSetting GUI_MARKET_LIST_GLOW_BORDER = new ConfigSetting(config, "guis.market list.glow border", true);
    public static final ConfigSetting GUI_MARKET_LIST_FILL_ITEM = new ConfigSetting(config, "guis.market list.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_MARKET_LIST_BORDER_ITEM = new ConfigSetting(config, "guis.market list.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_MARKET_LIST_MARKET_NAME = new ConfigSetting(config, "guis.market list.market name", "%market_name%");
    public static final ConfigSetting GUI_MARKET_LIST_MARKET_LORE = new ConfigSetting(config, "guis.market list.market lore", Arrays.asList(
            "%market_description%",
            "&7Owner&f: &e%market_owner%",
            "",
            "&7Click to view this market"
    ));

    /*
    ==================================
           MARKET VIEW GUI
    ==================================
    */
    public static final ConfigSetting GUI_MARKET_CATEGORY_TITLE = new ConfigSetting(config, "guis.market category.title", "&e%market_name% > %category_display_name%");
    public static final ConfigSetting GUI_MARKET_CATEGORY_GLOW_BORDER = new ConfigSetting(config, "guis.market category.glow border", true);
    public static final ConfigSetting GUI_MARKET_CATEGORY_FILL_ITEM = new ConfigSetting(config, "guis.market category.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_MARKET_CATEGORY_BORDER_ITEM = new ConfigSetting(config, "guis.market category.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_MARKET_CATEGORY_ITEM_NAME = new ConfigSetting(config, "guis.market category.item name", "%item_name%");
    public static final ConfigSetting GUI_MARKET_CATEGORY_ITEM_LORE = new ConfigSetting(config, "guis.market category.item lore", Arrays.asList(
            "&7Price&f: &a$%market_item_price%",
            "&7Price is for stack&f: &e%market_item_price_for_stack%",
            "",
            "&7Click to purchase this item."
    ));

    /*
    ==================================
           ITEM PRE PURCHASE GUI
    ==================================
    */
    public static final ConfigSetting GUI_ITEM_PURCHASE_TITLE = new ConfigSetting(config, "guis.item purchase.title", "&ePurchasing Item");
    public static final ConfigSetting GUI_ITEM_PURCHASE_GLOW_BORDER = new ConfigSetting(config, "guis.item purchase.glow border", true);
    public static final ConfigSetting GUI_ITEM_PURCHASE_FILL_ITEM = new ConfigSetting(config, "guis.item purchase.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_ITEM_PURCHASE_BORDER_ITEM = new ConfigSetting(config, "guis.item purchase.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());

    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_INC_ITEM = new ConfigSetting(config, "guis.item purchase.items.increment.item", XMaterial.LIME_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_INC_NAME = new ConfigSetting(config, "guis.item purchase.items.increment.name", "&a+%increment_amount%");
    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_INC_LORE = new ConfigSetting(config, "guis.item purchase.items.increment.lore", Arrays.asList(
            "&7Click to increase the purchase",
            "&7quantity by &a+%increment_amount%"
    ));

    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_DECR_ITEM = new ConfigSetting(config, "guis.item purchase.items.decrement.item", XMaterial.RED_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_DECR_NAME = new ConfigSetting(config, "guis.item purchase.items.decrement.name", "&c-%decrement_amount%");
    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_DECR_LORE = new ConfigSetting(config, "guis.item purchase.items.decrement.lore", Arrays.asList(
            "&7Click to decrease the purchase",
            "&7quantity by &c-%decrement_amount%"
    ));

    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_PURCHASE_ITEM = new ConfigSetting(config, "guis.item purchase.items.purchase.item", XMaterial.SUNFLOWER.name());
    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_PURCHASE_NAME = new ConfigSetting(config, "guis.item purchase.items.purchase.name", "&ePurchase Information");
    public static final ConfigSetting GUI_ITEM_PURCHASE_ITEMS_PURCHASE_LORE = new ConfigSetting(config, "guis.item purchase.items.purchase.lore", Arrays.asList(
            "&7Quantity&f: &e%purchase_quantity%",
            "&7Stack Price&f: &a$%stack_price%",
            "&7Price is for stack&f: &a$%market_item_price_for_stack%",
            "&7Final Price&f: &a$%purchase_price%",
            "",
            "&7Click to make purchase."
    ));

    /*
    ==================================
           TRANSACTIONS GUI
    ==================================
    */
    public static final ConfigSetting GUI_TRANSACTIONS_TITLE = new ConfigSetting(config, "guis.transactions.title", "&eTransaction History");
    public static final ConfigSetting GUI_TRANSACTIONS_GLOW_BORDER = new ConfigSetting(config, "guis.transactions.glow border", true);
    public static final ConfigSetting GUI_TRANSACTIONS_FILL_ITEM = new ConfigSetting(config, "guis.transactions.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_TRANSACTIONS_BORDER_ITEM = new ConfigSetting(config, "guis.transactions.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_TRANSACTIONS_TRANSACTION_ITEM = new ConfigSetting(config, "guis.transactions.transaction item", XMaterial.PAPER.name());
    public static final ConfigSetting GUI_TRANSACTIONS_TRANSACTION_NAME = new ConfigSetting(config, "guis.transactions.transaction name", "&eTransaction");
    public static final ConfigSetting GUI_TRANSACTIONS_TRANSACTION_LORE = new ConfigSetting(config, "guis.transactions.transaction lore", Arrays.asList(
            "&7ID: &e%transaction_id%",
            "&7Buyer: &e%transaction_buyer%",
            "&7Market: &e%transaction_market%",
            "&7Price: &e%transaction_price%",
            "&7Date: &e%transaction_date%"
    ));

    /*
    ==================================
            OPEN REQUEST GUI
    ==================================
     */

    public static final ConfigSetting GUI_OPEN_REQUEST_TITLE = new ConfigSetting(config, "guis.open request.title", "&eYour Requests");
    public static final ConfigSetting GUI_OPEN_REQUEST_GLOW_BORDER = new ConfigSetting(config, "guis.open request.glow border", true);
    public static final ConfigSetting GUI_OPEN_REQUEST_FILL_ITEM = new ConfigSetting(config, "guis.open request.fill item", XMaterial.BLACK_STAINED_GLASS_PANE.name());
    public static final ConfigSetting GUI_OPEN_REQUEST_BORDER_ITEM = new ConfigSetting(config, "guis.open request.border item", XMaterial.ORANGE_STAINED_GLASS_PANE.name());

    public static final ConfigSetting GUI_OPEN_REQUEST_ITEMS_EMPTY_ITEM = new ConfigSetting(config, "guis.open request.items.empty.item", XMaterial.HOPPER.name());
    public static final ConfigSetting GUI_OPEN_REQUEST_ITEMS_EMPTY_NAME = new ConfigSetting(config, "guis.open request.items.empty.name", "&eCancel Requests");
    public static final ConfigSetting GUI_OPEN_REQUEST_ITEMS_EMPTY_LORE = new ConfigSetting(config, "guis.open request.items.empty.lore", Collections.singletonList("&7Click to cancel all open requests"));

    public static final ConfigSetting GUI_OPEN_REQUEST_ITEMS_COLLECTION_ITEM = new ConfigSetting(config, "guis.open request.items.collection.item", XMaterial.CHEST.name());
    public static final ConfigSetting GUI_OPEN_REQUEST_ITEMS_COLLECTION_NAME = new ConfigSetting(config, "guis.open request.items.collection.name", "&eRequest Collection");
    public static final ConfigSetting GUI_OPEN_REQUEST_ITEMS_COLLECTION_LORE = new ConfigSetting(config, "guis.open request.items.collection.lore", Collections.singletonList("&7Click to view fulfilled requests"));

    public static final ConfigSetting GUI_OPEN_REQUEST_ITEMS_REQUEST_NAME = new ConfigSetting(config, "guis.open request.items.request.name", "%request_item_name%");
    public static final ConfigSetting GUI_OPEN_REQUEST_ITEMS_REQUEST_LORE = new ConfigSetting(config, "guis.open request.items.request.lore", Arrays.asList(
            "",
            "&7-------------------------------",
            "&7Quantity&f: &e%request_amount%",
            "&7Price&f: &a$%request_price%",
            "",
            "&7Middle-Click to cancel request"
    ));


    public static void setup() {
        config.load();
        config.setAutoremove(true).setAutosave(true);
        config.saveChanges();
    }
}
