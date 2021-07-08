package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// instantiate new player and generate all the rooms
		RoomManager rm = new RoomManager();		
		Player p = new Player();
		rm.init();
		
		// set current room to starting room
		p.currentRoom = rm.rooms[0];
		
		// print initial room
		printRoom(p);
		
		// take input from user
		collectInput();
		// update current room
		
		
	}
	
	private static void printRoom(Player p) {
		// print a prompt about players current room
		System.out.println(p.currentRoom.getName());
		System.out.println(p.currentRoom.getShortDesc());
		System.out.println(p.currentRoom.getLongDesc());
	}
	
	private static String[] collectInput() {
		// parse first index of passed string, is action. return command
		String command = sc.next();
		String destination = sc.next();
		return new String[] { command, destination };
		
		
	}
	
	
	private static void parse(String[] command, Player player) {
//		switch() {
//		
//		}
	}
}
