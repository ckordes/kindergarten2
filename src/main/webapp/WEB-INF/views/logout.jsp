<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<html>
<head>
    <link rel="stylesheet" href="<c:url value="/resources/static/css/main.css"/>">
    <title>Login to Kindergarten</title>
</head>
<body class="container">
<%@include file="header.jsp" %>

<form action="<c:url value="/logout"/>" method="post">
    <input class="fa fa-id-badge" type="submit" value="Wyloguj">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

<%@include file="footer.jsp" %>
</body>
</html>