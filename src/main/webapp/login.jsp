<%--
  Created by IntelliJ IDEA.
  User: vic
  Date: 8/25/22
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="login.css">
    <title>Login</title>
</head>

<header>
    <h1>Victor & Kim Wedding</h1>

</header>
<body>
<form action="Login" method="POST">
    <input type="text"  placeholder="Username" name="user">
    <input type="password"  placeholder="Password" name="pass">
    <input type="submit" value="login" />
</form>

<p>${answer}</p>

</body>
</html>
