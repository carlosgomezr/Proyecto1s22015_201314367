<%-- 
    Document   : bus
    Created on : 1/09/2015, 06:25:52 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bus</title>
    </head><%! String id=""; %>
    <body background="BACK2.jpg">
        <center>
        <br></br>
        <br></br>
        <br></br>
        <h1>Bus</h1>
        <br></br>
        <br></br>
        <font color="white">
        <h1>Agregar Bus</h1>
        <form name="pasarbus" action="bus.jsp" method="POST">
        <table border="0" style="text-align:center;">      
            <tbody>
                <tr>
                    <td> ID: </td>
                    <td><input type="text" name="texto1" value="" size="20" /></td>
                    <% id = request.getParameter("texto1"); %>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td> <input type="submit" value="ADD" name="boton1" /> </td>
                </tr>
            </tbody>
        </table>
        </form>  
            
        <h1>Eliminar Bus</h1>
        <form name="pasarbus2" action="bus.jsp" method="POST">
        <table border="0" style="text-align:center;">      
             <tbody>
                <tr>
                    <td> ID: </td>
                    <td> <input type="text" name="texto2" value="" size="20" /></td>
                    <% id = request.getParameter("texto2"); %>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td> <input type="submit" value="REMOVE" name="boton2" /></td>
                </tr>
            </tbody>
        </table>
        </form>
                     <br></br>
        <h1>Editar Bus</h1>
        <form name="pasarbus3" action="bus.jsp" method="POST">
        <table border="0" style="text-align:center;">      
              <tbody>
                <tr>
                    <td> ID: </td>
                    <td> <input type="text" name="texto3" value="" size="20" /></td>
                    <% id = request.getParameter("texto3"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> NUEVO ID: </td>
                    <td> <input type="text" name="texto4" value="" size="20" /></td>
                    
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
