package game;


import fixtures.Room;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Player p = new Player();
		
		
		//instantiate new Room Manager and populate memory
		RoomManager rm = new RoomManager();
		Room[] list = rm.init();
		System.out.println(list);
		
		
		// placeholder variable to initiate game
		boolean playGame = true;
		
		// display a prompt
		initMenu();
		
		
		
		// current room and rm.rooms[] contain data but its hashed?
		
		alpha: while(playGame) {			
			if (list[0] == rm.rooms[0]) 
				System.out.println("1");				
//			} else if (currentRoom == rm.rooms[1]) {
//				System.out.println("2");
//			} else if (currentRoom == rm.rooms[2]) {
//				
//			} else if (currentRoom == rm.rooms[3]) {
//				
//			} else if (currentRoom == rm.rooms[4]) {
//				
//			} else if (currentRoom == rm.rooms[5]) {
//				
//			} else if (currentRoom == rm.rooms[6]) {
//				
//			} else if (currentRoom == rm.rooms[7]) {
//				
//			} else if (currentRoom == rm.rooms[8]) {
//				
//			} else {
//				
//			}
			playGame = false;
			
		}
	}
	
	private static void printRoom(Player player) {
		// print player location to console
		System.out.println();
	}

	private static String[] collectInput() {
		// scanner object to collect console input, and divide into string array and return that
		
		return null;

	}
		
	private static void parse(String[] command, Player player) {

	}
	
	private static void initMenu() {
		System.out.println("After exploring the forest for a few hours you come across"
				+ "a small clearing.");
	}
	
	private static String userInput(String str) {
		boolean b = true;
		while(b) {
		    try {
		        str = sc.next();
		        b = false;
		    }
		    catch(InputMismatchException inEx) {
		        System.out.println("Invalid input. Please try again!");
		        sc.nextLine();	        
		    }
		}
		return str;
	}
}
