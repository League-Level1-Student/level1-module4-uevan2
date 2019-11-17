package _11_whack_a_mole;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whackamole {
	JFrame wFrame = new JFrame();
	JPanel wPanel = new JPanel();
	
	JButton globalButton = new JButton("MOLE!");
	
	void run() {
		wFrame.add(wPanel);
		wPanel.add(globalButton);
		
		for(int i = 0; i < 23; i++) {
			JButton button = new JButton();
			wPanel.add(button);
		}
		
		wFrame.setSize(300, 350);
		wFrame.setVisible(true);
		
	}
}
