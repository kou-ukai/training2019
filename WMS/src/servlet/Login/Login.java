package servlet.Login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.USER_MST.USER_MST;
import entity.UserMst.SelectUserMst;
import entity.UserMst.UserMst;

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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String jsp;

		// エラーメッセージラベルを初期化
		String errorMessage = "";

		// ユーザ情報を取得
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		USER_MST us = null;
		UserMst um = null;

		if (userId == null && password == null) {
			request.setAttribute("message", errorMessage);
			jsp = "/WEB-INF/jsp/login.jsp";
		} else {
			us = new USER_MST();
			um = us.selectUserMst(new SelectUserMst(userId, password));//ユーザー情報を格納
			// 入力されたユーザID、パスワードが存在するかチェック
			// 存在しない場合、エラーメッセージをセット
			// ユーザが存在しない場合、エラーメッセージを設定し、ログイン画面を表示する。
			if (um == null) {
				errorMessage = "正しいユーザーIDとパスワードを入力してください";
				request.setAttribute("message", errorMessage);
				jsp = "/WEB-INF/jsp/login.jsp";

				// ユーザが存在する場合、以下の処理を行う。
				// 取得したUSER_MST.Authorityが"9"の場合、menu.jspの"title"に"管理者用メニュー"をセットする。
				// 取得したUSER_MST.Authorityが"0"の場合、menu.jspの"title"に"一般用メニュー"をセットする。
				// menu.jspの"userName"に取得したUSER_MST.UserNameをセットする。
			} else {
				if (um.getAuthority().equals("9")) {
					request.setAttribute("title", "管理者用メニュー");
					request.setAttribute("userName", um.getUserName());
					jsp = "/WEB-INF/jsp/menu.jsp";
				} else if (um.getAuthority().equals("0")) {
					request.setAttribute("title", "一般用メニュー");
					request.setAttribute("userName", um.getUserName());
					jsp = "/WEB-INF/jsp/menu.jsp";
				} else {
					errorMessage = "エラー";
					request.setAttribute("message", errorMessage);
					jsp = "/WEB-INF/jsp/login.jsp";
				}
			}

		}

		// メニュー画面を表示する。
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher(jsp);
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
