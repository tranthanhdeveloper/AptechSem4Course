<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<h1>Login to System</h1>

<s:form namespace="/student" action="checkLogin" method="POST">
    <s:textfield name="username" label="Username"/>
    <s:password name="password" label="Password"/>
    <s:submit value="Login"/>
</s:form>