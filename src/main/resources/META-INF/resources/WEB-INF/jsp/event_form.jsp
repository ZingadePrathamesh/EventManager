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
	    	<form:form method = "POST" modelAttribute="event" class ="form-group">
	    		<fieldset class = "mb-3">
					<form:label path="name">Name</form:label>
					<form:input type = "text" path = "name" required="required"/>
					<form:errors class = "text-warning" path = "name"/>
				</fieldset>
				
	    		<fieldset class = "mb-3">
					<form:label path="id">Id</form:label>
					<form:input type = "text" path = "id" required="required"/>
					<form:errors class = "text-warning" path = "id"/>
				</fieldset>
				
	    		<fieldset class = "mb-3">
					<form:label path="startDate">Start Date</form:label>
					<form:input type = "text" path = "startDate" required="required"/>
					<form:errors class = "text-warning" path = "startDate"/>
				</fieldset>
				
	    		<fieldset class = "mb-3">
					<form:label path="endDate">End Date</form:label>
					<form:input type = "text" path = "endDate" required="required"/>
					<form:errors class = "text-warning" path = "endDate"/>
				</fieldset>
				
	    		<fieldset class = "mb-3">
					<form:label path="status">Status</form:label>
					<form:input type = "text" path = "status" required="required"/>
					<form:errors class = "text-warning" path = "status"/>
				</fieldset>
				
	    		<fieldset class = "mb-3">
					<input type = "submit" class = "btn btn-primary"/>
				</fieldset>
				
	    	</form:form> 
	    
	    </div>
	    
		
	    <script type="text/javascript" src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script type="text/javascript" src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>

</html>