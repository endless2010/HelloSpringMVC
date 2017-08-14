<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<body>
	<table width=1000>
		<tr>
			<th style="text-align:left;">username</th>
			<th style="text-align:left;">gender</th>
			<th style="text-align:left;">birthday</th>
			<th style="text-align:left;">skills</th>
			<th style="text-align:left;">city</th>
			<th style="text-align:left;">description</th>
		</tr>
	<h1>${title}</h1>
	<c:forEach items="${users}" var="user">
		<tr>
			<td with=100>${user.username}</td>
			<td with=100>${user.gender}</td>
			<td with=100>${user.birthday}</td>
			<td with=300>${user.skills}</td>
			<td with=100>${user.city}</td>
			<td with=300>${user.description}</td>
		</tr>
	</c:forEach>		

	</table>
</body>

</html>
