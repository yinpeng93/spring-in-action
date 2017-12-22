<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/21 0021
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>RegisterForm</title>
</head>
<body>
    <h1>Register</h1>
    <form method="post" action="<%=path%>/spitter/register">
        First Name:<input type="text" name="firstName"/><br/>
        Last Name:<input type="text" name="lastName"/><br/>
        Username:<input type="text" name="username"/><br/>
        Password:<input type="password" name="password"/><br/>
        <input type="submit" value="Register"/>
    </form>
</body>
</html>
