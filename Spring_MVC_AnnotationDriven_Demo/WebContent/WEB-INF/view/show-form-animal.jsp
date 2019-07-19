<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Spring MVC - Animal Registration Form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>


<body>
	<form:form action="processFormMapping" modelAttribute="animals">

	Kingdom: <form:input path="kingdom" />
		<br>
		<br>
	Genus: <form:input path="genus" />
		<br>
		<br>
	Species: <form:input path="species" />
		<br>
		<br>
	Threat Status: 
	<form:select path="threatStatus">
			<form:option value="Vulnarable" label="Vulnarable" />
			<form:option value="Endangered" label="Endangered" />
			<form:option value="Extinct" label="Extinct" />
			<form:option value="Critically Endangered"
				label="Critically Endangered" />
		</form:select>
		<input type="submit" value="Submit">
		<br>
		<br>
	</form:form>
</body>

</html>