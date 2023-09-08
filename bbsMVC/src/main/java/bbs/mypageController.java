package bbs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserVO;
import service.UserService;


@WebServlet("/mypage")
public class mypageController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = (String) request.getSession().getAttribute("userId");
		if(userId != null) {
			UserService service = UserService.getInstance();
			UserVO vo = service.UserInfo(userId);
			request.setAttribute("vo",vo);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/views/mypage.jsp");
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect("login");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		UserVO vo = new UserVO();
		vo.setUserId(request.getParameter("userId"));
		vo.setUserNm(request.getParameter("userNm"));
		UserService service = UserService.getInstance();
		int cnt = service.updateUser(vo);		
		request.setAttribute("cnt", cnt);
		request.getRequestDispatcher("/views/mypage.jsp").forward(request, response);
//		response.sendRedirect("mypage");
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('수정 되었습니다.')");
		out.println("location.href='mypage'");
		out.println("</script>");
	}
}
