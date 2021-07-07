package fixtures;

public class Room extends Fixture {
	
	
	public Room[] exits;
	
	
	
	
	public Room(String name, String shortDescription, String longDescription, int i) {
		super(name, shortDescription, longDescription, i);
		String title = name;
		String shortDesc = shortDescription;
		String longDesc = longDescription;
		this.exits = new Room[3];
	}
	
	
	
	public Room[] getExits() {
		
	}
		
	public Room getExit(String direction) {
		
	}
		
	
	
	// current room method, getters/setters
}
