package game;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NullPointerException;

import fixtures.Bear;
import fixtures.Item;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static boolean b = true;
	
	public static void main(String[] args) {
		
		// instantiate objects. create array list
		RoomManager rm = new RoomManager();		
		ItemManager im = new ItemManager();
		Bear bear = new Bear("Mama Bear", "", "", 0);
		Player p = new Player();
		ArrayList<Item> invItemsList = new ArrayList<Item>();
		
		//instantiate rooms and items in memory
		rm.init();
		im.initItems();
		
		
		// set current room to starting room		
		p.setCurrentRoom(rm.rooms[0]);
		
		// print main objective
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
		System.out.println(p.getCurrentRoom().getName());
		System.out.println(p.getCurrentRoom().getShortDesc());
		System.out.println(p.getCurrentRoom().getLongDesc());
		if(a.contains(im.allItems[1]) && p.getCurrentRoom().getIndex() == 8) {
			System.out.println("And so our adventurer was never heard from after stepping into the portal. "
					+ "\n                           The End!");
			b = false;
		}
		if(a.contains(im.allItems[2]) && p.getCurrentRoom().getIndex() == 1) {
			System.out.println("give up fish");
			removeItem(a,im);
		}
			
	}
	
	private static void printItem(ItemManager im, int i) {
		System.out.println("\n");
		System.out.println(im.allItems[i].getName());
		System.out.println(im.allItems[i].getShortDesc());
		System.out.println(im.allItems[i].getLongDesc());
	}
	
	public static void removeItem(ArrayList<Item> a, ItemManager im) {
		int r = a.indexOf(im.allItems[2]);
		try {
			a.remove(r);				
		} catch(IndexOutOfBoundsException e) {
			
		}
	}
	
	private static String[] collectInput() {
		// parse first index of passed string, is action. return command
		String command = sc.next();
		String i = sc.next();
		String destination = sc.next();
		return new String[] { command, destination };
		
	}
	
	// yes this nested hell noodle is refactor-able
	
	private static void parse(String[] command, Player p, RoomManager rm, ItemManager im, ArrayList<Item> a, Bear bear) {
			
		if(command.length == 2) {			
			switch(command[0]) {
			case "go":				
				switch(command[1]) {
				case "clearing":
					p.setCurrentRoom(rm.rooms[0]);
					break;
				case "bears":
					p.setCurrentRoom(rm.rooms[1]);				
					break;
				case "grotto":
					p.setCurrentRoom(rm.rooms[2]);
					break;
				case "cave":
					p.setCurrentRoom(rm.rooms[3]);
					break;
				case "storage":
					p.setCurrentRoom(rm.rooms[5]);
					break;
				case "passageway":
					p.setCurrentRoom(rm.rooms[7]);
					break;
				case "outside":
					p.setCurrentRoom(rm.rooms[2]);
					break;
				case "tunnel":
					p.setCurrentRoom(rm.rooms[3]);
					break;							
				}
				break;
				
			case "enter":
				
				if(hasItem(a,im,1)) {
					p.setCurrentRoom(rm.rooms[8]);
				} else {
					System.out.println("\nIt seems something magical is required to travel through this portal.");
				}
				break;
				
			case "swim":			
				switch(command[1]) {
				
				//  sets description depending on which way you enter the rooms
				case "pond":
					
					p.setCurrentRoom(rm.rooms[7]);				
					rm.rooms[7].setShortDesc("swimming in the pond, you found a small cave entrance underwater and explore it\n");
					rm.rooms[7].setLongDesc("Upon entering the cave from the tunnel in the pond, you enter a small room \ninside of a larger cave complex."
							+ " You can see a larger cavern through a tunnel off \nthe left as well as the remains of a fire. \n"
							+ "\ngo through tunnel\n"
							+ "swim in water\n");
					break;
					
				case "water":
					p.setCurrentRoom(rm.rooms[2]);
					rm.rooms[7].setShortDesc("As you come to the end of the passageway, you find yourself in a small room\n");
					rm.rooms[7].setLongDesc("You enter into the small room from the passageway leading away from the cavern."
							+ " In front \nof you is what appears to be the remains of a fire pit, and to your right is a a pool of water \n"
							+ "\ngo through tunnel\n"
							+ "swim in water\n");
					break;
				}
				
				break;
				
			case "climb":
				
				// Separate key words to denote traveling direction in certain rooms
				switch(command[1]) {
				case "down":
					p.setCurrentRoom(rm.rooms[3]);
					break;
				case "plateau":
					p.setCurrentRoom(rm.rooms[4]);
					break;
				}	
				break;
				
			case "sit":
				
				// victory condition / if you gave bear a fish, you dont die
				if(bear.getHungry()){
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
				bear.setFriendly(true);
				removeItem(a,im);
				rm.rooms[1].setLongDesc("the Mama Bear feasts upon the fish as her cubs approach you to play."
						+ "\n\nsit and play\n"
						+ "go towards grotto"
						+ "");
				break;
			case "use":				
				fish(a,im);							
				break;
				
			// exit clause
			case "teleport":
				b = false;	
				break;				
			}
			
			// goodbye statement
			if(b == false) {
				System.out.println("Fare thee well, Traveler");
			} else {
				printRoom(p, a, im, rm);
			}
		} else {
			System.out.println("please enter a valid command.");
		}
	}
	
	private static boolean hasItem(ArrayList<Item> a, ItemManager im, int i) {
		boolean d = false;
		try {
			if(a.contains(im.allItems[i])) {
				d = true;				
			} else {
				d = false;
			}
		} catch(NullPointerException e) {
			
		}
		return d;
	}
	
	private static void fish(ArrayList<Item> a, ItemManager im) {
		// Math.random() to generate an integer and "roll" your chances of catching a fish
		// the fish is then added to players inventory
		
		double ph = Math.random();
		System.out.println("you rolled a " + ph);
		if( ph > 0.7) {
			printItem(im,1);
			a.add(im.allItems[1]);
		} else if(ph > 0.03) {
			printItem(im,2);
			a.add(im.allItems[2]);
		} else {
			System.out.println("Bummer! No luck!");
		}	
	}
}
