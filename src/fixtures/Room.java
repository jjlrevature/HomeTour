package fixtures;

public class Room extends Fixture {
	
	// array of adjacent rooms
	public Room[] exits;
	
	public String getName() { return this.name; }
	
	
	public Room(String name, String shortDescription, String longDescription, int i) {
		super(name, shortDescription, longDescription, i);
		String title = name;
		String shortDesc = shortDescription;
		String longDesc = longDescription;
		this.exits = new Room[3];
	}
	
	
	
	public Room[] getExits() {
		return exits;
		
	}
		
	public Room getExit(String direction) {
		return null;
		
	}
		
	
	
	// current room method, getters/setters
}
