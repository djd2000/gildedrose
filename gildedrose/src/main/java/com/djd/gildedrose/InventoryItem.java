package com.djd.gildedrose;

public abstract class InventoryItem extends Item {

	IQualityUpdate qualityUpdater;
	ISellInUpdate sellInUpdater;

	public InventoryItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void performQualityUpdate() {
//		quality = qualityUpdater.updateQuality(quality, sellIn);
		qualityUpdater.updateQuality(this);

	}

	public void performSellInUpdate() {
//		sellIn = 
		sellInUpdater.updateSellIn(this);

	}

}
