<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>

<style type="text/css">
header{
    display: flex;
    background: #3A5E48;
    width: 100%;
    height: 10vh;
    margin: auto;
    align-items: center;
}
.logo-container,.nav-links{
    display: flex;
}
.logo-container{
    flex: 1;
}
.logo{
    margin: 5px 0 5px 30px;
    font-size: 22px;
    color: white;
    text-decoration: none;
    font-weight: bold;
}
.logo:hover{
    text-decoration: underline;
}
nav{
    flex: 1;
}
.nav-links{
    justify-content: space-around;
    list-style: none;
    margin: 10px;
}
.nav-link{
    color: white;
    font-size: 20px;
    text-decoration: none;
}
.dropdown {
    position: relative;
    display: inline-block;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #467056;
    min-width: 130px;
    z-index: 1;
}
.dropdown-content a {
    color: white;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    font-size: 12pt;
}
.dropdown-content a:hover {
    background-color: #538c69;
}

.dropdown:hover .dropdown-content {
    display: block;
}
.signup{
	background: white;
	text-decoration: none;
	padding: 0.2em 0.5em 0.2em 0.5em ;
	color: black;
    font-size: 20px;
    border-radius: 5em;
    position: relative;
    display: inline-block;
}

.signup:hover .dropdown-content {
    display: block;
}
.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #538c69;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 22px;
  color: white;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
  color: white;
}
#side{
	color: white;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>

</head>
<body>
	
<header>
	<span id="side" style="font-size:20px;cursor:pointer" onclick="openNav()">&#9776;</span>

	<div class="logo-container">
		<a class="logo" href="main.html">Cookgle</a>
	</div>

	<nav>
		<ul class="nav-links">
			<li><a class="nav-link" href="#">About</a></li>
			<li class="dropdown"><a class="nav-link" href="Products.jsp">Products</a>
				<div class="dropdown-content">
					<a href="cookware.jsp">Cookwares</a> 
					<a href="pantry.jsp">Pantry Staples</a> 
					<a href="#">Recipe Packages</a>
				</div></li>
			<li class="dropdown"><a class="nav-link" href="#">Recipe</a>
				<div class="dropdown-content">
					<a href="#">Quick & Easy</a> 
					<a href="#">Healthy</a> 
					<a href="#">Dessert</a>
				</div></li>

			<li><a class="signup" href="signup.html">Sign Up</a></li>
		</ul>
	</nav>

	<div id="mySidenav" class="sidenav">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<a href="#">About</a> 
		<a href="#">Products</a> 
		<a href="#">Recipe</a>
		<a href="#">My Cart</a>
	</div>

</header>

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