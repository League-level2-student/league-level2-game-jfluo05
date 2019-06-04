import java.awt.Color;
import java.awt.Font;
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
	public static BufferedImage door;
	public static BufferedImage teacherDesk;
	public static BufferedImage math;
	public static BufferedImage doorknobLock;
	
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	Font titleFont;
	Font pressEnterToStartFont;
	Font iForInstructionsFont;
	Font gameOver;
	Font restartFont;
	
	Graphics g;
	
	final int TITLE_SCREEN = 0;
	final int CLASSROOM = 1;
	final int TEACHER_DESK = 2;
	final int MATH_WORKSHEET = 3;
	final int DOOR = 4;
	final int FAIL_OR_PASS = 5;
	int currentState= TITLE_SCREEN;
	
	Panel(){
		
		titleFont= new Font("Arial",Font.PLAIN,48);
		pressEnterToStartFont= new Font("Arial", Font.PLAIN, 30);
		iForInstructionsFont=new Font("Arial", Font.PLAIN, 30);
		gameOver=new Font("Arial",Font.BOLD,48);
		restartFont= new Font("Arial", Font.PLAIN, 44);
		
		if (needImage) {
		    loadImage ("Classroom.jpg");
		}
		if (needImage) {
		    loadImage ("teacherDesk.jpg");
		}
		if (needImage) {
		    loadImage ("math.jpg");
		}
		if (needImage) {
		    loadImage ("door.jpg");
		}
		if (needImage) {
		    loadImage ("doorknobLock.jpg");
		}
	}
	
	
	  void loadImage(String imageFile) { 
		  if (needImage) { 
			  try {
			  classroom = ImageIO.read(this.getClass().getResourceAsStream(imageFile)); gotImage = true; 
			  door = ImageIO.read(this.getClass().getResourceAsStream(imageFile)); gotImage = true;
			  doorknobLock = ImageIO.read(this.getClass().getResourceAsStream(imageFile)); gotImage = true; 
			  math = ImageIO.read(this.getClass().getResourceAsStream(imageFile)); gotImage = true; }
			  
			  catch (Exception e) {
	  
	   
		  needImage = false; }
		   }
		  repaint();
		  }
	 
	  
	public void paintComponent(Graphics g){
		
		/*
		 * if (gotImage) { g.drawImage(classroom, 0, 0,1000, 666, null); } else {
		 * g.setColor(Color.BLUE); g.fillRect(1000, 1000, WIDTH, HEIGHT); }
		 */
		
		if(currentState == TITLE_SCREEN){
			System.out.println("title screen");
		    drawTitleScreen(g);
		}else if(currentState == CLASSROOM){
			System.out.println("class screen");
		    drawClassroomScreen(g);
		}else if(currentState == TEACHER_DESK){
		    drawTeacherScreen(g);
		}else if(currentState == DOOR){
		    drawDoorScreen(g);
		}else if(currentState == FAIL_OR_PASS){
		    drawSuccessScreen(g);
		    //drawFailScreen(g);
		}
	}
	

void updateClassroomScreen() {
	
}
void updateTeacherScreen() {
	
}

void updateDoorScreen() {
	
}
void updateSuccessScreen() {
	
}
void updateFailScreen() {
	
}
//draw methods

void drawTitleScreen(Graphics g) {
    
    g.setColor(Color.YELLOW);

	g.fillRect(0, 0, 1000, 666); 
	
	g.setColor(Color.BLACK);
	g.setFont(titleFont);
    g.drawString("CLASSROOM ESCAPE", 20, 100);
    
    g.setColor(Color.YELLOW);
	g.setFont(pressEnterToStartFont);
    g.drawString("Press ENTER to start", 86, 150);
    
    g.setColor(Color.YELLOW);
	g.setFont(iForInstructionsFont);
    g.drawString("Press i for instructions", 50, 200);
}



void drawClassroomScreen(Graphics g) {
	if (gotImage) {
		g.drawImage(classroom, 0, 0,1000, 666, null);
	} else {
		g.setColor(Color.BLUE);
		g.fillRect(1000, 1000, WIDTH, HEIGHT);
	}
}
void drawTeacherScreen(Graphics g) {
	
}

void drawDoorScreen(Graphics g) {
	
}
void drawSuccessScreen(Graphics g) {
	g.setColor(Color.GREEN);

	g.fillRect(0, 0, 1000, 666);  
	g.setColor(Color.BLACK);
	g.setFont(gameOver);
    g.drawString("You succeeded!", 100, 100);
    
    g.setColor(Color.BLACK);
	g.setFont(pressEnterToStartFont);
    g.drawString("",90,300);
    
    g.setColor(Color.BLACK);
	g.setFont(restartFont);
    g.drawString("Press ENTER to restart", 20, 450);
}
void drawFailScreen(Graphics g) {
	g.setColor(Color.RED);

	g.fillRect(0, 0, 1000, 666);  
	g.setColor(Color.BLACK);
	g.setFont(gameOver);
    g.drawString("You failed", 100, 100);
    //need to finish the states of the game
    
    g.setColor(Color.BLACK);
	g.setFont(pressEnterToStartFont);
    g.drawString("",90,300);
    
    g.setColor(Color.BLACK);
	g.setFont(restartFont);
    g.drawString("Press ENTER to restart", 20, 450);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == TITLE_SCREEN) {
	        currentState = CLASSROOM;
	    } else if(currentState == CLASSROOM){
            currentState = TEACHER_DESK;
    }else if(currentState == TEACHER_DESK){
            currentState = MATH_WORKSHEET;
    }else if(currentState == MATH_WORKSHEET){
        currentState = DOOR;
}else if(currentState == DOOR){
    currentState = FAIL_OR_PASS;
}else if(currentState == FAIL_OR_PASS){
    currentState = TITLE_SCREEN;
}}
	
	repaint();
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
