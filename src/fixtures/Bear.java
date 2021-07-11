package fixtures;

public class Bear extends Item implements Animal {
	
	private boolean isHungry = true;
	private boolean isFriendly = false;
	

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
		this.isHungry = b;
	}



	@Override
	public boolean getFriendly() {
		// TODO Auto-generated method stub
		return isFriendly;
	}



	@Override
	public void setFriendly(boolean b) {
		this.isFriendly = b;
	}

}
