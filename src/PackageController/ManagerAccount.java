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
	private Statement stmt;
//	private PreparedStatement preSttm;
	private String str;
	private String str2;
	private String Strtt;
	private static int id;
	
//	FormatUserPass accountUserPass;
	

	public ManagerAccount()	throws Exception{
		gui_ja a = new gui_ja(); // tao doi tuong thuoc lop gui_ja
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
				
				String SQL = "SELECT * FROM tableuserpassword"; // lay het toan bo du lieu trong bang tableuserpassword
				ResultSet rs = sttm.executeQuery(SQL);// thuc hien cau lenh truy van trong databse
				while(rs.next()) {
	
					if(rs.getString("users").equals(user) && rs.getString("passwords").equals(pass)) {
						checkLogin = true;
						//
						
						try {
							stmt = varConnect.getCon().createStatement();
							ResultSet data = stmt.executeQuery("select id from tableuserpassword where users ="+"'"+user+"'"+"and passwords = "+"'"+pass+"'");
							while(data.next()) {
								
								id = data.getInt(1);// luon luon nhan duoc gia tri id khi username va password correct
								
								System.out.println(getId());// in ra id de check 
							}
							
							

						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						////////////////
					}//if

				}//while
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if(checkLogin == true) {
				new ControllCenter(); // neu checklogin bang true thi chay bang nhap du lieu len
				a.dispose(); // neu checklogin dung thi hien thi cua so len
				//_________________________________________________
				
				
//				try {
//					stmt = varConnect.getCon().createStatement();
//					ResultSet data = stmt.executeQuery("select id from tableuserpassword where users ="+user+"and passwords = "+pass);
//					while(data.next()) {
//						System.out.println(data.getInt(1));
//					}
//					
//					
////					PreparedStatement data = varConnect.getCon().prepareStatement("select users from tableuserpassword");
////					System.out.println(data);
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				
				//_________________________________________________
				System.out.println(checkLogin); // sau khi hoan thi se chinh sau dong code nay k co y nghia chi in ra true de test
			}else { 
				new popUpFailLogin(); // nguoc lai neu checklogin false thi cua so dang nhap that bai se hien len
				
			}
			
		});
		//new ControllCenter(); 
	}
	
	// muon lay duoc id thi phai viet lai cai main chay ra 1 lop khac
//	public static void main(String args[]) {
//		try {
//			new ManagerAccount();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public static int getId() {
		return id;
	}

}