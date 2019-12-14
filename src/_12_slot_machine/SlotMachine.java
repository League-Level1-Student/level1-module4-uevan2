package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame slotMachineFrame = new JFrame();
	JPanel slotMachinePanel = new JPanel();
	JLabel reelOne = new JLabel();
	JLabel reelTwo = new JLabel();
	JLabel reelThree = new JLabel();
	Random reelOneImage = new Random();
	Random reelTwoImage = new Random();
	Random reelThreeImage = new Random();
	int reelOneRV = 0;
	int reelTwoRV = 0;
	int reelThreeRV = 0;
	JButton spin = new JButton("Spin");
	int winCounter = 0;
	JLabel winCounterLabel = new JLabel();
	
	void run() {
		slotMachineFrame.add(slotMachinePanel);
		slotMachineFrame.setVisible(true);
		slotMachinePanel.add(spin);
		spin.addActionListener(this);
		
		slotMachineFrame.pack();
	}
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}


	@Override
	public void actionPerformed(ActionEvent d) {
		// TODO Auto-generated method stub	
	slotMachinePanel.remove(reelOne);
	slotMachinePanel.remove(reelTwo);
	slotMachinePanel.remove(reelThree);

	reelOneRV = reelOneImage.nextInt(3);
	
		if(reelOneRV==0) {
		
			try {
				reelOne=(createLabelImage("Cherry.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(reelOneRV==1) {
		
			try {
				reelOne=(createLabelImage("Diamond.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(reelOneRV==2) {
		
			try {
				reelOne=(createLabelImage("Seven.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		reelTwoRV = reelTwoImage.nextInt(3);
		
		if(reelTwoRV==0) {
		
			try {
				reelTwo=(createLabelImage("Cherry.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(reelTwoRV==1) {
		
			try {
				reelTwo=(createLabelImage("Diamond.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(reelTwoRV==2) {
		
			try {
				reelTwo=(createLabelImage("Seven.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		reelThreeRV = reelThreeImage.nextInt(3);
		
		if(reelThreeRV==0) {
		
			try {
				reelThree=(createLabelImage("Cherry.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(reelThreeRV==1) {
		
			try {
				reelThree=(createLabelImage("Diamond.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(reelThreeRV==2) {
		
			try {
				reelThree=(createLabelImage("Seven.png"));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		slotMachinePanel.add(reelOne);
		slotMachinePanel.add(reelTwo);
		slotMachinePanel.add(reelThree);
		slotMachineFrame.pack();
		
		if(reelThreeRV==reelOneRV&&reelTwoRV==reelOneRV) {
			System.out.println("You Win!");
		}
	}
}
