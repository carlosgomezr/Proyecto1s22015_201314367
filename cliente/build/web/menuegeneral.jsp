<%-- 
    Document   : menuegeneral
    Created on : 31/08/2015, 08:21:10 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Estacion General</title>
    </head><%! int c=0; %>
    <body background="BACK2.jpg">
        <br> </br>
        <DIV ALIGN=right>
           <form name="pasarindex" action="index.jsp" method="POST">
                <input type="submit" value="LOG OUT" name="logout" />
           </form>
       </DIV>
       <br> </br>
    <center>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	int result = port.operation();
	out.println("Result = "+result);
        c = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
    <%
        for (int i=0; i<=c;i++){
        %>     
        <input type="text" name="texto<%=i%>" value="" size="10" />
        <br>    </br>
        <%
        }
        %>    
    </center>
    </body>
</html>
