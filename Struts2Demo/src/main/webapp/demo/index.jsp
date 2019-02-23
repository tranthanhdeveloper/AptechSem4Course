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
		<h1>Welcome to Struts2 demo</h1>
		<p>Age: ${age }</p>
		<p>User name: ${username }</p>
		<hr>
		<h3>Product information</h3>
		<table border="1">
			<thead align="center">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Price</th>
					<th>Photo</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${product.id }</td>
					<td>${product.name }</td>
					<td>${product.price }</td>
					<td><img src="${pageContext.request.contextPath }/assets/images/${product.photo }"></td>
				</tr>
			</tbody>
		</table>
		
		<hr>
		<h3>Product List</h3>
		<table border="1">
			<thead align="center">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Price</th>
					<th>Photo</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="productListItem" items="${ products}">
					<tr>
						<td>${productListItem.id }</td>
						<td>${productListItem.name }</td>
						<td>${productListItem.price }</td>
						<td><img src="${pageContext.request.contextPath }/assets/images/${productListItem.photo }"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<s:url namespace="/demo" action="hello" var="helloUrl"/>
		<s:a href="%{helloUrl}">Go to Hello</s:a>
		<s:url namespace="/demo" action="usesession" var="useSessionUrl"/>
		<s:a href="%{useSessionUrl}">Session Demo</s:a>
		<s:url var="myLink" namespace="/demo" action="querystring">
			<s:param name="id1">123</s:param>
			<s:param name="id2">Abc</s:param>
		</s:url>
		<s:a href="%{myLink}">Use Query String</s:a>
	</body>
</html>