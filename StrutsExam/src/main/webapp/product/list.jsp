<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<s:a namespace="/product" action="add">Add new product</s:a>
<hr>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Description</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="p" items="${products}">
        <tr>
            <td>${p.name }</td>
            <td>${p.description }</td>
            <td>${p.price }</td>
            <td>${p.quantity }</td>
            <td>${p.price * p.quantity }</td>
            <td>
                <s:url var="url_edit" namespace="/product" action="edit">
                    <s:param name="id">${p.id }</s:param>
                </s:url>
                <s:a href="%{url_edit}">Edit</s:a> |
                <s:url var="url_delete"
                       namespace="/product" action="delete">
                    <s:param name="id">${p.id }</s:param>
                </s:url>
                <s:a href="%{url_delete}"
                     onclick="return confirm('Are you sure?');">Delete</s:a>
        </tr>
    </c:forEach>
    </tbody>

</table>

</body>
</html>
