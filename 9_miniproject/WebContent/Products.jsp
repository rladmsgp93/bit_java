<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>

<link href="https://fonts.googleapis.com/css?family=Poppins&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Crete+Round|Patua+One&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/style_products2.css">

</head>
<body>
<section id="banner">
    
    <%@ include file="common/header_css.jsp" %>

    <main>
        <section class="presentation">
            <div class="products">
            
            <div class="cookware">
            	<a href="#"><img class="img" src="./img/kitch.jpg"></a>
            	<p>Cookwares</p>            
            </div>
            
            <div class="pantry">
                <a href="#"><img class="img" src="./img/spices.jpg"></a>
            	<p>Pantry Staples</p>    
            </div>
            
            <div class="package">
            	<a href="#"><img class="img" src="./img/cookbooks.jpg"></a>
            	<p>Recipe Packages</p>
            </div>
               
            </div>
           
        </section>

    </main>

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