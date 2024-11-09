<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enquiry</title>
<style type="text/css">
.form{
display: flex;
align-content: center;
justify-content: center;

}
.form form{
display: flex;
flex-direction: column;
align-content: center;
justify-content: center;
padding: 20px;
margin: 10px;
border: solid 2px black;
width: 450px;
background: transparent;
border-radius:20px; 
box-shadow: 25px 15px #777;
}
form input{
padding: 10px;
margin: 5px;
border-radius: 20px;
}
.btn .btn-1{
background: red;
width:100px ;
 }
.btn .btn-2{
background: green;
width:100px ;
}

</style>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<div align="center">
		<h3>Enquiry form</h3>
	</div>
	<div class="form">
		<form action="enquiry" method="get" >
			<input type="text" placeholder="enter the name" name="name">
			<input type="tel" placeholder="enter ur number" name="cNumber">
			<input type="text" placeholder="enter ur email" name="email">
			<input type="text" placeholder="enter the description of the enquery"
				name="description">
			<div  class="btn">
				<input type="reset" value="clear" class="btn-1"> 
				<input type="submit"value="enquiry" class="btn-2">
			</div>

		</form>
	</div>
	<%@include file="footer.jsp"%>



</body>
</html>