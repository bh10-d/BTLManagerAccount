package PackageModel;

import PackageModel.*;
import PackageView.*;
import PackageController.*;

public class Account {
	
	private static long money = 0L;// d chua (datamoneys)
	private static long moneyy; // d
	private String des;
	private Dates date;
	
	public Account(long money,String des,Dates date){
		this.money = money;
		this.des = des;
		this.date = date;
	}
	//su li tien
	public static void setMoneyFlus(long moneys) {
		money += moneys;
	}
	public static void setMoneySub(long moneys) {
		money -= moneys;
	}
	public static long getMoneyy() {
		return moneyy;
	}
	public static void setMoneyy(long moneyy) {
		money = moneyy;
	}
	public static long getMoney() {
		return money;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Dates getDate() {
		return date;
	}
	public void setDate(Dates date) {
		this.date = date;
	}
}
