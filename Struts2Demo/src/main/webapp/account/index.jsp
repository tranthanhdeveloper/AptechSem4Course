<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Struts2 Demonstration</title>
		<link href="${pageContext.request.contextPath }/assets/css/style.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<h1>Welcome to Register page</h1>
		<s:form action="save" namespace="/account" method="POST">
			<s:textfield label="Username" name="account.username"/>
			<s:password label="Password" name="account.password"/>
			<s:textarea label="Description" name="account.description"/>
			<s:checkbox label="Status" name="account.status"/>
			<s:checkboxlist list="languageList" listKey="code" listValue="name" label="Languages" name="account.languages"/>
			<s:radio label="Gender" list="#{'m':'Male', 'f':'Female'}" name="account.gender"/>
			<s:select label="Role" list="roleList" listValue="name" listKey="id" name="account.role"/>

			<s:submit value="Save" align="left"/>

		</s:form>
		<s:url var="loginLink" namespace="/account" action="login"></s:url>
		<s:a href="%{loginLink}">Login</s:a>

	</body>
</html>