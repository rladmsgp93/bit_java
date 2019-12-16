<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://fonts.googleapis.com/css?family=Poppins&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Crete+Round|Patua+One&display=swap"
	rel="stylesheet">
<title>Insert title here</title>
<style type="text/css">
.img{

width: 500px;
height: 320px;
}
body{
    font-family: 'Poppins', sans-serif;
}
.picture{
 padding: 40px;

}
.context{
padding:10px;
top:30px; 
height: 100px; 
width:600px;
font-weight: bold;
}
.title{
margin: 5px 0 5px 45px;

font-size: 30px;
font-weight: bold;
}
</style>
</head>
<body>
	<section id="banner">

		<%@ include file="common/header_css.jsp"%>

		<section id="main">
		<div class = "title">
		About...</div>
			<center><div class="context">
				<p>Cookgle은 바쁜 현대인들의 식단을 풍성하게 채워주기 위해 개발한 사이트입니다. Quick&Easy, Healthy, Dissert 레시피에서 원하는 
				음식을 만들어보세요! 필요한 Cookware, Pantry Staples, Recipe Packages들 또한 로그인 하시면 구입하실 수 있습니다.</p>
			</div></center>
			<div class ="picture">
			<center><img class= "img" src = "./Img/salad.jpg" alt="그림업다"></center>
			</div>
		</section>

		<%@ include file="common/footer_css.jsp"%>
	</section>
</body>
</html>