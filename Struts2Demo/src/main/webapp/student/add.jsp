<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<h1>Student Creation Form</h1>

<s:form namespace="/student" action="add" method="POST">
    <s:textfield name="student.username" label="Username"/>
    <s:textfield name="student.fullName" label="Full name"/>
    <s:password name="student.password" label="Password"/>
    <s:submit value="Create"/>
</s:form>