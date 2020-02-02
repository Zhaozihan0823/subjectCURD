<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insertServlet" method = "post">
	stuID:<input type="text" name="stuID"><br/>
	stuname:<input type="text" name="stuname"><br/>
	classname
	<select name="classname">
		<c:forEach var="s" items="${sub }">
			<option value="${s.classname }">${s.classname }</option>
		</c:forEach>
	</select><br/>
	score:<input type="text" name="score"><br/>
	<input type="submit" value="添加">
	</form>
</body>
</html>