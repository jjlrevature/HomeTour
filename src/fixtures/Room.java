package fixtures;

public class Room extends Fixture {
	private Room[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[1]; // size is your choice
	}
		
	public Room[] getExits() {
		return null;
		
	}
		
	public Room getExit(String direction) {
		return null;
		
	}
	
	// current room method, getters/setters
}
