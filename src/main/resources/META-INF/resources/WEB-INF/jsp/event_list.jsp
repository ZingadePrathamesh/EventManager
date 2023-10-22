<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">

	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Event Manager</title>
	    <link rel="stylesheet" href="webjars/bootstrap/5.3.2/css/bootstrap.min.css">
	</head>

	<body>
	    <h1>Event List</h1>
	    <hr>
	    <table class = "table">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Start Date</th>
					<th>End Date</th>
					<th>Status</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${events}" var = "event">
					<tr>
						<td>${event.id}</td>
						<td>${event.name}</td>
						<td>${event.startDate}</td>
						<td>${event.endDate}</td>
						<td>${event.status}</td>
						<td><a class ="btn btn-primary" href = "update-event?id=${event.id}">Update</a></td>
						<td><a class ="btn btn-secondary" href = "">View</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
	    <script type="text/javascript" src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script type="text/javascript" src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>

</html>