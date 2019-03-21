package entity.UserMst;

public class SelectUserMst {

	String userId;
	String password;

	public SelectUserMst() {
	}

	public SelectUserMst(String userId, String password) {
		this.userId = userId;
		this.password = password;
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

}
