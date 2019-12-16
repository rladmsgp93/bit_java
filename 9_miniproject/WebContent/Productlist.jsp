<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/prob1.css">
<link rel="stylesheet" href="css/table.css">
<link rel="stylesheet" href="css/button.css">
<%
        request.setCharacterEncoding("UTF-8");
        String userid = request.getParameter("userid");
        
            %>
<script type="text/javascript">
	function f1() {
		return confirm("정말 삭제할거니?")
	}
</script>
<style type="text/css">
img {
	width: 70px;
	height: 40px
}
</style>
</head>
<body>



	<div id="output">
		<section>

			<h3>Product list</h3>
			<form action="deleteProduct.do">
				<table class="tablea">
					<tr>
						
						<th>pname</th>
						<th>category</th>
						<th>price</th>
						<th>img</th>
						
			
						<th><input type="submit" id="" value="삭제"
							onclick="return f1()"></th>
					</tr>
					<c:forEach var="data" items="${productlist}">
						<tr>
							
							<td>${data.pname}</td>
							<td>${data.category}</td>
							<td>${data.price}</td>
							<td><img src="${data.img}" alt=""></td>
			
							<td><input type="checkbox" name="pid" value="${data.pid}"></td>
						</tr>
					</c:forEach>
				</table>
				<input type="hidden" name="userid" value="<%=userid%>">
			</form>
              
		</section>
	</div>

</body>
</html>