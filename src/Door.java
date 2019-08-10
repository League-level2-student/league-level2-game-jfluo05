
public class Door extends Room{

	Door() {
		super("door.jpg");
		//apple
				items.add(new InventoryItem ("Clue 5: Please throw away any trash before the students arrive in the classroom",626,501,42,29,5));
		//blue textbook
				items.add(new InventoryItem ("Clue 8: The word OPEN will help you open the door (last clue, you may click on the door handle to type in your answer)",733,530,79,13,8));
		 //door 
				InventoryItem door=new InventoryItem ("Enter 8 digit number here:",425,332,34,46,9);
				door.input=true;
				door.answer="15160514";
				items.add(door);
				
		 
	}

}
