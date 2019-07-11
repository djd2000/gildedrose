package com.djd.gildedrose;

public class QualityStandardIncrease implements IQualityUpdate {

	@Override
	public int updateQuality(InventoryItem item) {
//		return quality < STANDARD_MAX_QUALITY ? ++quality : STANDARD_MAX_QUALITY;
		if (item.quality < STANDARD_MAX_QUALITY) {
			item.quality = item.quality + 1;
		} else {
			item.quality = STANDARD_MAX_QUALITY;
		}
		
		return 1;
	}

}
