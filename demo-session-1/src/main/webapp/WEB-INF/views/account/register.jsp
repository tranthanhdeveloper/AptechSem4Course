<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html lang="en">
<head>
<title>Title</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form:form method="POST" modelAttribute="account" action="${pageContext.request.contextPath }/account/register" cssClass="form" enctype="multipart/form-data">
			<form >
				<div class="form-group">
					<form:label path="username">Username</form:label>
					<form:input type="text" path="username" id="usernameId" cssClass="form-control" placeholder="" aria-describedby="helpId"/>
					<small id="helpId" class="text-muted">Help text</small>
				</div>

				<div class="form-group">
					<label for="password">Password</label>
					<form:input type="password" path="password" id="password" cssClass="form-control" placeholder="" aria-describedby="helpId"/>
				</div>

				<div class="form-group">
					<form:label path="description">Description</form:label>
					<form:textarea cssClass="form-control" path="description" rows="3"></form:textarea>
				</div>

				<div class="form-check">
					<label class="form-check-label">
						<form:checkbox cssClass="form-check-input" path="status" value="checkedValue" checked="checked" />
						Status
					</label>
				</div>

				<div class="form-check">
					<label class="form-check-label">
						<form:checkboxes path="languages" items="${languages}" itemValue="code" itemLabel="name" />
					</label>
				</div>

				<div class="form-check">
					<label class="form-check-label">
						<form:radiobutton cssClass="form-check-input" path="gender" value="MALE"/>Male
					</label>
				</div>

				<div class="form-check">
					<label class="form-check-label">
						<form:radiobutton cssClass="form-check-input" path="gender"  value="FEMALE"/>Male
					</label>
				</div>

				<div class="form-check">
					<label class="form-check-label">
						<form:select cssClass="form-control" items="${roles}" itemLabel="name" itemValue="id" path="role" />
					</label>
				</div>

				<div class="form-group">
					<label class="custom-file">
						<input type="file" name="fileUpload" accept="image/*">
						<span class="custom-file-control">Upload avatar</span>
					</label>
				</div>
				<br>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</form:form>
	</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>