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
		<%@ include file = "common/navbar.jspf" %>
		
		
	    <hr>
	    
	    <div class = "container">
	    	<form:form method = "POST"  modelAttribute ="task"  class ="form-group">
	    		<fieldset class = "mb-3">
					<form:label path="taskName">Name</form:label>
					<form:input class= "form-control" type = "text" path = "taskName" required="required"/>
					<form:errors class = "text-warning" path = "taskName"/>
				</fieldset>
				
	    		<fieldset class = "mb-3">
					<form:label path="description">Description</form:label>
					<form:input class= "form-control" type = "text" path = "description" required="required"/>
					<form:errors class = "text-warning" path = "description"/>
				</fieldset>
				
	    		<!-- <fieldset class = "mb-3">
					<form:label path="id">Id</form:label>
					<form:input class = "input-box" type = "hidden" path = "id" required="required"/>
					<form:errors class = "text-warning" path = "id"/>
				</fieldset> -->
				
	  
				
	    		<fieldset class = "mb-3">
					<form:label path="deadline">End Date</form:label>
					<form:input type = "text" path = "deadline" required="required"/>
					<form:errors class = "text-warning" path = "deadline"/>
				</fieldset>
				
	    	<!--<fieldset class = "mb-3">
					<form:label path="isDone">Status</form:label>
					<form:select path = "isDone" class= "form-select">
						<option value = "Upcoming">Upcoming</option>
						<option value = "Ongoing">Ongoing</option>
						<option value = "Completed">Completed</option>
					</form:select>
					<form:errors class = "text-warning" path = "isDone"/>
				</fieldset>   -->	
				
	    		<fieldset class = "mb-3">
					<input type = "submit" class = "btn btn-primary"/>
				</fieldset>
				
	    	</form:form> 
	    
	    </div>
	    
		
	    <script type="text/javascript" src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script type="text/javascript" src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>

</html>