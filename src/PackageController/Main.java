package PackageController;

import PackageView.*;

import java.awt.EventQueue;
import java.util.ArrayList;

import PackageModel.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_ja frame = new gui_ja();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		//new getGUI_ja();
		*/
//		gui_ja frame = new gui_ja();
//		frame.setVisible(true);
		new ManagerAccount();
		/*
		Account ac = new Account("ahihi","yahio");
		storeData a = new storeData();
		
		for(Account i : a.getArr()) {
			System.out.println(i.toString());
		}
		
		System.out.println(a.getArr().size());
		*/
	}
		
}
