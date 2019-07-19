<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<title>Spring MVC - Animal Confirmation</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>


<body>
	The animal is confirmed:
	<br>
	<br> The animal's species is: ${animals.species}
	<br>
	<br> The animal's genus is:${animals.genus}
	<br>
	<br> The animal's kingdom is is:${animals.kingdom}
	<br>
	<br> The animal's threat status is:${animals.threatStatus}
	<br>
</body>

</html>