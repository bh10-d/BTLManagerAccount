import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class demo2 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel title = new JLabel();
		title.setText("Manager Account");
		frame.setMinimumSize(new Dimension(600, 600));
		frame.setMaximumSize(new Dimension(600, 600));
		//--------------------------//
		// Label
		JLabel money = new JLabel("Money:");
		JLabel date = new JLabel("Date:");
		JLabel des = new JLabel("Description:");
		
		//TextField
		JTextField moneyt = new JTextField(10);
		JTextField datet = new JTextField(10);
		JTextField dest = new JTextField(10);
		
		
		//Button
		JButton add = new JButton("Add");
		JButton change = new JButton("Change");
		JButton delete = new JButton("Delete");
		
		
		
		//--------------------------//
		frame.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		//--------------------------//
		//label money
		gc.anchor = GridBagConstraints.PAGE_START;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.gridx = 0;
		gc.gridy = 0;
		frame.add(money,gc);
		//label date
		gc.weightx = 1;
		gc.weighty = 1;
		gc.gridx = 0;
		gc.gridy = 2;
		frame.add(date,gc);
		
		//label description
		gc.gridx = 0;
		gc.gridy = 4;
		frame.add(des,gc);
		//textfield money
		gc.gridx = 0;
		gc.gridy = 1;
		frame.add(moneyt,gc);
		//textfield date
		gc.gridx = 0;
		gc.gridy = 3;
		frame.add(datet,gc);
		//textfield description
		gc.gridx = 0;
		gc.gridy = 5;
		frame.add(dest,gc);
		//button add
		gc.anchor = GridBagConstraints.CENTER;
		gc.weighty = 40;
		gc.gridx = 0;
		gc.gridy = 7;
		frame.add(add,gc);
		//button change
		gc.gridx = 1;
		gc.gridy = 7;
		frame.add(change,gc);
		//button delete
		gc.gridx = 2;
		gc.gridy = 7;
		frame.add(delete,gc);
		
		
		
		
		//--------------------------//
		frame.setVisible(true);
	}

}
