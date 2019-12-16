<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="output">
		<section>

			<h3>Boardlist</h3>
				<table class="tablea">
					<tr>
						<th>bid</th>
						<th>userid</th>
						<th>content</th>
						<th>date</th>


					</tr>
					<c:forEach var="data" items="${Boardlist}">
						<tr>

							<td>${data.bid}</td>
							<td>${data.userid}</td>
							<td>${data.content}</td>
							<td>${data.wdate}</td>

						</tr>
					</c:forEach>
				</table>
	

		</section>
	</div>

</body>
</html>