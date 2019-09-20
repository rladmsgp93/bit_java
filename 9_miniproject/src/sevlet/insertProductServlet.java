package sevlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.ProductDAO;
import dao.ProductDAO_Oracle;
import service.ProductService;
import service.ProductServiceImpl;
import vo.ProductVO;


@WebServlet("/insertProduct.do")
@MultipartConfig(maxFileSize = 1024 * 1024 * 5)

public class insertProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public insertProductServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		System.out.println("/insertProduct.do 요청 처리");

		ProductDAO dao = new ProductDAO_Oracle();
		ProductService service = new ProductServiceImpl(dao);
		ProductVO vo = new ProductVO();
//		vo.setPid(Integer.parseInt(request.getParameter("pid")));
		vo.setP_id(Integer.parseInt(request.getParameter("P_id")));
		vo.setPname(request.getParameter("pname"));
		vo.setCategory(request.getParameter("category"));
		vo.setPrice(Integer.parseInt(request.getParameter("price")));
		vo.setImg(request.getParameter("img"));
		vo.setUserid(request.getParameter("userid"));
		
		try {
			service.addProduct(vo);
			response.sendRedirect("listProduct.do");
		} catch (Exception e) {
			request.setAttribute("exception", new Exception("데이터 입력이 잘못되었습니다"));
			System.out.println(e);
			getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}

}
