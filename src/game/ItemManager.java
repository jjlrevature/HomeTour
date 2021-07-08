package game;



import fixtures.Item;

public class ItemManager {
	Item[] allItems = new Item[3];
	
	
	
	
	public void initItems() {
		Item ghost = new Item("","","",0);
		Item goldenFish = new Item("The Golden Fish", "A fish made of pure gold, what a wonder this is! seems magical..", "",0);
		Item meatyFish = new Item("Meaty Fish", "Looks tasty, would make for a good meal", "",1);
		
		goldenFish.setName("               The Golden Fish");
		goldenFish.setShortDesc("A fish made of pure gold, what a wonder this is! seems magical..");
		
		meatyFish.setName("            Meaty Fish\n");
		meatyFish.setShortDesc("Looks tasty, would make for a good meal. I hear bears love fish");
		
		this.allItems[0] = ghost;
		this.allItems[1] = goldenFish;
		this.allItems[2] = meatyFish;
		
		
	}
	
	
}
