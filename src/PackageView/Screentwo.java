package PackageView;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class Screentwo{
	private static JLabel yourmoney;
	private static JLabel date;
	private static JLabel des;
	private static JLabel sum;
	private static JLabel list;
	private static JPanel panelOfscrollPane;
	private static JPanel panel1;
	private static JList listt;
	private static JScrollPane scrollPane;
	private static JButton Add;
	private static JButton Charts;
	private static JButton Sub;
	private static JButton Del;
	private static JTextField moneyt;
	private static JTextField datet;
	private static JTextField dest;
	private static JTextArea sumt;
	private static DefaultListModel listmode;
//___________________________________________________________________________________________________//	
	public static void Screen() {
		// Khoi tao cua so chuong trinh
		JFrame frame = new JFrame("Account Manager");
		//frame.setSize(900, 600);
		frame.setMinimumSize(new Dimension(900, 600));
		frame.setMaximumSize(new Dimension(900, 600));
		// Khoi tao panel
		JPanel panel = new JPanel();
		panel.setBounds(450, 0, 450, 600);
		panel.setBackground(Color.gray);
//__________________________________________________________________________________________________//
		// Khoi tao panel1 dung de chua list
		panel1 = new JPanel();
		panel1.setBackground(Color.white);
		listt = new JList();
		listt.setFont(new Font("Calibri", Font.BOLD, 15));
		//Khoi tao con lan!!!
		scrollPane = new JScrollPane();
		scrollPane.getViewport().add(listt);
		scrollPane.setPreferredSize(new Dimension(370,428));
//___________________________________________________________________________________________________//
		
//		ImageIcon background = new ImageIcon("images/lethanhcong5.png");
//		JLabel setbackground = new JLabel();
//		setbackground.setIcon(background);
//		setbackground.setBounds(450, 0, 450, 600);

//___________________________________________________________________________________________________//
		// Khoi tao cac tieu de cho tung thanh phan
		/*JLabel*/ yourmoney = new JLabel("Enter Money");
		yourmoney.setFont(new Font("Calibri",Font.BOLD,30));
		/*JLabel*/ date = new JLabel("Date");
		date.setFont(new Font("Calibri",Font.BOLD,30));
		JLabel format = new JLabel("(mm/dd/yyyy)");
		format.setFont(new Font("Calibri",Font.BOLD,20));
		/*JLabel*/ des = new JLabel("Description");
		des.setFont(new Font("Calibri",Font.BOLD,30));
		/*JLabel*/ sum = new JLabel("Your account = ");
		sum.setFont(new Font("Calibri",Font.BOLD,25));
		/*JLabel*/ list = new JLabel("List");
		list.setFont(new Font("Calibri", Font.BOLD, 40));
		/*
		 * Khoi tao cac button chuc nang cua chuong trinh 
		 */
		// Add button!!!!!
		Add = new JButton("Add");
		Add.setBackground(Color.pink);
		//Charts button!!!!!
		Charts = new JButton("Charts");
		Charts.setBackground(Color.pink);
		//Sub button!!!!!
		Sub = new JButton("Sub");
		Sub.setBackground(Color.pink);
		//Delete button!!!!!
		Del = new JButton("Del");
		Del.setBackground(Color.pink);
		// Khoi tao cac vung nhap du lieu vao chuong trinh
		/*JTextField*/ moneyt = new JTextField();
		moneyt.setFont(new Font("Calibri", Font.BOLD, 30));
		/*JTextField*/ datet = new JTextField();
		datet.setFont(new Font("Calibri", Font.BOLD, 30));
		/*JTextField*/ dest = new JTextField();
		dest.setFont(new Font("Calibri", Font.BOLD, 20));
		// Khoi tao vung xuat thong tin duoc xu ly tu chuong trinh
		/*JTextArea*/ sumt = new JTextArea();
		sumt.setFont(new Font("Calibri", Font.BOLD, 30));
		/* 
		 * Tao vi tri cho cac button, label, jlist.
		 */
		// Khoi tao cac label 
		yourmoney.setBounds(500, 50, 200,30);
		date.setBounds(500, 200, 200, 30);
		format.setBounds(565, 199, 200, 30);
		des.setBounds(500, 350, 200, 30);
		sum.setBounds(10, 480, 250, 60);
		list.setBounds(40, 0, 100, 50);//label
		// Thiet lap vi tri cho panel1
		panel1.setBounds(40,40,370,435);
		// Thiet lap vi tri cho cac button
		Add.setBounds(500, 500, 90, 30);
		Charts.setBounds(740, 500, 90, 30);
		Sub.setBounds(620, 500, 90, 30);
		Del.setBounds(740,500,90,30);
		// Thiet lap vi tri cho cac vung nhap du lieu
		moneyt.setBounds(500, 100, 300, 50);
		datet.setBounds(500, 250, 300, 50);
		dest.setBounds(500, 400, 300, 50);
		sumt.setBounds(200, 490, 200, 30);// textArea nay se tinh tong so tien hien co!!!
//___________________________________________________________________________________________________//
		// Thiet lap hien thi cho cac component(thanh phan)
		panel1.add(scrollPane);
		frame.add(yourmoney);
		frame.add(date);
		frame.add(format);
		frame.add(des);
		frame.add(sum);
		frame.add(list);
		frame.add(Add);
		//frame.add(Charts);
		frame.add(Sub);
		frame.add(Del);
		frame.add(moneyt);
		frame.add(datet);
		frame.add(dest);
		frame.add(sumt);
		frame.add(panel1);
		// Thiet lap hien thi cho chuong trinh
		frame.add(panel);
		frame.setLayout(null);
		frame.setVisible(true);
//___________________________________________________________________________________________________//
	}
	
	public static JLabel getYourmoney() {
		return yourmoney;
	}
	
	public static JLabel getDate() {
		return date;
	}

	public static JLabel getDes() {
		return des;
	}

	public static JLabel getSum() {
		return sum;
	}

	public static JLabel getList() {
		return list;
	}

	public static JTextField getMoneyt() {
		return moneyt;
	}
	
	public static JTextField getDatet() {
		return datet;
	}

	public static JTextField getDest() {
		return dest;
	}

	public static JTextArea getSumt() {
		return sumt;
	}

	public static JButton getAdd() {
		return Add;
	}

	public static JButton getCharts() {
		return Charts;
	}
	
	public static JButton getSub() {
		return Sub;
	}
	public static JButton getDel() {
		return Del;
	}
	
	public static JPanel getPanel() { 
		return panel1;
	}
	
	public static JList getListt() {
		return listt;
	}
	
	public static JScrollPane getScrollPane() {
		return scrollPane;
	}
}

