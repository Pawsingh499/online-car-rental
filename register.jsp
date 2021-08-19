<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | Rent A Car</title>
	
	<!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->
<body>
 <%@ include file="header.jsp" %>  
<form action="Registercontroller" method="post">
<br><br>

<center><input id= "name" style="text-indent:20px;" type="text" name="name" placeholder="name"><br></center>
<center><input id= "email" style="text-indent:20px;" type="email" name="emailid" placeholder="Email"><br><center>
<center><input id= "password" style="text-indent:20px;" type="password" name="password" placeholder="Password"><br><center>
<center><input id= "confirmpass" style="text-indent:20px;" type="password" name="confirm" placeholder="Confirm password"><br><center>
<center><input id= "contact" style="text-indent:20px;" type="text" name="phone" placeholder="Contact number"><br><center>
<center><input id= "address" style="text-indent:20px;" type="text" name="address" placeholder="address"><br><center>
<center><input id= "city" style="text-indent:20px;" type="text" name="city" placeholder="city"><br><center>
<center><input id= "userid" style="text-indent:20px;" type="number" name="userId" placeholder="userId"><br><center>
<center><input id= "active" style="text-indent:20px;" type="text" name="active" placeholder="active"><br><center>
<center><input id="in"  type="submit" name="submit" value="Register"></input><center> 
</form>
 <%@ include file="footer.jsp" %>
</body>
</html>