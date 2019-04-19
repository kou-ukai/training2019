package jp.co.cis.bbs.service;

import javax.servlet.http.HttpServletRequest;

public class RegistrationService {

	public void insert(HttpServletRequest request) {

		UserBean uBean = new UserBean();

		String name = request.getParameter("name");

		String password = request.getParameter("password");

		if (name != null && !name.isEmpty() && password != null && !password.isEmpty()) {

			uBean.setName(name);

			uBean.setPassword(password);

			UserDao uDao = UserDao();

			uDao.insert(uBean);

		} else {

			request.setAttribute("message", "受け取りエラー");

		}

	}

	/*
	 	登録する為の文 
	 	
	 	
	 	
	 	
	  public void insert(UserBean uBean) throws SQLException{
	  	//クラス及び変数の用意
		int numRow = 0;
		PreparedStatement pstatement = null;
		String sql = "INSERT INTO user(name,password) VALUES(?,?)";
		
	
		try {
	
			//トランザクション開始及びSQL文保持オブジェクト作成
			connection.setAutoCommit(false);
			pstatement = connection.prepareStatement(sql);
	
			//INパラメーターの設定
			pstatement.setString(1, uBean.getName());
			pstatement.setString(2, uBean.getPassword());
	
			//登録行数の取得
			numRow = pstatement.executeUpdate();
	
		} finally {
	
			//登録の判定
			if (numRow > 0) {
	
				//登録成功時コミットの実施
				connection.commit();
				request.setAttribute("message", "ユーザ追加完了");
	
			} else {
	
				//登録失敗時ロールバックの実施
				connection.rollback();
				request.setAttribute("message", "ユーザ追加失敗");
			}
	
			//オブジェクトの開放の実施
			pstatement.close();
	
		}
	
	 */

}
