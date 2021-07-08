package fixtures;

public class Room extends Fixture {
	public Room[] exits;
	protected String name;
	protected String shortDesc;
	protected String longDesc;

	public Room(String name, String s, String l) {
		super(name, s, l);
		
		this.exits = new Room[3];
	}
	
	public Room[] getExits() {
		
	}
	
	public Room getExit(String dir) {
		return null;
		
	}
    
	
}
