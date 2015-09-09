<%-- 
    Document   : chofer
    Created on : 1/09/2015, 06:25:22 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chofer</title>
    </head><%! String clave=""; String nombre=""; String apellido=""; String password="";%>
    <body background="BACK2.jpg">
        <center>
        <br></br>
        <br></br>
        <br></br>
        <h1>Chofer</h1>
        <br></br>
        <br></br>
        <font color="white">
        <h1>Agregar Chofer</h1>
        <form name="pasarchofer" action="chofer.jsp" method="POST">
        <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> CLAVE: </td>
                    <td><input type="text" name="texto1" value="" size="20" /></td>
                    <% clave = request.getParameter("texto1"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> NOMBRE: </td>
                    <td><input type="text" name="texto2" value="" size="20" /></td>
                    <% nombre = request.getParameter("texto2"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> APELLIDO: </td>
                    <td><input type="text" name="texto3" value="" size="20" readonly="readonly" /></td>
                    <% apellido = request.getParameter("texto3"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td><input type="password" name="texto4" value="" size="20" /></td>
                    <% password = request.getParameter("texto4"); %>
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
        <br> </br>
        <h1>Eliminar Chofer</h1>       
        <form name="pasarchofer2" action="chofer.jsp" method="POST">
            <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> CLAVE: </td>
                    <td><input type="text" name="texto5" value="" size="20" /></td>
                    <% clave = request.getParameter("texto5"); %>
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
        <br> </br>
        <h1>Editar Chofer</h1>  
        <form name="pasarchofer3" action="chofer.jsp" method="POST">
            <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> CLAVE: </td>
                    <td><input type="text" name="texto6" value="" size="20" /></td>
                    <% clave = request.getParameter("texto6"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> NOMBRE: </td>
                    <td><input type="text" name="texto7" value="" size="20" /></td>
                    <% nombre = request.getParameter("texto7"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> APELLIDO: </td>
                    <td><input type="text" name="texto8" value="" size="20" readonly="readonly" /></td>
                    <% apellido = request.getParameter("texto8"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td><input type="password" name="texto9" value="" size="20" /></td>
                    <% password = request.getParameter("texto9"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> NUEVA CLAVE: </td>
                    <td><input type="text" name="texto10" value="" size="20" /></td>
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
