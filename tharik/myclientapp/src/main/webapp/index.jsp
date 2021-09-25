<%-- 
    Document   : index
    Created on : Aug 29, 2021, 4:17:23 PM
    Author     : tharik
--%>

<%@page import="mu.Person"%>
<%@page import="mu.MyWebService"%>
<%@page import="mu.MyWebService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            MyWebService_Service service = new MyWebService_Service();
            MyWebService proxy = service.getMyWebServicePort();
            
            String greeting = proxy.hello("George");
            out.print(greeting);
            out.print("<br/>");
            int sum = proxy.add(2, 4);
            out.print(sum);
            
            out.print("<br/>");
            Person p = proxy.getPerson();
            out.print(p.getName());

        %>
    </body>
</html>
