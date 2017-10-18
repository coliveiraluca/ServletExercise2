<%--
  Created by IntelliJ IDEA.
  User: LucaCDO
  Date: 18/10/17
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<form method="post" action="/login">
    Login: <input type="text" name="login"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Login">
    <input type="button" value="Cancel">
</form>
</body>
</html>
