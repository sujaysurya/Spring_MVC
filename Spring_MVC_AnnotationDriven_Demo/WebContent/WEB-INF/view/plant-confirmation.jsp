<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<title>Spring MVC - Plant Confirmation</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/my-test.css">
</head>


<body>
	The plant is identified:
	<br>
	<br> The plant's name is: ${tthplant.name}
	<br>
	<br> The plant's type is:${tthplant.type}
	<br>
	<br> The plant's life span is:${tthplant.longevity}
	<br>
	<br> The Country Code where the plant first originated is:${tthplant.country}
	<br>
	<br> The  Native country based on continental Area is:${tthplant.continent}
	<br>
	<br> The  oxygen rate provided by the selected plant is:${tthplant.oxyRate}
	<br>
	<br> The  feasibility to contract disease is:
	<ul>
			<c:forEach var="temp" items="${tthplant.diseaseLiablity}">
			
					<li>${temp}</li>
			
			</c:forEach>
			
	</ul>
			
</body>

</html>