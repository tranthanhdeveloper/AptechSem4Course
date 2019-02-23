<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Student List</h1>
<s:a namespace="/student" action="add">Add new student</s:a>
<table>
    <thead>
        <tr>
            <th>Id</th>
            <th>User name</th>
            <th>Full name</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="student" items="studentList">
            <tr>
                <td>${student.id}</td>
                <td>${student.username}</td>
                <td>${student.fullName}</td>
                <td>Update||Delete</td>

            </tr>

        </c:forEach>

    </tbody>

</table>
