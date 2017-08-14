<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
<body>
 	<mvc:form  modelAttribute="user" action="disPlayUser1.mvc">  
	<fieldset>
		<legend>Add a user</legend>
		<p>
			<mvc:label path="username">username:</mvc:label>
			<mvc:input path="username" />
		</p>
		<p>
			<mvc:label path="gender">gender:</mvc:label>
			<mvc:radiobuttons path="gender" items="${genders}"/>
		</p>
		<p>
			<mvc:label path="birthday">birthday:</mvc:label>
			<mvc:input path="birthday"/>
		</p>
		<p>
			<mvc:label path="skills">skills:</mvc:label>
			<mvc:checkboxes path="skills" items="${skills}"/>
		</p>
		<p>
			<mvc:label path="city">city:</mvc:label>
			<mvc:select path="city" items="${cities}"/>
		</p>
		<p>
			<mvc:label path="description">description:</mvc:label>
			<mvc:textarea path="description"/>
		</p>
		<p>
			<input type="submit" value="Add">
		</p>
	</fieldset>
</mvc:form> 

</body>

</html>