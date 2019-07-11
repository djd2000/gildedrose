package com.djd.gildedrose;

class GildedRose {
	Item[] items;
	InventoryItem[] inventoryItems;

	public GildedRose(Item[] items) {
		this.items = items;

		inventoryItems = new InventoryItem[items.length];


	}

	public void updateQuality() {
		for (int i = 0; i < inventoryItems.length; i++) {

//			inventoryItems[i] = new InventoryItem(items[i].name,items[i].sellIn, items[i].quality);
//			
////			inventoryItems[i].quality = items[i].quality;
////
////			inventoryItems[i].sellIn = items[i].sellIn;
//
//			inventoryItems[i].updateQuality();
//
//			inventoryItems[i].updateSellin();
//
//			items[i].quality = inventoryItems[i].quality;
//
//			items[i].sellIn = inventoryItems[i].sellIn;

//			items[i].updateQuality();
//			
//			items[i].updateSellin();
//            if (!items[i].name.equals("Aged Brie")
//                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                if (items[i].quality > 0) {
//                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!items[i].name.equals("Aged Brie")) {
//                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
//                        if (items[i].quality > 0) {
//                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
		}
	}
}