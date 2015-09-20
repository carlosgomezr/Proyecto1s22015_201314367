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
    <font color="white">
        <br></br>
        <DIV ALIGN=right>
           <form name="pasarmenu" action="menu.jsp" method="POST">
                <input type="submit" value="Menu Admin" name="Menu Admin" />
           </form>
        </DIV>
        <br></br>
        <h1>Cargar CSV</h1>
        <br></br>
        <br></br>
        <form name="pasarcargar" action="cargar.jsp" method="POST">
        <br></br>
        <br></br>
        <center>
        <input type="text" name="Buscador" value="" size="20" />
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String path = request.getParameter("Buscador");
	// TODO process result here
	java.lang.String result = port.cargarCSV(path);
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
	 // TODO initialize WS operation arguments here
	java.lang.String parameter = "";
	// TODO process result here
	java.lang.String result = port.graphAsignacion(parameter);
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
	java.lang.String result = port.rutaPrimero();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>


        <input type="submit" value="CARGAR! xD" name="boton1" />   
        </center>
        </form>
    </font>
    </center>
    </body>
</html>
