<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
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