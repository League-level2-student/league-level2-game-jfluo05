import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public  class Room {

	public BufferedImage image;
	ArrayList<InventoryItems> items = new ArrayList<InventoryItems>();
	
	Room(String imageName){
		
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream(imageName));
		}
		catch (Exception e) {
			System.out.println("image error");
		}
		
	}
	
}
