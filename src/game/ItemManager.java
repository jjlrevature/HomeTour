package game;



import fixtures.Item;

public class ItemManager {
	Item[] allItems = new Item[4];
	
	
	
	public void initItems() {
		Item ghost = new Item("","","",0);
		Item goldenFish = new Item("                  The Golden Fish", "A fish made of pure gold,"
				+ " what a wonder this is! seems magical..",
				"*****You have acuired THE GOLDEN FISH******",0);
		Item meatyFish = new Item("                  Meaty Fish", "Looks tasty, would make for a good meal",
				"*****You have acquired a Meaty Fish!******",1);
		Item gryphonHeadKey = new Item("               Gryphon Head Key", "A key with the hilt of a gryphons head",
				"*****You have acquired the Gryphon Head Key******", 2);
		
		this.allItems[0] = ghost;
		this.allItems[1] = goldenFish;
		this.allItems[2] = meatyFish;
		this.allItems[3] = gryphonHeadKey;
		
		
	}
	
	
}
