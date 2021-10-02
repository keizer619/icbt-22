<%-- 
    Document   : index
    Created on : Sep 12, 2021, 11:46:16 AM
    Author     : tharik
--%>

<%@page import="org.icbt.myrestservice.student.Person"%>
<%@page import="org.icbt.myrestservice.student.DBUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           for(Person p : DBUtils.getPersons()) {
              out.print("<p>" + p.getName() + "</p>");
           }
        %>
    </body>
</html>
