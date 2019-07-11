package com.djd.gildedrose;

public class AgedBrieItem extends InventoryItem {

	public AgedBrieItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		qualityUpdater = new QualityBackStagePassUpdate();
		sellInUpdater = new SellInStandardDecrease();
	}

}
