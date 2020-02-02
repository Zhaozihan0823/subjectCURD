<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 function register(){
  document.signupForm.action = "../signupServlet";
  document.signupForm.submit();
 }
</script>
</head>

<body>
 <form name= "signupForm" action="../signinServlet" method="post">
  stuID:<input type = "text" name = "stuID"><br/>
  password:<input type = "password" name = "password"><br/>
  <input type = "submit" value = "登陆">
  <input type = "button" onclick = "register()" value = "注册">
 </form>

 
</body>
</html>