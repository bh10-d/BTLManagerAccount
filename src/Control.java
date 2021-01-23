import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
public class Control extends Centre{
	DataMA1 control = new DataMA1();
	
	//------------------
	
	private void btnAddActionPerformed(ActionEvent arg0) {
		Component contentPane = null;
		try {
		    //Lấy dữ liệu nhập trên phần mềm
			String money = getMoneyt().getText();
		    String date = getDatet().getText();
		    String description = getDest().getText();


		    // Kiểm tra dữ liệu nhập vào, kiểm tra trùng khóa chính trong database
//		    if (manager.checkStudent(Sno)) throw new Exception("This student ID is already exits in database!");
//		    if (!Validation.checkIdFormat(Sno)) throw new Exception("Id of student can not contain space!");
//		    if (!Validation.checkNameFormat(Sname)) throw new Exception("Name of student can not contain special(s) character!");
//		    if (!Validation.checkIdFormat(Sclass)) throw new Exception("Name of class can not contain special(s) character!");
//		    if (!Validation.checkNameFormat(Sadress)) throw new Exception("Adress can not contain special(s) character!");

		    // Thêm dữ liệu vào database
		    control.addNew(money, date, description);
		    Vector<String> header = new Vector<String>();
			header.add("ID");
			header.add("Name");
			header.add("Gender");
		    // Cập nhật hiển thị database cho phần mềm
		  
		    Vector<Vector<String>> data = control.getAll();
		    ((DefaultTableModel) (getListt().getModel())).setDataVector(data, header);

		    // Thông báo thành công
		    JOptionPane.showMessageDialog(contentPane, "Add Success!", "Sucess", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e1) {
		    JOptionPane.showMessageDialog(contentPane, "Add new failure\nDetails: " + e1, "Error", JOptionPane.ERROR_MESSAGE);
		}
	    }
	
	//------------------
}
*/