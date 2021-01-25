package PackageModel;

import java.util.ArrayList;

public class storeData{
	private ArrayList<FormatUserPass> arrAccount1 = new ArrayList<FormatUserPass>();
	
	public storeData() {
		arrAccount1 = arrAccount1;
	}
	public storeData(FormatUserPass user_pass) {
		arrAccount1.add(user_pass);
	}
	
	public  ArrayList<FormatUserPass> getArr(){
		return arrAccount1;
	}
}
