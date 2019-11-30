<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add publications</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New publication</h3>

	<div id="addWorkshop">
		<form action="/getWorkshopsByID" method="post">
			<p>
				<label>Enter publication ID</label>
				<input type="text" name="id" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
	</div>
</body>
</html>