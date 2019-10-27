package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton b1 = new JButton("joke");
	JButton b2 = new JButton("punchline");
	
	public static void main(String[] args) {
		
		ChuckleClicker x = new ChuckleClicker();
		x.makeButtons();
		
	}

	void makeButtons() {
		
		JFrame f1 = new JFrame();
		f1.setVisible(true);
		JPanel p1 = new JPanel();
		f1.add(p1);
		p1.add(b1);
		p1.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(null, "joke");
		}
		if(e.getSource()==b2) {
			JOptionPane.showMessageDialog(null, "punchline");
		}
	}
	
}