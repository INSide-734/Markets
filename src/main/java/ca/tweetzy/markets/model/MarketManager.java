package ca.tweetzy.markets.model;

import ca.tweetzy.markets.api.market.AbstractMarket;

public final class MarketManager extends ListManager<AbstractMarket> {

	public MarketManager() {
		super("Market");
	}

	@Override
	public void load() {
	}
}
