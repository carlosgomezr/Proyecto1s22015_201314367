<%-- 
    Document   : verificar
    Created on : 9/09/2015, 11:33:50 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="BACK2.jpg">
        <%! String user;
            String password;
            String tipo;
        %>
        <%
            user = request.getParameter("user");
            password = request.getParameter("password");
            tipo = request.getParameter("tipo");
        %>
    <center>    
        <font color="white"> 
        <br></br>
        <br></br>
        <br></br>
    
         <h1> ERROR LOGIN </h1> 
         Por favor verifique datos
         <h2> <%= user %> </h2>
         <h2> <%= password %> </h2>
         <h2> <%= tipo %> </h2>
         </font>
    </center>
     <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String usuario = request.getParameter("user");
	java.lang.String password = request.getParameter("password");
	java.lang.String tipo = request.getParameter("tipo");
	// TODO process result here
	java.lang.String result = port.login(usuario, password, tipo);
	out.println("Result = "+result);
        response.sendRedirect("http://localhost:8080/cliente/"+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

         
    </body>
</html>
