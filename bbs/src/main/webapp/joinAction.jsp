<%@page import="javax.tools.DocumentationTool.Location"%>
<%@page import="model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="service.UserService" %>     
<jsp:useBean id="userVO" class="model.UserVO" scope="page"></jsp:useBean>
<jsp:setProperty property="userId" name="userVO" />
<jsp:setProperty property="userPw" name="userVO" />
<jsp:setProperty property="userNm" name="userVO" />
<%
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	String userNm = request.getParameter("userNm");
// 	System.out.println(userNm);
// 	System.out.println(userVO);
%>	
<!-- 	UserService의 insertUser 메서드를 호출하여 회원정보 저장 후 -->
<!-- 	리턴 값이 1이면 (정상저장) 세션에 userId저장 후 main.jsp로 이동 -->
<!-- 	리턴 값이 0이면 join.jsp 화면으로 이동시켜 주세요  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinAction</title>
</head>
<body>
   <%
	if(UserService.getInstance().insertUser(userVO) == 1){
		session.setAttribute("userId", userVO.getUserId());
// 		session.setAttribute("userPw", userVO.getUserPw());
// 		session.setAttribute("userNm", userVO.getUserNm());
	%>
	<script> 
		location.href="main.jsp"
	</script> 		
	<%}else{%>
	<script> 
		alert("잘못됐어요 다시하세요");	
		history.back()
	</script> 
	<%}%>
</body>
</html>