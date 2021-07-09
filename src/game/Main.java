package game;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NullPointerException;

import fixtures.Animal;
import fixtures.Bear;
import fixtures.Item;
import fixtures.Room;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);	
	public static boolean b = true;
	
	public static void main(String[] args) {
		
		// instantiate new player and generate all the rooms and items. also create array list
		RoomManager rm = new RoomManager();		
		rm.init();
		ItemManager im = new ItemManager();
		im.initItems();
		
		Bear bear = new Bear("Mama Bear", "", "", 0);
		Player p = new Player();
		ArrayList<Item> invItemsList = new ArrayList<Item>();
		
		
		// set current room to starting room		
		p.currentRoom = rm.rooms[0];
		
		System.out.println("\n\n\n              Objective: Be friends with the bears, or die trying"
				+ "\nIf you should wish to quite and anytime, please enter 'teleport far away'.\n"
				+ "please enter the commands you see that you would like to execute\n");
		// Print initial menu
		printRoom(p, invItemsList, im, rm);	
		
		
		// Game loop
		do {			
			// take input from user and parse
			String[] result = collectInput();
			parse(result, p, rm, im, invItemsList, bear);
			
		} while(b);
		
	}
	
	private static void printRoom(Player p,ArrayList<Item> a, ItemManager im, RoomManager rm) {
		// print a prompt about players current room
		System.out.println(p.currentRoom.getName());
		System.out.println(p.currentRoom.getShortDesc());
		System.out.println(p.currentRoom.getLongDesc());
		if(a.contains(im.allItems[1]) && p.currentRoom.getIndex() == 8) {
			System.out.println("And so our adventurer was never heard from after stepping into the portal. "
					+ "\n                           The End!");
			b = false;
		}
		
		if(a.contains(im.allItems[2]) && p.currentRoom.getIndex() == 1)
			System.out.println("give up fish?");
	}
	
	private static String[] collectInput() {
		// parse first index of passed string, is action. return command
		String command = sc.next();
		String i = sc.next();
		String destination = sc.next();
//		do {
//			command = sc.next();
//			i = sc.next();
//			destination = sc.next();
//			sc.nextLine();
//			System.out.println("reset");
//			
//		} while(destination == null);
		return new String[] { command, destination };
		
	}
	
	
	
	private static void parse(String[] command, Player p, RoomManager rm, ItemManager im, ArrayList<Item> a, Bear bear) {
			
		if(command.length == 2) {			
			switch(command[0]) {
			case "go":				
				switch(command[1]) {
				case "clearing":
					p.currentRoom = rm.rooms[0];
					break;
				case "bears":
					p.currentRoom = rm.rooms[1];				
					break;
				case "grotto":
					p.currentRoom = rm.rooms[2];
					break;
				case "cave":
					p.currentRoom = rm.rooms[3];
					break;
				case "storage":
					p.currentRoom = rm.rooms[5];
					break;
				case "passageway":
					p.currentRoom = rm.rooms[7];
					break;			
				case "outside":
					p.currentRoom = rm.rooms[2];
					break;
				case "tunnel":
					p.currentRoom = rm.rooms[3];
					break;
				case "water":
					p.currentRoom = rm.rooms[2];
					break;				
				}
				break;
			case "enter":			
				try {
					if(a.contains(im.allItems[1])) {
						p.currentRoom = rm.rooms[8];
						break;				
					}
				} catch(NullPointerException e) {
					
				}
				System.out.println("\nIt seems something magical is required to travel through this portal.");
				break;
			case "swim":			
				switch(command[1]) {
				case "pond":
					p.currentRoom = rm.rooms[7];					
					rm.rooms[7].setShortDesc("swimming in the pond, you found a small cave entrance underwater and explore it\n");
					rm.rooms[7].setLongDesc("Upon entering the cave from the tunnel in the pond, you enter a small room \ninside of a larger cave complex."
							+ " You can see a larger cavern through a tunnel off \nthe left as well as the remains of a fire. \n"
							+ "\ngo through tunnel\n"
							+ "swim in water\n");
					break;
				case "water":
					p.currentRoom = rm.rooms[2];
					rm.rooms[7].setShortDesc("As you come to the end of the passageway, you find yourself in a small room\n");
					rm.rooms[7].setLongDesc("You enter into the small room from the passageway leading away from the cavern."
							+ " In front \nof you is what appears to be the remains of a fire pit, and to your right is a a pool of water \n"
							+ "\ngo through tunnel\n"
							+ "swim in water\n");
					break;
				}
				break;
			case "climb":
				switch(command[1]) {
				case "down":
					p.currentRoom = rm.rooms[3];
					break;
				case "plateau":
					p.currentRoom = rm.rooms[4];
					break;
				}	
				break;
			case "sit":
				if(bear.isHungry){
					System.out.println("\nYou have died.");				
				} else {
					System.out.println("\nThe bears sit next to you as they eat the fish.\n");
					System.out.println("You have won the game and befriended the bears!\n");
				}
				b = false;
				break;
			case "give":
				// make bear not hungry
				bear.setHungry(false);
				rm.rooms[2].setLongDesc("As you Approach the Mama Bear perks up and looks at you inquisitevely. It seems to smell something tasty that you have.");
				break;
			case "use":
				double ph = Math.random();
				System.out.println("you rolled a " + ph);
				if( ph > 0.7) {
					System.out.println("\n");
					System.out.println(im.allItems[1].getName());
					System.out.println(im.allItems[1].getShortDesc());
					System.out.println("*****You have acuired THE GOLDEN FISH******");
					a.add(im.allItems[1]);
				} else if(ph > 0.03) {
					System.out.println("\n");
					System.out.println(im.allItems[2].getName());
					System.out.println(im.allItems[2].getShortDesc());
					System.out.println("You have acquired a Meaty Fish!");
					a.add(im.allItems[2]);
				} else {
					System.out.println("Bummer! No luck!");
				}
				
				break;
				
			case "teleport":
				b = false;	
				break;
				
			}
			if(b == false) {
				System.out.println("Fare thee well, Traveler");
			} else {
				printRoom(p, a, im, rm);
			}
		} else {
			System.out.println("please enter a valid command.");
		}
	}
}
