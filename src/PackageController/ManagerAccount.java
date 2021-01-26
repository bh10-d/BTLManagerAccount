package PackageController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import PackageModel.*;
import PackageView.*;

public class ManagerAccount{
	storeData arrUserPass = new storeData();
	
	boolean checkLogin = false; 
	
	FormatUserPass accountUserPass;
	
//	public static void main(String[] args)
		public ManagerAccount()	{
		// TODO Auto-generated method stub
		gui_ja a = new gui_ja();
		a.setVisible(true);
		
		
		a.getButtonREGISTER().addActionListener(new ActionListener()  {
		boolean checkRegister = false;
		public void actionPerformed(ActionEvent e) {
			
			String user = a.getTextFieldUSER().getText();
			String pass = a.getTextFieldPASSWORD().getText();
			//lay tu textfield
			accountUserPass = new FormatUserPass(user,pass);
//			if(arrUserPass.getArr().size() != 0)
			//bị mảng hành....
			if(arrUserPass.getArr().size() == 0) {
				arrUserPass.setArr(accountUserPass);
				new popUpRegisterSuccess();
			}else {
				for(FormatUserPass accountInArray : arrUserPass.getArr()) {
					if(accountInArray.getUser() == accountUserPass.getUser()) {
						checkRegister = true;
					}
				}
				if(checkRegister) {
					new popUpFailRegister();
				}else {
					arrUserPass.setArr(accountUserPass);
					new popUpRegisterSuccess();
				}
				
			}
//				new popUpRegisterSuccess();
		}
		});
		
		a.getButtonLOGIN().addActionListener(e -> {
			
			if(arrUserPass.getArr().size() == 0){
				new popUpFailLogin();
			} else {
				for(FormatUserPass acc : arrUserPass.getArr()) {
					if(acc.getUser() == accountUserPass.getUser()) {
						checkLogin = true;
					}
				}
				if(checkLogin) {
					new ControllCenter();
					a.dispose();
				}else { 
					new popUpFailLogin();
				}
				
				
			}
//			for(FormatUserPass acc : arrUserPass.getArr()) {
//				if(acc.getUser() == accountUserPass.getUser()) {
//					new ControllCenter();
//					a.dispose();
//				}
//			}
			
		});
		//new ControllCenter(); 
	}
}
