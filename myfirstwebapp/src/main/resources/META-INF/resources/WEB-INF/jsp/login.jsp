<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Login Page</title>
	</head>
	<body>
		<div class="Container">
			 Welcome to login page!
			 <pre>${errorMsg}</pre>
			 <form method="post">
			 	Name: <input name="name" type="text"/>
			 	Password: <input type="password" name="password"/>
			 	<input type="submit">
			 </form>
		</div>
		 
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>