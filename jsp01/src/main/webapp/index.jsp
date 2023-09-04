<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 디렉티브 page -->
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
	<!-- 디렉티브 page -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 선언부 -->
<%!
	public int multiply(int x, int y){
	return x * y;
}
%>
<!-- 선언부 -->
<!-- 스크립트릿 -->
<% 
	Date today = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String dateStr = dateFormat.format(today);
	int result = multiply(2, 10);
%>
<!-- 스크립트릿 -->


<!-- 표현식 : 값을 출력 -->
	<h1> 오늘의 날짜는 : <%= dateStr %> 입니다.</h1>
	<h1> 2*10 은 <%= result %> 입니다.</h1>
<!-- 표현식 -->

</head>
<body>

</body>
</html>