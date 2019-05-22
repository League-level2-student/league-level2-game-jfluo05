import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics;
public class Panel extends JPanel implements ActionListener, KeyListener{

	public static BufferedImage classroom;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	Graphics g;
	
	Panel(){
		if (needImage) {
		    loadImage ("Classroom.jpg");
		}
	}
	
	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            classroom = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	    repaint();
	}
	public void paintComponent(Graphics g){
		if (gotImage) {
			g.drawImage(classroom, 0, 0,1000, 666, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(1000, 1000, WIDTH, HEIGHT);
		}
	}
	
void drawTitleScreen() {
	
}
void drawInstructionScreen() {
	
}
void drawClassroomScreen() {
	
}
void drawTeacherScreen() {
	
}
void drawStudentScreen() {
	
}
void drawDoorScreen() {
	
}
void drawEndScreen() {
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
