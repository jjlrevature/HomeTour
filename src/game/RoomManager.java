package game;

import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	Room[] rooms = new Room[9];
	
	
			// some learning happened here, i am aware that you do not need to setterMethod if you have a proper constructor
			// i did not when first starting the project..
			// and no index is not used, i was planning on it but had to scale back
	
	public void init() {
		Room smallClearing = new Room("n", "s", "l", 0);
		smallClearing.setName("             A Small Clearing \n");
		smallClearing.setShortDesc("A small clearing in the middle of a wooded area \n");
		smallClearing.setLongDesc("You exit the tree line and before you is a grassy clearing. \n"
				+ "Off to your far left you can see a Mama Bear and her \n"
				+ "two cubs playing in the grass. To the right you can see a Grotto containing \n"
				+ "a large oak tree next to a small pond, both butted up against \na rocky cliff that looms high overhead. \n"
				+ "\ngo towards bears \n"
				+ "go to grotto \n"
				+ "teleport far away");
		smallClearing.setIndex(0);
		this.rooms[0] = smallClearing;
		this.startingRoom = smallClearing;
		
		
		Room bearArea = new Room("n","s","l",1);
		bearArea.setName("\n             Forest Edge \n");
		bearArea.setShortDesc("A small shaded area near the forest edge \n");
		bearArea.setLongDesc("As you Approach the Mama Bear perks up and roars vigorously. There is still time to back away!\n"
				+ " \nsit and wait\n"
				+ "go towards grotto\n"
				+ "teleport away");
		this.rooms[1] = bearArea;
		
		Room smallGrotto = new Room("n","s","l",2);
		smallGrotto.setName("\n           Small Grotto \n");
		smallGrotto.setShortDesc("A small area including a pond, a tree, and a cave entrance \n");
		smallGrotto.setLongDesc("Upon arriving closer, on your left you can see a cave entrance hidden \nbehind"
				+ "the tall and imposing oak tree. however, on your right "
				+ "you see a \npond covered in water lilies, with a mysterious glow coming from the water.\n"
				+ "You spot a tree stump near the edge of the water with a fishing pole at its base.\n"
				+ "\ngo into cave\n"
				+ "swim in pond\n"
				+ "go to bears\n"
				+ "use fishing pole\n");
		this.rooms[2] = smallGrotto;
		
		Room cavern = new Room("n","s","l",3);
		cavern.setName(" \n          Wyrmlight Cavern\n");
		cavern.setShortDesc("A winding expansive cave network\n");
		cavern.setLongDesc("Entering the entrance to the cave, you find yourself in a large expanse."
				+ "The top of the \nmain cavern shimmers in a low violet light in the shape of a dragon,"
				+ " with its tail \nreaching across the entirety of the cave. "
				+ " To the left you see a little hollow \nwhich appears to be a storage room, you can spot a passageway to another room.\n"
				+ "In front of you, however, is a rocky plateau with what appear to be dancing balls\n"
				+ "of light upon it.\n"
				+ "\ngo to storage\n"
				+ "go through passageway\n"
				+ "climb rocky plateau\n"
				+ "go back outside");
		this.rooms[3] = cavern;
		
		Room rockLedge = new Room("n","s","l",4);
		rockLedge.setName("  \n          Rocky Ledge\n");
		rockLedge.setShortDesc("A Rocky plateau at the back of a large cavern\n");
		rockLedge.setLongDesc("As you eclipse the top of the plateua you can see what you thought were \n"
				+ "dancing lights, was actually a portal! The glowing ethereal lights beckon to\n"
				+ "you to unlock the pathway into the new dimension\n"
				+ "\nenter the portal\n"
				+ "climb back down\n");
		this.rooms[4]= rockLedge;
		
		Room subRoom1 = new Room("n","s","l",5);
		subRoom1.setName("\n          Storage Room\n");
		subRoom1.setShortDesc("A room that has baskets and some shelves to store food\n");
		subRoom1.setLongDesc("Entering the room, you find yourself standing amongst various sized pots\n"
				+ "and baskets. You can see that the inhabitants have gathered plenty of nuts, berries, and fruits\n"
				+ "\ngo to cave\n");
		this.rooms[5] = subRoom1;
		
		
		Room subRoom3 = new Room("n","s","l",7);
		subRoom3.setName("\n            End of Passageway\n");
		subRoom3.setShortDesc("As you come to the end of the passageway, you find yourself in a small room\n");
		subRoom3.setLongDesc("You enter into the small room from the passageway leading away from the cavern."
				+ " In front \nof you is what appears to be the remains of a fire pit, and to your right is a a pool of water \n"
				+ "\ngo through tunnel\n"
				+ "swim in water\n");
		this.rooms[7] = subRoom3;
		
		Room secretCowLevel = new Room("n","s","l",8);
		secretCowLevel.setName("\n           The Secret Cow Level\n");
		secretCowLevel.setShortDesc("You emerge from the portal in the town of Tristram\n");
		secretCowLevel.setLongDesc("A chill runs down your spine at the gruesome sight before you. a terrible eveil has \n"
				+ "befallel the town of Tristram. The sight before you is not for mortal eyes to lay upon.\n"
				+ "Off in the distance you hear a cacaphony of Moo's.. They sound like they are approaching..");
		this.rooms[8] = secretCowLevel;
		
		
	}
	
	
	
	
}
