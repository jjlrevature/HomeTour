package fixtures;

public class Bear extends Item implements Animal {
	
	

	public Bear(String name, String shortDescription, String longDescription, int i) {
		super(name, shortDescription, longDescription, i);
		// TODO Auto-generated constructor stub
	}



	@Override
	public boolean getHungry() {
		// TODO Auto-generated method stub
		return isHungry;
	}



	@Override
	public void setHungry(boolean b) {
		// TODO Auto-generated method stub
		isHungry = b;
	}

}
