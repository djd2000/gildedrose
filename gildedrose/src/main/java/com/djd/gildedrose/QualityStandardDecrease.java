package com.djd.gildedrose;

public class QualityStandardDecrease implements IQualityUpdate {

	@Override
	public int updateQuality(InventoryItem item) {
		item.quality = item.quality - 1;
		return 1;
	}

}
