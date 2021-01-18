import java.sql.*;
public class DataMA{

	public static void main(String[]args) throws SQLException {
		
		Connection connection = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionURL="jdbc:sqlserver://HieuBui\\SQLEXPRESS01:1433;databaseName=DataMA;integratedSecurity=true";
			connection = DriverManager.getConnection(connectionURL, "sa", "03072002");
			System.out.println("Ket noi thanh cong!!!!!!!!!!!!!!!");
			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) 
                        + "  " + rs.getString(3));
            }
			
		} catch (ClassNotFoundException e) {
			System.out.println("Ket noi that bai!!!!!!!!!!");
			System.err.println(e.getMessage()+"\n"+e.getClass()+"\n"+e.getCause());
		}
		
	}
	
}