<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<link rel="stylesheet" href="css/prob1.css">
<link rel="stylesheet" href="css/table.css">
<link rel="stylesheet" href="css/button.css">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="output">
<section>
 <%
        request.setCharacterEncoding("UTF-8"); 
        String name = request.getParameter("id");
            %>
<h3>product 등록 폼</h3>
<form action="insertProduct.do" method= "post" enctype = "multipart/form-data">
pid:<input type = "text" id="P_id" name="P_id"><br>
pname :<input type = "text" id="pname" name="pname"><br>
category :<input type = "text" id="category" name="category"><br>
price :<input type = "text" id = "price" name = "price" ><br>
img :<input type = "text" name = "img" name="img"><br>
<input type = "hidden" name = "userid" id="userid" value="<%=name%>"><br>
<input type= "submit" value= "등록">
<input type= "reset" value="초기화">
</form>
</section>
</div>


</body>
</html>