import java.awt.Rectangle;

public class InventoryItems {
	int x;
	int y;
	int width;
	int height;
	Rectangle collisionBox= new Rectangle();
	
	public InventoryItems(int x,int y, int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		collisionBox = new Rectangle(x,y,width,height);
	}
	void update() {
		 collisionBox.setBounds(x, y, width, height);
	}
}