package jp.co.cis.bbs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.cis.bbs.service.ThreadDisp;

@WebServlet(name = "Bbs", urlPatterns = { "/aa" })
public class BbsController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// リクエストパラメータの文字コードを指定
		req.setCharacterEncoding("UTF-8");

		String jsp;
		// TODO リクエストパラメータの取得
		ThreadDisp treadDisp = new ThreadDisp();
		try {
			treadDisp.execute(req);
			jsp = "/WEB-INF/thread.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			jsp = "/WEB-INF/thread.jsp";
		}
		req.getRequestDispatcher(jsp).forward(req, resp);

		// TODO ブラウザで確認
		// http://localhost:8080/WebTask/
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// リクエストパラメータの文字コードを指定
		req.setCharacterEncoding("UTF-8");
		req.getRequestDispatcher("/WEB-INF/threadInsert.jsp").forward(req, resp);
	}
}
