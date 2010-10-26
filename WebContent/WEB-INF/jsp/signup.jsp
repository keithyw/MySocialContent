<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
<h1>Sign Up</h1>
<form:form commandName="user" method="post">
<fieldset>
	<div>
		<form:label path="firstName"><spring:message code="label.firstName"/></form:label>
		<form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>
	</div>
	<div>
		<form:label path="lastName"><spring:message code="label.lastName"/></form:label>
		<form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
	</div>
	<div>
		<form:label path="username"><spring:message code="label.username"/></form:label>
		<form:input path="username"/>
		<form:errors path="username" cssClass="error"/>
	</div>
	<div>
		<form:label path="email"><spring:message code="label.email"/></form:label>
		<form:input path="email"/>
		<form:errors path="email" cssClass="error"/>
	</div>
	<div>
		<form:label path="password"><spring:message code="label.password"/></form:label>
		<form:password path="password"/>
		<form:errors path="password" cssClass="error"/>
	</div>
	<div>
		<form:label path="confirmPassword"><spring:message code="label.confirmPassword"/></form:label>
		<form:password path="confirmPassword"/>
		<form:errors path="confirmPassword" cssClass="error"/>
	</div>
	<input type="submit" value="Register"/>
</fieldset>
</form:form>
</body>
</html>