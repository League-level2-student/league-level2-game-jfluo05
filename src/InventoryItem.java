import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public class InventoryItem {
	int x;
	int y;
	int width;
	int height;
	String description;
	int num;
	
	public InventoryItem(String description, int x,int y, int width,int height, int num){
		this.description=description;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.num=num;
	
	}
	
	public String toString() {
		return "inventory item "+description;
	}
	
	boolean isOnItem(int x, int y) {
		return false;
		
	}
}
