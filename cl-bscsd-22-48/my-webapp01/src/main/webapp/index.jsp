<%-- 
    Document   : index
    Created on : Aug 27, 2021, 9:08:18 PM
    Author     : UNKNOWN_BRO
--%>

<%@page import="oop.UserSession"%>
<%@page import="java.util.UUID"%>
<%@page import="oop.Utils"%>
<%@page import="java.util.List"%>
<%@page import="oop.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body> <form action="handle-logout.jsp" method="post">
  <input type="submit" value="Logout">
  </form> 
  
        <%
        UserSession usersession = Utils.handleusersession(request, response, session);
        if (usersession == null){
            response.sendRedirect("login.jsp");
        }else{
        
        
        %>
        <h1>Welcome <%out.print(usersession.getUserName()); %>
        <%
        out.print(Utils.getPersonsHTML() ); 
        %>
        <%}%>
 

        
    </body>
</html>
