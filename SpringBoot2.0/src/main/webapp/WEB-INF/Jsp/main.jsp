<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <h1>登陆用户is:</h1>  ${userName}
   <h2>修改用户密码</h2>
   <form method="post" action="update">
   		yonghM:<input type="text" name="userName" style="width: 168px; color: Green; height: 24px"/>
   		<br><br>Mima:<input type="password" name="passWord" style="width: 168px; color: Green; height: 24px"/>
   		<br><br><input type="submit" value="提交"/>
   </form>
   
   <form method="post" action="inser">
   		yonghM:<input type="text" name="userName" style="width: 168px; color: Green; height: 24px"/>
   		<br><br>Mima:<input type="password" name="passWord" style="width: 168px; color: Green; height: 24px"/>
   		<br><br><input type="submit" value="提交"/>
   </form>
  </body>
</html>
