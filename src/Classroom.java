import java.awt.Color;
import java.awt.Graphics;

public class Classroom extends Room{

	Classroom() {
		super("Classroom.jpg");
		//white board
		items.add(new InventoryItem ("Dear sub, today is wednesday, so please have the class turn in their homework in the hw bin",102,179,205,143,1));
		//globe
				items.add(new InventoryItem ("Class begins at 11:05",770,265,23,29,3));
	}
	
	void addRemainingItems() {
		super.addRemainingItems();
		//clock:
		items.add(new InventoryItem ("It doesn't fall from the tree",345,151,27,23,4));
		//computer:
		items.add(new InventoryItem ("Don't forget the read aloud after lunch! Read the blue book...",313,277,49,26,7));
		
	}

}
