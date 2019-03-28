package servlet.Login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.USER_MST.USER_MST;
import entity.UserMst.SelectUserMst;

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
		String message="";
		String jsp;

		// ユーザ情報を取得
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");

		//必要クラスのオブジェクト生成
		SelectUserMst selectUser = new SelectUserMst(userId, password);
		USER_MST mst = new USER_MST();

		// 初回起動時の処理を記述（起動時全てnullの為、空かどうかは次に記述）
		if (userId == null && password == null) {

			request.setAttribute("message", message);
			jsp = "WEB-INF/jsp/login.jsp";

		//PASSかIDどちらかが入力されなっかた場合
		} else if (userId.isEmpty() || password.isEmpty()) {

			message = "必ずID・パスワードを入力してください";
			request.setAttribute("message", message);
			jsp = "WEB-INF/jsp/login.jsp";

		// ユーザが存在しない場合、エラーメッセージを設定し、ログイン画面を表示する。
		} else if (mst.selectUserMst(selectUser) == null) {

			message = "ユーザが存在しません";
			request.setAttribute("message", message);
			jsp = "WEB-INF/jsp/login.jsp";
			
		//パスワードが違う場合、エラーメッセージを設定し、ログイン画面を表示する。
		}else if(!mst.selectUserMst(selectUser).getPassword().equals(password)) {
			
			message = "パスワードが違います";
			request.setAttribute("message", message);
			jsp = "WEB-INF/jsp/login.jsp";

		// ユーザが存在する場合、以下の処理を行う。
		} else {

			if (mst.selectUserMst(selectUser).getAuthority().equals("9")) {

				// 取得したUSER_MST.Authorityが"9"の場合、menu.jspの"title"に"管理者用メニュー"をセットする。
				request.setAttribute("title", "管理者メニュー");

			} else {

				// 取得したUSER_MST.Authorityが"0"の場合、menu.jspの"title"に"一般用メニュー"をセットする。
				request.setAttribute("title", "一般メニュー");

			}

			// menu.jspの"userName"に取得したUSER_MST.UserNameをセットする。
			request.setAttribute("userName", mst.selectUserMst(selectUser).getUserName());

			// メニュー画面を表示する。
			jsp = "WEB-INF/jsp/menu.jsp";
		}

		RequestDispatcher dispatcher;
		dispatcher = request.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
