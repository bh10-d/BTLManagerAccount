package PackageController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import PackageModel.*;
import PackageView.*;

public class ManagerAccount{
	storeData arrUserPass = new storeData();
	popUpRegisterSuccess pupUpSuccField;
	popUpFailRegister popUpFailField;
	FormatUserPass accountUserPass;
//	public static void main(String[] args)
		public ManagerAccount()	{
		// TODO Auto-generated method stub
		gui_ja a = new gui_ja();
		a.setVisible(true);
		
		
		a.getButtonREGISTER().addActionListener(new ActionListener()  {
		public void actionPerformed(ActionEvent e) {
			String user = a.getTextFieldUSER().getText();
			String pass = a.getTextFieldPASSWORD().getText();
			
			//lay tu textfield
			accountUserPass = new FormatUserPass(user,pass);
			
			if(arrUserPass.getArr().size() == 0){
				arrUserPass = new storeData(accountUserPass);
				pupUpSuccField = new popUpRegisterSuccess();
			}
	
			if(arrUserPass.getArr().size() != 0) {
				for(FormatUserPass accountInArray : arrUserPass.getArr()) {
					if(accountInArray.getUser() == accountUserPass.getUser()) {
						popUpFailField = new popUpFailRegister();
						
					}
					
				}
				arrUserPass = new storeData(accountUserPass);
				
//				new popUpRegisterSuccess();
			}
			
		}
		});
		 
		a.getButtonLOGIN().addActionListener(e -> {
			for(FormatUserPass acc : arrUserPass.getArr()) {
				if(acc.getUser() == accountUserPass.getUser()) {
					new ControllCenter();
					a.dispose();
				}else {
					new popUpFailLogin();
				}
			}
		});
		//new ControllCenter(); 
	}
}
