<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/homepage_style.css" type = "text/css">
    <link rel="stylesheet" href="webjars/bootstrap/5.3.2/css/bootstrap.min.css">
    
    <style>
        .lists-div{
        	margin-top:16px;
        	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
        }
        
        .title-text{
        	color: rgb(0, 0, 113);
        }
    </style>
</head>

<body>
    <nav id="nav_text">
        <span class="text1">EVENT SCHEDULER AND ASSISTANT</span>
        <img src="./Images/menu_icon.png" alt="" id="menu_img" onclick="toggleMenu()">

        <div id="nav_list" class="showMenu">
            <ul id="list_ul">
                <li>
                    <a href="user-profile-page">
                        <img src="./Images/profile_icon.png" alt="profile">
                        <span>Profile</span>
                    </a>
                </li>
                <li>
                    <a href="user-team-page">
                        <img src="./Images/team_icon.png" alt="team">
                        <span>Team</span>
                    </a>
                </li>
                <li>
                    <a href="user-tasks-list">
                        <img src="./Images/task_icon.png" alt="task">
                        <span>Tasks</span>
                    </a>
                </li>
                <li>
                    <a href="user-event-list">
                        <img src="./Images/event_icon.png" alt="event">
                        <span>Event</span>
                    </a>
                </li>
                <li>
                    <a href="logout">
                        <img src="./Images/home_icon.png" alt="home">
                        <span>Logout</span>
                    </a>
                </li>
            </ul>
        </div>
    </nav>


    <div id="feature_div"> <!-- make a scrollview -->
        <div class="feature">
            <p>Whats's New!</p>
            <a href="#">Read More..</a>
        </div>
        <div class="feature">
            <p>Interesting Events.</p>
            <a href="#">Read More..</a>
        </div>
        <div class="feature">
            <p>Introducing Tasks</p>
            <a href="#">Read More..</a>
        </div>
        <div class="feature">
            <p>Introducing Tasks</p>
            <a href="#">Read More..</a>
        </div>
    </div>
    
    <div class = "container lists-div">
    	<h5 class = "title-text"><strong>Your Tasks</strong></h5>
    	<hr>
    	<table class = "table" >
			<thead>
				<tr>
					<th>Event Name</th>
					<th>Task Name</th>
					<th>Deadline</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${tasks}" var = "task">
					<tr>
						<td>${task.eventname}</td> 
						<td>${task.taskName}</td>
						<td>${task.deadline}</td>
						<td>${task.isDone}</td>
					</tr>
				</c:forEach>	
			</tbody>
		</table>
    </div>
    
    <div class = "container lists-div">
    	<h5 class = "title-text"><strong>Your Events</strong></h5>
    	<hr>
    	<table class = "table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Start Date</th>
					<th>Status</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${events}" var = "event">
					<tr>
						<td>${event.name}</td>
						<td>${event.startDate}</td>
						<td>${event.status}</td>
						<td><a href ="event-user-view?name=${event.name}" class ="btn btn-secondary" >View</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
    </div>
        

    <script src="homepage_js.js"></script>
</body>

</html>