package bbs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserVO;
import service.UserService;


@WebServlet({ "/login", "/logout" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathString = request.getServletPath();
		if("/login".equals(pathString)) {
			String userId = (String) request.getSession().getAttribute("userId");
			if(userId != null) {
				// 로그인 정보가 있으면 (index 페이지로)
				response.sendRedirect("index.jsp");
			}else {
				request.getRequestDispatcher("/views/login.jsp").forward(request, response);
			}
		}else if("/logout".equals(pathString)){
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("index.jsp");
		}

	}

	

	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = UserService.getInstance();
	    UserVO userVO = userService.loginUser(request.getParameter("userId")
	    									 ,request.getParameter("userPw"));
		if(userVO != null) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", userVO.getUserId());
			response.sendRedirect("index.jsp");
		}else {
			response.sendRedirect("login");
		}
	}

}
