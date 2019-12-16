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
<script type="text/javascript">
function info(pname,category,price,img) {
	const result = confirm('장바구니에 추가할꺼가');
	if(result){
document.getElementById("pname").value =pname;
document.getElementById("category").value =category;
document.getElementById("price").value =price;
document.getElementById("img").value =img;
	}
	else{
		return ;
	}
	};
</script>
</head>
<body>
<div id="output">
<section>
 <%
        request.setCharacterEncoding("UTF-8"); 
        String name = request.getParameter("id");
            %>
            <script type="text/javascript">
            </script>
<h3>product 등록 폼</h3>
<form action="insertProduct.do" method= "post" enctype = "multipart/form-data">
<img id="img1" alt="~~~" src="./Img/w6.jpg" onclick="info('123','123','123','./Img/b3.jpg');">
pname :<input type = "text" id="pname" name="pname"><br>
category :<input type = "text" id="category" name="category"><br>
price :<input type = "text" id = "price" name = "price"><br>
img :<input type = "text" id = "img" name = "img"><br>
<!-- pid:<input type = "text" id="pid" name="pid"><br>
pname :<input type = "text" id="pname" name="pname"><br>
category :<input type = "text" id="category" name="category"><br>
price :<input type = "text" id = "price" name = "price" ><br>
img :<input type = "text" id = "img" name="img"><br>  -->
<input type = "hidden" name = "userid" id="userid" value="<%=name%>"><br>
<input type= "submit" value= "등록">
<input type= "reset" value="초기화">
</form>
</section>
</div>

</body>
</html>