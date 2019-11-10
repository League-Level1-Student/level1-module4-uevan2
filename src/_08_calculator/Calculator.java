package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame mainFrame = new JFrame("Simple Calculator");
	JPanel mainPanel = new JPanel();
	JTextField firstNumber = new JTextField(20);
	JTextField secondNumber = new JTextField(20);
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton multiply = new JButton("multiply");
	JButton divide = new JButton("divide");
	JLabel answer = new JLabel();

	void run() {
		mainFrame.add(mainPanel);
		
		mainPanel.add(firstNumber);
		mainPanel.add(secondNumber);
		mainPanel.add(add);
		mainPanel.add(subtract);
		mainPanel.add(multiply);
		mainPanel.add(divide);
		mainPanel.add(answer);
		
		mainFrame.setVisible(true);
		mainFrame.pack();
		
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);

	}
	
	int add() {
		int firstNumberInt = Integer.parseInt(firstNumber.getText());
		int secondNumberInt = Integer.parseInt(secondNumber.getText());
		return firstNumberInt+secondNumberInt;
	}
	
	int subtract() {
		int firstNumberInt = Integer.parseInt(firstNumber.getText());
		int secondNumberInt = Integer.parseInt(secondNumber.getText());
		return firstNumberInt-secondNumberInt;
		}
	
	int multiply() {
		int firstNumberInt = Integer.parseInt(firstNumber.getText());
		int secondNumberInt = Integer.parseInt(secondNumber.getText());
		return firstNumberInt*secondNumberInt;
		}
		
	int divide() {
		int firstNumberInt = Integer.parseInt(firstNumber.getText());
		int secondNumberInt = Integer.parseInt(secondNumber.getText());
		return firstNumberInt/secondNumberInt;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(add)) {
			answer.setText(""+add());
		}
		else if(e.getSource().equals(subtract)) {
			answer.setText(""+subtract());
		}
		else if(e.getSource().equals(multiply)) {
			answer.setText(""+multiply());
		}
		else{
			answer.setText(""+divide());
		}
		
	}
}
