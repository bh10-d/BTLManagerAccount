package PackageController;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import PackageModel.*;
import PackageView.*;
import java.util.*;

public class ControllCenter {
	storeData2 storeAccount;
	private String textYourMoney;
	private long longYourMoney;
	private String textDate;
	private Dates YourDate;
	private String[] arrTextDate;
	private String textDes;
	private Account account;
	private ArrayList<Account> temporaryStorage;
	private String textLabels;
	
	public ControllCenter() {
		Control Ctrl = new Control();
		Screentwo.Screen();
		DefaultListModel<Control> mode = new DefaultListModel<>();// set mode cho list 
		Screentwo.getListt().setModel(mode);//_____________________________
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
//_________________________________________________________________________________________//
				/*
				getGUI_ja userVsPasswordOfYour = new getGUI_ja();
				String userVaPassword = userVsPasswordOfYour.toString();
				String[] arrUserVsPassword = userVaPassword.split("\\s");
				*/
				//cai ni de luu tru tam thoi chuan bi luu vo arraylist(luu vo array tam)
				
				account = new Account(longYourMoney,textDes,YourDate);
				temporaryStorage = new ArrayList<Account>();
				temporaryStorage.add(account);
				
				//luu vo arraylist toan cuc(luu tru ben lop storeData)
				
				storeAccount = new storeData2(temporaryStorage);
				// Dua du lieu vao 
				Ctrl.setTextDate(textDate);
				Ctrl.setTextDes(textDes);
//_________________________________________________________________________________________//
				JTextArea/*JLabel*/ textLabels = new JTextArea();
				String textdate = new String();
				JTextArea textmoney = new JTextArea();
				String money = new String();
				money = Long.toString(Account.getMoney());
				textdate = YourDate.toString();
				
				// Dua du lieu vao
				Ctrl.setTextmoney(money);
				// Lay du lieu ra va in ra man hinh
				textLabels.setText(Ctrl.getTextDate()+Ctrl.getTextDes()+Ctrl.getTextmoney());
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
				Account.setMoneySub(Long.parseLong(textYourMoney));
				long longYourMoney = Account.getMoney();
				String textDate = Screentwo.getDatet().getText();
				String[] arrTextDate = textDate.split("/");
				Dates YourDate = new Dates(Integer.parseInt(arrTextDate[0]),
						Integer.parseInt(arrTextDate[1]),Integer.parseInt(arrTextDate[2]));
				// Lay du lieu cua muc mo ta
				String textDes = Screentwo.getDest().getText();
//_________________________________________________________________________________________//				
				/*
				getGUI_ja userVsPasswordOfYour = new getGUI_ja();
				String userVaPassword = userVsPasswordOfYour.toString();
				String[] arrUserVsPassword = userVaPassword.split("\\s");
				*/
				//cai ni de luu tru tam thoi chuan bi luu vo arraylist(luu vo array tam)
				
				Account account = new Account(longYourMoney,textDes,YourDate);
				ArrayList<Account> temporaryStorage = new ArrayList<Account>();
				temporaryStorage.add(account);
				//luu vo arraylist toan cuc(luu tru ben lop storeData)
				storeAccount = new storeData2(temporaryStorage);
//_________________________________________________________________________________________//
				JTextArea textLabels = new JTextArea();
				//JTextArea textmoney = new JTextArea();
				String money = new String();
				money = Long.toString(Account.getMoney());
				// Dua du lieu vao
				Ctrl.setTextmoney(money);
				Ctrl.setTextDate(textDate);
				Ctrl.setTextDes(textDes);
				// Lay du lieu ra va in ra man hinh
				textLabels.setText(Ctrl.getTextDate()+Ctrl.getTextDes()+Ctrl.getTextmoney());
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

}

