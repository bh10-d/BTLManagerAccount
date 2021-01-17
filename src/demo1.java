import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class demo1{
	public static void main(String[]args) {
		
		
		
		JFrame frame = new JFrame("Manage Account");
		JLabel label = new JLabel("Money!!");
		JLabel label1 = new JLabel("Date!!");
		JLabel label2 = new JLabel("Description!!");
		JLabel label3 = new JLabel("Sum = ");
		
		
		
		JButton Add = new JButton("Add");
		JButton Change = new JButton("Change");
		JButton Delete = new JButton("Delete");
		
		
		
		
		JTextField textField = new JTextField();
		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		JTextArea textArea = new JTextArea();
		

		
		frame.setMinimumSize(new Dimension(900,600));
		frame.setMaximumSize(new Dimension(900,600));
		

		
		label.setBounds(500, 50, 100, 10);
		label1.setBounds(500, 200, 100, 10);
		label2.setBounds(500, 350, 100, 10);
		label3.setBounds(150, 480, 100, 50);
		
		Add.setBounds(500, 500, 90, 30);
		Change.setBounds(620, 500, 90, 30);
		Delete.setBounds(740, 500, 90, 30);
		
		
		textField.setBounds(500, 100, 300, 50);
		textField1.setBounds(500, 250, 300, 50);
		textField2.setBounds(500, 400, 300, 50);
		
		
		textArea.setBounds(250, 480, 200, 50);// textArea nay se tinh tong so tien hien co!!!
		
		
		
		
		
		frame.add(label);
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(Add);
		frame.add(Change);
		frame.add(Delete);
		frame.add(textField);
		frame.add(textField1);
		frame.add(textField2);
		frame.add(textArea);
		
		
		
		
		frame.setLayout(null);
		frame.setSize(900, 600);
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
	}
}