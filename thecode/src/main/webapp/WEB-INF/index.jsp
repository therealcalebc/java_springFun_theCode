<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Secret Code</title>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<div class="container">
		<p class="error"><c:out value="${error}" /></p>
		<h1>What is the code?"</h1>
		<form action="/submit" method="post">
			<input type="text" name="code" />
			<button type="submit">Try Code</button>
		</form>
	</div>
</body>
</html>