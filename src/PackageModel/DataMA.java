package PackageModel;
import java.sql.*;
import java.util.*;
public class DataMA{
	public static void main(String[]args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		String n = "'admin'";
		
		Connection connection = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionURL="jdbc:sqlserver://HieuBui\\SQLEXPRESS01:1433;databaseName=DataMA;integratedSecurity=true";
			connection = DriverManager.getConnection(connectionURL, "sa", "03072002");
			System.out.println("Ket noi thanh cong!!!!!!!!!!!!!!!");
			
			Statement stmt = connection.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from Dulieu where id='2'");
			ResultSet rs = stmt.executeQuery("select * from Taikhoan where username= " + n +"and passwordd= "+n);
			
			
			
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
//                        + "  " + rs.getString(3)+" "+rs.getString(4));
//            }
			
			
            while (rs.next()) {
                System.out.println(rs.getInt(1));
            }
			
		} catch (ClassNotFoundException e) {
			System.out.println("Ket noi that bai!!!!!!!!!!");
			System.err.println(e.getMessage()+"\n"+e.getClass()+"\n"+e.getCause());
		}
		
	}
	
}