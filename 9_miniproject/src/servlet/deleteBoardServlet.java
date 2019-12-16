package servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import service.BoardService;
import service.BoardServiceImpl;

/**
 * Servlet implementation class deleteBoardServlet
 */
@WebServlet("/deleteboard.do")
public class deleteBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String[] bid = request.getParameterValues("bid");
		request.setAttribute("userid",request.getParameter("userid"));
		BoardDAO dao = new BoardDAO();
		BoardService service = new BoardServiceImpl(dao);
		try {
			for (String data : bid) {
				int r = service.deleteBoard(data);
				System.out.println(data + " => " + r);
			}
			response.sendRedirect("listboard.do");
		} catch (Exception e) {
			request.setAttribute("exception", e);
			System.out.println(e);
			request.getRequestDispatcher("/error.jsp").forward(request, response);

		}
	}

}
