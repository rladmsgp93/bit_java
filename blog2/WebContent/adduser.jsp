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
<title>adduser.jsp</title>
</head>
<body>
	<h3>회 원 가 입 처 리</h3>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String role = request.getParameter("role");

		UsersDAO dao = new UsersDAO();
		UsersService service = new UsersServiceImpl(dao);
		UsersVO vo = new UsersVO();
		vo.setId(id);
		vo.setPassword(pw);
		vo.setName(name);
		vo.setRole(role);
		int c = service.addUsers(vo);
	%>
	입력정보:
	<%=id%>/<%=pw%>/<%=name%>/<%=role%>
	<%
		if (c == 0) {
	%>
	<h4>회원가입 실패</h4>
	<%
		}
	%>
	<%
		if (c != 0) {
	%>
	<h4>회원가입 성공하셨습니다.</h4>
	<%
		}
	%>
</body>
</html>