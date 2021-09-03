 <%@page import="oop.Utils"%>
<%@page import="oop.UserSession"%>
<%-- 
    Document   : profile
    Created on : Sep 2, 2021, 11:13:04 AM
    Author     : UNKNOWN_BRO
--%>

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
        
         <%UserSession usersession = Utils.handleusersession(request, response, session);
        if (usersession == null){
            response.sendRedirect("login.jsp");
        }
        %>
        <h1>Hello World!</h1>
    </body>
</html>
