import javax.swing.JFrame;

public class Runner {
	JFrame frame= new JFrame();
	final int width= 1000;
	final int height= 800;
			
public static void main(String[] args) {
	Runner runner= new Runner();
	runner.setup();
}
void setup() {
	frame.setVisible(true);
	frame.setSize(width,height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	
	//need to add more things like start game for anything to run
}
}
