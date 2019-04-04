<%@ page isELIgnored="false" language="java" contentType="text/html; UFT-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html"/>

</head>
<body>

<h1>Test</h1>
<hr>
<p>Age:${age}</p>
<br>
<p>Fullname:${fullname}</p>
<p>Price:${age}</p>

<p><strong>Product information:</strong></p>
<table class="table" border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Photo</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
            <td><img src="${pageContext.request.contextPath}/resources/image/${product.photo}"></td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
