
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ManagerAccount{
	public static void main(String[]args) {
		
		 JFrame frame = new JFrame();
		
		 JPanel basic = new JPanel();
		 // tao 1 panel theo chieu tu tren xuong//
		 basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
		 frame.add(basic);
		 //tao 1 panel theo chieu ngang va ep sang phai//
		 basic.add(Box.createVerticalGlue());
		 
		 JPanel bottom = new JPanel();
		 bottom.setAlignmentX(Component.RIGHT_ALIGNMENT);
	     bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
	     
	     JButton Add = new JButton("Add");
	     JButton Change = new JButton("Change");
	     JButton Delete = new JButton("Delete");
	 
	     
	     bottom.add(Add);
	     bottom.add(Box.createRigidArea(new Dimension(60,0)));
	     
	     bottom.add(Change);
	     bottom.add(Box.createRigidArea(new Dimension(60, 0)));
	     bottom.add(Delete);
	     bottom.add(Box.createRigidArea(new Dimension(15, 0)));
	 
	     basic.add(bottom);
	     basic.add(Box.createRigidArea(new Dimension(0, 15)));
	     //
	     

	     
	 
	     
	     //container
	     JLabel label = new JLabel("First App"); 
	     frame.setMinimumSize(new Dimension(900,600));
	     frame.setMaximumSize(new Dimension(900,600));
	     frame.setVisible(true);
		 
		 
		 
	}
}
