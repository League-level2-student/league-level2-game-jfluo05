import java.awt.Color;
import java.awt.Graphics;

public class Classroom extends Room{

	Classroom() {
		super("Classroom.jpg");
		
		//white board
		items.add(new InventoryItem ("Dear sub, today is wednesday, so please have the class turn in their homework in the hw bin for the corresponding day",102,179,205,143,1));
		//clock:
		items.add(new InventoryItem ("It doesn't fall from the tree",345,151,27,23,4));
		//computer:
		items.add(new InventoryItem ("Don't forget to let the students have free reading time!",313,277,49,26,7));
		//globe
		items.add(new InventoryItem ("Class begins at 11:05",770,265,23,29,3));
		
		
		//projector: 
		//items.add(new InventoryItem ("projector",418,84,66,22,9));

	}
	
	

}
