<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 2/21/2019
  Time: 7:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<style type="text/css">
    .errorMessage{
        color: #ff0000;
    }

</style>

<s:form method="POST" namespace="/employee" action="save">
    <s:textfield label="Username" name="employee.username" value=""/>
    <s:password label="Password" name="employee.password" value=""/>
    <s:textfield label="Email" name="employee.email" value=""/>
    <s:textfield label="Website" name="employee.website" value=""/>
    <s:submit value="submit"/>
</s:form>
