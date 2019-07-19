<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Spring MVC - Employee Confirmation</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>


<body>
	The employee is confirmed:
	<br><br> The employee's first Name is: ${employee.firstName}
	<br><br> The employee's last Name is:${employee.lastName}
	<br><br> The employee's telephone number
	is:${employee.telephoneNumber}
	<br><br> The employee's social security number
	is:${employee.socialSecurity}
	<br><br> The employee's ID is:${employee.employeeID}
	<br><br>
</body>

</html>