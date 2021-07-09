package game;

import fixtures.Item;
import fixtures.Room;

public class Player {
	Room currentRoom;	
	private boolean hasSwum = false;
	public Item[] inventory;
	
	
	public Item[] getInv() {
		return this.inventory;
	}
	
	
	public boolean getHasSwum() {return this.hasSwum;}
	
	public boolean setHasSwum(boolean c) {
		return this.hasSwum = c;
	}
	
}
