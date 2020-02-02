<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../updateServlet" method="post">
		stuID:<span>${stu.stuID }</span><br/>
		stuname:<span>${stu.stuname }</span><br/>
		classname:<span>${stu.classname }</span><br/>
		score:<input type="text" name="score" value="${stu.score }"><br/>
		<input type="submit" value="修改" ><br/>
	</form>

</body>
</html>