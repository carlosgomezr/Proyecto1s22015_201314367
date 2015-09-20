<%-- 
    Document   : reporte
    Created on : 2/09/2015, 10:55:07 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <META HTTP-EQUIV="Pragma" CONTENT="no-cache">
        <META HTTP-EQUIV="Expires" CONTENT="-1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REPORT</title>
    </head><%! String titulo=""; String bus=""; String chofer=""; %>
    <body background="BACK2.jpg" onLoad="if ('Navigator' == navigator.appName)document.forms[0].reset();">
        <center>
        <font color="white">
        <br></br>
        <DIV ALIGN=right>
           <form name="pasarmenu" action="menu.jsp" method="POST">
                <input type="submit" value="Menu Admin" name="Menu Admin" />
           </form>
        </DIV>
        <br></br>
        <h1>        REPORT!</h1>
        <br></br>
        <br></br>  
        <br></br>
        <form name="pasar1" action="reporte.jsp" method="POST">     
        
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphAdmin();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <img src="C:/Users/estua_000/Documents/NetBeansProjects/cliente/web/graphadmin.txtgraphadmin.png">

<SCRIPT language="JavaScript" type="text/javascript">
var t = 2; // Interval in Seconds
image = "graphBus.txtgraphBus.png"; //URL of the Image
function Start() {
tmp = new Date();
tmp = "?"+tmp.getTime();
document.images["refresh"].src = image+tmp;
setTimeout("Start()", t*1000);
}
Start();
</SCRIPT> 

        <input type="submit" value="        GRAFICAR ADMIN           " name="boton1" />
        
        </form>
        <br></br>
        <form name="pasar1" action="reporte.jsp" method="POST">   
        
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphEstacionClave();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <img src="C:/Users/estua_000/Documents/NetBeansProjects/cliente/web/graphEC.txtgraphEC.png">
        
        <input type="submit" value="     GRAFICAR ESTACION CLAVE     " name="boton2" />
       
        </form>
        <br></br>
        <form name="pasar1" action="reporte.jsp" method="POST">      
        
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
    <img src="C:/Users/estua_000/Documents/NetBeansProjects/cliente/web/graphEG.txtgraphEG.png">
        
        <input type="submit" value="    GRAFICAR ESTACION GENERAL    " name="boton3" />
     
        
        </form>
        <br></br>
        <form name="pasar1" action="reporte.jsp" method="POST">      
        CHOFER: <input type="text" name="texto0" value="" size="10" />
       <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String id = request.getParameter("texto0");
	// TODO process result here
	java.lang.String result = port.grahpBusxChofer(id);
	out.println("Result = "+id);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <img src="C:/Users/estua_000/Documents/NetBeansProjects/cliente/web/graphChoferxBus.txtgraphChoferxBus.png">        
        
        <input type="submit" value="     GRAFICAR BUS POR CHOFER     " name="boton4" />
        
        </form>
        <br></br>
        <form name="pasar1" action="reporte.jsp" method="POST">      
        BUS: <input type="text" name="texto1" value="" size="10" />
        CHOFER: <input type="text" name="texto2" value="" size="10" />
      
    <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String idbus = request.getParameter("texto1");
	java.lang.String idchofer = request.getParameter("texto2");
	// TODO process result here
	java.lang.String result = port.graphHorarioxBusxChofer(idbus, idchofer);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <img src="C:/Users/estua_000/Documents/NetBeansProjects/cliente/web/graphHoraxChofer.txtgraphHoraxChofer.png">        
        
        <input type="submit" value="GRAFICAR HORARIO POR CHOFER Y BUS" name="bton5"/>
        
        </form>
        <br></br>
        <form name="pasarreporte" action="reporte.jsp" method="POST">
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphChofer();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <img src="C:/Users/estua_000/Documents/NetBeansProjects/cliente/web/graphChofer.txtgraphChofer.png">
  
    

        <input type="submit" value="GRAFICAR AVL CHOFER" name="bton6" onclic="reloadIt();"/>
      
        </form>
        <br></br>
     
     
        <br></br>
        </font>
        </center>
    </body>
</html>
