<%-- 
    Document   : logout.jsp
    Created on : Aug 29, 2021, 12:17:48 PM
    Author     : Chanaka
--%>

<%
    session.invalidate();
    response.sendRedirect("./login.jsp");
%>
