package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
	JFrame wFrame = new JFrame();
	JPanel wPanel = new JPanel();
	Random whichButton = new Random();
	JButton button1 = new JButton("mole");
	JButton button2 = new JButton();
	int whichMole = 0;
	int missCounter = 0;

	void run() {
		wFrame.add(wPanel);
		
		whichMole = whichButton.nextInt(24);
		
		for(int i = 0; i < 24; i++) {
			if(i==whichMole) {
				wPanel.add(button1);
				button1.addActionListener(this);
			}
			
			else {
				JButton button2 = new JButton();
				wPanel.add(button2);
				button2.addActionListener(this);
			}
		}
		
		
		wFrame.setSize(300, 350);
		wFrame.setVisible(true);
		
		
		
	}
	
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		wFrame.dispose();
		whichMole = whichButton.nextInt(24);
		if(buttonClicked.getText().equals("mole")) {
			
			for(int i = 0; i < 24; i++) {
				if(i==whichMole) {
					wPanel.add(button1);
					button1.addActionListener(this);
				}
				
				else {
					wPanel.add(button2);
					button2.addActionListener(this);
				}
			}
		speak("You hit the mole");
		wFrame.add(wPanel);
		wFrame.setSize(300, 350);
		wFrame.setVisible(true);
		}
		
		else {
			for(int i = 0; i < 24; i++) {
				if(i==whichMole) {
					wPanel.add(button1);
					button1.addActionListener(this);
				}
				
				else {
					wPanel.add(button2);
					button2.addActionListener(this);
				}
			}
			missCounter++;
			speak("You missed the mole");
			wFrame.add(wPanel);
			wFrame.setSize(300, 350);
			wFrame.setVisible(true);
		}
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
		//endGame( , 10);
}
