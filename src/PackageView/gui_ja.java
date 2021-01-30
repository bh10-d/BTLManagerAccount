package PackageView;

import PackageModel.*;
import PackageView.*;
import PackageController.*;

//giao dien front end form dang ki, dang nhap
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPasswordField;

public class gui_ja extends JFrame {
	protected JPanel contentPane;
	protected JTextField textFieldUSER;
	protected JButton ButtonREGISTER;
	protected JButton ButtonLOGIN;
	private JPasswordField FieldPass;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_ja frame = new gui_ja();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the frame.
	 */
	public gui_ja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{67, 0, 0, 89, 191, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{78, 20, 0, 20, 0, 0, 115, 0, 0, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel_1 = new JLabel("USER");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textFieldUSER = new JTextField();
		GridBagConstraints gbc_textFieldUSER = new GridBagConstraints();
		gbc_textFieldUSER.gridwidth = 3;
		gbc_textFieldUSER.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUSER.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldUSER.gridx = 4;
		gbc_textFieldUSER.gridy = 1;
		contentPane.add(textFieldUSER, gbc_textFieldUSER);
		textFieldUSER.setColumns(10);
		
		lblNewLabel = new JLabel("PASSWORD");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		FieldPass = new JPasswordField();
		GridBagConstraints gbc_FieldPass = new GridBagConstraints();
		gbc_FieldPass.gridwidth = 3;
		gbc_FieldPass.insets = new Insets(0, 0, 5, 5);
		gbc_FieldPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_FieldPass.gridx = 4;
		gbc_FieldPass.gridy = 2;
		contentPane.add(FieldPass, gbc_FieldPass);
		
		ButtonREGISTER = new JButton("REGISTER");
		//ButtonREGISTER.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//	}
		//});
		GridBagConstraints gbc_ButtonREGISTER = new GridBagConstraints();
		gbc_ButtonREGISTER.gridwidth = 3;
		gbc_ButtonREGISTER.anchor = GridBagConstraints.NORTHEAST;
		gbc_ButtonREGISTER.insets = new Insets(0, 0, 5, 5);
		gbc_ButtonREGISTER.gridx = 1;
		gbc_ButtonREGISTER.gridy = 7;
		contentPane.add(ButtonREGISTER, gbc_ButtonREGISTER);
		
		ButtonLOGIN = new JButton("LOGIN");
		//ButtonLOGIN.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//	}
		//});
		GridBagConstraints gbc_ButtonLOGIN = new GridBagConstraints();
		gbc_ButtonLOGIN.insets = new Insets(0, 0, 5, 5);
		gbc_ButtonLOGIN.anchor = GridBagConstraints.NORTH;
		gbc_ButtonLOGIN.fill = GridBagConstraints.HORIZONTAL;
		gbc_ButtonLOGIN.gridx = 5;
		gbc_ButtonLOGIN.gridy = 7;
		contentPane.add(ButtonLOGIN, gbc_ButtonLOGIN);
	}
	public JTextField getTextFieldUSER() {
		return textFieldUSER;
	}
	public JPasswordField getFieldPass() {
		return FieldPass;
	}
	public JButton getButtonREGISTER() {
		return ButtonREGISTER;
	}
	
	public JButton getButtonLOGIN() {
		return ButtonLOGIN;
	}
	
	public String toString() {
		return textFieldUSER+" "+FieldPass;
	}
//	public static void main(String args[]) {
//		RegisterForm a = new RegisterForm();
//		a.setVisible(true);
//		a.getRegisterButton().addActionListener(e -> {
//			String b = String.valueOf(a.getRegisterPassTF().getPassword()) ;
//			System.out.println(b);
//			
//		});
//	}
}
