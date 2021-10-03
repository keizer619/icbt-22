<%@page import="oop.Utils"%>
<%@page import="oop.UserSession"%>
<%
     UserSession usersession = Utils.handleusersession(request, response, session);
        if (usersession != null){
           //session.removeAttribute(session.getId());
           session.invalidate();
        }
        response.sendRedirect("login.jsp");
        
        
%>
