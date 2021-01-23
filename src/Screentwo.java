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
	private static JPanel listtt;
	private static JScrollPane scrollPane;
	private static JButton Add;
	private static JButton Charts;
	private static JButton Sub;
	private static JTextField moneyt;
	private static JTextField datet;
	private static JTextField dest;
	private static JTextArea sumt;
	
	
	public static void Screen() {
		
		JFrame frame = new JFrame("Account Manager");
		frame.setMinimumSize(new Dimension(900, 600));
		frame.setMaximumSize(new Dimension(900, 600));
		
		JPanel panel = new JPanel();
		panel.setBounds(450, 0, 450, 600);
		panel.setBackground(Color.gray);
		

		listtt = new JPanel();
		
		//scrollPane = new JScrollPane(listtt);
		listtt.setBackground(Color.white);
		listtt.setFont(new Font("Calibri", Font.BOLD, 15));
		//scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//panelOfscrollPane.add(scrollPane);
		
		
		/*JLabel*/ yourmoney = new JLabel("Enter Money");
		yourmoney.setFont(new Font("Calibri",Font.BOLD,30));
		/*JLabel*/ date = new JLabel("Date");
		date.setFont(new Font("Calibri",Font.BOLD,30));
		/*JLabel*/ des = new JLabel("Description");
		des.setFont(new Font("Calibri",Font.BOLD,30));
		/*JLabel*/ sum = new JLabel("Your account = ");
		sum.setFont(new Font("Calibri",Font.BOLD,25));
		/*JLabel*/ list = new JLabel("List");
		list.setFont(new Font("Calibri", Font.BOLD, 40));
		
		
		Add = new JButton("Add");
		Charts = new JButton("Charts");
		Sub = new JButton("Sub");
		
		
		/*JTextField*/ moneyt = new JTextField();
		moneyt.setFont(new Font("Calibri", Font.BOLD, 30));
		/*JTextField*/ datet = new JTextField();
		datet.setFont(new Font("Calibri", Font.BOLD, 30));
		/*JTextField*/ dest = new JTextField();
		dest.setFont(new Font("Calibri", Font.BOLD, 20));
		
		
		/*JTextArea*/ sumt = new JTextArea();
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
		listtt.setBounds(40,40,370,420);//listtt
		//panelOfscrollPane.setSize(380, 430);
		
		Add.setBounds(500, 500, 90, 30);
		Charts.setBounds(740, 500, 90, 30);
		Sub.setBounds(620, 500, 90, 30);
		
		
		moneyt.setBounds(500, 100, 300, 50);
		datet.setBounds(500, 250, 300, 50);
		dest.setBounds(500, 400, 300, 50);
		sumt.setBounds(200, 490, 200, 30);// textArea nay se tinh tong so tien hien co!!!

		
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
		frame.add(listtt);
		//frame.add(panelOfscrollPane);
		
	//-----------------------------------
		frame.add(panel);
		frame.setLayout(null);
		frame.setVisible(true);
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
	public static void setAdd() {
		
	}
	
	public static JButton getCharts() {
		return Charts;
	}
	public static void setCharts() {
		
	}
	
	public static JButton getSub() {
		return Sub;
	}
	public static void setSub() {
		
	}
	
	public static JPanel getPanel() {
		return listtt;
	}
	
}
