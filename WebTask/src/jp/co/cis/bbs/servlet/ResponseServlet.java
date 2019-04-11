package jp.co.cis.bbs.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.cis.bbs.service.ResponseService;

/**
 * Servlet implementation class ComentServlet
 */
@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResponseServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ResponseService rService = new ResponseService();
		//ThreadDisp treadDisp = new ThreadDisp();

		try {

			//コメント検索
			rService.select(request);
			//treadDisp.execute(request);スレッドテーブルの呼び出し

		} catch (Exception e) {

			//検索時の異常
			request.setAttribute("message", "コメント検索時にエラー発生（GET）");

		}

		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/jsp/response.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String btn = request.getParameter("btn");

		try {

			ResponseService rService = new ResponseService();
			//ThreadDisp treadDisp = new ThreadDisp();

			//コメント検索
			rService.select(request);
			
			//treadDisp.execute(request);スレッドテーブルの呼び出し

			if (btn != null && !btn.isEmpty()) {

				//コメントの追加
				rService.insert(request);

			} else {

				request.setAttribute("message", "不正アクセスです");

			}

		} catch (SQLException e) {

			request.setAttribute("message", "DBS異常");

		} catch (Exception e) {

			request.setAttribute("message", "エラー発生");

		}

		ServletContext context = getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/jsp/response.jsp");
		dispatcher.forward(request, response);
		// http://localhost:8080/WebTask/ResponseServlet

	}

}
