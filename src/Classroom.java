
public class Classroom extends Room{

	Classroom() {
		super("Classroom.jpg");
		//projector:
		items.add(new InventoryItems (418,84-24,66,22));
		//clock:
		items.add(new InventoryItems (345,151-24,27,23));
		//computer:
		items.add(new InventoryItems (313,277-24,49,26));
		//white board
		items.add(new InventoryItems (102,179-24,205,143));
	}

}
