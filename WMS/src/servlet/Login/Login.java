package servlet.Login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String url=null;
		
		// エラーメッセージラベルを初期化
		String errorMessage=null;

		// ユーザ情報を取得
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		
		// 入力されたユーザID、パスワードが存在するかチェック
		// 存在しない場合、エラーメッセージをセット
		if(userId==null||password==null) {
			errorMessage="エラー";
			request.setAttribute("errorMessage", errorMessage);
		}

		// ユーザが存在しない場合、エラーメッセージを設定し、ログイン画面を表示する。
		if(session==null) {
			errorMessage="エラー";
			url="/login";
			
			// ユーザが存在する場合、以下の処理を行う。
			// 取得したUSER_MST.Authorityが"9"の場合、menu.jspの"title"に"管理者用メニュー"をセットする。
			// 取得したUSER_MST.Authorityが"0"の場合、menu.jspの"title"に"一般用メニュー"をセットする。
			// menu.jspの"userName"に取得したUSER_MST.UserNameをセットする。
		}else {
			if((new  USER_MST().selectUserMst(new SelectUserMst(userId,password))).getAuthority()=="9") {
				request.setAttribute("title", "管理者用メニュー");
			}else if((new  USER_MST().selectUserMst(new SelectUserMst(userId,password))).getAuthority()=="0") {
				request.setAttribute("title", "一般用メニュー");
			}
		}
		
		// メニュー画面を表示する。
		ServletContext context=getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/menu.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
