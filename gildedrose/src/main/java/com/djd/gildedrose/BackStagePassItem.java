package com.djd.gildedrose;

public class BackStagePassItem extends InventoryItem {

	public BackStagePassItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		qualityUpdater = new QualityBackStagePassUpdate();
		sellInUpdater = new SellInStandardDecrease();
	}

}
