package game;


import fixtures.Room;

public class Player {
	private Room currentRoom;	
	private boolean hasSwum = false;
	
	
	Room setCurrentRoom(Room r) {
		return this.currentRoom = r;
	}
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	public boolean getHasSwum() {return this.hasSwum;}
	
	public boolean setHasSwum(boolean c) {
		return this.hasSwum = c;
	}
	
}
