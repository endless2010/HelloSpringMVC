<%@ page language="java" contentType="text/html; charset=ISO-8859-1" errorPage="" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
<head>
	<title>Spring MVC Form</title>
	<style type="text/css">
		.error { background-color: #FFC; }
	</style>
</head>
<body>
<!-- ModealAttribute和commandName含义一样，由于历史原因才共同存在  -->
 	<mvc:form  modelAttribute="employee" action="converterResult.mvc" method="GET">  
	<fieldset>
		<legend>Add an Employee</legend>
			<p>
			<mvc:label path="id">employeeid: </mvc:label>
			<mvc:input path="id"/>
		 	</p>
		 	
			<p>
			<mvc:label path="name">name: </mvc:label>
			<mvc:input path="name"/>
		 	</p>
		 	
		 	<p>
		 	<mvc:errors path="recruitTime" cssClass="error" />
			<mvc:label path="recruitTime">recruitTime(yyyy-dd-MM): </mvc:label>
			<mvc:input path="recruitTime"/>
			</p>
			
			<p>
		 	<mvc:errors path="boss" cssClass="error" />
			<mvc:label path="boss">boss: </mvc:label>
			<mvc:input path="boss"/>
			</p>
			
			<input type="submit" value="submit">
	</fieldset>
</mvc:form> 

</body>

</html>
