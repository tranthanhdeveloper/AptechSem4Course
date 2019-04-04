<%@ page language="java" contentType="text/html; UFT-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html"/>
    <link href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
    <h3>Demo static resources</h3>
    <hr>
    <img src="${pageContext.request.contextPath}/resources/images/thumb1.gif" onclick="clickMe();">
    <a href="${pageContext.request.contextPath}/demo/demo3">Go to demo3</a>
    <br>
    <a href="${pageContext.request.contextPath}/demo/demo4/10">Go to demo3</a>
    <br>
    <a href="${pageContext.request.contextPath}/demo/demo5/10/20">Go to demo5</a>
    <br>
    <a href="${pageContext.request.contextPath}/demo/demo6?page=5">Demo6</a>
<script src="${pageContext.request.contextPath}/resources/js/mylib.js" type="text/javascript"></script>
</body>
</html>
