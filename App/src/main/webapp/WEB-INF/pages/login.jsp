<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=windows-1251" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
		<link href="<spring:url value="/resources/css/basic.css" />" rel="stylesheet"/>
		<link href="<spring:url value="/resources/css/forms.css" />" rel="stylesheet"/>
	</head>
	<body class="red">
		<div class="warnings">
			${warning}
		</div>
		<form class="login" method="post" action="loginCheck">
			<label>
				Login
				<input name="login" required="required"/>
			</label>
			<br/>
			<label>
				Password
				<input type="password" name="password" required="required"/>
			</label>
			<br/>
			<label>
				Name
				<input name="name" />
			</label>
			<br/>
			<input type="submit" value="Sign Up" />
		</form>
	</body>
</html>