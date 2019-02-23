<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 2/19/2019
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:a namespace="/home" action="index">Home</s:a>
    <s:a namespace="/aboutus" action="index">About us</s:a>
    <s:a namespace="/news" action="index">News</s:a>
    <s:a namespace="/news" action="index">Employee</s:a>
    <s:a namespace="/student" action="index">Student</s:a>
<br><br>
    <tiles:insertAttribute name="content"></tiles:insertAttribute>
<br><br>

</body>
</html>
