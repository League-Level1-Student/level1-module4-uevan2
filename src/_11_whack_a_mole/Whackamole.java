package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Whackamole implements ActionListener {
	JFrame wFrame = new JFrame();
	JPanel wPanel = new JPanel();
	Random whichButton = new Random();
	JButton button1 = new JButton("mole");
	JButton button2 = new JButton();
	int whichMole = 0;
	int missCounter = 0;
	Date timeAtStart = new Date();
	int molesWhacked=0;
	
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

	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		molesWhacked++;
		if(molesWhacked==10) {
			endGame(timeAtStart, molesWhacked);
			System.exit(0);
		}
		JButton buttonClicked = (JButton) e.getSource();
		button1.removeActionListener(this);
		button2.removeActionListener(this);
		wFrame.remove(wPanel);
		wPanel = new JPanel();
		wFrame.add(wPanel);
		whichMole = whichButton.nextInt(24);
		button2.removeAll();
		if(buttonClicked.getText().equals("mole")) {
			
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
		speak("You hit the mole");
		wFrame.add(wPanel);
		wFrame.setSize(300, 350);
		wFrame.setVisible(true);
		}
		
		else {
			if(missCounter==0) {
				System.out.println("Nice try");
			}
			else if(missCounter==1){
				System.out.println("Oops");
			}
			else if(missCounter==2){
				System.out.println("You missed");
			}
			else if(missCounter==3){
				System.out.println("Try again");
			}
			else if(missCounter==4){
				System.out.println("You lost");
				System.exit(0);
			}
			System.out.println();
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
			missCounter++;
			speak("You missed the mole");
			wFrame.add(wPanel);
			wFrame.setSize(300, 350);
			wFrame.setVisible(true);
		}
	}
}
