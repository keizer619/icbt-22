<%-- 
    Document   : index
    Created on : Aug 7, 2021, 9:09:56 PM
    Author     : Amila
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="oop.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello world</title>
        <style>
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
                text-align: left;    
            }
        </style>
    </head>
    <body>
        <h1>Hi My new web App</h1>
        <%

            List<Person> persons = new ArrayList<Person>();
            for (int i = 0; i < 10; i++) {
                Person person = new Person();
                person.setName("Amila" + i);
                person.setAddress("Malambe" + i);
                person.setNic("9" + i + "2510642V");
                person.setAge(27);
                persons.add(person);
            }
//            for (Person person : persons) {
//
//                out.println("Hi " + person.getName() + ". Your Address is " + person.getAddress() + "<br>");
//
//            }
        %>

        <table style="width:100%">
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Address</th>
                <th>NIC</th>
            </tr>
            <% for (Person person : persons) { %>
            <tr>
                <td><% out.print(person.getName()); %></td>
                <td><% out.print(person.getAge()); %></td>
                <td><% out.print(person.getAddress()); %></td>
                <td><% out.print(person.getNic()); %></td>
            </tr>
            <% } %>
        </table> 

        <%

        %>
    </body>
</html>
