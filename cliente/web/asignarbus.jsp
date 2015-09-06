<%-- 
    Document   : asignarbus
    Created on : 1/09/2015, 10:51:29 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignar Bus</title>
    </head><%! String idbus="";String ruta=""; String clavechofer="";String horarioini="";String horariofin="";String fecha="";%>
    <body background="BACK2.jpg">
    <center>
        <br></br>
        <br></br>
        <br></br>
        <h1>Asignar Bus</h1>
        <br></br>
        <br></br>
        <font color="white">
        <h1>Agregar Asignacion de Bus</h1>
        <form name="pasarasignarbus" action="asignarbus.jsp" method="POST">
        <table border="0">
            <tbody>
                <tr>
                    <td> ID BUS: </td>
                    <td><input type="text" name="texto1" value="" size="20" /></td>
                    <% idbus = request.getParameter("texto1"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> RUTA: </td>
                    <td><input type="text" name="texto2" value="" size="20" /></td>
                    <% ruta = request.getParameter("texto2"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> CLAVE CHOFER:</td>
                    <td><input type="text" name="texto3" value="" size="20" /></td>
                    <% clavechofer = request.getParameter("texto3"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> HORARIO INICIO: </td>
                    <td><input type="text" name="texto4" value="" size="20" /></td>
                    <% horarioini = request.getParameter("texto4"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> HORARIO FIN: </td>
                    <td><input type="text" name="texto5" value="" size="20" /></td>
                    <% horariofin = request.getParameter("texto5"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> FECHA: </td>
                    <td><input type="text" name="texto6" value="" size="20" /></td>
                    <% fecha = request.getParameter("texto6"); %>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="ADD" name="boton1" /></td>
                </tr>
            </tbody>
        </table>
        </form>
        <br></br>
        <h1>Eliminar Asignacion de Bus</h1>
        <form name="pasarasignarbus2" action="asignarbus.jsp" method="POST">
         <table border="0">
            <tbody>
                <tr>
                    <td> ID BUS: </td>
                    <td><input type="text" name="texto7" value="" size="20" /></td>
                    <% idbus = request.getParameter("texto7"); %>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="REMOVE" name="boton2" /></td>
                </tr>
            </tbody>
        </table>
        </form>
        <br></br>
        <h1>Editar Asignacion de Bus</h1>       
        <form name="pasarasignarbus3" action="asignarbus.jsp" method="POST">
        <table border="0">
            <tbody>
                <tr>
                    <td> ID BUS: </td>
                    <td><input type="text" name="texto8" value="" size="20" /></td>
                    <% idbus = request.getParameter("texto8"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> RUTA: </td>
                    <td><input type="text" name="texto9" value="" size="20" /></td>
                    <% ruta = request.getParameter("texto9"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> CLAVE CHOFER:</td>
                    <td><input type="text" name="texto10" value="" size="20" /></td>
                     <% clavechofer = request.getParameter("texto10"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> HORARIO INICIO: </td>
                    <td><input type="text" name="texto11" value="" size="20" /></td>
                    <% horarioini = request.getParameter("texto11"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> HORARIO FIN: </td>
                    <td><input type="text" name="texto12" value="" size="20" /></td>
                    <% horariofin = request.getParameter("texto12"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> FECHA: </td>
                    <td><input type="text" name="texto13" value="" size="20" /></td>
                    <% fecha = request.getParameter("texto13");%>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="EDIT" name="boton3" /></td>
                </tr>
            </tbody>
        </table>    
        </form>
        </font>
    </center>
    </body>
</html>
