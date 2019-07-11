package com.djd.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

//	@Before
//	private void setup() {
//		// TODO Auto-generated method stub
//        GildedRose app = new GildedRose(items);
//	}
	Item backStagePass = new Item("Backstage passes to a TAFKAL80ETC concert", 12, 20);
	Item agedBrie = new Item("Aged Brie", 2, 0); //
	Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 80); //
	Item conjured = new Item("Conjured Mana Cake", 3, 6);
	Item standardItem = new Item("+5 Dexterity Vest", 10, 20); //

	@Test
	public void foo() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("foo", app.items[0].name);
	}

	@Test
	public void standardItemQualAndSellInDailyDecrease() {
		GildedRose app = instiantiateGuildedRoseApp(standardItem);
		ageItems(app, 2);
		assertEquals(18, app.items[0].quality);
		assertEquals(8, app.items[0].sellIn);
	}

	@Test
	public void standardItemQualAndSellInDailyDecreaseNotNegative() {
		GildedRose app = instiantiateGuildedRoseApp(standardItem);
		ageItems(app, 15);
		assertEquals(0, app.items[0].quality);
		assertEquals(-5, app.items[0].sellIn);
	}

	@Test
	public void agedBrieShouldIncreaseInQualityDaily() {
		GildedRose app = instiantiateGuildedRoseApp(agedBrie);
		ageItems(app, 1);
		assertEquals(1, app.items[0].quality);
		assertEquals(1, app.items[0].sellIn);
	}

	@Test
	public void agedBrieShouldIncreaseInQualityDailyMaximum50() {
		GildedRose app = instiantiateGuildedRoseApp(agedBrie);
		ageItems(app, 60);
		assertEquals(50, app.items[0].quality);
		assertEquals(-58, app.items[0].sellIn);
	}

	@Test
	public void SulfurasShouldNotChangeInQuality() {
		GildedRose app = instiantiateGuildedRoseApp(sulfuras);
		ageItems(app, 10);
		assertEquals(80, app.items[0].quality);
		assertEquals(0, app.items[0].sellIn);
	}

	@Test
	public void backStagePassIncreaseInQualityGT10days() {
		GildedRose app = instiantiateGuildedRoseApp(backStagePass);
		ageItems(app, 1);
		assertEquals(11, app.items[0].sellIn);
		assertEquals(21, app.items[0].quality);
	}

	@Test
	public void backStagePassIncreaseInQuality5to10days() {
		GildedRose app = instiantiateGuildedRoseApp(backStagePass);
		ageItems(app, 3);
		assertEquals(9, app.items[0].sellIn);
		assertEquals(24, app.items[0].quality);
	}

	@Test
	public void backStagePassIncreaseInQuality3to5days() {
		GildedRose app = instiantiateGuildedRoseApp(backStagePass);
		ageItems(app, 9);
		assertEquals(3, app.items[0].sellIn);
		assertEquals(38, app.items[0].quality);
	}

	@Test
	public void backStagePassZeroQualityLessThanZerodays() {
		GildedRose app = instiantiateGuildedRoseApp(backStagePass);
		ageItems(app, 13);
		assertEquals(-1, app.items[0].sellIn);
		assertEquals(0, app.items[0].quality);
	}

	@Test
	public void AllItemsMultiDays() {
		Item[] items = new Item[] { backStagePass, agedBrie, sulfuras, standardItem };
		GildedRose app = new GildedRose(items);
		ageItems(app, 30);
		assertEquals(-18, app.items[0].sellIn);
		assertEquals(0, app.items[0].quality);
		assertEquals(-28, app.items[1].sellIn);
		assertEquals(50, app.items[1].quality);
		assertEquals(0, app.items[2].sellIn);
		assertEquals(80, app.items[2].quality);
		assertEquals(-20, app.items[3].sellIn);
		assertEquals(0, app.items[3].quality);
	}

	@Test
	public void conjuredItemsQualAndSellInDailyDecrease() {
		GildedRose app = instiantiateGuildedRoseApp(conjured);
		ageItems(app, 1);
		assertEquals(2, app.items[0].sellIn);
		assertEquals(4, app.items[0].quality);
	}

	Item[] items = new Item[] { backStagePass, agedBrie, sulfuras, standardItem };

	public GildedRose instiantiateGuildedRoseApp(Item item) {
		Item[] items = new Item[] { item };
		GildedRose app = new GildedRose(items);
		return app;
	}

	public void ageItems(GildedRose app, int daysInStock) {
		for (int timeElapsed = 0; timeElapsed < daysInStock; timeElapsed++) {
			app.updateQuality();
		}
	}

}
