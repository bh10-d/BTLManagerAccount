package PackageController;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import PackageModel.*;
import PackageView.*;
import java.util.*;
import java.sql.*;
import PackageController.ManagerAccount;

// su li screen two;
public class ControllCenter {
	private String textYourMoney;
	private long longYourMoney;
	private String textDate;
	private Dates YourDate;
	private String[] arrTextDate;
	private String textDes;
	private String textLabels;
	private ConnectDatabase connect;
	private ManagerAccount id;
	private Statement stmt;
	private static String moneys;
	private String money;
	private static String d;
	
	public ControllCenter() {
		Control Ctrl = new Control();
		Screentwo.Screen();
		DefaultListModel<Control> mode = new DefaultListModel<>();// set mode cho list 
		Screentwo.getListt().setModel(mode);//_____________________________
		money = new String();
/////////////////////////////////////////////////////////////////		
		// Lay du lieu tu trong database ra
		int Id = id.getId();
		try {
			connect = new ConnectDatabase();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			stmt = connect.getCon().createStatement();
			ResultSet data = stmt.executeQuery("select * from tableaccount where id ="+"'"+Id+"'");
			while(data.next()) {
				
				//System.out.println(data.getString(2)+" "+data.getString(3)+" "+data.getString(4));
				String a = data.getString(2);
				String b = data.getString(3);
				String c = data.getString(4);
				
				
				mode.addElement(new Control(b,c,a));
				
			///////////////////////////////
				
				//Screentwo.getSumt().setText();
				
			///////////////////////////////	
			}
			ResultSet datamoneys = stmt.executeQuery("select sum(moneys) from tableaccount where id ="+"'"+Id+"'");
			while(datamoneys.next()) {
				String d = datamoneys.getString(1);
				Screentwo.getSumt().setText(d);
			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
///////////////////////////////////////////////////////////////		
		
		
		
		
		
		
		
		
		
		// Tao su kien cho button Add(Them,Cong)
		Screentwo.getAdd().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//_________________________________________________________________________________________//
				// Xu ly tien
				textYourMoney = Screentwo.getMoneyt().getText();
				Account.setMoneyFlus(Long.parseLong(textYourMoney));
				longYourMoney = Account.getMoney();
				// Xu ly ngay
				textDate = Screentwo.getDatet().getText();
				arrTextDate = textDate.split("/");
				YourDate = new Dates(Integer.parseInt(arrTextDate[0]),
						Integer.parseInt(arrTextDate[1]),Integer.parseInt(arrTextDate[2]));
				// Xu ly mo ta
				textDes = Screentwo.getDest().getText();
				// Lay id
				int Id = id.getId(); 
				
				
//_________________________________________________________________________________________//

				try {
					connect = new ConnectDatabase();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					Statement sttm = connect.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				try {
					PreparedStatement dt = connect.getCon().prepareStatement("insert into tableaccount(id,moneys,times,descriptions) values(?,?,?,?)");
					
					dt.setInt(1, Id);
					dt.setString(2, textYourMoney);
					dt.setString(3, textDate);
					dt.setString(4, textDes);
				
					dt.executeUpdate();
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}// trong nay se co id cua bang 1)

//____________________________________________________________			
				// Dua du lieu vao 
				Ctrl.setTextDate(textDate);
				Ctrl.setTextDes(textDes);
//_________________________________________________________________________________________//
				JTextArea/*JLabel*/ textLabels = new JTextArea();
				String textdate = new String();
				textdate = YourDate.toString();
				JTextArea textmoney = new JTextArea();
//				String money = new String();
				money = Long.toString(Account.getMoney());
				
				//moneys = Long.toString(Account.getMoney());/////////
				
				
				// Dua du lieu vao
				Ctrl.setTextmoney(money);
				// Lay du lieu ra va in ra man hinh
				//textLabels.setText(Ctrl.getTextDate()+Ctrl.getTextDes()+Ctrl.getTextmoney());
				mode.addElement(new Control(Ctrl.getTextDate(),Ctrl.getTextDes(),Ctrl.getTextmoney()));
				
				Screentwo.getSumt().setText(Long.toString(Account.getMoney()));// in ra tong tien 
				Screentwo.getPanel().setVisible(true);
			}
	
		});
		
		// Tao su kien cho button Sub(Tru)
		Screentwo.getSub().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textYourMoney = Screentwo.getMoneyt().getText();
				String textYourMoneyy = "-"+textYourMoney;
				Account.setMoneySub(Long.parseLong(textYourMoney));///_______
				long longYourMoney = Account.getMoney();
				String textDate = Screentwo.getDatet().getText();
				String[] arrTextDate = textDate.split("/");
				Dates YourDate = new Dates(Integer.parseInt(arrTextDate[0]),
						Integer.parseInt(arrTextDate[1]),Integer.parseInt(arrTextDate[2]));
				// Lay du lieu cua muc mo ta
				String textDes = Screentwo.getDest().getText();
				//lay id
				int Id = id.getId();
		

//_____________________________________________________________________________________//
				try {
					connect = new ConnectDatabase();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					Statement sttm = connect.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					PreparedStatement dt = connect.getCon().prepareStatement("insert into tableaccount(id,moneys,times,descriptions) values(?,?,?,?)");
					dt.setInt(1, Id);
					dt.setString(2, textYourMoneyy);
					dt.setString(3, textDate);
					dt.setString(4, textDes);//////
					
					dt.executeUpdate();
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//_________________________________________________________________________________________//
				JTextArea textLabels = new JTextArea();
				//JTextArea textmoney = new JTextArea();
//				String money = new String();
				money = Long.toString(Account.getMoney());
				//moneys = Long.toString(Account.getMoney());
				// Dua du lieu vao
				Ctrl.setTextmoney(money);
				Ctrl.setTextDate(textDate);
				Ctrl.setTextDes(textDes);
				// Lay du lieu ra va in ra man hinh
				//textLabels.setText(Ctrl.getTextDate()+Ctrl.getTextDes()+Ctrl.getTextmoney());
				mode.addElement(new Control(Ctrl.getTextDate(),Ctrl.getTextDes(),Ctrl.getTextmoney()));
				
//_________________________________________________________________________________________//				
				//Screentwo.getScrollPane().add(textmoney);
				Screentwo.getSumt().setText(Long.toString(Account.getMoney()));// lay tong tien ra man hinh
				Screentwo.getPanel().setVisible(true);
				
			}
		});
		

		
		
		
		
		
		
		// chuc nang charts
		Screentwo.getCharts().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
	}

//	public static String getd() {
//		return d;
//	}
//	public static void setd(String dts) {
//		d = dts;
//	}
	
	
	
//	public static String getMoneys() {
//		return moneys;
//	}
}

