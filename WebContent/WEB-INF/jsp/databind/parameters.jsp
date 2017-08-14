<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<body>
	session: ${sessionScope.user.username} <br/>
	session: ${sessionScope.user.skills}	  <br/>
	
	user1.username: ${user1.username} </br>	
	user1.skills:   ${user1.skills}	  </br>
	user2.username: ${user2.username} </br>	
	user2.skills:   ${user2.skills}	  </br>	
	<h1>title:${title}</h1>	
	<h1>message:${message}</h1>	
	<h1>cities:${cities}</h1>		
	<h1>skills:${skills}</h1>		
	<h1>genders:${genders}</h1>		
	</table>
</body>

</html>
