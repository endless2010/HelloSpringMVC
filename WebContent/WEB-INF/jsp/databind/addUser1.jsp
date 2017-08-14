<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>

<form action="disPlayUser2.mvc">  
	username:<input type="text" name="username"><br/>
	gender:
	<c:forEach items="${genders}" var="gender">
		${gender}<input type="radio" name="gender" value="${gender}">
	</c:forEach>
	<br/>
	birthday:<input type="text" name="birthday"><br/>
	skills:
	<c:forEach items="${skills}" var="skill">
		<input type="checkbox" name="skills" value="${skill}"/>${skill}
	</c:forEach>
	<br/>
	city:
	<select name="city">
		<c:forEach items="${cities}" var="city">
			${city}<option  value="${city}"/>
		</c:forEach>	
	</select></br> 
	description:<input type="textarea" name="description"></br>
	
	<input type="submit" value="submit">
</form>
</body>

</html>