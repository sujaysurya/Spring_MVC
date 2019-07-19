<!DOCTYPE html>
<html>

<head>
<title>Spring MVC - Show Form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>


<body>
	<h2>Spring MVC - Show Form Page</h2>
	<h3>Spring MVC - Enter name to get greeted</h3>
	<form action="processFormMapping" method="get">
		<input type="text" name="stdnt_name"
			placeholder="Enter name for greeting"> <input type="submit">
	</form>
	<br>
	<br>
	<hr>
	<br>
	<br>
	<h3>Spring MVC - Enter name for upper case conversion</h3>
	<form action="upperCaseConvertMapping" method="get">

		<input type="text" name="stdnt_name"
			placeholder="Enter here to convert to lower text"> <input
			type="submit">
	</form>
	<br>
	<br>
	<hr>
	<br>
	<br>
	<h3>Spring MVC - Enter name for lower case conversion</h3>
	<form action="lowerCaseConvertMapping" method="get">
		<input type="text" name="stdnt_name"
			placeholder="Enter here to convert to lower text"> <input
			type="submit">
	</form>


</body>

</html>