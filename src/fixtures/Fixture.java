package fixtures;

public abstract class Fixture {
		// use as a base for anything that can be looked at or interacted with
	public String name;
	public String shortDescription;
	public String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription, int i) {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() { return this.name; }
	public String getShortDesc() { return this.shortDescription; }
	public String getLongDesc() { return this.longDescription; }
	
	
	public void getItem() {
		// add item into inventory
	}
	
	public void useItem() {
		// use item
	}
	
	
	
}
