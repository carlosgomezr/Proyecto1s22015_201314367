<%-- 
    Document   : index
    Created on : 30/08/2015, 01:17:29 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
       
    </head>
    <body background="LOGIN1.jpg">
        <DIV ALIGN=right> 
            <br>
            </br>
            <form name="pasar" action="verificar.jsp" method="POST">
                 USER: 
                 <input type="text" name="user" value="" size="15" />  
                 PASSWORD:
                 <input type="password" name="password" value="" size="15" />
                 <select name="tipo">
                     <font color="white">
                     <option>------------</option>
                     <option>Administrador</option>
                     <option>EstacionClave</option>
                     <option>EstacionGeneral</option>
                     <option>Chofer</option>
                 </select>
                      
   
                 <input type="submit" value="LOGIN" name="boton1" /> 
            </form>
        </DIV>
        <% String user;
           String password;
           String tipo;
            user = request.getParameter("user");
            password = request.getParameter("password");
            tipo = request.getParameter("tipo");
        %>
    </body>
</html>
