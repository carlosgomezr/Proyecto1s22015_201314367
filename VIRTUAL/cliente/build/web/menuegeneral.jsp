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
    </head><%! int c=0; String auxc=""; String nombre=""; int tamaño=5; String bus="";%>
    <body background="BACK2.jpg">
        <br> </br>
        <DIV ALIGN=right>
           <form name="pasarindex" action="index.jsp" method="POST">
                <input type="submit" value="LOG OUT" name="logout" />
           </form>
       </DIV>
       <br> </br>
    <center>
         <font color="white">
         <h1>Menú Estacion General</h1>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	int result = port.darUser();
	out.println(""+result);
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
	int result = port.operation();
	out.println("Result = "+result);
        c = result;
       
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    

    
    <%
        for (int i=1; i<=c;i++){
        %>
        
                <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
        String aux = Integer.toString(i);
	java.lang.String posicion = aux;
        out.println("aux "+aux);
	// TODO process result here
	java.lang.String result = port.nombreEstacion(posicion);
	//out.println("Result = "+result);
        nombre = result;
        out.println(nombre);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        
        <h3>Estacion <%= nombre%></h3>
   <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
        out.println("nombre "+nombre);
        
	//java.lang.String estacion = nombre;
	// TODO process result here
	int result = port.tamañoEstacion(nombre);
        tamaño = result;
        out.println("tamñao: "+tamaño);
        out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
     
        <br> </br>
        Lista de buses
        <select name="list<%= nombre%>">
        
            
        <%  
        for(int j=1; j<=tamaño; j++){ %>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
        String aux = Integer.toString(j);
	java.lang.String estacion = nombre;
	java.lang.String posicion = aux;
	// TODO process result here
	java.lang.String result = port.nombreBus(estacion, posicion);
	out.println("Result = "+result);
        bus = result;
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>


            <option><%= bus %></option>
        <% } %>
        
        </select>
        <br>    </br>
        <input type="text" name="texto<%= nombre%>" value="" size="10" />
        <br>    </br>
        <form name="pasarmenuegeneral" action="menuegeneral.jsp" method="POST">
            <input type="button" value="NEXT >" name="boton<%= nombre%>" />
        </form>
        <br>    </br>
        <%
        }
        %>    
        </font>
    </center>
    </body>
</html>
