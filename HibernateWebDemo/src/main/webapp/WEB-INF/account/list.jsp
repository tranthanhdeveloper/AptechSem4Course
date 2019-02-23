<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Email</th>
				<th scope="col">Full name</th>
				<th scope="col">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${accounts }" var="account">
				<tr>
					<th scope="row">${account.id }</th>
					<td>${account.username }</td>
					<td>${account.fullname }</td>
					<td>Update &nbsp;|&nbsp;Delete </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
