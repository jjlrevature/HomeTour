package game;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NullPointerException;

import fixtures.Item;
import fixtures.Room;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static boolean b = true;
	public static void main(String[] args) {
		
		// instantiate new player and generate all the rooms and items. also create array list
		RoomManager rm = new RoomManager();		
		ItemManager im = new ItemManager();
		im.initItems();
		Player p = new Player();
		rm.init();
		ArrayList<Item> invItemsList = new ArrayList<Item>();
		// set current room to starting room		
		p.currentRoom = rm.rooms[0];
		
		// Print initial menu
		printRoom(p, invItemsList, im, rm);	
		
		// Game loop
		do {
						
			// take input from user and parse
			String[] result = collectInput();		
			parse(result, p, rm, im, invItemsList);
			
		} while(b);
		
	}
	
	private static void printRoom(Player p,ArrayList<Item> a, ItemManager im, RoomManager rm) {
		// print a prompt about players current room
		System.out.println(p.currentRoom.getName());
		System.out.println(p.currentRoom.getShortDesc());
		System.out.println(p.currentRoom.getLongDesc());
		if(a.contains(im.allItems[1]) && p.currentRoom.getIndex() == 8)
			System.out.println("Secret cow level dialogue");
		
		if(a.contains(im.allItems[2]) && p.currentRoom.getIndex() == 1)
			System.out.println("give fish to the bear?");
	}
	
	private static String[] collectInput() {
		// parse first index of passed string, is action. return command
		String command = sc.next();
		String i = sc.next();
		String destination = sc.next();
		return new String[] { command, destination };		
	}
	
	
	
	private static void parse(String[] command, Player p, RoomManager rm, ItemManager im, ArrayList<Item> a) {
			
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
			case "subroom1":
				p.currentRoom = rm.rooms[5];
				break;
			case "subroom2":
				p.currentRoom = rm.rooms[6];
				break;			
			case "outside":
				p.currentRoom = rm.rooms[2];
				break;
			case "tunnel":
				p.currentRoom = rm.rooms[3];
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
			p.currentRoom = rm.rooms[7];
			break;
		case "run":
			p.currentRoom = rm.rooms[2];
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
			System.out.println("You have died.");
			b = false;
			break;		
		case "use":
			double ph = Math.random();
			System.out.println(ph);
			if( ph > 0.7) {
				System.out.println("\n");
				System.out.println(im.allItems[1].getName());
				System.out.println(im.allItems[1].getShortDesc());
				System.out.println("You have acuired THE GOLDEN FISH");
				a.add(im.allItems[1]);
			} else if(ph > 0.03) {
				System.out.println("\n");
				System.out.println(im.allItems[2].getName());
				System.out.println(im.allItems[2].getShortDesc());
				System.out.println("You have acquired the Meaty Fish!");
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
	}
}
