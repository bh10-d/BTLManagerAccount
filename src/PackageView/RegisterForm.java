package PackageView;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JButton RegisterButton;
	private JTextField RegisterUserTF;
	private JPasswordField passwordField;
	private JPasswordField passwordEnterField;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("USER");
		label1.setBounds(10, 71, 37, 22);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("PASSWORD");
		label2.setBounds(10, 118, 98, 22);
		contentPane.add(label2);
		
		JLabel lblNewLabel = new JLabel("Enter the password");
		lblNewLabel.setBounds(10, 169, 116, 20);
		contentPane.add(lblNewLabel);
		
		RegisterButton = new JButton("REGISTER");
		RegisterButton.setBounds(147, 227, 136, 23);
		contentPane.add(RegisterButton);
		
		RegisterUserTF = new JTextField();
		RegisterUserTF.setBounds(136, 72, 218, 20);
		contentPane.add(RegisterUserTF);
		RegisterUserTF.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(136, 119, 218, 20);
		contentPane.add(passwordField);
		
		passwordEnterField = new JPasswordField();
		passwordEnterField.setBounds(136, 169, 218, 20);
		contentPane.add(passwordEnterField);
	}
	public JButton getRegisterButton() {
		return RegisterButton;
	}
	public JTextField getRegisterUserTF() {
		return RegisterUserTF;
	}
	public JPasswordField getRegisterPassTF() {
		return passwordField;
	}
	public JPasswordField getRegisterEnterPassTF() {
		return passwordEnterField;
	}
}
