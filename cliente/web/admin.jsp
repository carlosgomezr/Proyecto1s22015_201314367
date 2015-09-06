<%-- 
    Document   : admin
    Created on : 1/09/2015, 06:25:09 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrador</title>
    </head><%! String correo=""; String password="";%>
    <body  background="BACK2.jpg">
    <center>
        <br></br>
        <br></br>
        <br></br>
        <h1>Administrador</h1>
        <br></br>
        <br></br>
        <font color="white">
        <h1>Agregar Aministrador</h1>
        <form name="pasaradmin" action="admin.jsp" method="POST">
        <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> CORREO: </td>
                    <td> <input type="text" name="texto1" value="" size="20" /> </td>
                    <% correo = request.getParameter("texto1"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td>  <input type="password" name="texto2" value="" size="20" /> </td>
                    <% password = request.getParameter("texto2"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> </td>
                    <td> </td>
                    <td> <input type="submit" value="ADD" name="boton1" /> </td>
                </tr>
            </tbody>
        </table>
        </form>
        <td> </td>      
        <h1>Eliminar Administrador</h1>           
        <form name="pasaradmin2" action="admin.jsp" method="POST">
            <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> CORREO: </td>
                    <td> <input type="text" name="texto3" value="" size="20" /> </td>
                    <% correo = request.getParameter("texto3"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> </td>
                    <td> </td>
                    <td> <input type="submit" value="REMOVE" name="boton2" /> </td>
                </tr>
            </tbody>
        </table>
        </form> 
        <td> </td>
        <h1>Editar Administrador</h1>
        <form name="pasaradmin3" action="admin.jsp" method="POST">
            <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> CORREO: </td>
                    <td> <input type="text" name="texto4" value="" size="20" /> </td>
                    <% correo = request.getParameter("texto4"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td>  <input type="password" name="texto5" value="" size="20" /> </td>
                    <% password = request.getParameter("texto5"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> </td>
                    <td> </td>
                    <td> <input type="submit" value="EDIT" name="boton3" /> </td>
                </tr>
            </tbody>
        </table>     
        </form>        
                             
        </font>
    </center>     
    </body>
</html>
