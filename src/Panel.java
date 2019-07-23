import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics;

public class Panel extends JPanel implements ActionListener, KeyListener, MouseListener {

	public static BufferedImage classroom;
	public static BufferedImage door;
	public static BufferedImage teacherDesk;
	public static BufferedImage math;
	public static BufferedImage doorknobLock;
	Room currentRoom;
	
	Classroom classRoom= new Classroom();
	TeacherDesk deskRoom= new TeacherDesk();
	 
	Room doorRoom= new Room("door.jpg");

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
	int currentState = TITLE_SCREEN;

	Panel() {

		titleFont = new Font("Courier", Font.PLAIN, 48);
		pressEnterToStartFont = new Font("Courier", Font.PLAIN, 30);
		iForInstructionsFont = new Font("Courier", Font.PLAIN, 20);
		gameOver = new Font("Courier", Font.BOLD, 48);
		restartFont = new Font("Courier", Font.PLAIN, 44);
		//loadImages();

	}

	/*
	 * void loadImages() {
	 * 
	 * try { classroom =
	 * ImageIO.read(this.getClass().getResourceAsStream("Classroom.jpg"));
	 * teacherDesk =
	 * ImageIO.read(this.getClass().getResourceAsStream("teacherDesk.jpg")); door =
	 * ImageIO.read(this.getClass().getResourceAsStream("door.jpg")); doorknobLock =
	 * ImageIO.read(this.getClass().getResourceAsStream("doorknobLockjpg.jpg"));
	 * math = ImageIO.read(this.getClass().getResourceAsStream("math.jpg")); }
	 * 
	 * catch (Exception e) { System.out.println("image error"); }
	 * 
	 * 
	 * }
	 */

	public void paintComponent(Graphics g) {

		if (currentState == TITLE_SCREEN) {
			
			drawTitleScreen(g);
		
		} else if (currentState == FAIL_OR_PASS) {
			
			drawSuccessScreen(g);
		//	drawFailScreen(g);
		}
		else {
			currentRoom.draw(g);
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
		g.drawString("CLASSROOM ESCAPE", 250, 100);

		g.setColor(Color.BLACK);
		g.setFont(pressEnterToStartFont);
		g.drawString("Press ENTER to start", 310, 250);

		g.setColor(Color.BLACK);
		g.setFont(iForInstructionsFont);
		g.drawString("Press i for instructions", 340, 310);
	}

	void drawClassroomScreen(Graphics g) {
		g.drawImage(classRoom.image, 0, 0, 1000, 666, null);
		for(InventoryItem i: classRoom.items) {
			g.setColor(Color.red);
		g.drawRect(i.x, i.y, i.width,i.height);

		}
		System.out.println("projector");
	}

	void drawTeacherScreen(Graphics g) {
		g.drawImage(deskRoom.image, 0, 0, 1000, 666, null);
		for(InventoryItem i: deskRoom.items) {
			g.setColor(Color.red);
			g.drawRect(i.x, i.y, i.width,i.height);
		}
		
	}

	void drawDoorScreen(Graphics g) {
		g.drawImage(doorRoom.image, 0, 0, 1000, 666, null);
		
	}

	void drawSuccessScreen(Graphics g) {
		g.setColor(Color.GREEN);

		g.fillRect(0, 0, 1000, 666);
		g.setColor(Color.BLACK);
		g.setFont(gameOver);
		g.drawString("You succeeded!", 250, 100);

		g.setColor(Color.BLACK);
		g.setFont(pressEnterToStartFont);
		g.drawString("", 200, 300);

		g.setColor(Color.BLACK);
		g.setFont(restartFont);
		g.drawString("Press ENTER to restart", 230, 450);
	}

	void drawFailScreen(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, 1000, 666);
		g.setColor(Color.BLACK);
		g.setFont(gameOver);
		g.drawString("You failed", 270, 100);
		// need to finish the states of the game

		g.setColor(Color.BLACK);
		g.setFont(restartFont);
		g.drawString("Press ENTER to restart", 200, 450);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (currentState == TITLE_SCREEN) {
				currentState = CLASSROOM;
				currentRoom=new Classroom();}
			else if (currentState == FAIL_OR_PASS) {
						currentState = TITLE_SCREEN;
			} 
			}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			 if (currentState == CLASSROOM) {
				currentState = TEACHER_DESK;
				currentRoom=new TeacherDesk();
			} else if (currentState == TEACHER_DESK) {
				currentState = DOOR;
				currentRoom=new Door();
			} 
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			 if (currentState == DOOR) {
				currentState = TEACHER_DESK;
				currentRoom=new TeacherDesk();
			} else if (currentState == TEACHER_DESK) {
				currentState = CLASSROOM;
				currentRoom=new Classroom();
			} 
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {
			if (currentState == DOOR) {
				currentState = FAIL_OR_PASS;
					}
		}if (e.getKeyCode() == KeyEvent.VK_I) {
			JOptionPane.showMessageDialog(null, "-Use the right and left arrow keys to change rooms \n-Click on the items that you would like to investigate \n-You can click i at any time during the game");
		}
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX()+", "+e.getY());

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
