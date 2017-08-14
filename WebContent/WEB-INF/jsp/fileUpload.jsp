<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
<head>
	<title>Spring MVC File Upload</title>
</head>
<body>
 	<mvc:form modelAttribute="upload" action="upload.mvc" enctype="multipart/form-data" >
	<table>
		<tr>
			<td>Name</td><td><mvc:input path="name" /></td>
		</tr>
		<tr>
			<td>Choose File</td><td><mvc:input type="file" path="file" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit" /></td>
		</tr>
	</table>
</mvc:form> 


	<h3>Uploaded Information</h3>
	<table>
		<tr>
			<td>file Name</td><td>${filename}</td>
		</tr>
		<tr>
			<td>File Length</td><td>${fileLength}</td>
		</tr>
	</table>
	
</body>

</html>