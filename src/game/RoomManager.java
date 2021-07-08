package game;

import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	Room[] rooms = new Room[9];
	
	public void init() {
		Room smallClearing = new Room("n", "s", "l");
		smallClearing.setName("             A Small Clearing \n");
		smallClearing.setShortDesc("A small clearing in the middle of a wooded area \n");
		smallClearing.setLongDesc("You exit the tree line and before you is a grassy clearing. \n"
				+ "Off to your far left you can see a Mama Bear and her \n"
				+ "two cubs playing in the grass. To the right you can see \n"
				+ "a large oak tree next to a small pond, both butted up against \na rocky cliff that looms high overhead.");
		this.rooms[0] = smallClearing;
		this.startingRoom = smallClearing;
		
		Room bearArea = new Room("n","s","l");
		bearArea.setName("             Forest Edge \n");
		bearArea.setShortDesc("A small shaded area near the forest edge \n");
		bearArea.setLongDesc("As you Approach the Mama Bear perks up and roars vigorously.");
		this.rooms[1] = bearArea;
		
		Room smallGrotto = new Room("n","s","l");
		smallGrotto.setName("           Small Grotto \n");
		smallGrotto.setShortDesc("A small area including a pond, a tree, and a cave entrance \n");
		smallGrotto.setLongDesc("Upon arriving closer, on your left you can see a cave entrance hidden \nbehind"
				+ "the tall and imposing oak tree. however, on your right"
				+ "you see a \npond covered in water lilies, with an unusual glow coming from the water.");
		this.rooms[2] = smallGrotto;
		
		Room cavern = new Room("n","s","l");
		cavern.setName("           Wyrmlight Cavern\n");
		cavern.setShortDesc("A winding expansive cave network\n");
		cavern.setLongDesc("Entering the entrance to the cave, you find yourself in a large expanse. \n"
				+ "To the left and to the right, you can spot a passageways to other room.\n"
				+ "In front of you, however, is a rocky ledge with what appear to be dancing balls of light upon it");
		this.rooms[3] = cavern;
		
		Room rockLedge = new Room("n","s","l");
		rockLedge.setName(null);
		rockLedge.setShortDesc(null);
		rockLedge.setLongDesc(null);
		this.rooms[4]= rockLedge;
		
		Room subRoom1 = new Room("n","s","l");
		subRoom1.setName(null);
		subRoom1.setShortDesc(null);
		subRoom1.setLongDesc(null);
		this.rooms[5] = subRoom1;
		
		Room subRoom2 = new Room("n","s","l");
		subRoom2.setName(null);
		subRoom2.setShortDesc(null);
		subRoom2.setLongDesc(null);
		this.rooms[6] = subRoom2;
		
		Room subRoom3 = new Room("n","s","l");
		subRoom3.setName(null);
		subRoom3.setShortDesc(null);
		subRoom3.setLongDesc(null);
		this.rooms[7] = subRoom3;
		
		Room secretCowLevel = new Room("n","s","l");
		secretCowLevel.setName(null);
		secretCowLevel.setShortDesc(null);
		secretCowLevel.setLongDesc(null);
		this.rooms[8] = secretCowLevel;
	}
	
	
	
	
}
