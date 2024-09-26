<%-- 
    Document   : LoginCheck
    Created on : Aug 22, 2021, 12:01:15 PM
    Author     : User
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
          String username=request.getParameter("username");
          String password=request.getParameter("password");
          
          if((username.equals("admin") && password.equals("admin")))
          {
              session.setAttribute("username",username);
              response.sendRedirect("new1.jsp");
          }
          else
          {
              request.setAttribute("errorMessage", "Invalid user or password");
          }
        %>
    </body>
</html>
