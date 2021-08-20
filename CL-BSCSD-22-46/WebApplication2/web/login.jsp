<%-- 
    Document   : login
    Created on : Aug 20, 2021, 10:09:51 PM
    Author     : 94711
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp" method="post">
          <label for="username">Username:</label><br>
          <input type="text" id="username" name="username" value=""><br>
          <label for="lname">Password:</label><br>
          <input type="password" id="password" name="password" value=""><br><br>
          <input type="submit" value="Login">
        </form> 
    </body>
</html>
