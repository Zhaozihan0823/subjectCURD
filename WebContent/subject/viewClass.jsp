<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1" style="text-align:center " width=80%>
	<caption>开课课程信息</caption>
	<tr>
	<td>序号</td>
	<td>课程号</td>
	<td>课程名</td>
	<td>开课时间</td>
	<td>授课教师</td>
	</tr>
	<c:forEach items = "${sub }" var = "s" varStatus = "state">
	<tr>
	<td>${state.count }</td>
	<td>${s.classno }</td>
	<td>${s.classname }</td>
	<td>${s.begaindate }</td>
	<td>${s.teacher }</td>
	</tr>
	</c:forEach>
	
	</table>
</body>
</html>