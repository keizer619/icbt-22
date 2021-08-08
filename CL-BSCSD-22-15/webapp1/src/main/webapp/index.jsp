<%-- 
    Document   : index
    Created on : Aug 8, 2021, 9:37:14 AM
    Author     : Bilaal
--%>
<%@page import="oop.Person"%>
<%@page import="oop.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> Persons </h2>
        <table border="2">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>NIC</th>
                    <th>Phone</th>
                    <th>Date Of Birth</th>
                    <th>Gender</th>
                </tr>
            </thead>
                <%
                    Util util = new Util();
                    for (Person p : util.getPersons()) {
                %>
                    <tr>
                        <td><%= p.getName()%></td>
                        <td><%= p.getNic()%></td>
                        <td><%= p.getPhone()%></td>
                        <td><%= p.getDOB()%></td>
                        <td><%= p.getGender()%></td>
                    </tr>
                <% } %>         
        </table>
    </body>
</html>