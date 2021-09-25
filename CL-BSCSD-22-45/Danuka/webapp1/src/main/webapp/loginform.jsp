<%-- 
    Document   : loginform
    Created on : Aug 18, 2021, 11:32:36 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
         
        button {   
        background-color: #4CAF50;   
        width: 30%;  
        color: black;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
        margin-left: 70px;
         }   
         
        form {   
            border: 3px solid #f1f1f1;   
            } 
            
        input[type=text], input[type=password] {   
        width: 30%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px solid green;   
        box-sizing: border-box;   
        }
    
        .text1{
        margin-left: 85px;
        
        </style>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="LoginCheck.jsp" method="post">
         <form>  
        <div class="container">   
            <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="username" required><br>  
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" required><br>  
            <button type="submit">Login</button><br>  
            <button type="button" class="cancelbtn"> Cancel</button><br>
            
                <input class="text1" type="checkbox" checked="checked"> Remember me
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                Forgot <a href="#"> password? </a>
            
              
        </div>   
    </form>
        
    </body>
</html>
