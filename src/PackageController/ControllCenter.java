package PackageController;

import PackageModel.*;
import PackageView.*;
import PackageController.*;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
//import Account;
//import Dates;
//import Screentwo;
import PackageModel.*;

import java.util.*;

public class ControllCenter {
	storeData2 storeAccount;
	//ahihi
	
	public ControllCenter() {
		Screentwo.Screen();
		//Centre center2 = new Centre();
		
		Screentwo.getAdd().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String textYourMoney = Screentwo.getMoneyt().getText();
				Account.setMoneyFlus(Long.parseLong(textYourMoney));
				long longYourMoney = Account.getMoney();
				
				String textDate = Screentwo.getDatet().getText();
				
				String[] arrTextDate = textDate.split("/");
				Dates YourDate = new Dates(Integer.parseInt(arrTextDate[0]),
						Integer.parseInt(arrTextDate[1]),Integer.parseInt(arrTextDate[2]));
				
				String textDes = Screentwo.getDest().getText();
				
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
				
				
				JLabel textLabels = new JLabel();
				//Account.setMoneyFlus(longYourMoney);
				
				textLabels.setText("Thoi gian :"+YourDate.toString()+", Description :"+textDes+", money:"+Long.toString(Account.getMoney()));
				Screentwo.getPanel().add(textLabels);
				
				
				
				Screentwo.getSumt().setText(Long.toString(Account.getMoney()));
				Screentwo.getPanel().setVisible(true);
			}
	
		});
		
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
				
				String textDes = Screentwo.getDest().getText();
				
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
				
				
				JLabel textLabels = new JLabel();
				//Account.setMoneyFlus(longYourMoney);
				
				textLabels.setText("Thoi gian :"+YourDate.toString()+", Description :"+textDes+", money:"+Long.toString(Account.getMoney()));
				Screentwo.getPanel().add(textLabels);
				
				
				
				Screentwo.getSumt().setText(Long.toString(Account.getMoney()));
				Screentwo.getPanel().setVisible(true);
				
			}
		});
		
		Screentwo.getCharts().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		
	}
}
