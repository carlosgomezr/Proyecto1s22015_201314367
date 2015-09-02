<%-- 
    Document   : menu
    Created on : 30/08/2015, 06:48:57 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Administrador</title>
    </head>
    <body background="BACK2.jpg">
       <br> </br>
        <br> </br>
        <br> </br>
    <center>
        <h1>Menú Administrador</h1>
        <br> </br>
        <form name="pasaradmin" action="admin.jsp" method="POST">
        <input type="submit" value="  Administrador  " name="boton1"/>
        </form>
        <br> </br>
        <form name="pasarestaciong" action="estaciong.jsp" method="POST">
        <input type="submit" value="Estacion General" name="boton2"/>    
        </form>
        <br> </br>
        <form name="pasarestacionc" action="estacionc.jsp" method="POST">
        <input type="submit" value="  Estacion Clave  " name="boton3"/>     
        </form>
        <br> </br>
        <form name="pasarchofer" action="chofer.jsp" method="POST">
        <input type="submit" value="        Chofer      " name="boton4"/>     
        </form>
        <br> </br>
        <form name="pasarasignarbus" action="asignarbus.jsp" method="POST">
        <input type="submit" value="    Asignar bus   " name="boton5"/>     
        </form>
        <br> </br>
        <form name="pasarbus" action="bus.jsp" method="POST">
        <input type="submit" value="          Bus         " name="boton6"/>
        </form>
        <br> </br>
        <form name="pasarruta" action="ruta.jsp" method="POST">
        <input type="submit" value="Ruta" name="boton7" />
        </form>
        <br> </br>
        <form name="pasarresumen" action="resumen.jsp" method="POST">
        <input type="submit" value="         Resumen       " name="boton8" />
        </form>
    </center>
    </body>
</html>
