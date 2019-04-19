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

import jp.co.cis.bbs.service.RegistrationService;

/**
 * Servlet implementation class ComentServlet
 */
@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();

		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/jsp/registration.jsp");

		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String jsp = null;

		try {

			RegistrationService regist = new RegistrationService();

			regist.insert(request);

		} catch (SQLException e) {

			request.setAttribute("message", "DBS異常");

			jsp = "/WEB-INF/jsp/login.jsp";

		} catch (Exception e) {

			request.setAttribute("message", "エラー発生");

			jsp = "/WEB-INF/jsp/registration.jsp";

		}

		ServletContext context = getServletContext();

		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/jsp/login.jsp");

		dispatcher.forward(request, response);

	}

}
