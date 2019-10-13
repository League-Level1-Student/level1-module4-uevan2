package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {

	JFrame a = new JFrame("Trick or Treat");
	JPanel b = new JPanel();
	JLabel c = new JLabel("Trick");
	JLabel d = new JLabel("Treat");
	JButton e = new JButton();
	JButton f = new JButton();
	
	void setup() {
		a.add(b);
		a.pack();
		a.setVisible(true);
		b.add(e);
		b.add(f);
		e.add(c);
		f.add(d);
		e.addActionListener(this);
		f.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		NastySuprise x = new NastySuprise();
		x.setup();
		
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(f)) {
			showPictureFromTheInternet("https://i.redd.it/jhfs9eg1c5r31.jpg");
		}
		else {
			showPictureFromTheInternet("https://i.redd.it/6x4bjlaqjas31.jpg");
		}
		
	}
}
