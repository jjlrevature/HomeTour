package game;

import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	Room[] rooms = new Room[9];
	
	public void init() {
		Room smallClearing = new Room("n", "s", "l", 0);
		smallClearing.setName("             A Small Clearing \n");
		smallClearing.setShortDesc("A small clearing in the middle of a wooded area \n");
		smallClearing.setLongDesc("You exit the tree line and before you is a grassy clearing. \n"
				+ "Off to your far left you can see a Mama Bear and her \n"
				+ "two cubs playing in the grass. To the right you can see a grotto containing \n"
				+ "a large oak tree next to a small pond, both butted up against \na rocky cliff that looms high overhead. \n"
				+ "\ngo towards bears \n"
				+ "go to grotto \n"
				+ "teleport away");
		smallClearing.setIndex(0);
		this.rooms[0] = smallClearing;
		this.startingRoom = smallClearing;
		
		
		Room bearArea = new Room("n","s","l",1);
		bearArea.setName("\n             Forest Edge \n");
		bearArea.setShortDesc("A small shaded area near the forest edge \n");
		bearArea.setLongDesc("As you Approach the Mama Bear perks up and roars vigorously. There is still time to back away!\n"
				+ " \nsit and wait\n"
				+ "run towards grotto\n"
				+ "teleport away");
		bearArea.setIndex(1);
		this.rooms[1] = bearArea;
		
		Room smallGrotto = new Room("n","s","l",2);
		smallGrotto.setName("\n           Small Grotto \n");
		smallGrotto.setShortDesc("A small area including a pond, a tree, and a cave entrance \n");
		smallGrotto.setLongDesc("Upon arriving closer, on your left you can see a cave entrance hidden \nbehind"
				+ "the tall and imposing oak tree. however, on your right "
				+ "you see a \npond covered in water lilies, with an unusual glow coming from the water.\n"
				+ "\ngo to cave\n"
				+ "swim in pond\n"
				+ "go to bears\n"
				+ "use fishing pole\n");
		smallGrotto.setIndex(2);
		this.rooms[2] = smallGrotto;
		
		Room cavern = new Room("n","s","l",3);
		cavern.setName(" \n          Wyrmlight Cavern\n");
		cavern.setShortDesc("A winding expansive cave network\n");
		cavern.setLongDesc("Entering the entrance to the cave, you find yourself in a large expanse. \n"
				+ "To the left and to the right, you can spot a passageways to other room.\n"
				+ "In front of you, however, is a rocky plateau with what appear to be dancing balls of light upon it\n"
				+ "\ngo to left\n"
				+ "go to right\n"
				+ "climb rocky plateau\n"
				+ "go back out");
		cavern.setIndex(3);
		this.rooms[3] = cavern;
		
		Room rockLedge = new Room("n","s","l",4);
		rockLedge.setName("  \n          Rocky Ledge\n");
		rockLedge.setShortDesc("A Rocky plateau at the back of a large cavern\n");
		rockLedge.setLongDesc("As you eclipse the top of the plateua you can see what you thought were \n"
				+ "dancing lights, was actually a portal! The glowing ethereal lights beckon to\n"
				+ "you to unlock the pathway into the new dimension\n"
				+ "\nEnter portal\n"
				+ "climb back down\n");
		rockLedge.setIndex(4);
		this.rooms[4]= rockLedge;
		
		Room subRoom1 = new Room("n","s","l",5);
		subRoom1.setName("\n          Storage Room\n");
		subRoom1.setShortDesc("A room that has baskets and some shelves to store food\n");
		subRoom1.setLongDesc("Entering the room, you find yourself standing amongst various sized pots\n"
				+ "and baskets. You can see that the inhabitants have gathered plenty of nuts, berries, and fruits\n"
				+ "\ngo to cave\n");
		subRoom1.setIndex(5);
		this.rooms[5] = subRoom1;
		
		
		Room subRoom3 = new Room("n","s","l",7);
		subRoom3.setName("\n            A secret cave\n");
		subRoom3.setShortDesc("swimming in the pond, you found a small cave entrance underwater and explore it\n");
		subRoom3.setLongDesc("Upon entering the cave from the tunnel in the pond, you enter a small room \ninside of a larger cave complex."
				+ " You can see a larger cavern through a tunnel off the left as well as the remains of a fire. \n"
				+ "\ngo through tunnel\n"
				+ "go back out\n");
		subRoom3.setIndex(7);
		this.rooms[7] = subRoom3;
		
		Room secretCowLevel = new Room("n","s","l",8);
		secretCowLevel.setName("\n           The Secret Cow Level");
		secretCowLevel.setShortDesc(null);
		secretCowLevel.setLongDesc(null);
		secretCowLevel.setIndex(8);
		this.rooms[8] = secretCowLevel;
	}
	
	
	
	
}
