<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="school" items = "${schools}">
		<p>
			<c:out value="${school.getYear()}"></c:out>
			<c:out value="${school.getSemester()}"></c:out>
			<c:out value="${school.getCode()}"></c:out>
			<c:out value="${school.getName()}"></c:out>
			<c:out value="${school.getSection()}"></c:out>
			<c:out value="${school.getScore()}"></c:out>
		</p>
		
		
	</c:forEach>
	

</body>
</html>