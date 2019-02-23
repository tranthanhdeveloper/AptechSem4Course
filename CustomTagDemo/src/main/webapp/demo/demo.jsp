<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/mytag.tld" prefix="demo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo custom tags</title>
</head>
<body>
	<h3>Demo custom tag</h3>
	<demo:hello/>
	<br>
	<demo:hi fullname="Tran Thanh"/>
</body>
</html>