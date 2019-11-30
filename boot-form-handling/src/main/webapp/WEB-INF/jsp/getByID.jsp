<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show publication</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: red;">The publication with specified ID is</h3>
	<ul>
		<c:forEach var="listValue" items="${work}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>