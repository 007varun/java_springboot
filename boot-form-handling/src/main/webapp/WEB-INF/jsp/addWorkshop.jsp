<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New publications</h3>

	<div id="addWorkshop">
		<form:form action="/addWorkshop" method="post"
			modelAttribute="work">
			<p>
				<label>Enter publication ID</label>
				<form:input path="workid" />
			</p>
			<p>
				<label>Enter publication Topic</label>
				<form:input path="topic" />
			</p>
			<p>
				<label>Enter publication conference</label>
				<form:input path="venue" />
			</p>
			<p>
				<label>Enter publication Date</label>
				<form:input path="date" />
			</p>
			<p>
				<label>Enter publication journal</label>
				<form:input path="organiser" />
			</p>
			<p>
				<label>Enter publication Location</label>
				<form:input path="location" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
