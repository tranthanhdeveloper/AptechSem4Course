<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Student List</h1>
<s:a namespace="/student" action="add">Add new student</s:a>
<table border="1">
    <thead>
        <tr>
            <th>Id</th>
            <th>User name</th>
            <th>Full name</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.username}</td>
                <td>${student.fullName}</td>
                <td>
                    <s:url var="url_update" namespace="/student" action="update">
                        <s:param name="studentId">${student.id}</s:param>
                    </s:url>
                    <s:a href="%{url_update}">Update</s:a>
                    &nbsp;||&nbsp;
                    <s:url var="url_delete" namespace="/student" action="delete">
                        <s:param name="studentId">${student.id}</s:param>
                    </s:url>
                    <s:a href="%{url_delete}" onclick="return confirm('Are you sure?')">Delete</s:a>
                </td>
            </tr>

        </c:forEach>

    </tbody>

</table>
