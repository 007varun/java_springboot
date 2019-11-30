<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<a href="${pageContext.request.contextPath}/welcome">welcome page</a> | &nbsp;
	<a href="${pageContext.request.contextPath}/addWorkshop">Add a Publication</a> | &nbsp; 
	<a href="${pageContext.request.contextPath}/getWorkshops">Show Publications</a> |&nbsp;
	<a href="${pageContext.request.contextPath}/getWorkshopsByID">Get a publication by ID</a> | &nbsp;
	<a href="${pageContext.request.contextPath}/getWorkshopsByTopic">Get Publication by Topic</a> | &nbsp;
	<a href="${pageContext.request.contextPath}/getWorkshopsByCollege">Get Publication by location</a>
	
</div>