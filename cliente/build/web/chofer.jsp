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
    </head><%! int clave=0; String nombre=""; String apellido=""; String password="";%>
    <body background="BACK2.jpg">
        <center>
        <br></br>
        <br></br>
        <br></br>
        <h1>Chofer</h1>
        <br></br>
        <br></br>
        <font color="white">
        <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> CLAVE: </td>
                    <td><input type="text" name="texto1" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> NOMBRE: </td>
                    <td><input type="text" name="texto2" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> APELLIDO: </td>
                    <td><input type="text" name="texto3" value="" size="20" readonly="readonly" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td><input type="password" name="texto4" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td><input type="submit" value="ADD" name="boton1" /></td>
                    <td><input type="submit" value="REMOVE" name="boton2" /></td>
                    <td><input type="submit" value="EDIT" name="boton3" /></td>
                </tr>
            </tbody>
        </table>

        </font>
    </center>
       
    </body>
</html>
