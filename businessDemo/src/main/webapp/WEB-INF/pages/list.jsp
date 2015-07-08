<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="navbar.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
	<center>
		<div class="panel panel-default" style="width: 600px;">
			<!-- Default panel contents -->
			<div class="panel-heading">User List</div>
			<c:if test="${!empty userList}">
				<table class="table">
					<tr
						style="background-color: teal; color: white; text-align: center;"
						height="40px">
						<td>First Name</td>
						<td>Last Name</td>
						<td>Email</td>
						<td>Phone</td>
						<td>Edit</td>
						<td>Delete</td>
					</tr>
					<c:forEach items="${userList}" var="user">
						<tr
							style="background-color: white; color: black; text-align: center;"
							height="30px">
							<td><c:out value="${user.firstName}" /></td>
							<td><c:out value="${user.lastName}" /></td>
							<td><c:out value="${user.email}" /></td>
							<td><c:out value="${user.phone}" /></td>
							<td><a href="edit?id=${user.id}">Edit</a></td>
							<td><a href="delete?id=${user.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
		</div>
		<a href="form">Click Here to add new User</a>
	</center>
</body>
</html>