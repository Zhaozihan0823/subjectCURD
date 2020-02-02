<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Subject</title>
<script type = "text/javascript" src = "js/jquery-1.11.1.js"></script>

<script type = "text/javascript">
	$(function(){
		$("tr").mouseover(function(){
			$(this).css("background","#eeffee");
			});
		$("tr").mouseout(function(){
			$(this).css("background","white");
			});
		
		$("#btn_del").click(function(){
			var check_stuID = $("input[name='stuID']:checked");

			if(check_stuID.size() == 0){
				alert("请选中后再删除");
				}else{
					$("form").submit();
					}
			});
		$("#stuIDs").click(function(){
			$("input[name='stuID']").prop("checked", $(this).prop("checked"));
			});
		
		$("#btn_insert").click(function(){
			window.open("viewInsertServlet", "_self");	
			});
		})
				

</script>

</head>
<body>
	<form action="deleteServlet" method="post">
	<table border="1" style="text-align: center" width=100%>
	<caption>学生课程管理列表</caption>
	<tr>
	<td><input type="checkbox" name="stuIDs" id="stuIDs"></td>
	<td>序号</td>
	<td>学号</td>
	<td>姓名</td>
	<td>课程号</td>
	<td>课程名</td>
	<td>分数</td>
	<td>开课时间</td>
	<td>授课教师</td>
	<td>操作</td>
	</tr>
	
	<c:forEach items = "${subject }" var = "s" varStatus = "state">
	<tr>
	<td><input type="checkbox" name="stuID" value="${s[0] }"></td>
	<td>${state.count }</td>
	<td>${s[0] }</td>
	<td>${s[1] }</td>
	<td>${s[2] }</td>
	<td>${s[3] }</td>
	<td>${s[4] }</td>
	<td>${s[5] }</td>
	<td>${s[6] }</td>
	<td><a href="">修改</a></td>
	</tr>
	</c:forEach>
	
	</table>
	<input type="button" value="删除" id="btn_del">
	<input type="button" value="添加" id="btn_insert">
	</form>

</body>
</html>