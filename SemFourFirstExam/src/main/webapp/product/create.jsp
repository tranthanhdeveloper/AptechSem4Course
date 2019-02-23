<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create product</title>
</head>
<body>
	<h1>Product creation file</h1>
	<form action="${pageContext.request.contextPath }/product?action=create" method="post" >
		<table>
			<tr>
				<td>Name:</td>
				<td><input name="name" type="text" placeholder="Product Name"> </td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><input name="price" type="text" placeholder="Product Price"> </td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><input name="description" type="text" placeholder="Product description"> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Create"> </td>
			</tr>
			
		</table>
	</form>
</body>
</html>