package game;

import fixtures.Room;

public class RoomManager {
	
	
	
	
	public Room[] rooms = new Room[9];
	private Room startingRoom;
	
	
	
	

	// instantiate the room objects
	public void init() {
		Room smallClearing = new Room(
				"Small Clearing",
				
				"A grassy clearing with a singular massive tree tucked near the back, in between"
				+ " a cliff and a small pond",
				
				"Cardinals are singing as they dart about the crisp morning air. The smell of dew and petrichlor after"
				+ "a soft morning drizzle.Off to the left A mother bear watches you as her two cubs frolick about near the edge of "
				+ "the grassy field. "				
				+ " Off to the right in a small grotto, a large oak tree looms in defiance next to an imposing cliff face. the old tree was so impressive"
				+ "that its roots penetrated the rock and into the cliffside. "
				+ "Also in the small grotto was a small pond, half covered in water lilies with a cacaphony of frogs and dragonflies"
				+ "whirling and whizzing around.",
				0
				);
		
		// set startingRoom and and this room to array
		this.rooms[0] = smallClearing;
		this.startingRoom = smallClearing;
		
		Room bearArea = new Room(
				"Grassy Meadow",
				
				"A comfortable shaded area near the tree line of the small clearing",
				
				"The mother bear perks up at you as she sees you approach. The cubs do not notice you as they wrestle with one another."
				+ "You continue to approach the bears unabashed, and as you get closer the mother bear roars a warning at you.",
				1
				);
		
		this.rooms[1] = bearArea;
		
		Room smallGrotto = new Room(
				"Small Grotto Entrance",
				
				"the area encompassing a large oak tree, a cave entrance, and a small pond",
				
				"As you enter the small grotto you find a cave looming to the left, just behind the tree trunk, hidden by a small overhang. You also"
				+ "see an old tree stump near to the edge of the pond with a fishing pole and some bait.",
				2
				);
		this.rooms[2] = smallGrotto;
		
		Room cavern = new Room(
				"Wyrmlight Cavern",
								
				"A vast cavern with smaller passageways and rocky plateau's",
				
				"Upon entering the cave and following a short bend, you enter a vast cavernous expanse that is illuminated by a multide of soft blue lights."
				+ "You can see two smaller tunnels exiting the room, one to your left, and one to your right. You can also see a small plateau up ahead of you "
				+ "which seems to have dancing balls of light upon it",3
				
				);
		this.rooms[3] = cavern;
		
		Room rockLedge = new Room(
				"",
				
				"",
				
				"",
				3
				);
		this.rooms[4] = rockLedge;
		
		Room subRoom1 = new Room(
				"",
				
				"",
				
				"",
				4
				);
		this.rooms[5] = subRoom1;
		
		Room subRoom2 = new Room(
				"",
				
				"",
				
				"",
				5
				);
		this.rooms[6] = subRoom2;
		
		Room subRoom3 = new Room(
				"",
				
				"",
				
				"",
				6
				);
		this.rooms[7] = subRoom3;
		
		Room secretCowLevel = new Room(
				"",
				
				"",
				
				"",
				7
				);
		this.rooms[8] = secretCowLevel;
		
		
	}
	public Room[] getRooms() { return this.rooms; }
}
