<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/10 0010
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
    <h1>Welcome to Spittr</h1>
    <a href="<c:url value="/spittles"/>">Spittles</a>
    <a href="<c:url value="/spittles/register"/>">Register</a>
</body>
</html>