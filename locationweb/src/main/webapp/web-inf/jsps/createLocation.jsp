<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	<%@include file="StyleProject.css"%>
</style>
<title>Create Location</title>
</head>
<body class="back">
	<div class="outerBox" >
		<div class="InnerBox">		
			<form action="saveLoc" method="post">
				Id :<input type="text" class="inputField" name="id"/><br/>
				Code :<input type="text" class="inputField" name="code"/><br/>
				Name :<input type="text" class="inputField" name="name"/><br/><br/>
				<span class="title">Type :</span><span class="inputField"> <label> Urban : </label><input type="radio" name="type" value="urban"/><br/></span>
					   <span class="rural"><label>Rural :</label><input type="radio" name="type" value="rural"/><br/></span>
					   
				
			<div class="but">
			<button type="submit" class ="savebutton">save</button>
			<a href="displayAllLoc"> View All</a>
			</div>
			</form>
			${message}
		</div>	
	</div>
	
</body>
</html>