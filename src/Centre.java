
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Centre {
    public static void main(String[]args) {
    	
        JFrame frame = new JFrame();
        JPanel basic = new JPanel();
        
        basic.setLayout(new BoxLayout(basic, BoxLayout.X_AXIS));
        
        
        
        frame.add(basic);
        basic.add(Box.createVerticalGlue());
        

        JPanel centre = new JPanel();	
        centre.setAlignmentY(Component.RIGHT_ALIGNMENT);
        centre.setLayout(new BoxLayout(centre, BoxLayout.Y_AXIS));
        
        
        
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        
        
//        JTextField textField = new JTextField();
        
        label1.setText("Set Money");
       
        
        JTextField textField = new JTextField();
//        textField.setBounds(200, 50, 10, 30);
        label2.setText("Set Date");
        
        JTextField textField1 = new JTextField();
//        textField1.setBounds(200, 100, 10, 30);
        label3.setText("Set Description");
        
        JTextField textField2 = new JTextField();
//        textField2.setBounds(200, 150, 10, 30);
        
        
        centre.add(label1);
        centre.add(Box.createRigidArea(new Dimension(15,0)));
        
//        centre.add(textField);
//        centre.add(Box.createRigidArea(new Dimension(15,0)));
        
        centre.add(label2);
        centre.add(Box.createRigidArea(new Dimension(15,0)));
        
        
//        centre.add(textField1);
//        centre.add(Box.createRigidArea(new Dimension(15,0)));
        
        
        centre.add(label3);
        centre.add(Box.createRigidArea(new Dimension(15,0)));
        
        
//        centre.add(textField2);
//        centre.add(Box.createRigidArea(new Dimension(15,0)));
        
        
        
        basic.add(label1);
//        basic.add(textField);
        basic.add(label2);
//        basic.add(textField1);
        basic.add(label3);
//        basic.add(textField2);
        
        
        
        
        
        
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
