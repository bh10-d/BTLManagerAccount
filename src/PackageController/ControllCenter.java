package PackageController;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import PackageModel.*;
import PackageView.*;
import java.util.*;
import java.sql.*;
import java.sql.Date; // dinh dang ngay h 
import PackageController.ManagerAccount;

// su li screen two;
public class ControllCenter {
	private String textYourMoney;
	private long longYourMoney;
	private String textDate;
	private Dates YourDate;
	private String[] arrTextDate;
	private String textDes;
	private ConnectDatabase connect;
	private Statement stmt;
	private String money;
	private String test;
	private String aa;
	private String bb;
	private String cc;
	
	
	public ControllCenter() {
		Control Ctrl = new Control();
		Screentwo.Screen();
		DefaultListModel<Control> mode = new DefaultListModel<>();// set mode cho list 
		Screentwo.getListt().setModel(mode);
		money = new String();
		/*
		 * Lay du lieu tu trong database ra 
		 */
		int Id = ManagerAccount.getId();
		try {
			connect = new ConnectDatabase();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			stmt = connect.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet data = stmt.executeQuery("select * from tableaccount where id ="+"'"+Id+"'");
			while(data.next()) {
				String a = data.getString(2);// tien
				String b = data.getString(3);// ngay 
				String c = data.getString(4);// mo ta
				mode.addElement(new Control(b,c,a));
			}
			ResultSet datamoneys = stmt.executeQuery("select sum(moneys) from tableaccount where id ="+"'"+Id+"'");
			datamoneys.absolute(1); // co dong nay se k hien tong so tien trong database ra																			

			while(datamoneys.next()) {
				String d = datamoneys.getString(1);
				Account.setMoneyy(Long.parseLong(d)); // dong nay khi k co du lieu trong dtb thi se hien loi khi khoi dong chuong trinh nhung k co dong nay se k in ra man hinh tong tien duoc
				Screentwo.getSumt().setText(d);
				}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		// Tao su kien cho button Add(Them,Cong)
		Screentwo.getAdd().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
				try {
					connect = new ConnectDatabase();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					PreparedStatement dt = connect.getCon().prepareStatement("insert into tableaccount(id,moneys,times,descriptions) values(?,?,?,?)");
					dt.setInt(1, Id);
					dt.setString(2, textYourMoney);
					dt.setString(3, textDate);
					dt.setString(4, textDes);
					dt.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}		
				// Dua du lieu vao 
				Ctrl.setTextDate(textDate);
				Ctrl.setTextDes(textDes);
				money = Long.toString(Account.getMoney());
				// Dua du lieu vao
				Ctrl.setTextmoney(money);
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
				Account.setMoneySub(Long.parseLong(textYourMoney));
				String textDate = Screentwo.getDatet().getText();
				// Lay du lieu cua muc mo ta
				String textDes = Screentwo.getDest().getText();
				try {
					connect = new ConnectDatabase();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					PreparedStatement dt = connect.getCon().prepareStatement("insert into tableaccount(id,moneys,times,descriptions) values(?,?,?,?)");
					dt.setInt(1, Id);
					dt.setString(2, textYourMoneyy);
					dt.setString(3, textDate);
					dt.setString(4, textDes);//////
					dt.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				money = Long.toString(Account.getMoney());
				// Dua du lieu vao
				Ctrl.setTextmoney(money);
				Ctrl.setTextDate(textDate);
				Ctrl.setTextDes(textDes);
				// Lay du lieu ra va in ra man hinh
				mode.addElement(new Control(Ctrl.getTextDate(),Ctrl.getTextDes(),Ctrl.getTextmoney()));	
				Screentwo.getSumt().setText(Long.toString(Account.getMoney()));// lay tong tien ra man hinh
				Screentwo.getPanel().setVisible(true);
			}
		});
		
		// chuc nang Delete
		Screentwo.getDel().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ListSelectionModel lsm = Screentwo.getListt().getSelectionModel();
				int firstSelected = lsm.getMinSelectionIndex();
			    int lastSelected = lsm.getMaxSelectionIndex();
			    mode.removeRange(firstSelected, lastSelected);			    
				String adate = aa;
				String bdes = bb;
				String cmoney = cc;
			    try {
					connect = new ConnectDatabase();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			    try {
					PreparedStatement dt = connect.getCon().prepareStatement("delete from tableaccount where moneys="+"'"+cmoney+"'"+"and times= "+"'"+adate+"'"+"and descriptions = "+"'"+bdes+"'");
					dt.executeUpdate();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		Screentwo.getListt().addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				ListSelectionModel lsmm = Screentwo.getListt().getSelectionModel();
				int firstSelectedd = lsmm.getMinSelectionIndex();
			    test = mode.get(firstSelectedd).toString1();
			    String []tester = test.split("[,]");
			    aa = tester[0];
			    bb = tester[1];
			    cc = tester[2];
			    //System.out.println(aa+"\n"+bb+"\n"+cc);//test thu co lay duoc du lieu khong
			}
		});
//		 chuc nang charts
//		Screentwo.getCharts().addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//					
//			}
//		});	
		
		
	}


	
}

