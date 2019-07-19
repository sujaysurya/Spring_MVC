<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
<title>Spring MVC - Employee Registration Form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>


<body>

<form:form action="processFormMapping" modelAttribute="employee">
	First Name: <form:input path="firstName"/>
	<br><br>
	Last Name: <form:input path="lastName"/>
	<br><br>
	Social Security: <form:input path="socialSecurity"/>
	<br><br>
	Telephone Number: <form:input path="telephoneNumber"/>
	<br><br>
	Employee ID: <form:input path="employeeID"/>
	
	<input type="submit" value="Submit">

</form:form>

</body>

</html>