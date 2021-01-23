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

public class gui_ja extends JFrame {

	protected JPanel contentPane;
	protected JTextField textFieldUSER;
	protected JTextField textFieldPASSWORD;
	protected JButton ButtonREGISTER;
	protected JButton ButtonLOGIN;
	/**
	 * Launch the application.
	 */
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
		gbl_contentPane.columnWidths = new int[]{67, 89, 191, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{78, 20, 0, 20, 0, 0, 115, 0, 0, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel LabelUSER = new JLabel("USER");
		GridBagConstraints gbc_LabelUSER = new GridBagConstraints();
		gbc_LabelUSER.anchor = GridBagConstraints.WEST;
		gbc_LabelUSER.fill = GridBagConstraints.VERTICAL;
		gbc_LabelUSER.insets = new Insets(0, 0, 5, 5);
		gbc_LabelUSER.gridx = 1;
		gbc_LabelUSER.gridy = 1;
		contentPane.add(LabelUSER, gbc_LabelUSER);
		
		textFieldUSER = new JTextField();
		GridBagConstraints gbc_textFieldUSER = new GridBagConstraints();
		gbc_textFieldUSER.gridwidth = 2;
		gbc_textFieldUSER.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUSER.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldUSER.gridx = 2;
		gbc_textFieldUSER.gridy = 1;
		contentPane.add(textFieldUSER, gbc_textFieldUSER);
		textFieldUSER.setColumns(10);
		
		JLabel LabelPASSWORD = new JLabel("PASSWORD");
		GridBagConstraints gbc_LabelPASSWORD = new GridBagConstraints();
		gbc_LabelPASSWORD.anchor = GridBagConstraints.WEST;
		gbc_LabelPASSWORD.insets = new Insets(0, 0, 5, 5);
		gbc_LabelPASSWORD.gridx = 1;
		gbc_LabelPASSWORD.gridy = 2;
		contentPane.add(LabelPASSWORD, gbc_LabelPASSWORD);
		
		textFieldPASSWORD = new JTextField();
		GridBagConstraints gbc_textFieldPASSWORD = new GridBagConstraints();
		gbc_textFieldPASSWORD.gridwidth = 2;
		gbc_textFieldPASSWORD.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldPASSWORD.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPASSWORD.gridx = 2;
		gbc_textFieldPASSWORD.gridy = 2;
		contentPane.add(textFieldPASSWORD, gbc_textFieldPASSWORD);
		textFieldPASSWORD.setColumns(10);
		
		ButtonREGISTER = new JButton("REGISTER");
		//ButtonREGISTER.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//	}
		//});
		GridBagConstraints gbc_ButtonREGISTER = new GridBagConstraints();
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
		gbc_ButtonLOGIN.gridx = 3;
		gbc_ButtonLOGIN.gridy = 7;
		contentPane.add(ButtonLOGIN, gbc_ButtonLOGIN);
	}
}
