package entity.UserMst;

public class UserMst {

	String userId;
	String password;
	String userName;
	String authority;

	public UserMst(String userId, String password, String userName, String authority) {
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.authority = authority;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}


}
