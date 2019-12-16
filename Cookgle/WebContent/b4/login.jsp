<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/prob1.css">
<link rel="stylesheet" href="css/table.css">
<link rel="stylesheet" href="css/button.css">
</head>
<body>
<div id="output">
<section>

<h3> login form </h3>

<form action="login.do" method="post">
   <table border="1">
      <tr>
         <td> <label for="id"> ID </label> </td>
         <td> <input type="text" id="id" name="id" value="" /> </td>
      </tr>
      <tr>
         <td> <label for="pw"> PW </label> </td>
         <td> <input type="password" id="pw" name="pw" value="" /> </td>
      </tr>
      <tr>
         <td colspan="2"> 
             <input type="submit" value="로그인">
             <input type="reset" value="취소">
             <a href="user.jsp">회원 가입</a>
             <span style="color: red;">${msg}</span>         
         </td>
      </tr>
   </table>
</form>




</section>
</div>


</body>
</html>