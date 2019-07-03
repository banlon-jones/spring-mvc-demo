<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration page </title>
</head>
<body>
	
	<h2> fill out the form below become a students </h2>
	
	<form:form action="student/processForm" modelAttribute="student">
		
		first name : <form:input path="firstName" /> <br><br>
		last name : <form:input path="lastName" />
		<br><br>
		<input type="submit" value="Submit" />
		
	</form:form>

</body>
</html>