<%-- 
    Document   : profile.jsp
    Created on : Aug 22, 2021, 10:42:26 AM
    Author     : tharik
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
        <script>
            function logout() {
                
                var test = "test";
                
                
                window.location.href = "./handle-logout.jsp"
            }
        </script>
        
        <input type="button" onclick="logout()" value="logout"/>
        
        
        <%
            UserSession userSession = Utils.handleUserSession(request, response, session);
            if (userSession == null) {
                response.sendRedirect("login.jsp");
            } 
        %>
        <h1>Hello World!</h1>
    </body>
</html>
