<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<header class="header">
    <h1>Kindergarden</h1>
    <a href="/login" style="background: aquamarine">Log In</a>
    <sec:authorize access="hasRole('TEACHER')">
        <a href="/kindergarden_war_exploded/teacher/mainPage" style="background: aquamarine">Teacher Zone</a>
    </sec:authorize>

    <sec:authorize access="hasRole('PARENT')">
        <a href="/kindergarden_war_exploded/parent/mainPage" style="background: aquamarine">Parent Zone</a>
    </sec:authorize>

    <sec:authorize access="isAuthenticated()">
        <a href="/kindergarden_war_exploded/changePassword" style="background: aquamarine">Change E-mail or Password</a>
        <form action="<c:url value="/logout"/>" method="post">
            <input type="submit" value="Log Out">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <%--    <a href="/logout" style="background: aquamarine">Log Out</a>--%>
    </sec:authorize>

    <sec:authorize access="isAuthenticated()">
        <p>Zalogowany jako: <sec:authentication property="username"/></p>
    </sec:authorize>
</header>