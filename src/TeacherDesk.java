
public class TeacherDesk extends Room{
	
	TeacherDesk() {
		super("teacherDesk.jpg");
		
		//wednesday bin
		items.add(new InventoryItem ("wednesday bin",640,58-24,41,72,2));
		
		/*
		 * //monday tuesday bin items.add(new InventoryItem
		 * ("mon, tue bin",567,60-24,72,72,)); //thursday friday bin items.add(new
		 * InventoryItem (681,58-24,90,72));
		 */
	}
}
