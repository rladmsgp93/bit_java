<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookgle mainpage</title>
<link rel="shortcut icon" href="">
<link href="https://fonts.googleapis.com/css?family=Poppins&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Crete+Round|Patua+One&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/style_main.css">
</head>
<body>
	<section id="banner">
	
	<%@ include file="common/header_black.jsp" %>

	<section class="presentation">

		<div class="introduction">
			<div class="intro-text">
				<h1>A Balanced Diet</h1>
				<p>is what we aim to provide our customers.</p>
			</div>
			<div class="c-btn">
				<button class="btn-check">Check out Recipe!</button>
			</div>
		</div>

    </section>
	<%@ include file="common/footer_css.jsp" %>
	</section>
    
    <script type="text/javascript">
    function openNav() {
		document.getElementById("mySidenav").style.width = "250px";
	}

	function closeNav() {
		document.getElementById("mySidenav").style.width = "0";
	}
    </script>

</body>
</html>