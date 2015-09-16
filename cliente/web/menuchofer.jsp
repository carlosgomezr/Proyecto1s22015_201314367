<%-- 
    Document   : menuchofer
    Created on : 31/08/2015, 08:20:14 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Chofer</title>
    </head>
    <body background="BACK2.jpg">
        <br> </br>
        <DIV ALIGN=right>
           <form name="pasarindex" action="index.jsp" method="POST">
                <input type="submit" value="LOG OUT" name="logout" />
           </form>
       </DIV>
       <br> </br>
    <center>
        <%! int user=0; %>
        <h1>Menú Chofer</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	int result = port.darUser();
        user = result;
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <h2><%= user %></h2>
    </center>
    
    </body>
</html>
