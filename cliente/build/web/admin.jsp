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
    </head><%! String correo1=""; String password1="";%>
    <body  background="BACK2.jpg">
    <center>
        <br></br>
        <DIV ALIGN=right>
           <form name="pasarmenu" action="menu.jsp" method="POST">
                <input type="submit" value="Menu Admin" name="Menu Admin" />
           </form>
        </DIV>
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
                   
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td>  <input type="password" name="texto2" value="" size="20" /> </td>
                   
                    <td></td>
                </tr>
                <tr>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String correo = request.getParameter("texto1");
	java.lang.String password = request.getParameter("texto2");
	// TODO process result here
	java.lang.String result = port.insertarAdmin(correo, password);
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
	java.lang.String result = port.graphAdmin();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    
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
                    <td></td>
                </tr>
                <tr>
                    <td> </td>
                    <td> </td>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String correo = request.getParameter("texto3");
        out.println("texto3");
	// TODO process result here
	java.lang.String result = port.eliminarAdmin(correo);
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
	java.lang.String result = port.graphAdmin();
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
        <td> </td>
        <h1>Editar Administrador</h1>
        <form name="pasaradmin3" action="admin.jsp" method="POST">
            <table border="0" style="text-align:center;">
            <tbody>
                <tr>
                    <td> CORREO: </td>
                    <td> <input type="text" name="texto4" value="" size="20" /> </td>
                    <td></td>
                </tr>
                <tr>
                    <td> PASSWORD: </td>
                    <td>  <input type="password" name="texto5" value="" size="20" /> </td>
                    <td></td>
                </tr>
                 <tr>
                    <td> NUEVO CORREO: </td>
                    <td>  <input type="text" name="texto6" value="" size="20" /> </td>
                    <td></td>
                </tr>
                <tr>
                    <td> </td>
                    <td> </td>
                   <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String correo = request.getParameter("texto4");
	java.lang.String password = request.getParameter("texto5");
	java.lang.String nuevocorreo = request.getParameter("texto6");
	// TODO process result here
	java.lang.String result = port.modificarAdmin(correo, password, nuevocorreo);
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
	java.lang.String result = port.graphAdmin();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

                    <td> <input type="submit" value="EDIT" name="boton3" /> </td>
                </tr>
            </tbody>
        </table>     
        </form>        
                             
        </font>
    </center>     
    </body>
</html>
