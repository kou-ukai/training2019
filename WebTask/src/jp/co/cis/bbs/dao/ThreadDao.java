package jp.co.cis.bbs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.cis.bbs.model.ThreadBean;

public class ThreadDao {
	private Connection connection;

	//データベース接続
	public ThreadDao() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://192.168.1.37:3306/training_bbs";
		String user = "training_user1";
		String password = "password";
		connection = DriverManager.getConnection(url, user, password);

	}

	//切断
	public void close() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	//データベースのなかの情報を取得してリストに格納
	public ArrayList<ThreadBean> getThreadList() throws SQLException {
		ArrayList<ThreadBean> threadList = null;
		PreparedStatement pstatement = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT*FROM thread";
			pstatement = connection.prepareStatement(sql);
			rs = pstatement.executeQuery();
			threadList = new ArrayList<>();

			while (rs.next()) {
				ThreadBean bb = new ThreadBean();
				bb.setId(rs.getString("thread_id"));
				bb.setTitle(rs.getString("thread_title"));
				bb.setTime(rs.getString("thread_time"));
				threadList.add(bb);
			}
			rs.close();
		} finally {
			pstatement.close();
		}
		return threadList;

	}

	//受け取ったスレッドIDと一致するスレッドの情報をbeanに格納
	public ThreadBean getThread(int threadId) throws SQLException {
		ThreadBean bean = null;
		PreparedStatement pstatement = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT*FROM thread WHERE thread_id=?";
			pstatement = connection.prepareStatement(sql);
			pstatement.setInt(1, threadId);
			rs = pstatement.executeQuery();

			while (rs.next()) {
				ThreadBean bb = new ThreadBean();
				bb.setId(rs.getString("thread_id"));
				bb.setTitle(rs.getString("thread_title"));
				bb.setTime(rs.getString("thread_time"));
			}
			rs.close();
		} finally {
			pstatement.close();
		}
		return bean;

	}

	//送られてきた情報をデータベースにinsert
	public int insertThread(ThreadBean bb) throws SQLException {
		int numRow = 0;
		PreparedStatement pstatement = null;
		try {
			connection.setAutoCommit(false);

			String sql = "INSERT INTO thread (thread_title,thread_time) VALUES(?,?)";
			pstatement = connection.prepareStatement(sql);

			pstatement.setString(1, bb.getTitle());
			pstatement.setString(2, bb.getTime());

			numRow = pstatement.executeUpdate();
		} finally {
			if (numRow > 0) {
				connection.commit(); //insertできたらcommit
			} else {
				connection.rollback(); //insert出来なかったらrollback
			}
			pstatement.close();
		}
		return numRow;
	}

}
