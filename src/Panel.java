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

public class Panel extends JPanel implements ActionListener, KeyListener {

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
	int currentState = TITLE_SCREEN;

	Panel() {

		titleFont = new Font("Courier", Font.PLAIN, 48);
		pressEnterToStartFont = new Font("Courier", Font.PLAIN, 30);
		iForInstructionsFont = new Font("Courier", Font.PLAIN, 20);
		gameOver = new Font("Courier", Font.BOLD, 48);
		restartFont = new Font("Courier", Font.PLAIN, 44);
		loadImages();

	}

	void loadImages() {

			try {
				classroom = ImageIO.read(this.getClass().getResourceAsStream("Classroom.jpg"));
				teacherDesk = ImageIO.read(this.getClass().getResourceAsStream("teacherDesk.jpg"));
				door = ImageIO.read(this.getClass().getResourceAsStream("door.jpg"));
				doorknobLock = ImageIO.read(this.getClass().getResourceAsStream("doorknobLockjpg.jpg"));
				math = ImageIO.read(this.getClass().getResourceAsStream("math.jpg"));
			}

			catch (Exception e) {
System.out.println("image error");
			}


	}

	public void paintComponent(Graphics g) {

		if (currentState == TITLE_SCREEN) {
			System.out.println("title screen");
			drawTitleScreen(g);
		} else if (currentState == CLASSROOM) {
			System.out.println("class screen");
			drawClassroomScreen(g);
		} else if (currentState == TEACHER_DESK) {
			System.out.println("teacher desk");
			drawTeacherScreen(g);
		} else if (currentState == DOOR) {
			System.out.println("door");
			drawDoorScreen(g);
		} else if (currentState == FAIL_OR_PASS) {
			System.out.println("fail or pass");
			drawSuccessScreen(g);
			drawFailScreen(g);
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
		g.drawImage(classroom, 0, 0, 1000, 666, null);

	}

	void drawTeacherScreen(Graphics g) {
		g.drawImage(teacherDesk, 0, 0, 1000, 666, null);
		
	}

	void drawDoorScreen(Graphics g) {
		g.drawImage(door, 0, 0, 1000, 666, null);
		
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
			} else if (currentState == CLASSROOM) {
				currentState = TEACHER_DESK;
			} else if (currentState == TEACHER_DESK) {
			//	currentState = MATH_WORKSHEET;
		//	} else if (currentState == MATH_WORKSHEET) {
				currentState = DOOR;
			} else if (currentState == DOOR) {
				currentState = FAIL_OR_PASS;
			} else if (currentState == FAIL_OR_PASS) {
				currentState = TITLE_SCREEN;
			}
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
}
