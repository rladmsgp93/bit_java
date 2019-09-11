<%@page import="vo.UsersVO"%>
<%@page import="service.UsersServiceImpl"%>
<%@page import="service.UsersService"%>
<%@page import="dao.UsersDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	<h3>login 처리</h3>
	<!-- JAVA code 영역 -->
	<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");
UsersDAO dao = new UsersDAO();
UsersService service = new UsersServiceImpl(dao);
UsersVO vo = new UsersVO();
vo.setId(id);
vo.setPassword(pw);
UsersVO data = service.login(vo);


%>
로그인 정보: <%= data %>
<p>
	<%= id %>/<%=pw %>
	</p>
	<a href="home.html">Home으로</a>
</body>
</html>