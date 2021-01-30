package PackageModel;

public class FormatUserPass {
	private String users;
	private String passwords;
	
	public FormatUserPass(String user,String password) {
		this.users = user;
		this.passwords = password;	
	}
	public void setUser(String users,String passwords) {
		this.users = users;
		this.passwords = passwords;
	}
	public String getUser() {
		return users;
	}
	public String getPassword() {
		return passwords;
	}
	public String toString() {
		return "User :"+users+", Password :"+passwords;
	}
	
}
