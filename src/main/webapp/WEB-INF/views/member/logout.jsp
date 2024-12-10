<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그아웃 페이지</h1>
	${test }<br>
	<%= request.getParameter("test") %><br>
	<%= request.getAttribute("test") %>
	
</body>
</html>