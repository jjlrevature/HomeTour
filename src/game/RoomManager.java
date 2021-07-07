package game;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms;
	
	public void init() {
		Room frontYard = new Room(
				"The Front Yard",
				"A grassy clearing with a singular massive tree tucked near the back, in between"
				+ " a cliff and a small pond",
				"Cardinals are singing as they dart about the crisp morning air. The smell of dew and petrichlor after"
				+ "a soft morning drizzle.Off to the left A mother bear watches you as her two cubs frolick about near the edge of "
				+ "the grassy field. "
				+ " Off to the right, a large oak tree looms in defiance next to an imposing cliff face. the old tree was so impressive"
				+ "that its roots penetrated the rock and into the cliffside. "
				+ "Not more than 30 feet away from the tree was a small pond, half covered in water lilies with a cacaphony of frogs and dragonflies"
				+ "whirling and whizzing around."
				);
		this.rooms[0] = frontYard;
		this.startingRoom = frontYard;
	}
}
