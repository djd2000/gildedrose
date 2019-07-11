package com.djd.gildedrose;

/**
 *
 */
public class App {

	public static void main(String[] args) {

		InventoryItem inventoryItems[];

		InventoryItem standardItem = new StandardItem("+5 Dexterity Vest", 10, 20);
		InventoryItem agedBrieItem = new AgedBrieItem("Aged Brie", 2, 50);
		InventoryItem backStagePassItem = new BackStagePassItem("Backstage passes to a TAFKAL80ETC concert", 15, 20);

		
		System.out.println(standardItem.name + " " + standardItem.sellIn + " " + standardItem.quality);
		
		standardItem.performSellInUpdate();
		standardItem.performQualityUpdate();

		System.out.println(standardItem.name + " " + standardItem.sellIn + " " + standardItem.quality);

		inventoryItems = new InventoryItem[] { standardItem, agedBrieItem, backStagePassItem };
		updateItems(inventoryItems);
	}

	public static void updateItems(InventoryItem[] inventoryItems) {

		for (int i = 0; i < inventoryItems.length; i++) {
			System.out.println(i);
			System.out
					.println(inventoryItems[i].name + " " + inventoryItems[i].sellIn + " " + inventoryItems[i].quality);
			inventoryItems[1].performSellInUpdate();
			inventoryItems[i].performQualityUpdate();

			System.out
					.println(inventoryItems[i].name + " " + inventoryItems[i].sellIn + " " + inventoryItems[i].quality);
		}
	}
}
