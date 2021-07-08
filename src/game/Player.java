package game;

import fixtures.Item;
import fixtures.Room;

public class Player {
	public Room currentRoom;	
	public Item[] inventory;
	
	public void addItem(int n, Item[] j, Item k) {		
		int i;		
		Item[] newInv = new Item[n + 1];		
		for (i = 0; i < n; i++) {
			newInv[i] = j[i];
		}		
		this.inventory = newInv;
		
	}
	
	public Item[] getInv() {
		return this.inventory;
	}
	
	
	
}
