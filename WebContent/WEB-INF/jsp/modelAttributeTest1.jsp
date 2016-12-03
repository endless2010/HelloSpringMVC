<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Spring MVC Form</title>
<body>
	<H1>Standard HTML Form </H1>
	<form id="form1" action="/HelloSpringMVC/databind/model1.mvc">
		userid:   <input type="text" name="userid" >  <br/>
		username: <input type="text" name="username" > <br/>
		
		<input type="submit" value="submit">
		<input type="reset" value="reset">
	</form>
	
</body>

</html>