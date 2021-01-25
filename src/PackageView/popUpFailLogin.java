package PackageView;

import javax.swing.*;

public class popUpFailLogin {
	private JFrame frameFailLog;
	
	public popUpFailLogin() {
		frameFailLog = new JFrame();
		JOptionPane.showMessageDialog(frameFailLog, "LogIn Failure","Warning",JOptionPane.WARNING_MESSAGE);
	
	}
}
