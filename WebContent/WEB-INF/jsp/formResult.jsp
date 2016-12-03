<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Spring MVC Form Result</title>
</head>
<body>
	<table>
		<tr>
			<td>username</td>
			<td>${user.username}</td>
		</tr>
		<tr>
			<td>password</td>
			<td>${user.password}</td>
		</tr>
		<tr>
			<td>email</td>
			<td>${user.email}</td>
		</tr>
		<tr>
			<td>phone</td>
			<td>${user.phone}</td>
		</tr>
		<tr>
			<td>detail</td>
			<td>${user.detail}</td>
		</tr>
		<tr>
			<td>gender</td>
			<td>${user.gender}</td>
		</tr>
		<tr>
			<td>favoriateColor</td>
			<td>${user.favoriateColor}</td>
		</tr>
		<tr>
			<td>programmer</td>
			<td>${user.programmer}</td>
		</tr>
	</table>
</body>

</html>