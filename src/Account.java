
public class Account {
	private String user;
	private String password;
	private static long money = 0L;
	private String des;
	private Dates date;
	

	public Account(String user,String password) {
		this.user = user;
		this.password = password;
	}
	public Account(long money,String des,Dates date){
		this.money = money;
		this.des = des;
		this.date = date;
	}
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return password;
	}
	//su li tien
	public static void setMoneyFlus(long moneys) {
		money += moneys;
	}
	public static void setMoneySub(long moneys) {
		money -= moneys;
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
	public String toString() {
		return "USER :"+user+"\n"+"PASSWORD"+password;
	}
}
