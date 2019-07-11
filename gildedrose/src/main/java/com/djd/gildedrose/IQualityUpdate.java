package com.djd.gildedrose;

public interface IQualityUpdate {
	
	public final int MIN_QUALITY = 0;
	public final int STANDARD_MAX_QUALITY = 50;

//	public int updateQuality(int quality);
	
//	public int updateQuality(int quality, int sellIn);
	public int updateQuality(InventoryItem inventoryItem);

}
