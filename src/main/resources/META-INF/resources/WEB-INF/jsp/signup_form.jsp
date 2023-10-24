<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="signup_form_style.css">
    <script src="signup_form_js.js"></script>
</head>

<body>
    <div id="signup">
        <form id="signup_f" action="" method = "POST">
            <div class="text1">
                Sign Up
            </div>
            <label for="f_name">First Name</label>
            <input type="text" placeholder="First Name" required>
            <label for="l_name">Last Name</label>
            <input type="text" placeholder="Last Name" required>

            <label for="skills">Skills</label>

            <div id="skills">

                <div id="skills_main">
                    <div id="skills_in"></div>
                    <button id="btn_menu"><img src="./Images/down.png" alt=""></button>
                </div>

                <div id="skills_item" class="list_item">
                    <ul>
                        <li id="one" onclick="get_value(this)"> dog </li>
                        <li id="two" onclick="get_value(this)"> cat </li>
                        <li id="three" onclick="get_value(this)"> crow </li>
                        <li id="four" onclick="get_value(this)"> cow </li>
                    </ul>
                </div>

            </div>

            <label for="age">Age</label>
            <input type="number" placeholder="Age" required>
            <label for="password">Enter Password</label>
            <input type="password" placeholder="Password" required>
            <label for="r_password">Repeat Password</label>
            <input type="password" placeholder="Repeat Password" required>
            <div id="forget_p">
                <a href="login_form.html">Already have an account? Login</a>
            </div>
            
            
			<input type = "submit" class = "btn btn-success"/>
			
            <!--
            <div id="btn_div">
                <button method="POST" type="submit" id="btn1">Sign Up</button>
                <button id="btn2"> <img src="./Images/google_logo.png" alt="google_logo"> Google</button>
            </div>  
            -->
        </form>
    </div>
</body>

</html>