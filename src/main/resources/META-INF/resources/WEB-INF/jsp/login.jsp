<!DOCTYPE html>
<html lang="en">

	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Document</title>
	    <link rel="stylesheet" href="/login_form_style.css" type="text/css">
	    <link rel="stylesheet" href="webjars/bootstrap/5.3.2/css/bootstrap.min.css">
	</head>

	<body>
	    <div id="signin">
	        <form id="signin_f" action="" method = POST>
	            <div class="text1">
	                Sign In
	            </div>
	            <label for="u_name">username</label>
	            
	            <input type="text" placeholder="Username" name = "username" required>
	            
	            <label for="password">Password</label>
	            
	            <input type="password" placeholder="Password" name = "password" required>
	            
	            <div id="forget_p">
	                <a href="#">Forget Password?</a>
	                <a href="signup-page">Sign Up</a>
	            </div>
	            
	            <input type = "submit" class = "btn">
	            <!-- <div id="btn_div">
	                 <button id="btn1">Login</button>  
	            	 </div> -->
	        </form>
	    </div>
	    
	    <script type="text/javascript" src = "webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script type="text/javascript" src = "webjars/jquery/3.7.1/jquery.min.js"></script>
	</body>

</html>