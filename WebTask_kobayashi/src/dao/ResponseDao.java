package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import bean.ResponseBean;

/**
 *Response用データベースアクセスクラス
 */
public class ResponseDao {

	//データベースアクセス用　変数
	private final String JDBC_URL = "jdbc:mysql://192.168.1.37:3306/training_bbs";
	private final String DB_USER = "training_user1";
	private final String DB_PASS = "password";
	public Connection connection;

	//データベース追加文
	private final String INSERT_SQL = "INSERT INTO Response(Thread_id,response_name,response_coment) VALUES(?,?,?)";

	//スレッドIDによる検索SQL文
	private final String THREAD_ID_SEACH_SQL = "SELECT * FROM Response WHERE thread_id=?";

	/**インスタンス作成と同時にデータベースとの接続を行う
	 * @throws SQLException
	 */
	public ResponseDao() throws SQLException {

		connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

	}

	/**
	 * データベース切断用メソッド
	 */
	public void close() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**Beanから追加用のデータを預かり追加するメソッド
	 * @param rBean　追加用のデータ
	 * @throws SQLException
	 */
	public void insertResponseDao(ResponseBean rBean, HttpServletRequest request) throws SQLException {

		//クラス及び変数の用意
		int numRow = 0;
		PreparedStatement pstatement = null;

		try {

			//トランザクション開始及びSQL文保持オブジェクト作成
			connection.setAutoCommit(false);
			pstatement = connection.prepareStatement(INSERT_SQL);

			//INパラメーターの設定
			pstatement.setInt(1, rBean.getT_id());
			pstatement.setString(2, rBean.getR_name());
			pstatement.setString(3, rBean.getR_coment());

			//登録行数の取得
			numRow = pstatement.executeUpdate();

		} finally {

			//登録の判定
			if (numRow > 0) {

				//登録成功時コミットの実施
				connection.commit();
				request.setAttribute("message", "コメント追加完了");

			} else {

				//登録失敗時ロールバックの実施
				connection.rollback();
				request.setAttribute("message", "コメント追加失敗");
			}

			//オブジェクトの開放の実施
			pstatement.close();

		}

	}

	/**スレッドIDと関係があるデータを呼び出し
	 * @param id　スレッドid
	 * @return 検索結果
	 * @throws SQLException
	 */
	public void threadIdSeach(int id, HttpServletRequest request) throws SQLException {

		//各必要クラスの用意
		ResponseBean rBean = null;
		PreparedStatement pstatement = null;
		ResultSet rs = null;
		ArrayList<ResponseBean> comentList = null;

		try {

			//INパラメターとSQL文を保持するオブジェクトを作成
			pstatement = connection.prepareStatement(THREAD_ID_SEACH_SQL);
			pstatement.setInt(1, id);
			comentList = new ArrayList<ResponseBean>();

			//抽出結果をオブジェクトに格納
			rs = pstatement.executeQuery();

			//結果をListに格納
			while (rs.next()) {
				rBean = new ResponseBean();
				rBean.setT_id(rs.getInt("Response_id"));
				rBean.setT_id(rs.getInt("Thread_id"));
				rBean.setR_name(rs.getString("Response_name"));
				rBean.setR_coment(rs.getString("Response_coment"));
				comentList.add(rBean);
			}

			if (!comentList.isEmpty()) {

				request.setAttribute("comentList", comentList);

			}

			rs.close();

		} finally {

			pstatement.close();
		}

	}

}
