<%-- 
    Document   : asignarbus
    Created on : 1/09/2015, 10:51:29 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignar Bus</title>
    </head><%! String idbus="";String ruta=""; String clavechofer="";String horarioini="";String horariofin="";String fecha="";%>
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
        <h1>Asignar Bus</h1>
        <br></br>
        <br></br>
        <h1>Agregar Asignacion de Bus</h1>
        <form name="pasarasignarbus" action="asignarbus.jsp" method="POST">
        <table border="0">
            <tbody>
                <tr>
                    <td> ID BUS: </td>
                    <td><input type="text" name="texto1" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> RUTA: </td>
                    <td><input type="text" name="texto2" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> CLAVE CHOFER:</td>
                    <td><input type="text" name="texto3" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> HORARIO INICIO: </td>
                    <td><input type="text" name="texto4" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> HORARIO FIN: </td>
                    <td><input type="text" name="texto5" value="" size="20" /></td>
                    <td></td>
                </tr>
                <tr>
                    <td> FECHA: </td>
                    <td><input type="text" name="texto6" value="" size="20" /></td>
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
	java.lang.String ruta = request.getParameter("texto2");
	java.lang.String claveChofer = request.getParameter("texto3");
	java.lang.String horaini = request.getParameter("texto4");
	java.lang.String horafin = request.getParameter("texto5");
	java.lang.String fecha = request.getParameter("texto6");
	// TODO process result here
	java.lang.String result = port.insertarAsignacion(id, ruta, claveChofer, horaini, horafin, fecha);
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

                    
                    <td><input type="submit" value="ADD" name="boton1" /></td>
                </tr>
            </tbody>
        </table>
        </form>
        <br></br>
        <h1>Eliminar Asignacion de Bus</h1>
        <form name="pasarasignarbus2" action="asignarbus.jsp" method="POST">
         <table border="0">
            <tbody>
                <tr>
                    <td> ID BUS: </td>
                    <td><input type="text" name="texto7" value="" size="20" /></td>
                    <% idbus = request.getParameter("texto7"); %>
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
        <br></br>
        <h1>Editar Asignacion de Bus</h1>       
        <form name="pasarasignarbus3" action="asignarbus.jsp" method="POST">
        <table border="0">
            <tbody>
                <tr>
                    <td> ID BUS: </td>
                    <td><input type="text" name="texto8" value="" size="20" /></td>
                    <% idbus = request.getParameter("texto8"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> RUTA: </td>
                    <td><input type="text" name="texto9" value="" size="20" /></td>
                    <% ruta = request.getParameter("texto9"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> CLAVE CHOFER:</td>
                    <td><input type="text" name="texto10" value="" size="20" /></td>
                     <% clavechofer = request.getParameter("texto10"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> HORARIO INICIO: </td>
                    <td><input type="text" name="texto11" value="" size="20" /></td>
                    <% horarioini = request.getParameter("texto11"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> HORARIO FIN: </td>
                    <td><input type="text" name="texto12" value="" size="20" /></td>
                    <% horariofin = request.getParameter("texto12"); %>
                    <td></td>
                </tr>
                <tr>
                    <td> FECHA: </td>
                    <td><input type="text" name="texto13" value="" size="20" /></td>
                    <% fecha = request.getParameter("texto13");%>
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
