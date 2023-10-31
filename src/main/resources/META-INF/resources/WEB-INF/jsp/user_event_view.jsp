<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Event Manager And Assistant</title>
	    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
	     <link rel="stylesheet" href="./event_view.css">
	</head>

	<body>
		<%@ include file = "common/user_navbar.jspf" %>
		
		<div class = "container">
			<h5><strong>Event name:</strong> ${event.eventName} </h5>
			<hr>
			<h5><strong>Event description:</strong> ${event.description} </h5> <hr>
			<h5><strong>status:</strong> ${event.status} </h5> <hr>
			<h5><strong>start date:</strong> ${event.startDate} </h5> <hr>
			<h5><strong>end date:</strong> ${event.endDate} </h5> <hr>
		</div>

 		<div class =  "container">
			<%@ include file = "common/tasklist.jspf" %>
		</div>
		
		<%-- <div>
			<a href ="delete-event?eventId=${event.eventId}" class="btn btn-success">Delete</a>
		</div> --%>
		
		
		
		
		
		
		
<%@ include file = "common/footer.jspf" %>
		
		
		

