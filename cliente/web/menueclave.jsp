<%-- 
    Document   : menueclave
    Created on : 31/08/2015, 08:17:52 PM
    Author     : Carlos Gomez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Estacion Clave</title><%! int user=0; String nombre=""; int tamaño=0; String bus="";%>
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
        <font color="white">
        <h1>Menú Estacion Clave</h1>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	int result = port.darUser();
        user = result; 
        nombre = Integer.toString(user);
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
        out.println("nombre "+nombre);
	 // TODO initialize WS operation arguments here
	java.lang.String estacion = "";
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
            <% int auxtamaño=tamaño; 
                for(int j=1;j<=auxtamaño;j++){
            %>
            
                <%-- start web service invocation --%><hr/>
    <%
    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
        String auxj = Integer.toString(j);
	java.lang.String estacion = nombre;
	java.lang.String posicion = auxj;
	// TODO process result here
	java.lang.String result = port.nombreBus(estacion, posicion);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

        <option><%= bus %></option>
        <% } tamaño = 0; %>
            
           
        </select>
        <br>    </br>
        <input type="text" name="texto<%= nombre%>" value="" size="10" />
        <br>    </br>
        <form name="pasarmenuegeneral" action="menuegeneral.jsp" method="POST">
            <input type="button" value="NEXT >" name="boton<%= nombre%>" />
        </form>
        <br>    </br>

        
    <font>
</center>
    
</body>
</html>
