<%@page import="oop.Utils"%>
<%@page import="oop.UserSession"%>
<%
    UserSession userSession = Utils.handleUserSession(request, response, session);
    if (userSession != null) {
      //  session.removeAttribute(session.getId());
        session.invalidate();
    }
    response.sendRedirect("login.jsp");
%>
