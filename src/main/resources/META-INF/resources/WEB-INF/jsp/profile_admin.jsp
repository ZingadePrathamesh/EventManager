<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <style>
        body {
            font-family: 'Gothic', Arial, sans-serif;
            background-color: #000;
            color: #fff;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #222;
            text-align: center;
            padding: 30px;
        }
        h1 {
            font-size: 36px;
        }
        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #111;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        }
        .profile-image {
            display: block;
            margin: 0 auto 20px;
            border-radius: 50%;
            width: 200px;
            height: 200px;
            object-fit: cover;
        }
        h2 {
            color: #900;
        }
        p {
            font-size: 18px;
            line-height: 1.5;
        }
        .contact-info {
            background-color: #333;
            padding: 10px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <!-- <nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
        <a class="navbar-brand m-1" href="">Event Manager and Assistant</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="user_homepage">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="user-event-list">Events List</a></li>
                <li class="nav-item"><a class="nav-link" href="user-tasks-list">Tasks List</a></li>
            </ul>
        </div>
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link" href="landing-page">Logout</a></li>
        </ul>
    </nav> -->

<%@include file = "common/admin_navbar.jspf" %>

    <header>
        <h1>My Profile</h1>
    </header>
    <div class="container">
        <img class="profile-image" src="./Images/profile-icon.png" alt="My Horror Profile Picture">
        <h2>About Me</h2>
        <p>
            Welcome to my profile happy to be part of this amazing community.
        </p>
        <h2>Contact Information</h2>
        <div class="contact-info">
            <p><strong>Name:</strong> [Your Name]</p>
            <p><strong>Domain:</strong> [Domain]</p>
         
        </div>
    </div>
</body>
</html>
