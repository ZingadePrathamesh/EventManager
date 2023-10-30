<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">

	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Event Manager</title>
	    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
	</head>

	<body>
	<!-- navigation bar shortcut -->
		<%@include file = "common/admin_navbar.jspf" %>
		
	    <h3>Tasks List</h3>
	    <hr>
	    <div class="container " >
	    <h5>ongoing</h5>
	    <table class = "table" >
			<thead style="background-color: #8E8FFA; color: black;">
				<tr>
					<th width = 5%>ID</th>
					<th width = 10%>Event Name</th>
					<th width = 15%>Task Name</th>
					<!-- <th width = 5%>Description</th> -->
					<th width = 10%>Deadline</th>
					<th width = 10%>Status</th>
					<th width = 15%>Domain</th>
					<th width = 12%>Members</th>
					<th width = 10%></th>
					<th width = 10%></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${ongoingTasks}" var = "task">
					<tr>
						<td>${task.id}</td>
						<td>${task.eventname}</td> 
						<td>${task.taskName}</td>
						<%-- <td>${task.description}</td> --%>
						<td>${task.deadline}</td>
						<td>
							<c:if test="${!task.isDone}">
						     	Pending   
						    </c:if>
						    <c:if test="${task.isDone}">
						        Completed
						    </c:if>
						</td>
						<td>${task.domain}</td>
						<td>${task.member}</td>
						<td><a class ="btn btn-primary" href = "update-task?id=${task.id}">Update</a></td>
						<td><a class ="btn btn-warning" href = "delete-task?taskId=${task.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		 <h5>upcoming</h5>
		<table class = "table" >
			<thead style="background-color: #8E8FFA; color: black;">
				<tr>
					<th width = 5%>ID</th>
					<th width = 10%>Event Name</th>
					<th width = 15%>Task Name</th>
					<!-- <th width = 5%>Description</th> -->
					<th width = 10%>Deadline</th>
					<th width = 10%>Status</th>
					<th width = 15%>Domain</th>
					<th width = 12%>Members</th>
					<th width = 10%></th>
					<th width = 10%></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${upcomingTasks}" var = "task">
					<tr>
						<td>${task.id}</td>
						<td>${task.eventname}</td> 
						<td>${task.taskName}</td>
						<%-- <td>${task.description}</td> --%>
						<td>${task.deadline}</td>
						<td>
							<c:if test="${!task.isDone}">
						     	Pending   
						    </c:if>
						    <c:if test="${task.isDone}">
						        Completed
						    </c:if>
						</td>
						<td>${task.domain}</td>
						<td>${task.member}</td>
						<td><a class ="btn btn-primary" href = "update-task?id=${task.id}">Update</a></td>
						<td><a class ="btn btn-warning" href = "delete-task?taskId=${task.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		 <h5>Completed</h5>
		<table class = "table" >
			<thead style="background-color: #8E8FFA; color: black;">
				<tr>
					<th width = 5%>ID</th>
					<th width = 10%>Event Name</th>
					<th width = 15%>Task Name</th>
					<!-- <th width = 5%>Description</th> -->
					<th width = 10%>Deadline</th>
					<th width = 10%>Status</th>
					<th width = 15%>Domain</th>
					<th width = 12%>Members</th>
					<th width = 10%></th>
					<th width = 10%></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${completedTasks}" var = "task">
					<tr>
						<td>${task.id}</td>
						<td>${task.eventname}</td> 
						<td>${task.taskName}</td>
						<%-- <td>${task.description}</td> --%>
						<td>${task.deadline}</td>
						<td>
							<c:if test="${!task.isDone}">
						     	Pending   
						    </c:if>
						    <c:if test="${task.isDone}">
						        Completed
						    </c:if>
						</td>
						<td>${task.domain}</td>
						<td>${task.member}</td>
						<td><a class ="btn btn-primary" href = "update-task?id=${task.id}">Update</a></td>
						<td><a class ="btn btn-warning" href = "delete-task?taskId=${task.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<div>
			<a href="task-form?name=${task.eventname}" class=" btn btn-success">Add Task</a></div>
		</div>
		
<%@ include file = "common/footer.jspf" %>