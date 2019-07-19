<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
<script
	src="${pageContext.request.contextPath}/resources/javascript/simple-test.js"></script>
</head>
<body>
	<h1>Welcome to the world of SPRING-MVC</h1>
	<img
		src="${pageContext.request.contextPath}/resources/images/spring-logo.png" />
<br>
<hr>	
<br>	
	<h2>Spring MVC Demo - Student Home Page</h2>
	<a href="student/showFormMapping">Student Home Page</a>
	<br>
	<br>
	<img
		src="${pageContext.request.contextPath}/resources/images/students-logo.png" />
	<br>
	<br>
	<input type="button" onclick="doSomeWork()" value="Click Me" />
<br>
<hr>	
<br>
	<h2>Spring MVC Demo - Hospital Home Page</h2>
	<a href="hospital/showFormMapping">Hospital Home Page</a>
	<br>
	<br>
	<img
		src="${pageContext.request.contextPath}/resources/images/hospital-logo.png" />
	<br>
	<br>
	<input type="button" onclick="doSomeWork()" value="Click Me" />
</body>
</html>