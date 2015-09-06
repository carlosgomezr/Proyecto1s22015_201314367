<%-- 
    Document   : cargar
    Created on : 1/09/2015, 10:15:50 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cargar CSV</title>
    </head><%! String ruta=""; %>
    <body background="BACK2.jpg">
    <center>
        <br></br>
        <br></br>
        <br></br>
        <h1>Cargar CSV</h1>
        <br></br>
        <br></br>
        <form name="pasarcargar" action="cargar.jsp" method="POST">
        
        <input type="file" name="buscador" value="" width="45" />
        <br></br>
        <br></br>
        <input type="submit" value="CARGAR! xD" name="boton1" />
        <% ruta = request.getParameter("buscador"); %>
        <% out.println("ruta: "+ruta +" xD"); %>
        </form>
    </center>
    </body>
</html>
