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
    </head>
    <body background="BACK2.jpg">
        <center>
        <br></br>
        <DIV ALIGN=right>
           <form name="pasarmenu" action="menu.jsp" method="POST">
                <input type="submit" value="Menu Admin" name="Menu Admin" />
           </form>
        </DIV>
        <br></br>
        <font color="white">
        <h1>Bus</h1>
        <br></br>
        <br></br>
        
        <h1>Agregar Bus</h1>
        <form name="pasarbus" action="bus.jsp" method="POST">
        <table border="0" style="text-align:center;">      
            <tbody>
                <tr>
                    <td> ID: </td>
                    <td><input type="text" name="texto1" value="" size="20" /></td>
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
	// TODO process result here
	java.lang.String result = port.insertarBus(id);
	out.println(" Este es el id: "+id+" res"+result);
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
	java.lang.String result = port.graphBus();
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
            
        <h1>Eliminar Bus</h1>
        <form name="pasarbus2" action="bus.jsp" method="POST">
        <table border="0" style="text-align:center;">      
             <tbody>
                <tr>
                    <td> ID: </td>
                    <td> <input type="text" name="texto2" value="" size="20" /></td>
                    
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
	java.lang.String id = request.getParameter("texto2");
	// TODO process result here
	java.lang.String result = port.eliminarBus(id);
	out.println("Result = "+result+" Este es el id: "+id);
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
	java.lang.String result = port.graphBus();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    
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
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String id = request.getParameter("texto3");
	java.lang.String nuevoid = request.getParameter("texto4");
	// TODO process result here
	java.lang.String result = port.modificarBus(id, nuevoid);
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
	java.lang.String result = port.graphBus();
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
