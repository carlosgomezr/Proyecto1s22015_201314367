<%-- 
    Document   : estaciong
    Created on : 1/09/2015, 06:25:33 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estación General</title>
    </head>
    <body background="BACK2.jpg">
       <font color="white">
        <center>
        <br></br>
        <DIV ALIGN=right>
           <form name="pasarmenu" action="menu.jsp" method="POST">
                <input type="submit" value="Menu Admin" name="Menu Admin" />
           </form>
        </DIV>
        <br></br>
        <h1>Estacion General</h1>
        <br></br>
        <br></br>
       
        <h1>Agregar Estacion General</h1>
        <form name="pasarestaciong" action="estaciong.jsp" method="POST">
       
        <table border="0" style="text-align:center;">
           
            <tbody>
                <tr>
                    <td> ID: </td>
                    <td><input type="text" name="texto1" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> NOMBRE: </td>
                    <td><input type="text" name="texto2" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td><input type="password" name="texto3" value="" size="20" /></td>
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
	java.lang.String id = request.getParameter("texto1");
	java.lang.String nombre = request.getParameter("texto2");
	java.lang.String password = request.getParameter("texto3");
	// TODO process result here
	java.lang.String result = port.insertarEstacionGeneral(id, nombre, password);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphEstacionGeneral();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

                    
                    <td><input type="submit" value="ADD" name="boton1" /></td>
                </tr>
            </tbody>
        </table>
        </form>
        <br></br>
        <h1>Eliminar Estacion General</h1>
        <form name="pasarestaciong2" action="estaciong.jsp" method="POST">
            <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> ID: </td>
                    <td><input type="text" name="texto4" value="" size="20" /></td>
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
	java.lang.String id = request.getParameter("texto4");
	// TODO process result here
	java.lang.String result = port.eliminarEstacionGeneral(id);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                   
     <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphEstacionGeneral();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                   
                    <td><input type="submit" value="REMOVE" name="boton2" /></td>
                </tr>
            </tbody>
        </table>
        </form>
        <br></br>
        <h1>Editar Estacion General</h1>  
        <form name="pasarestaciong3" action="estaciong.jsp" method="POST">
            <table border="0" style="text-align:center;">
           
            <tbody>
                <tr>
                    <td> ID: </td>
                    <td><input type="text" name="texto5" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> NOMBRE: </td>
                    <td><input type="text" name="texto6" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td><input type="password" name="texto7" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> NUEVO ID: </td>
                    <td><input type="text" name="texto8" value="" size="20" /></td>
                   
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
	java.lang.String id = request.getParameter("texto5");
	java.lang.String nombre = request.getParameter("texto6");
	java.lang.String password = request.getParameter("texto7");
	java.lang.String nuevaclave = request.getParameter("texto8");
	// TODO process result here
	java.lang.String result = port.modificarEstacionGeneral(id, nombre, password, nuevaclave);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                    
      <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphEstacionGeneral();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
                  
                    <td><input type="submit" value="EDIT" name="boton3" /></td>
                </tr>
            </tbody>
        </table>
        </form>
        </font>
    </center>
    </body>
</html>
