
public class TeacherDesk extends Room{
	
	TeacherDesk() {
		super("teacherDesk.jpg");
		
		//wednesday bin
		items.add(new InventoryItem ("Please show the kids a 3D model of a world map",640,58,41,72,2));
		//trash
		items.add(new InventoryItem ("Apple has come up with iPhones, iPads, iPods, airpods, apple watches, and most importantly ________",59,463,187,685,6));
		/*
		 * //monday tuesday bin items.add(new InventoryItem
		 * ("mon, tue bin",567,60-24,72,72,)); //thursday friday bin items.add(new
		 * InventoryItem (681,58-24,90,72));
		 */
	}
}
