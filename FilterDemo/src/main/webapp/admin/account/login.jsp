<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login page</h1>

<form method="post" action="${pageContext.request.contextPath }/admin/account?action=login">
	<table>
		<tr>
			<td>Username</td>
			<td><input name="username" type="text"></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input name="password" type="password"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><input type="submit"  value="Login"></td>
		</tr>
	</table>
</form>

</body>
</html>