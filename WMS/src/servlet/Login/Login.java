package servlet.Login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// エラーメッセージラベルを初期化

		// ユーザ情報を取得

		// 入力されたユーザID、パスワードが存在するかチェック
		// 存在しない場合、エラーメッセージをセット

		// ユーザが存在しない場合、エラーメッセージを設定し、ログイン画面を表示する。
		// ユーザが存在する場合、以下の処理を行う。
		// 取得したUSER_MST.Authorityが"9"の場合、menu.jspの"title"に"管理者用メニュー"をセットする。
		// 取得したUSER_MST.Authorityが"0"の場合、menu.jspの"title"に"一般用メニュー"をセットする。
		// menu.jspの"userName"に取得したUSER_MST.UserNameをセットする。
		// メニュー画面を表示する。

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
