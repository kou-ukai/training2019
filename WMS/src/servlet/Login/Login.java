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
		String errorMessage;
		String jsp;

		// ユーザ情報を取得
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");

		// 入力されたユーザID、パスワードが存在するかチェック
		if(userId.isEmpty() && password.isEmpty()) {
			
		// 存在しない場合、エラーメッセージをセット
			errorMessage="ID・パスワードが間違っています";
			request.setAttribute("errorMessage", errorMessage);
			jsp="login.jsp";
		}
		
		SelectUserMst selectUser=new SelectUserMst(userId,password);
		USER_MST mst=new USER_MST();
		mst.selectUserMst(selectUser);
		
		// ユーザが存在しない場合、エラーメッセージを設定し、ログイン画面を表示する。
		if() {
			errorMessage="ユーザが存在しません";
			request.setAttribute("errorMessage", errorMessage);
			jsp="login.jsp";
		
		// ユーザが存在する場合、以下の処理を行う。
		}else {
		// 取得したUSER_MST.Authorityが"9"の場合、menu.jspの"title"に"管理者用メニュー"をセットする。
			if(mst.equals("9")) {
				request.setAttribute("title", "管理者メニュー");
				
		// 取得したUSER_MST.Authorityが"0"の場合、menu.jspの"title"に"一般用メニュー"をセットする。
			}else {
				request.setAttribute("title", "一般メニュー");
			}
		// menu.jspの"userName"に取得したUSER_MST.UserNameをセットする。
			request.setAttribute("userName", );
			
		// メニュー画面を表示する。
			jsp="menu.jsp";
		}
		
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher(jsp);
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
