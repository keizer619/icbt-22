<%-- 
    Document   : login
    Created on : Aug 15, 2021, 4:59:23 PM
    Author     : Chanaka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp" method="POST">
            <label>Username :</label>
            <input type="text" name="username"><br/>
            <label>Password :</label>
            <input type="password" name="password"><br/>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
