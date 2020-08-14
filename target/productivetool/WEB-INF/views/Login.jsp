<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h1 {
	text-align: center;
	font-size: 36px;
	color: #696868;
	padding-bottom: 11px;
	border-bottom: 1px solid rgba(18, 104, 205, 0.3);
}

label {
	display: inline-block;
	max-width: 100%;
	margin-bottom: 5px;
	font-weight: 700;
}



/* body, input, td, tr {
	line-height: 1 !important;
	max-width: 100% !important;
	overflow-x: hidden !important;
	font-family: "Trebuchet MS";
	font-size: 14px !important;
	line-height: 1.928571429 !important;
	color: #333333 !important;
} */
}
</style>
</head>
<body>
	<h1>Employee Login</h1>
	<form action="/EmployeeLoginPage">
		<div>
			<div class="box1">
				<label>User Name:</label><br /> <input type="text" id="username" style="width: 350px;height: 40px"/>
			</div>
			<div>
				<br /> <label>Password:</label><br /> <input type="password"
					id="password" style="width: 350px;height: 40px"/>
			</div>
		</div>
	</form>
</body>
</html>