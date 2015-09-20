<%-- 
    Document   : resumen
    Created on : 1/09/2015, 10:56:21 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resumen</title>
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
        <h1>Resumen</h1>
        <br></br>
        <br></br>
        <form name="pasarresumen" action="resumen.jsp" method="POST">
            ID Chofer: <input type="text" name="texto1" value="" size="20" />
            
            <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String idchofer = request.getParameter("texto1");
	// TODO process result here
	java.lang.String result = port.resumenChoferEspecifico(idchofer);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <img src="C:/Users/estua_000/Documents/NetBeansProjects/cliente/web/graphChoferEspecifico.txtgraph.png">
 
            
            <input type="submit" value="Horario Chofer Específico" name="boton1" />
        
        </form>
    <br></br>
    <br></br>
    <form name="pasarresumen" action="resumen.jsp" method="POST">
        <input type="text" name="texto2" value="" size="20" />
            <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String idbus = request.getParameter("texto2");
	// TODO process result here
	java.lang.String result = port.resumenBusEspecifico(idbus);
	out.println("Result = \n "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <img src="C:/Users/estua_000/Documents/NetBeansProjects/cliente/web/graphResumenBusEspecifico.txtgraphResumenBusEspecifico.png">
        <input type="submit" value="Bus Especifico" name="boton2" />
    </form>
    </center>
    </font>
    </body>
</html>
