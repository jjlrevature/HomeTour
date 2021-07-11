package fixtures;

public class Room extends Fixture {
	public Room[] exits;
	protected String name;
	protected String shortDesc;
	protected String longDesc;

	public Room(String name, String s, String l,int i) {
		super(name, s, l, i);
	}
	
    
	
}
