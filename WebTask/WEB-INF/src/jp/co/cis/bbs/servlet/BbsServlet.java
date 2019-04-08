package jp.co.cis.bbs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Bbs", urlPatterns = { "/" })
public class BbsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// リクエストパラメータの文字コードを指定
		req.setCharacterEncoding("UTF-8");

		// TODO リクエストパラメータの取得

		req.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(req, resp);

		// TODO ブラウザで確認
		// http://localhost:8080/WebTask/
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
