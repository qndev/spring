<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Test RadioButtons</h1>

	<form:form modelAttribute="RadioModel" servletRelativeAction="/spring/spring/submit">
		<c:forEach items="${radiobuttonsList}" varStatus="iteration" var="item">
			<c:choose>
				<c:when test="${iteration.index == 0}">
					<form:radiobutton path="radioButtonKey" value="${item.key}"
						label="${item.value}" checked="checked" />
				</c:when>
				<c:otherwise>
					<form:radiobutton path="radioButtonKey" value="${item.key}"
						label="${item.value}" />
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>