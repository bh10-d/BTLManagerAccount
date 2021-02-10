package PackageModel;
import java.sql.*;

public class ConnectDatabase {
	private String url;
	private String user;
	private Connection con;
	
	public ConnectDatabase() throws Exception {
		String url = "jdbc:sqlserver://HieuBui\\\\SQLEXPRESS01:1433;databaseName=DataMA;integratedSecurity=true";
		String user = "sa";
		String password = "03072002";
		con = DriverManager.getConnection(url,user,password);
		System.out.println("connect successful.....");
				
	}
	public Connection getCon() {
		return con;
	}
	/*
	public static void main(String args[]) {
		try {
			ConnectDatabase ahi = new ConnectDatabase();
			
			Statement aha = ahi.getCon().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = aha.executeQuery("select count(id) as countId from tableuserpassword");
			rs.absolute(1);
			System.out.println(rs.getString(1));
			if(rs.getInt(1) == 0) {
				int rs2 = aha.executeUpdate("insert into tableuserpassword(users,passwords) values('ahii','huhu')");
			
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	*/
	
	
	
}
