package bbs;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BbsVO;
import service.UserService;

@WebServlet("/bbs")
public class BbsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService service = UserService.getInstance();
		ArrayList<BbsVO> list = service.bbsList();
		request.setAttribute("arr", list);
		request.getRequestDispatcher("/views/bbs.jsp").forward(request, response);
		
	}
	
	
}
