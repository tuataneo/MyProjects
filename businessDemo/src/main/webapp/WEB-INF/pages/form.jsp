<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<div style="color: teal; font-size: 30px">Registration Form</div>
		<c:url var="userRegistration" value="saveUser.html" />
		<form:form class="form-signin" id="registerForm" modelAttribute="user"
			method="post" action="register">
			<table style="width: 400px; height: 150px;">
				<tr>
					<td><form:input path="firstName" class="form-control"
							placeholder="Fist Name" /></td>
				</tr>
				<tr>
					<td><form:input path="lastName" class="form-control"
							placeholder="Last Name" /></td>
				</tr>
				<tr>
					<td><form:input path="email" type="email" id="inputEmail"
							class="form-control" placeholder="Email address" /></td>
				</tr>
				<tr>
					<td><form:input path="phone" class="form-control"
							placeholder="Phone" /></td>
				</tr>
				<tr>
					<td>
						<button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
					</td>
				</tr>
			</table>
		</form:form>
		<a href="list">Click Here to see User List</a>
	</center>
</body>
</html>