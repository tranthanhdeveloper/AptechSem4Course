<%@ tag language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ attribute name="title" description="" rtexprvalue="true" required="false" type="java.lang.String"%>
<%@ attribute name="content" fragment="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/home">Home</a>&nbsp;|&nbsp;
	<a href="${pageContext.request.contextPath }/about">About us</a>&nbsp;|&nbsp;
	<a href="${pageContext.request.contextPath }/news">New</a>&nbsp;|&nbsp;
	<br>
	<br>
	<jsp:invoke fragment="content"></jsp:invoke>
	
	<br>
	<br>
	Copyright
</body>
</html>