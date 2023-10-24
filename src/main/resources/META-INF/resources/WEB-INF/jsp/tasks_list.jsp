<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">

	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Event Manager</title>
	    <link rel="stylesheet" href="webjars/bootstrap/5.3.2/css/bootstrap.min.css">
	</head>

	<body>
	<!-- navigation bar shortcut -->
		<%@include file = "common/navbar.jspf" %>
		
	    <h3>Tasks List</h3>
	    <hr>
	    <div class="container " >
	    <table class = "table" >
			<thead>
				<tr>
					<th>ID</th>
					<th>Event Name</th>
					<th>Task Name</th>
					<th>Description</th>
					<th>Deadline</th>
					<th>isDone</th>
					<th>Domain</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${tasks}" var = "task">
					<tr>
						<td>${task.id}</td>
						<td>${task.eventname}</td> 
						<td>${task.taskName}</td>
						<td>${task.description}</td>
						<td>${task.deadline}</td>
						<td>${task.isDone}</td>
						<td>${task.domain}</td>
						<td><a class ="btn btn-primary" href = "update-event?id=${task.id}">Update</a></td>
					<%-- 	<td><a class ="btn btn-secondary" href = "event-view?id=${task.id}">View</a></td> --%>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<div><a href="task-form?name=${task.eventname}" class=" btn btn-success">Add Task</a></div>
		
		</div>
		
	    <script type="text/javascript" src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script type="text/javascript" src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>

</html>