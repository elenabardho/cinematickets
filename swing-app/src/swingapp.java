import javax.swing.JFrame;

public class swingapp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();         // creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setTitle("App");        // title
		frame.setSize(500, 500);      // dimensions	
		frame.setVisible(true);		  // visibility
	}
}
