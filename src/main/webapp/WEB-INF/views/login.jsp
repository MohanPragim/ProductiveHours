<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h1 {
	font-family: Arial;
	font-weight: normal;
	color: #696868;
	margin-left: 370px;
}

body {
	background-color: #f4f4f4;
}

.Ldiv, .Pdiv {
	margin-left: 370px;
	font-family: Arial;
	font-weight: normal;
}

input {
	border: 1px solid #e5e5e5;
	border-radius: 1px;
	background: #fff;
	width: 60%;
	height: 40px;
	box-shadow: 0px 0px 5px 0px;
}

.login {
	margin-left: 370px;
	font-family: inherit;
	width: 10%;
	height: 5%;
}

.ldiv {
	background-color: #2f8ecc;
	font-family: serif;
	font-size: 15px !important;
	color: white;
	border: none;
	padding: 0px 0px 0px 0px;
}

.formBody {
	position: relative;
	margin: 50px;
	margin-left: 50px;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: #757474;
	color: white;
	height: 120px;
	margin-top: 80px;
	left: 0;
}

.header {
	width: 100%;
	overflow: hidden;
	background-color: #ffffff;
	padding: 20px 30px;
	height: 70px;
	overflow: hidden;
}

hr.new1 {
	border-top: 1px solid;
	background-color: #f4f4f4;
	width: 41%;
}

.copyright {
	float: left;
	margin: 50px;
	font-family: Arial;
	font-weight: normal;
	font-size: 14px;
	color: white;
	letter-spacing: 1px;
}

.Limg {

    position : relative;
	margin: 50px;
	margin-right: 180px;
	width: 30px;
	height: 30px;
	background-color: #4099ff;
}

.Fimg {

    position : relative;
	margin: 50px;
	width: 30px;
	height: 30px;
	background-color: #4099ff;
	margin-right: -120px;
}

.Timg{

   position : fixed;
   margin : -20px;
   margin-left : 70px;
   width: 200px;
   height: 100px;
}

.top_logo_lft {
	width: 50%;
	float: left;
}
</style>
</head>
<body>

	<div class="header">
		<span> <a href="http://localhost:8080/productivetool/login"> <img alt="Productive Image" class="Timg"
				src="https://www.productivehours.com/Images/SiteLogo.png">
		</a>
		</span>
	</div>

	<div class="formBody">
		<h1>Employee Login</h1>
		<hr class="new1">
		<br />
		<form action="validate-user" method="post">
			<section>
				<div>
					<div class="Ldiv">
						<div>
							<label style="color: #333;">User Name:</label>
						</div>
						<div>
							<input type="text" id="username" name="email" />
						</div>
						<br /> <br />
					</div>
					<div class="Pdiv">
						<div>Password</div>
						<div>
							<input type="password" id="password" name="password" />
						</div>
					</div>
					<br /> <br />
					<div class="login">
						<input type="submit" value="Login" class="ldiv" />
					</div>
				</div>
			</section>
		</form>
	</div>

	<div class="footer">
		<p class="copyright">Copyright 2020 - Productive Hours</p>
		<span> <a target="_blank" href=""> <img align="right"
												alt="Linked IN"
												class="Limg"
												src="https://cdn4.iconfinder.com/data/icons/social-messaging-ui-color-shapes-2-free/128/social-linkedin-circle-512.png"></a> <a> <img alt="Facebook" class="Fimg"
				align="right"
				src="https://cdn3.iconfinder.com/data/icons/capsocial-round/500/facebook-512.png">
		</a>
		</span>
	</div>
</body>
</html>