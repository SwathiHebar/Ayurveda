<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/WEB-INF/views/template/Header.jsp" %>SSS

<html>
<head></head>
<body>
<div class="container-wrapper">
    <div class="login-container">
        <div id="login-box">
<br><br><br><br><br>
            <h2>Login to your Account</h2>

            <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>

            <form name="loginForm" action=<c:url value='/j_spring_security_check'/> method="post">
                <c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000;">${error}</div>
                </c:if>
                <div class="form-group">
                    <label for="username">User: </label>
                    <input type="text" id="username" name="username" class="form-control" size="20"/>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" class="form-control"  size="30"/>
                </div>

                <input type="submit" value="Submit" class="btn btn-default">

                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            </form>

        </div>
    </div>
</div>

<%@include file="/WEB-INF/views/template/footer.jsp" %>
</body>
</html>