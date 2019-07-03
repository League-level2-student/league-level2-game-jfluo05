import java.awt.Color;
import java.awt.Graphics;

public class Classroom extends Room{

	Classroom() {
		super("Classroom.jpg");
		//projector:
		items.add(new InventoryItem ("projector",418,84-24,66,22,8));
		//clock:
		items.add(new InventoryItem ("clock",345,151-24,27,23,4));
		//computer:
		items.add(new InventoryItem ("computer",313,277-24,49,26,7));
		//white board
		items.add(new InventoryItem ("whiteboard",102,179-24,205,143,1));
		//globe
		items.add(new InventoryItem ("globe",770,265-24,23,29,3));
	}

}
