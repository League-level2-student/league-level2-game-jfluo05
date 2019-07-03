
public class Door extends Room{

	Door() {
		super("door.jpg");
		//apple
				items.add(new InventoryItem ("apple",626,501-24,42,29,5));
		//blue textbook
				items.add(new InventoryItem ("blue textbook",733,530-24,79,13,6));
	}

}
