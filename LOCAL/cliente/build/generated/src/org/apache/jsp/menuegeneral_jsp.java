package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuegeneral_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int c=0; String auxc=""; String nombre=""; int tamaño=5; String bus="";
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menú Estacion General</title>\n");
      out.write("    </head>");
      out.write("\n");
      out.write("    <body background=\"BACK2.jpg\">\n");
      out.write("        <br> </br>\n");
      out.write("        <DIV ALIGN=right>\n");
      out.write("           <form name=\"pasarindex\" action=\"index.jsp\" method=\"POST\">\n");
      out.write("                <input type=\"submit\" value=\"LOG OUT\" name=\"logout\" />\n");
      out.write("           </form>\n");
      out.write("       </DIV>\n");
      out.write("       <br> </br>\n");
      out.write("    <center>\n");
      out.write("         <font color=\"white\">\n");
      out.write("         <h1>Menú Estacion General</h1>\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	int result = port.darUser();
	out.println(""+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("     \n");
      out.write("         \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");

        for (int i=1; i<=c;i++){
        
      out.write("\n");
      out.write("        \n");
      out.write("                ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <h3>Estacion ");
      out.print( nombre);
      out.write("</h3>\n");
      out.write("   ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("     \n");
      out.write("        <br> </br>\n");
      out.write("        Lista de buses\n");
      out.write("        <select name=\"list");
      out.print( nombre);
      out.write("\">\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        ");
  
        for(int j=1; j<=tamaño; j++){ 
      out.write("\n");
      out.write("\n");
      out.write("            ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String posicion = nombre;
        bus = nombre;
	// TODO process result here
	java.lang.String result = port.nombreEstacion(posicion);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <option>");
      out.print( bus );
      out.write("</option>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        </select>\n");
      out.write("        <br>    </br>\n");
      out.write("        <input type=\"text\" name=\"texto");
      out.print( nombre);
      out.write("\" value=\"\" size=\"10\" />\n");
      out.write("        <br>    </br>\n");
      out.write("        <form name=\"pasarmenuegeneral\" action=\"menuegeneral.jsp\" method=\"POST\">\n");
      out.write("            <input type=\"button\" value=\"NEXT >\" name=\"boton");
      out.print( nombre);
      out.write("\" />\n");
      out.write("        </form>\n");
      out.write("        <br>    </br>\n");
      out.write("        ");

        }
        
      out.write("    \n");
      out.write("        </font>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
