import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class demo5 {

	public static void main(String[] args) {
		//-----------------//
		JFrame frame = new JFrame("Manage Account");
		JPanel panel = new JPanel();
		frame.setMinimumSize(new Dimension(900, 600));
		frame.setMaximumSize(new Dimension(900, 600));
		//-----------------//
		panel.setBounds(450, 0, 450, 600);
		panel.setBackground(Color.gray);
		//-----------------//
		
		JList listtt = new JList();
		listtt.setFont(new Font("Calibri", Font.BOLD, 15));
		
		
		JLabel yourmoney = new JLabel("Enter Money");
		yourmoney.setFont(new Font("Calibri",Font.BOLD,30));
		JLabel date = new JLabel("Date");
		date.setFont(new Font("Calibri",Font.BOLD,30));
		JLabel des = new JLabel("Description");
		des.setFont(new Font("Calibri",Font.BOLD,30));
		JLabel sum = new JLabel("Account Balance = ");
		sum.setFont(new Font("Calibri",Font.BOLD,25));
		JLabel list = new JLabel("List");
		list.setFont(new Font("Calibri", Font.BOLD, 40));
		
		
		JButton Add = new JButton("Add");
		JButton Charts = new JButton("Charts");
		JButton Sub = new JButton("Sub");
		
		
		JTextField moneyt = new JTextField();
		moneyt.setFont(new Font("Calibri", Font.BOLD, 30));
		JTextField datet = new JTextField();
		datet.setFont(new Font("Calibri", Font.BOLD, 30));
		JTextField dest = new JTextField();
		dest.setFont(new Font("Calibri", Font.BOLD, 20));
		
		
		JTextArea sumt = new JTextArea();
		sumt.setFont(new Font("Calibri", Font.BOLD, 30));
//		JTextArea listt = new JTextArea();
//		listt.setFont(new Font("Calibri", Font.BOLD, 15));

		frame.setMinimumSize(new Dimension(900,600));
		frame.setMaximumSize(new Dimension(900,600));
		

		yourmoney.setBounds(500, 50, 200,30);
		date.setBounds(500, 200, 200, 30);
		des.setBounds(500, 350, 200, 30);
		sum.setBounds(10, 480, 250, 60);
		list.setBounds(40, 0, 100, 50);
		
		Add.setBounds(500, 500, 90, 30);
		Charts.setBounds(740, 500, 90, 30);
		Sub.setBounds(620, 500, 90, 30);
		
		
		moneyt.setBounds(500, 100, 300, 50);
		datet.setBounds(500, 250, 300, 50);
		dest.setBounds(500, 400, 300, 50);
		sumt.setBounds(200, 490, 200, 30);// textArea nay se tinh tong so tien hien co!!!
//		listt.setBounds(40,40,370,420);
		listtt.setBounds(40,40,370,420);
		
		frame.add(yourmoney);
		frame.add(date);
		frame.add(des);
		frame.add(sum);
		frame.add(list);
		frame.add(Add);
		frame.add(Charts);
		frame.add(Sub);
		frame.add(moneyt);
		frame.add(datet);
		frame.add(dest);
		frame.add(sumt);
//		frame.add(listt);
		frame.add(listtt);
		
		frame.setLayout(null);
		frame.setSize(900, 600);
		frame.setVisible(true);
	
		//-----------------//
		//event
		
		Add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// tien se in ra o sum
				sumt.append(moneyt.getText());
//				// tien cx se in ra o list
//				listtt.append(moneyt.getText());
//				// date se in ra o list
//				listtt.append(datet.getText());
//				// description
//				listtt.append(dest.getText());
			}
		});
		
		Sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		Charts.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
		
		
	
		//-----------------//
		frame.setLayout(null);
		frame.add(panel);
		frame.setVisible(true);
	}

}
