package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	JLabel l1 = new JLabel();
	
	char currentLetter = generateRandomLetter();
	
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	
	void LetterGenerator() {
		
		f1.setVisible(true);
		f1.add(p1);
		f1.setSize(100, 50);
		
		p1.add(l1);
		f1.pack();
		
		l1.setSize(30, 30);
		l1.setText(""+currentLetter);
		f1.addKeyListener(this);
		
	}
	
	public static void main(String[] args) {
		
		TypingTutor x = new TypingTutor();
		x.LetterGenerator();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getSource());
		if(e.getKeyChar()==currentLetter) {
			System.out.println("correct");
			p1.setBackground(java.awt.Color.GREEN);
		}
		else {
			System.out.println("incorrect");
			p1.setBackground(java.awt.Color.red);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter=generateRandomLetter();
		l1.setText(""+currentLetter);
	}
}
