<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style><%@include file="StyleProject.css"%></style>
<title>Display Location</title>
</head>
<body class="back">
<div class="outerBox">
	<div class=InnerBox>
	<h2>Locations : </h2>	
		<table >
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Code</th>
				<th>Type</th>
			</tr>
			<c:forEach items="${locations}" var="location">
				<tr>
					<td>${location.id}</td>
					<td>${location.name}</td>
					<td>${location.code}</td>
					<td>${location.type}</td>
					<td><a href="deleteLocation?id=${location.id}">delete</a></td>
					<td><a href="updateLocation?id=${location.id}">edit</a></td>
				</tr>
			</c:forEach>
			
		</table>
			<a href="showCreate">Add location</a>
	</div>
</div>



</body>
</html>