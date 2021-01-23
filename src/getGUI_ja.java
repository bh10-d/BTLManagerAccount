
//rut TextField cua user,password
import javax.swing.*;



public class getGUI_ja extends gui_ja {
	public getGUI_ja() {
		super();
	}
	public JTextField getTextFieldUSER() {
		return textFieldUSER;
	}
	public JTextField getTextFieldPASSWORD() {
		return textFieldPASSWORD;
	}
	public String toString() {
		return textFieldUSER+" "+textFieldPASSWORD;
	}
}
