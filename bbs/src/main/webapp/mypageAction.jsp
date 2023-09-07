<%@page import="javax.tools.DocumentationTool.Location" %>
<%@page import="service.UserService"%>
<%@page import="model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<%// 세션.
String userId = request.getParameter("userId");
String userPw = request.getParameter("userPw");
String userNm = request.getParameter("userNm");
System.out.println(userId);
System.out.println(userNm);
UserVO vo = new UserVO();
vo.setUserId(userId);
vo.setUserNm(userNm);
UserService service = UserService.getInstance();
service.updateUser(vo);
System.out.println(vo);
out.println("<script>");
out.println("alert('수정되었습니다.'); location.href='main.jsp';");
out.println("</script>");	
%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mypageAction</title>
</head>
<body>
</body>
</html>