<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Spring MVC - Animal Registration Form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>


<body>

	<form:form action="processFormMapping" modelAttribute="tthplant">

	Name: <form:input path="name" />
		<br>
		<br>
	
	Type: <form:input path="type" />
		<br>
		<br>
	
	Longevity: <form:input path="longevity" />
		<br>
		<br>
	Native Country Location:
		<form:select path="country">
			<form:options items="${tthplant.nativeLocation}" />
		</form:select>
		<br>
		<br>
	Native Continent Location:
		<form:select path="continent">
			<form:options items="${donsContinentOptions}" />
		</form:select>
		<br>
		<br>
	OxygenRate:
	<br>
	Banyian Tree <form:radiobutton path="oxyRate" value="25%" />	
	Gauva Tree <form:radiobutton path="oxyRate" value="50%" />	
	Peapul Tree <form:radiobutton path="oxyRate" value="75" />	
	Neem Tree <form:radiobutton path="oxyRate" value="100%" />
		<br>
		<br>
	Feasibility to contract disease:	
	<br>
	Critical-High<form:checkbox path="diseaseLiablity" value="Critical"/>
	High-Medium<form:checkbox path="diseaseLiablity" value="Optimum"/>
	Medium-Low<form:checkbox path="diseaseLiablity" value="Fair"/>
	Low<form:checkbox path="diseaseLiablity" value="none"/>
	<br>
	<br>	
		<input type="submit" value="Submit">
		<br>
		<br>


	</form:form>



</body>

</html>