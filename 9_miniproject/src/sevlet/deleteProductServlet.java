package sevlet;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dao.ProductDAO_Oracle;
import service.ProductService;
import service.ProductServiceImpl;


@WebServlet("/deleteProduct.do")
public class deleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String[] pid = request.getParameterValues("pid");
		
		ProductDAO dao = new ProductDAO_Oracle();
		ProductService service = new ProductServiceImpl(dao);
		try {
			for (String data : pid) {
				service.deleteProduct(Integer.parseInt(data));
			}
			response.sendRedirect("listProduct.do");
		} catch (Exception e) {
			request.setAttribute("exception", e);
			request.getRequestDispatcher("/error.jsp").forward(request, response);

		}
	}

}
