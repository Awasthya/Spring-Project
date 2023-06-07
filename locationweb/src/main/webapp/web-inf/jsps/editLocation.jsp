<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
	<%@include file="StyleProject.css"%>
</style>
<link href="StyleProject.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<title>Edit Location</title>
</head>
<body class="back">
	<div class="InnerBox">	
			<form action="updateLoc" method="post">
				Id :<input type="text" name="id" class="inputField" value="${location.id}" readonly="true"/><br/>
				Code :<input type="text" name="code" class="inputField" value="${location.code}"/><br/>
				Name :<input type="text" name="name" class="inputField" value="${location.name}"/><br/>
				<span class="title">Type :</span><span class="inputField"> <label> Urban : </label><input type="radio" name="type" value="urban" ${location.type == "urban" ? "checked":""}/><br/></span>
					   <span class="rural"> Rural :<input type="radio" name="type" value="rural" ${location.type == "rural" ? "checked":""}/><br/></span>
					   
				<input type="submit" value="Save Edit"/>
				
			</form>
			
			
			<a href="displayAllLoc"> View All</a>
	</div>
</body>
</html>