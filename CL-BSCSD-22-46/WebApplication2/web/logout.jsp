<%-- 
    Document   : logout
    Created on : Aug 27, 2021, 12:05:49 AM
    Author     : 94711
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("login.jsp");
            %>
        <h1>Hello World!</h1>
    </body>
</html>
