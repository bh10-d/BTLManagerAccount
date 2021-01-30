package PackageController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import PackageModel.*;
import PackageView.*;
import java.sql.*;

// su li toan bo chuong trinh
public class ManagerAccount{
	
	private ConnectDatabase varConnect;
	private Statement sttm;
//	private PreparedStatement preSttm;
	private String str;
	private String str2;
	private String Strtt;
	
//	FormatUserPass accountUserPass;
	

	public ManagerAccount()	throws Exception{
		gui_ja a = new gui_ja(); 
		a.setVisible(true);
		
		
		varConnect = new ConnectDatabase();
		sttm = varConnect.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	
//		String SQL = "SELECT * FROM tableuserpassword"; 
//		ResultSet rs = sttm.executeQuery(SQL);
			
		// TODO Auto-generated catch block
		a.getButtonREGISTER().addActionListener(new ActionListener()  {
		public void actionPerformed(ActionEvent e) {
			new ControlRegisterForm();
		}
		});
		
		a.getButtonLOGIN().addActionListener(e -> {
			
			String user = a.getTextFieldUSER().getText();
			String pass = String.valueOf(a.getFieldPass().getPassword());
			boolean checkLogin = false;
			try {
				String SQL = "SELECT * FROM tableuserpassword"; 
				ResultSet rs = sttm.executeQuery(SQL);
				while(rs.next()) {
	
					if(rs.getString("users").equals(user) && rs.getString("passwords").equals(pass)) {
						checkLogin = true;
					}

				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if(checkLogin == true) {
				new ControllCenter();
				a.dispose();
				System.out.println(checkLogin);
			}else { 
				new popUpFailLogin();
				
			}
			
		});
		//new ControllCenter(); 
	}
	public static void main(String args[]) {
		try {
			new ManagerAccount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}