package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reporte_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String titulo=""; String bus=""; String chofer=""; 
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
      out.write("        <title>REPORT</title>\n");
      out.write("    </head>");
      out.write("\n");
      out.write("    <body background=\"BACK2.jpg\">\n");
      out.write("        <center>\n");
      out.write("        <br></br>\n");
      out.write("        <DIV ALIGN=right>\n");
      out.write("           <form name=\"pasarmenu\" action=\"menu.jsp\" method=\"POST\">\n");
      out.write("                <input type=\"submit\" value=\"Menu Admin\" name=\"Menu Admin\" />\n");
      out.write("           </form>\n");
      out.write("        </DIV>\n");
      out.write("        <br></br>\n");
      out.write("        <h1>        REPORT!</h1>\n");
      out.write("        <br></br>\n");
      out.write("        <br></br>  \n");
      out.write("        <br></br>\n");
      out.write("        <font color =\"white\">\n");
      out.write("        <form name=\"pasar1\" action=\"reporte.jsp\" method=\"POST\">     \n");
      out.write("<SCRIPT>\n");
      out.write("    function reloadIt()\n");
      out.write("  {\n");
      out.write("var img1= \"graphChofer.txtgraphChofer.png\"\n");
      out.write("newimg = img1\n");
      out.write("document.write('<IMG SRC=\"'+newimg+'\"width=\"50\" height=\"50\" border=\"0\" align=\"absmiddle\">')\n");
      out.write("  }\n");
      out.write("</SCRIPT>\n");
      out.write("        \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphAdmin();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    <img src=\"graphadmin.txtgraphadmin.png\">\n");
      out.write("       \n");
      out.write("        <input type=\"submit\" value=\"        GRAFICAR ADMIN           \" name=\"boton1\" />\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        <br></br>\n");
      out.write("        <form name=\"pasar1\" action=\"reporte.jsp\" method=\"POST\">   \n");
      out.write("        ");
 titulo="GRAFICAR AVL ESTACION CLAVE"; 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphEstacionClave();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    <img src=\"graphEC.txtgraphEC.png\">\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"     GRAFICAR ESTACION CLAVE     \" name=\"boton2\" />\n");
      out.write("       \n");
      out.write("        </form>\n");
      out.write("        <br></br>\n");
      out.write("        <form name=\"pasar1\" action=\"reporte.jsp\" method=\"POST\">      \n");
      out.write("        ");
 titulo="GRAFICAR AVL ESTACION GENERAL"; 
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphEstacionGeneral();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    <img src=\"graphEG.txtgraphEG.png\">\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"    GRAFICAR ESTACION GENERAL    \" name=\"boton3\" />\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        <br></br>\n");
      out.write("        <form name=\"pasar1\" action=\"reporte.jsp\" method=\"POST\">      \n");
      out.write("        CHOFER: <input type=\"text\" name=\"texto0\" value=\"\" size=\"10\" />\n");
      out.write("        ");
 titulo="GRAFICAR BUS POR CHOFER"; bus=request.getParameter("texto0"); 
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    <img src=\"graphEC.png\">        \n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"     GRAFICAR BUS POR CHOFER     \" name=\"boton4\" />\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        <br></br>\n");
      out.write("        <form name=\"pasar1\" action=\"reporte.jsp\" method=\"POST\">      \n");
      out.write("        BUS: <input type=\"text\" name=\"texto1\" value=\"\" size=\"10\" />\n");
      out.write("        CHOFER: <input type=\"text\" name=\"texto2\" value=\"\" size=\"10\" />\n");
      out.write("        ");
 titulo="GRAFICAR HORARIO POR CHOFER Y BUS"; bus=request.getParameter("texto1"); chofer=request.getParameter("texto2"); 
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    <img src=\"graphEC.png\">        \n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"GRAFICAR HORARIO POR CHOFER Y BUS\" name=\"bton5\"/>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        <br></br>\n");
      out.write("        <form name=\"pasarreporte\" action=\"reporte.jsp\" method=\"POST\">\n");
      out.write("        \n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	servicio.NewWebService_Service service = new servicio.NewWebService_Service();
	servicio.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.graphChofer();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    <img src=\"graphEC.png\">\n");
      out.write("  \n");
      out.write("    \n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"GRAFICAR AVL CHOFER\" name=\"bton6\" onclic=\"reloadIt();\"/>\n");
      out.write("      \n");
      out.write("        </form>\n");
      out.write("        <br></br>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("        <br></br>\n");
      out.write("        </font>\n");
      out.write("        </center>\n");
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
