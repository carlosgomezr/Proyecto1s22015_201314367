package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class asignarbus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Asignar Bus</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"BACK2.jpg\">\n");
      out.write("    <center>\n");
      out.write("        <br></br>\n");
      out.write("        <br></br>\n");
      out.write("        <br></br>\n");
      out.write("        <h1>Asignar Bus</h1>\n");
      out.write("        <br></br>\n");
      out.write("        <br></br>\n");
      out.write("        <font color=\"white\">\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td> ID BUS: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"texto1\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> RUTA: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"texto2\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> CLAVE CHOFER:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"texto3\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> HORARIO INICIO: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"texto4\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> HORARIO FIN: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"texto5\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> FECHA: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"texto6\" value=\"\" size=\"20\" /></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"ADD\" name=\"boton1\" /></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"REMOVE\" name=\"boton2\" /></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"EDIT\" name=\"boton3\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
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
