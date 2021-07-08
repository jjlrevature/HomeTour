package fixtures;

public abstract class Fixture {
	public Fixture(String name, String shortDescription, String longDescription, int i) {
		
	}
	
	public String name;
	public String shortDescription;
	public String longDescription;
	public int index;
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public String getShortDesc() {
		return this.shortDescription;
	}

	public String getLongDesc() {
		return this.longDescription;
	}
	
	public int getIndex() {
		return this.index;
	}
		
	
	// Setters
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setShortDesc(String s) {
		this.shortDescription = s;
	}
	
	public void setLongDesc(String l) {
		this.longDescription = l;
	}
	
	public void setIndex(int i) {
		this.index = i;
	}
	
	
	
}
