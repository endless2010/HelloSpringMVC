<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Spring MVC Form</title>
<body>

	<H1> SpringMVC Taglib mvc:form </H1>
	<mvc:form  modelAttribute="user" action="model2.mvc">
			<mvc:label path="userid">userid</mvc:label>
			<mvc:input path="userid"/>
			<mvc:label path="username">username</mvc:label>
			<mvc:input path="username"/>		
			<input type="submit" value="submit">
	</mvc:form>
	
</body>

</html>