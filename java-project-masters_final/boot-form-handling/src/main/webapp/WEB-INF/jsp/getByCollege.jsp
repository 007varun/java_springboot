<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Show Employees</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	      
	<h3 style="color: red;">The Workshop with specified location is</h3>
	<ul>
		<c:forEach var="listValue" items="${works}">
			<li>${listValue}</li>
		</c:forEach>
	</ul>
</body>
</html>