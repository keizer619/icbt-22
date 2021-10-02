<%-- 
    Document   : index
    Created on : Aug 8, 2021, 10:11:54 AM
    Author     : ASUS
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
            
            
            Utils utils = new Utils();
            List<Person> persons = utils.getPersons();
               
        %>
        <table border='1'>
            <thead>
                <tr>
                  <th>NIC</th>
                  <th>Name</th>
                  <th>Gender</th>
                  <th>Mobile No</th>
                  <th>Date Of Birth</th>
                </tr>
            </thead>
            <tbody>
             <%
              for (Person p : persons) {  %>
                <tr>
                  <td><% out.print(p.getNic());%></td>
                  <td><% out.print(p.getName());%></td>
                  <td><% out.print(p.getGender());%></td>
                  <td><% out.print(p.getMobileNo());%></td>
                  <td><% out.print(p.getDob());%></td>
                </tr>
               <% }%>
            </tbody>
            
       
          </table>
             
    </body>
</html>
