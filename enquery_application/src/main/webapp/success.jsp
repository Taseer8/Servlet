<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> success page </title>
<style type="text/css">
.link{
margin: 100px;
}
.link a {
text-decoration: none;
color: black;
}
.link button {
width:100px;
	border-radius: 10px;
}
</style>
</head>
<body>
	<%@ include file="navbar.jsp"  %>
	<h1 align="center"> successfully submited enquery </h1>
	<div class="link" align="center"  ><button ><a href="index.jsp" >Back</a></button></div>

</body>
</html>