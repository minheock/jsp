<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<meta name="viewport" content="width=device-width, inital-scale=1.0">
<script src="https://code.jquery.com/jquery-3.6.1.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">게시판</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarContent" aria-controls="navbarContent"
			aria-expanded="false" aria-label="Toggle naviation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="main.jsp">메인</a></li>
				<li class="nav-item"><a class="nav-link" href="bbs">게시판</a>
				</li>
			</ul>
			<c:if test="${empty userId}">
				<ul class="nav navbar-nav navbar-right">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false">접속하기</a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="login">로그인</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="join.jsp">회원가입</a></li>
						</ul></li>
				</ul>
			</c:if>
			<c:if test="${not empty userId}">
				<ul class="nav navbar-nav navbar-right">

					<li class="nav-item dropdown"><a
						class="nav=link dropdown-toggle" href="#" rolo="button"
						data-bs-toggle="dropdown" aria-expanded="false"> ${userId}님 </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="mypage.jsp"> 마이페이지 </a></li>
							<li><a class="dropdown-item" href="logout">
									로그아웃 </a></li>
						</ul></li>
				</ul>
			</c:if>
		</div>
	</div>
</nav>
