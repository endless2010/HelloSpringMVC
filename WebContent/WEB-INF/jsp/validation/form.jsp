<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
<head>
	<title>Spring MVC Form</title>
	<style type="text/css">
		.formFieldError { background-color: #FFC; }
	</style>
</head>
<body>
<!-- ModealAttribute和commandName含义一样，由于历史原因才共同存在   mvc:form  commandName="user" action="formResult.mvc" -->
 	<mvc:form  modelAttribute="user" action="formResult.mvc">  
	<table>
		<tr>
			<td><mvc:label path="username">username</mvc:label></td>
			<td><mvc:input path="username" cssErrorClass="formFieldError"/></td>
			<td><mvc:errors path="username"/></td>
		</tr>
		<tr>
			<td><mvc:label path="password">password</mvc:label></td>
			<td><mvc:password path="password" cssErrorClass="formFieldError"/></td>
			<td><mvc:errors path="password"/></td>
		</tr>
		<tr>
			<td><mvc:label path="email">email</mvc:label></td>
			<td><mvc:input path="email" cssErrorClass="formFieldError"/></td>
			<td><mvc:errors path="email"/></td>
		</tr>
		<tr>
			<td><mvc:label path="phone">phone</mvc:label></td>
			<td><mvc:input path="phone"/></td>
		</tr>
		<tr>
			<td><mvc:label path="detail">detail</mvc:label></td>
			<td><mvc:textarea path="detail"/></td>
		</tr>
		<tr>
			<td><mvc:label path="gender">gender</mvc:label></td>
			<td><mvc:radiobuttons path="gender" items="${genders}"/></td>
		</tr>
		<tr>
			<td><mvc:label path="favoriateColor">favoriateColor</mvc:label></td>
			<td><mvc:select path="favoriateColor" items="${colors}"/></td>
		</tr>
		<tr>
			<td><mvc:label path="programmer">programmer</mvc:label></td>
			<td><mvc:input path="programmer"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit">
		</tr>
	</table>
</mvc:form> 

</body>

</html>