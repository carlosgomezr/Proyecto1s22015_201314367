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
        <title>JSP Page</title>
        <%! 
            String vusuario="";
            String vpassword="";
            String vtipo="";
        %>
    </head>
    <body background="LOGIN1.jpg">
        <% 
            vusuario = request.getParameter("usuario");
            vpassword = request.getParameter("password");
            vtipo = request.getParameter("tipo");
        %>
        <DIV ALIGN=right> 
            <br>
            </br>
           
              USER: 
            <input type="text" name="usuario" value="" size="15" />  
              PASSWORD:
            <input type="password" name="password" value="" size="15" />
            <select name="tipo">
                <option>Administrador</option>
                <option>Estacion Clave</option>
                <option>Estacion General</option>
                <option>Chofer</option>
            </select>
            <input type="submit" value="LOGIN" name="boton1" /> 
        </DIV>
        
    </body>
</html>
