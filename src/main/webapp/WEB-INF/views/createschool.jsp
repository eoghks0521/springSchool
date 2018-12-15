<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
<body>
	<sf:form method="post"
		action="${pageContext.request.contextPath}/nextYear"
		modelAttribute="expect">

		<table class="formtable">
			<tr>
				<td>신청할 강의를 입력해주세요.</td>
			</tr>
			<tr>
				<td><sf:input class="control" type="text" path="name" /><br />
					<sf:errors path="name" class="error" /></td>
			</tr>
			<tr>
			<td>
			<input class="control" type="submit" value="등록하기" />
			</td>
			</tr>
		</table>

	</sf:form>


</body>
</html>