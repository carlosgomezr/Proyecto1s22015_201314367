<%-- 
    Document   : index
    Created on : 30/08/2015, 01:17:29 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%!
            String page="index.jsp";
            String vusuario="";
            String vpassword="";
            String vtipo="";
        %>
    </head>
    <body background="LOGIN1.jpg">
        <% 
            vusuario = request.getParameter("usuario");
            vpassword = request.getParameter("password");
            vtipo = request.getParameter("tipo");
        %>
        <DIV ALIGN=right> 
            <br>
            </br>
            <form name="pasar" action="index.jsp" method="POST">
                 USER: 
                 <input type="text" name="usuario" value="" size="15" />  
                 PASSWORD:
                 <input type="password" name="password" value="" size="15" />
                 <select name="tipo">
                     <option>Administrador</option>
                     <option>Estacion Clave</option>
                     <option>Estacion General</option>
                     <option>Chofer</option>
                 </select>
                     <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String usuario = request.getParameter("usuario");
	java.lang.String password = request.getParameter("password");
	java.lang.String tipo = request.getParameter("tipo");
	// TODO process result here
	java.lang.String result = port.login(usuario, password, tipo);
	out.println("Result = "+result);
        page = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

                 <input type="submit" value="LOGIN" name="boton1" /> 

            </form>
                    </DIV>
        
    </body>
</html>
