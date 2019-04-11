<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"  %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/home">Home</a> |
<a href="${pageContext.request.contextPath}/home">About us</a> |
<a href="${pageContext.request.contextPath}/home">News</a>
<br>
<br>
<tiles:insertAttribute name="content"></tiles:insertAttribute>
<br>
<br>
</body>
</html>