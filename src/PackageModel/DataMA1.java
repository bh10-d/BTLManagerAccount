package PackageModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class DataMA1 {
	public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";	
	public static String dbURL = "jdbc:sqlserver://HieuBui\\SQLEXPRESS01:1433;databaseName=DataMA;integratedSecurity=true";
	public static String dbUser = "sa";
	public static String dbPass = "03072002";
	
	
	public Connection getConnect() throws ClassNotFoundException, SQLException {
		Class.forName(DataMA1.driverName);
		Connection connection = DriverManager.getConnection(DataMA1.dbURL, DataMA1.dbUser, DataMA1.dbPass);
		return connection;
	}
	
	public Vector<Vector<String>> getAll() throws ClassNotFoundException, SQLException{
		Vector<Vector<String>> data = new Vector<>();
		Connection connection = getConnect();
		
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Dulieu");
		
		
		while (rs.next()) {

		    // Lấy dữ liệu từ ResultSet
		    String money = rs.getString(1);
		    String date = rs.getString(2);
		    String description = rs.getString(3);
		    
		    
		    
		    Vector<String> temp = new Vector<>();
		    temp.add(money);
		    temp.add(date);
		    temp.add(description);


		    // Thêm dữ liệu vào data vector chính
		    data.add(temp);
		}
		return data;
	}
	
	
	
	
	public void addNew(String money, String date, String description)throws ClassNotFoundException, SQLException {
            
		// Kết nối database
		Connection connection = getConnect();

		// Tạo câu lệnh SQL (Cách 2: sử dụng PreparedStatement)
		String sql = "INSERT INTO Students(Tien,Ngay,Mota) VALUES(?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, money);
		stmt.setString(2, date);
		stmt.setString(3, description);


		// Thực hiện lệnh SQL
		stmt.executeUpdate();

		// Đóng kết nối
		connection.close();
	}
	
	
	
	
	
//	//xoa 1 dong du lieu trong database
//	public int delete(String Sno) throws SQLException, ClassNotFoundException {
//		int deleteStatus = 0;
//
//		// Kết nối database
//		Connection connection = getConnect();
//
//		// Xóa sinh viên
//		String sql = "DELETE FROM STUDENTS WHERE Sno='" + Sno + "'";
//		Statement stm1 = connection.createStatement();
//		deleteStatus = stm1.executeUpdate(sql);
//
//		// Trả về kết quả int (có xóa thành công hay không)
//		connection.close();
//		return deleteStatus;
//	    }
	
	
	
	
	
//	
}

