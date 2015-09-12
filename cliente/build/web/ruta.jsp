<%-- 
    Document   : ruta
    Created on : 1/09/2015, 06:26:00 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ruta</title>
    </head><%! String nombre=""; String ruta="";%>
    <body background="BACK2.jpg">
        <center>
        <br></br>
        <DIV ALIGN=right>
           <form name="pasarmenu" action="menu.jsp" method="POST">
                <input type="submit" value="Menu Admin" name="Menu Admin" />
           </form>
        </DIV>
        <br></br>
        <h1>Ruta</h1>
        <br></br>
        <br></br>
        <font color="white">
        <h1>Agregar Ruta</h1>
        <form name="pasarruta" action="ruta.jsp" method="POST">
        <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> NOMBRE: </td>
                    <td><input type="text" name="texto1" value="" size="20" /></td>
                    <% nombre = request.getParameter("texto1"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> ESTACION: </td>
                    <td><input type="text" name="texto2" value="" size="20" /></td>
                    <% ruta = request.getParameter("texto2"); %>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = request.getParameter("texto1");
	java.lang.String estacion = request.getParameter("texto2");
	// TODO process result here
	java.lang.String result = port.insertarRuta(nombre, estacion);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                
                    
                    <td> <input type="submit" value="ADD" name="boton1" /> </td>
                </tr>
            </tbody>
        </table>
        </form>
      
        <br></br>
        <h1>Eliminar Ruta</h1>
        <form name="pasarruta2" action="ruta.jsp" method="POST">
            <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> NOMBRE: </td>
                    <td><input type="text" name="texto3" value="" size="20" /></td>
                    <% nombre = request.getParameter("texto3"); %>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = request.getParameter("texto3");
	// TODO process result here
	java.lang.String result = port.eliminarRuta(nombre);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                
                    <td> <input type="submit" value="REMOVE" name="boton2" /> </td>
                </tr>
            </tbody>
        </table>
        </form>
        <br></br>
        <h1>Editar Ruta</h1>   
        <form name="pasarruta3" action="ruta.jsp" method="POST">
        <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> NOMBRE: </td>
                    <td><input type="text" name="texto4" value="" size="20" /></td>
                    <% nombre = request.getParameter("texto4"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> ESTACION: </td>
                    <td><input type="text" name="texto5" value="" size="20" /></td>
                    <% ruta = request.getParameter("texto5"); %>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    
                    
                    <td> <input type="submit" value="EDIT" name="boton3" /> </td>
                </tr>
            </tbody>
        </table>  
        </form>
    </font>
    </center>
    </body>
</html>
