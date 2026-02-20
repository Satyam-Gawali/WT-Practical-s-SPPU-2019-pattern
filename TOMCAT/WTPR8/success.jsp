
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container success-container">
        <div class="success-icon">✓</div>
        <h2>Welcome, <span class="user-name">${user}</span>!</h2>
        <p>You have successfully logged in.</p>
    </div>
</body>
</html>