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


	<table class="formtable2">
		<tr>
			<td class="label">년도</td>
			<td class="label">학기</td>
			<td class="label">이수 학점</td>
			<td class="label">상세보기</td>

		</tr>
		<tr>
			<td class="label">2017</td>
			<td class="label">1</td>
			<td class="label">18</td>
			<td class="label"><sf:form method="post"
					action="${pageContext.request.contextPath}/school"
					modelAttribute="passYS">
					<sf:input type="hidden" path="year" value="2017" />
					<sf:input type="hidden" path="semester" value="1" />
					<input class="control" type="submit" name="링크" value="링크" />
				</sf:form>
		</tr>
		<tr>
			<td class="label">2017</td>
			<td class="label">2</td>
			<td class="label">22</td>
			<td class="label"><sf:form method="post"
					action="${pageContext.request.contextPath}/school"
					modelAttribute="passYS">
					<sf:input type="hidden" path="year" value="2017" />
					<sf:input type="hidden" path="semester" value="2" />
					<input class="control" type="submit" name="링크" value="링크" />
				</sf:form>
		</tr>
		<tr>
			<td class="label">2018</td>
			<td class="label">1</td>
			<td class="label">18</td>
			<td class="label"><sf:form method="post"
					action="${pageContext.request.contextPath}/school"
					modelAttribute="passYS">
					<sf:input type="hidden" path="year" value="2018" />
					<sf:input type="hidden" path="semester" value="1" />
					<input class="control" type="submit" name="링크" value="링크"/>
				</sf:form>
		</tr>
		<tr>
			<td class="label">2018</td>
			<td class="label">2</td>
			<td class="label">18</td>
			<td class="label"><sf:form method="post"
					action="${pageContext.request.contextPath}/school"
					modelAttribute="passYS">
					<sf:input type="hidden" path="year" value="2018" />
					<sf:input type="hidden" path="semester" value="2" />
					<input class="control" type="submit" name="링크" value="링크"/>
				</sf:form>
		</tr>
	</table>

</body>
</html>