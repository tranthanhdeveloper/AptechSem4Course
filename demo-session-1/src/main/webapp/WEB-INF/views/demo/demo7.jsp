<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html lang="en">
<head>
<title>Create employee successful</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<section class="container">
		<h3>Searching</h3>
		<hr>
		<form method="post" action="${pageContext.request.contextPath}/demo/search" class="form">
			<div class="form-group">
				<label for=""></label>
				<input type="text" class="form-control" name="keyword" id="" aria-describedby="helpId" placeholder="">
			</div>
			<button type="submit" class="btn btn-primary">Search</button>
		</form>

	</section>

	<section class="container">
		<h3>Cart</h3>
		<hr>
		<form method="post" action="${pageContext.request.contextPath}/demo/update" class="form">
			<div class="form-group">
				<label for="">Quantity</label>
				<input type="text" class="form-control" name="quantity" aria-describedby="helpId" placeholder="Quantity 1" value="3">
			</div>
			<div class="form-group">
				<label for="">Quantity 2</label>
				<input type="text" class="form-control" name="quantity" aria-describedby="helpId" placeholder="Quantity 2" value="8">
			</div>
			<div class="form-group">
				<label for="">Quantity 3</label>
				<input type="text" class="form-control" name="quantity" aria-describedby="helpId" placeholder="Quantity 3" value="9">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</section>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>