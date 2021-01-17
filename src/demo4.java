import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class demo4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		
		
		JPanel controlpanel = new JPanel();
		
		JPanel panel = new JPanel();
		
		
//		panel.setBounds(500, 0, 500, 600);
		
//		controlpanel.setLayout(new GridBagLayout());
		
		GridBagLayout layout = new GridBagLayout();
		
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		controlpanel.setBounds(300, 0, 300, 600);
		
//		panel.setBounds(200, 0, 200, 400);
//		gc.anchor = GridBagConstraints.LINE_END;
		panel.setSize(500, 500);
		controlpanel.setBackground(Color.gray);
		panel.setBackground(Color.darkGray);
		
		controlpanel.add(panel);
		
//		frame.add(panel);
		frame.add(controlpanel);
		
		frame.setLayout(null);
		
		
		
		frame.setVisible(true);
		
		
		
		
		
	}

}
