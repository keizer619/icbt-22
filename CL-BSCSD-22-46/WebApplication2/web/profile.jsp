<%-- 
    Document   : profile.jsp
    Created on : Aug 26, 2021, 11:11:45 PM
    Author     : 94711
--%>
<%@page import="oop.Utils"%>
<%@page import="oop.UserSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UserSession userSession = Utils.handleUserSession(request, response, session);
            if (userSession == null) {
                response.sendRedirect("login.jsp");
            } 
        %>
        <h1>Hello World!</h1> <br>
        <a href="logout.jsp">LogOut</a>
    </body>
</html>
