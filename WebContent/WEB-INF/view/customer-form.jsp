<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<style type="text/css">
		.error{color: red;}
	</style>
<title> Customer Registration </title>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		<h2> fill out the form below become a Customer </h2>
	
		first name : <form:input path="firstName" /> <br><br>
		
		last name : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>