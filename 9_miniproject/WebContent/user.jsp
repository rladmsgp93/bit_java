<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="./js/jquery-3.4.1.min.js"></script>
<title>uses table</title>
</head>
<body>
<h5 style="text-align: center;">Sign up</h5>
<form action="AddUser.do" method="post">
<table border = "1">

<tr>
   <td> <label for="id"> id </label> </td>
   <td> <input type="text" id="id" name="id" value="${id}" /> </td>
   <td> <input type="button" id ="id1" name="id1" value="중복체크" onclick="idcheck()" /> </td>
   		<span style="color: red;">${msg}</span>
</tr>

<tr>
   <td> <label for="pw"> pw </label> </td>
   <td> <input type="password" id="pw" name="pw" value="" /> </td>
</tr>

<tr>
   <td> <label for="name"> name </label> </td>
   <td> <input type="text" id="name" name="name" value="" /> </td>
</tr>

<!-- <tr>
   <td> <label for="role"> role </label> </td>
   <td colspan="2"> <input type="radio" id="role" name="role" value="admin" /> admin 
 					 <input type="radio" id="role" name="role" value="user" /> user 
 	</td> -->
   <hr><hr>
<!-- </tr> -->

<tr>
 <td colspan="2">
 <input type="submit" value="회원가입">
 <input type="reset" value="취소">
</td>
</tr>

</table>
</form>
<script>
	function idcheck(){
		$.ajax({
			url:'json/id_check.jsp',
			dataType:'json',
			data:{
				id:$('#id').val()
			},
			success:function(data){
	 			if(data.id == undefined){
					alert("사용가능한 ID입니다.")
				}else{
					alert("사용중인 ID입니다.")
				} 
			},
			error:function(e){
				alert("error" + e)
			}
		})
		};
	

</script>



</html>
</body>
</html>