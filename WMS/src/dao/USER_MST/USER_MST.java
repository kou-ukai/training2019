package dao.USER_MST;

import java.util.ArrayList;
import java.util.List;

import entity.UserMst.SelectUserMst;
import entity.UserMst.UserMst;

public class USER_MST {

	List<UserMst> table;

	public USER_MST() {
		this.table = new ArrayList<>();
		this.table.add(new UserMst("system","system","システム管理者","9"));
		this.table.add(new UserMst("000001","000001","ユーザ１","0"));
		this.table.add(new UserMst("000002","000002","ユーザ２","0"));
	}

	public UserMst selectUserMst(SelectUserMst prm) {

		return this.table.parallelStream()
				.filter(t -> t.getUserId().equals(prm.getUserId()) && t.getPassword().equals(prm.getUserId()))
				.findFirst()
				.orElse(null);
	}

}
