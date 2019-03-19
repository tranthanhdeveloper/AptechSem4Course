<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<h1>Student Creation Form</h1>

<s:form namespace="/product" action="processAdd" method="POST">
    <s:textfield name="product.name" label="Name"/>
    <s:textfield name="product.price" label="Price"/>
    <s:textfield name="product.quantity" label="Quantity"/>
    <s:textfield name="product.description" label="Description"/>
    <s:submit value="Create"/>
</s:form>