<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<body>

param=${param}</br> <!--第二个参数没了-->
paramValues=${paramValues}</br>
paramValues.purpose=${paramValues.purpose[0]}</br>
paramValues.message=${paramValues.message[0]}</br>
paramValues.message=${paramValues.message[1]}</br>
</br>
requestScope name=${requestScope.name}			</br>
requestScope rk1=${requestScope.rk1}			</br>
sessionScope sk1=${sessionScope.sk1}			</br>
applicationScope ak1=${applicationScope.ak1}	</br>		
pageContext.request.contextPath=${pageContext.request.contextPath} </br>
cookie.ck1.name=${cookie.ck1.name}	</br>
cookie.ck1.value=${cookie.ck1.value}	</br>
</br>
header==${header}	</br>
headerValues.accept-language=${headerValues["accept-language"][0]}	</br>
headerValues.host=${headerValues.host[0]}	</br>
</br>
initParam:${initParam}

</body>
</html>