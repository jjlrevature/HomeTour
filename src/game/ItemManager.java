package game;



import java.util.ArrayList;

import fixtures.Item;

public class ItemManager {
	Item[] allItems = new Item[7];
	
	
	
	public void initItems() {
		Item ghost = new Item("","","",0);
		Item goldenFish = new Item("                  The Golden Fish", "A fish made of pure gold,"
				+ " what a wonder this is! seems magical..",
				"******You have acuired THE GOLDEN FISH******",0);
		Item meatyFish = new Item("                  Meaty Fish", "Looks tasty, would make for a good meal",
				"******You have acquired a Meaty Fish!******",1);
		Item gryphonHeadKey = new Item("               Gryphon Head Key", "A key with the hilt of a gryphons head",
				"******You have acquired the Gryphon Head Key******", 2);
		Item mythriteOre = new Item("              Mythrite Ore", "an ore used for crafting", 
				"******You have acquired Mythrite Ore******", 3);
		Item standardFlux = new Item("              Standard Flux","an item used for crafting",
				"******You have acquired Standard Flux******", 4);
		Item mythriteSword = new Item("              Mythrite Sword", "A finely crafted sword",
				"******You have crafted Mythrite Sword******", 5);
		
		this.allItems[0] = ghost;
		this.allItems[1] = goldenFish;
		this.allItems[2] = meatyFish;
		this.allItems[3] = gryphonHeadKey;
		this.allItems[4] = mythriteOre;
		this.allItems[5] = standardFlux;
		this.allItems[6] = mythriteSword;
		
		
	}
	
}
