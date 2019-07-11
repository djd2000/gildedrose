package com.djd.gildedrose;

public class SellInStandardDecrease implements ISellInUpdate {

	@Override
	public int updateSellIn(InventoryItem item) {
		item.sellIn = item.sellIn - 1;
		return item.sellIn;
	}

}
