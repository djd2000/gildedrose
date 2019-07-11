package com.djd.gildedrose;

public class QualityBackStagePassUpdate implements IQualityUpdate {

	@Override
	public int updateQuality(InventoryItem item) {

		if (item.sellIn > 10) {
			item.quality = item.quality - 1;
		} else if (item.sellIn >= 5) {
			item.quality = item.quality + 2;
		} else if (item.sellIn >= 0) {
			item.quality = item.quality + 3;
		} else {
			item.quality = MIN_QUALITY;
		}

		return 0;

	}

}
