<%-- 
    Document   : index
    Created on : Aug 8, 2021, 9:25:18 AM
    Author     : tharik
--%>

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
    <body>
        <%
               String name = "John";
               String greeting = "Hello";
               out.print("<h1>" + greeting + " " + name + "</h1>");
               
               Utils utils = new Utils();
               List<Person> persons = utils.getPersons();
               

               for (Person p : persons) {
                   out.print("<p>" + p.getName() + "</p>");
               }

            
        %>
    </body>
</html>
