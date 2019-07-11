package com.djd.gildedrose;

public class StandardItem extends InventoryItem {

	public StandardItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		qualityUpdater = new QualityStandardDecrease();
		sellInUpdater = new SellInStandardDecrease();
	}

}
