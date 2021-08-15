<%-- 
    Document   : index
    Created on : Aug 8, 2021, 9:25:18 AM
    Author     : tharik
--%>

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
        <style>
            .custom-tble {
              border-collapse: collapse;
              width: 100%;
            }

            .custom-tble-content {
              border:1px solid;
              text-align: left;
              padding: 8px;
            }

            .custom-tble-content:nth-child(even) {background-color: #f2f2f2;}
        </style>
        
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.25/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.js"></script>

    </head>
    <body>
        
        <%
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          
          if (!Utils.authenticate(username, password)) {
              String name = null;
              for (Cookie cookie : request.getCookies()) {
                  if (cookie.getName().equals("sesid")) {
                      name = session.getAttribute(cookie.getValue()).toString();
                  }
              }
              
              if (name == null) {
                  response.sendRedirect("login.jsp");
              } else {
                  username = name;
              }
              
              
          } else {
             String sesid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
             session.setAttribute(sesid, username);
             
             Cookie cookie = new Cookie("sesid", sesid);
             response.addCookie(cookie);   
          }
        %>
        
        <h1>Welcome <% out.print(username);%>  
        <h1>Approach 01</h1>
        <%               
               out.print(Utils.getPersonsHTML());  
        %>
        
        <h1>Approach 02</h1>
        <table id='tblPersons'>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>NIC</th>
                    <th>Gender</th>
                    <th>Mobile No</th>
                    <th>Date of Birth</th>
                </tr>
            <thead>
            <tbody>
                <%
                    for (Person p : Utils.getPersons()) {
                %>
                <tr>
                    <td><%out.print(p.getName()); %></td>
                    <td><%out.print(p.getNic()); %></td>
                    <td><%out.print(p.getGender()); %></td>
                    <td><%out.print(p.getMobileNo()) ;%></td>
                    <td><%out.print(p.getDob()) ;%></td>
            </tr>
                
                
                <% } %>
            </tbody>
            <script>
                $(document).ready( function () {
                    $('#tblPersons').DataTable();
                } );
            </script>
        
    </body>
</html>
