<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom tag files demo</title>
</head>
<body>
	<tags:hello/>
	<tags:hi fullname="Tran Thanh"/>
	<tags:sum number2="13" number1="10"/>
	<tags:myfragment>
		<jsp:attribute name="content">
			<h3>My fragment content</h3>
		</jsp:attribute>
	</tags:myfragment>
</body>
</html>