package com.djd.gildedrose;

public class DoubleQualityDecrease implements IQualityUpdate {

	@Override
	public int updateQuality(InventoryItem item) {
		item.quality = item.quality - 2;
		return 2;
	}

}
