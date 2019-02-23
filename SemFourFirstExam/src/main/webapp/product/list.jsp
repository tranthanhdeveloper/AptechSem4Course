<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
	<h1>Product List page</h1>
	<a href="${pageContext.request.contextPath }/product?action=create">Create new product</a>
	<br>
	
	<form action="${pageContext.request.contextPath}/product?action=filter" method="get">
		<table>
			<tr>
				<td><input name="minprice" placeholder="Min price"> </td>
				<td><input name="maxprice" placeholder="Max price"> </td>
				<td><input type="submit" value="Search"> </td>
			</tr>
		</table>
		<input name="action" value="filter" type="hidden">
	</form>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Description</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products }" var="product">
				<tr>
					<td>${product.id }</td>
					<td>${product.name }</td>
					<td>${product.price }</td>
					<td>${product.description }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>