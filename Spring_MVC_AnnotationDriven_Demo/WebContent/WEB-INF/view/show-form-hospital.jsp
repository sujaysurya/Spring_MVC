<!DOCTYPE html>
<html>

<head>
<title>Spring MVC - Show Form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>


<body>
	<h2>Spring MVC - Hospital Home Page</h2>
	<h3>Spring MVC - Enter name to get greeted</h3>
	<form action="processFormMapping" method="get">
		<input type="text" name="patnt_name"
			placeholder="Enter name for greeting"> <input type="submit">
	</form>


	<h3>Spring MVC - Hospital : new patient Registration</h3>
	<form action="registerNewPatientMapping" method="get">
		<input type="text" name="patnt_name"
			placeholder="Enter your name">
			<input type="text" name="patnt_age"
			placeholder="Enter your age">
			<input type="text" name="patnt_gender"
			placeholder="Enter your gender">
			 <input
			type="submit">
	</form>


	<h3>Spring MVC - Hospital : Existing patient check-in here</h3>
	<form action="checkInExistingPatientMapping" method="get">
		<input type="text" name="patnt_name" placeholder="Enter full name">

		<input type="text" name="patnt_id"
			placeholder="Enter your registered patient id"> <input
			type="submit">

	</form>


</body>

</html>