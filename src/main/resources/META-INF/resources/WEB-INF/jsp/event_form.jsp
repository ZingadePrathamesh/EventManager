<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Event Manager</title>
	    <link rel="stylesheet" href="webjars/bootstrap/5.3.2/css/bootstrap.min.css">
	</head>

	<body>
	    <h1>Add Event</h1>
	    <hr>
	    
	    <div>
	    	<form:form method = "POST" modelAttribute="event">
	    		Name: <form:input type = "text" path = "name"/>
	    		Id: <form:input type = "text" path = "id"/>
	    		Start Date: <form:input type = "text" path = "startDate"/>
	    		End Date: <form:input type = "text" path = "endDate"/>
	    		Status: <form:input type = "text" path = "status"/>
	    		<input type = "submit" class = "btn btn-primary"/>
	    	</form:form> 
	    
	    </div>
	    
		
	    <script type="text/javascript" src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script type="text/javascript" src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>

</html>