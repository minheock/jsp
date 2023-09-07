<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <jsp:include page="/WEB-INF/inc/top.jsp" />
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-4"></div>
			<div class="col-lg-4">
				<form action="login" method="post">
					<h3 style="text-align:center; padding-bottom:5%; padding-top:15%">로그인화면</h3>
					<div class="form-group">
						<input type="text" class="form-control"
							placeholder="아이디" name="userId" maxlength="20">
					</div>
					<div class="form-group">
						<input type="password" class="form-control"
						placeholder="비밀번호" name="userPw" maxlength="20">
					</div>
					<input type="submit" class="btn btn-primary form-control"
						value="로그인">
				</form>
			</div>
			<div class="col-lg-4"></div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/inc/footer.jsp" />
</body>
</html>