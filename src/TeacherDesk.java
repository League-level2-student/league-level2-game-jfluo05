
public class TeacherDesk extends Room{
	
	TeacherDesk() {
		super("teacherDesk.jpg");
		
		//wednesday bin
		items.add(new InventoryItem ("Clue 2: Please show the kids a 3D model of a world map",640,58,41,72,2));
		//trash
		items.add(new InventoryItem ("Clue 6: I can run, but I cannot walk\nI live on a table\nMy display is blue but my back is black",59,463,187,685,6));
		/*
		 * //monday tuesday bin items.add(new InventoryItem
		 * ("mon, tue bin",567,60-24,72,72,)); //thursday friday bin items.add(new
		 * InventoryItem (681,58-24,90,72));
		 */
	}
}
