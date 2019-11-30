<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Publication</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">topic query</h3>

	<div id="addWorkshop">
		<form action="/getWorkshopsByTopic" method="post">
			<p>
				<label>Enter publication Topic</label>
				<input type="text" name="topic" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>
</body>
</html>