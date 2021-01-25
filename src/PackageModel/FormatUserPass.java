package PackageModel;

public class FormatUserPass {
	private String user;
	private String password;
	
	public FormatUserPass(String user,String password) {
		this.user = user;
		this.password = password;	
	}
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return "User :"+user+", Password :"+password;
	}
	
	
}
