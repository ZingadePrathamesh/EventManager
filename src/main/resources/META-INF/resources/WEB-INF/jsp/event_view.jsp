<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Event Manager And Assistant</title>
	    <link rel="stylesheet" href="webjars/bootstrap/5.3.2/css/bootstrap.min.css">
	</head>

	<body>
		<%@ include file = "common/navbar.jspf" %>
		<h3>Event name: ${event.name} </h3>
		<hr>
		<h3>Event description: ${event.description} </h3>
		<hr>
		<h3>status: ${event.status} </h3>
		<hr>
		<h3>start date: ${event.startDate} </h3>
		<hr>
		<h3>end date: ${event.endDate} </h3>
		
		<%@ include file = "common/tasklist.jspf" %>
		
		
		
		
		
		
<%@ include file = "common/footer.jspf" %>
		
		
		

