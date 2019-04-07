<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!doctype html>
<html lang="en">
<head>
    <title>Spring Validation</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<section class="container">
    <h1>Employee registration</h1>
    <hr>
    <form:form method="POST" modelAttribute="employee" action="${pageContext.request.contextPath }/employee/register" cssClass="form">
        <c:set var="usernameHasBindError">
            <form:errors path="username"/>
        </c:set>
        <div class="form-group">
            <form:label path="username">Username</form:label>
            <form:input type="text" path="username" id="usernameId" cssClass="form-control ${not empty usernameHasBindError ? 'is-invalid' : ''} " placeholder="" aria-describedby="helpId"/>
            <strong id="helpId" class="text-muted"><form:errors path="username" cssStyle="color: #d21d1d;"/></strong>
        </div>

        <c:set var="passwordHasBindError">
            <form:errors path="password"/>
        </c:set>
        <div class="form-group">
            <form:label path="username">Password</form:label>
            <form:password type="text" path="password" id="usernameId" cssClass="form-control ${ not empty passwordHasBindError ? 'is-invalid' : ''}" placeholder="" aria-describedby="helpId"/>
            <strong id="helpId" class="text-muted"><form:errors path="password" cssStyle="color: #d21d1d;"/></strong>
        </div>

        <div class="form-group">
            <form:label path="username">Password</form:label>
            <form:input type="text" path="age" id="usernameId" cssClass="form-control ${status.error ? 'has-error' : ''}" placeholder="" aria-describedby="helpId"/>
            <strong id="helpId" class="text-muted"><form:errors path="age" cssStyle="color: #d21d1d;"/></strong>
        </div>

        <div class="form-group">
            <form:label path="username">Password</form:label>
            <form:input type="text" path="email" id="usernameId" cssClass="form-control ${status.error ? 'has-error' : ''}" placeholder="" aria-describedby="helpId"/>
            <strong id="helpId" class="text-muted"><form:errors path="email" cssStyle="color: #d21d1d;"/></strong>
        </div>

        <div class="form-group">
            <form:label path="username">Password</form:label>
            <form:input type="text" path="website" id="usernameId" cssClass="form-control ${status.error ? 'has-error' : ''}" placeholder="" aria-describedby="helpId"/>
            <strong id="helpId" class="text-muted"><form:errors path="website" cssStyle="color: #d21d1d;"/></strong>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</section>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>