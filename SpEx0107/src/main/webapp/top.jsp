<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>톱 페이지입니다.</h1>
	<ul>
		<li><a href="user/user.jsp">일반 사용자용 페이지로</a></li>
		<li><a href="admin/admin.jsp">관리자 전용 페이지로</a></li>
	</ul>
	<!-- 로그인 했다면 참입니다. -->
	<sec:authorize access="isAuthenticated()">
		<a href="logout">로그아웃</a>
	</sec:authorize>
	<!-- 로그인 되지 않았다면 참입니다.  -->
	<sec:authorize access="isAnonymous()">
		<a href="login.jsp">로그인</a>
	</sec:authorize>
	
</body>
</html>