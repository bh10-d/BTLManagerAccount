package PackageController;
import java.sql.*;

import PackageModel.*;
import PackageView.*;
public class Main {
	public static void main(String args[]) {
		new ControlRegisterForm();
		/*
		try {
			ConnectDatabase a = new ConnectDatabase();
			Statement sttm = a.getCon().createStatement();
			
			ResultSet rs = sttm.executeQuery("Select * from tableuserpassword");
			while(rs.next()) {
				System.out.println(rs.getString("users")+"  "+rs.getString("passwords"));
			}
		
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
	}
	
}
