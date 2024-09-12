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
        <%

            if (Utill.authenticate(request, response, session)) {
        %>
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
                    for (Person p : Utill.getPersons()) {
                %>
                <tr>
                    <td><%= p.getNic()%></td>
                    <td><%= p.getName()%></td>
                    <td><%= p.getDateOfBirth()%></td>
                    <td><%= p.getGender()%></td>
                    <td><%= p.getMobile()%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <br>
        <br>
        <br>
        <form action="logout.jsp" method="POST">
            <input type="submit" value="Logout" />
        </form>
        <%
            } else {
                response.sendRedirect("login.jsp");
            }
        %>
    </body>
</html>
