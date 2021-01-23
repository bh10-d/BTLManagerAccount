package PackageView;

//lop ni toi bang 2
public class UserCurrent {
	private String User2;
	private long Current2;

	public UserCurrent() {
		User2 = "";
		Current2 = 0L;
	}
	
	public UserCurrent(String User2,long Current2) {
		this.User2 = User2;
		this.Current2 = Current2;
	}

	public String getUser2() {
		return User2;
	}

	public void setUser2(String user2) {
		User2 = user2;
	}

	public long getCurrent2() {
		return Current2;
	}

	public void setCurrent2(long current2) {
		Current2 = current2;
	}

	
	
}
