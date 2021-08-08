<%-- 
    Document   : index
    Created on : Aug 8, 2021, 9:26:02 AM
    Author     : Chanaka
--%>

<%@page import="oop.Person"%>
<%@page import="oop.Utill"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>NIC</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>Date Of Birth</th>
                    <th>Mobile</th>
                </tr>
            </thead>
            <tbody>
                <%
                    Utill utill = new Utill();
                    for (Person p : utill.getPersons()) {
                %>
                <tr>
                    <td><%= p.getNic()%></td>
                    <td><%= p.getName() %></td>
                    <td><%= p.getDateOfBirth()%></td>
                    <td><%= p.getGender()%></td>
                    <td><%= p.getMobile()%></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </body>
</html>
