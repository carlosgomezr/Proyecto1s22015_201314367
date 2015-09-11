package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("        <title>Menú Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"BACK2.jpg\">\n");
      out.write("       <br> </br>\n");
      out.write("       <DIV ALIGN=right>\n");
      out.write("           <form name=\"pasarindex\" action=\"index.jsp\" method=\"POST\">\n");
      out.write("                <input type=\"submit\" value=\"LOG OUT\" name=\"logout\" />\n");
      out.write("           </form>\n");
      out.write("       </DIV>\n");
      out.write("        <br> </br>\n");
      out.write("    <center>\n");
      out.write("        <h1>Menú Administrador</h1>\n");
      out.write("        <br> </br>\n");
      out.write("        <form name=\"pasaradmin\" action=\"admin.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"  Administrador  \" name=\"boton1\"/>\n");
      out.write("        </form>\n");
      out.write("        <br> </br>\n");
      out.write("        <form name=\"pasarestaciong\" action=\"estaciong.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"Estacion General\" name=\"boton2\"/>    \n");
      out.write("        </form>\n");
      out.write("        <br> </br>\n");
      out.write("        <form name=\"pasarestacionc\" action=\"estacionc.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"  Estacion Clave  \" name=\"boton3\"/>     \n");
      out.write("        </form>\n");
      out.write("        <br> </br>\n");
      out.write("        <form name=\"pasarchofer\" action=\"chofer.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"        Chofer      \" name=\"boton4\"/>     \n");
      out.write("        </form>\n");
      out.write("        <br> </br>\n");
      out.write("        <form name=\"pasarasignarbus\" action=\"asignarbus.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"    Asignar bus   \" name=\"boton5\"/>     \n");
      out.write("        </form>\n");
      out.write("        <br> </br>\n");
      out.write("        <form name=\"pasarbus\" action=\"bus.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"          Bus         \" name=\"boton6\"/>\n");
      out.write("        </form>\n");
      out.write("        <br> </br>\n");
      out.write("        <form name=\"pasarruta\" action=\"ruta.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"        Ruta         \" name=\"boton7\" />\n");
      out.write("        </form>\n");
      out.write("        <br> </br>\n");
      out.write("        <form name=\"pasarresumen\" action=\"resumen.jsp\" method=\"POST\">\n");
      out.write("        <input type=\"submit\" value=\"       Resumen      \" name=\"boton8\" />\n");
      out.write("        </form>\n");
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
