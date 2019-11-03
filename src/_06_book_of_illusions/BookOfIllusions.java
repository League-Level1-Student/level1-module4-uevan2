package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame frameOne = new JFrame();
	JLabel labelOne; 
	JLabel labelTwo;
	
	
	public void run() {
		// 2. make the frame visible
		frameOne.setVisible(true);
		// 3. set the size of the frame
		frameOne.setSize(80, 80);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		int location = 0;
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		labelOne = loadImageFromComputer("optical-illusion-stock-getty (1).jpg");
		labelTwo = loadImageFromComputer("download.jpeg");
		// 7. use the "loadImage..." methods below to initialize your JLabel
		// 8. add your JLabel to the frame
		frameOne.add(labelOne);
		// 9. call the pack() method on the frame
		frameOne.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		labelOne.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked!");
		// 12. remove everything from the frame that was added earlier
		frameOne.remove(labelOne);
		// 13. load a new image like before (this is more than one line of code)
		frameOne.add(labelTwo);
		// 14. pack the frame
		frameOne.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


