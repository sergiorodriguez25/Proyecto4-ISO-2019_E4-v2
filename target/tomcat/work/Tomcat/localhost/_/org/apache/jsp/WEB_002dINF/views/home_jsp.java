/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-27 20:52:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <title>The Good Health</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <link href=\"../../assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"signin.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\r\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("\t<form class=\"form-signin\">\r\n");
      out.write("        <h2 class=\"text-center\">BIENVENID@ A THE GOOD HEALTH</h2>\r\n");
      out.write("    </form>\r\n");
      out.write("\t<div class=\"text-center\">\r\n");
      out.write("    \t<div></div>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<!--  <div class=\"col-lg-4\"> -->\r\n");
      out.write("    \t<div class=\"text-center\">\r\n");
      out.write("    \t\r\n");
      out.write("\t\t\t<a><img src='http://s2.subirimagenes.com/otros/previo/thump_9911960iconotgh.jpg' alt='subir imagenes' border='0' ></a>    \t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <form class=\"form-signin\">\r\n");
      out.write("        <h2 class=\"form-signin-heading\">Introduce tus datos para iniciar sesión</h2>\r\n");
      out.write("        <label for=\"inputDNI\" class=\"sr-only\">DNI</label>\r\n");
      out.write("        <input type=\"text\" id=\"inputDNI\" name = \"dni\" class=\"form-control\" placeholder=\"DNI\" required autofocus>\r\n");
      out.write("        <label for=\"inputPassword\" class=\"sr-only\">Contraseña</label>\r\n");
      out.write("        <input type=\"password\" id=\"inputPassword\" name = \"password\" class=\"form-control\" placeholder=\"Contraseña\" required>\r\n");
      out.write("        <div>\r\n");
      out.write("        <label id=\"labelMalLogin\"></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"checkbox\">\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" value=\"remember-me\"> Recordar contraseña\r\n");
      out.write("          </label>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <a id=\"logearseBtn\" type=\"submit\" class=\"btn btn-lg btn-primary btn-block\">Iniciar sesión</a>\r\n");
      out.write("        <a href = \"/registro\" class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Registrarse</a>\r\n");
      out.write("        \r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    jQuery(document).ready(function($) {\r\n");
      out.write("    \t$('#logearseBtn').click(function(event) {\r\n");
      out.write("    \t\tevent.preventDefault();\r\n");
      out.write("    \t\tenviarDatos();\r\n");
      out.write("    \t});\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("\tfunction enviarDatos(){\r\n");
      out.write("\t\tvar data = {\r\n");
      out.write("\t\t\tDNI : $('#inputDNI').val(),\r\n");
      out.write("\t\t\tpassword : $('#inputPassword').val(),\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tvar url = \"/home\";\r\n");
      out.write("\t\tvar type = \"POST\";\r\n");
      out.write("\t\tvar success;\r\n");
      out.write("\t\tvar xhrFields;\r\n");
      out.write("\t\tvar headers = {\r\n");
      out.write("\t\t\t'Content-Type' : 'application/json'\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdata = JSON.stringify(data);\r\n");
      out.write("\t\tconsole.log(data);\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: type,\r\n");
      out.write("\t\t\turl: url,\r\n");
      out.write("\t\t\tdata: data,\r\n");
      out.write("\t        headers : headers,\r\n");
      out.write("\t        xhrFields: {\r\n");
      out.write("\t            withCredentials: true\r\n");
      out.write("\t        },\r\n");
      out.write("\t        success : loginOK,\r\n");
      out.write("\t        error : loginError\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\tfunction loginOK() {\r\n");
      out.write("        console.log(\"Credenciales correctas\");\r\n");
      out.write("        var forma = document.forms[0];\r\n");
      out.write("        forma.action=\"/citas\";\r\n");
      out.write("        forma.submit(); \r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\tfunction loginError() {\r\n");
      out.write("        console.log(\"Credenciales incorrectas\");\r\n");
      out.write("        $('#labelMalLogin').html(\"Credenciales inválidas. Por favor vuelva a introducir los datos\");\r\n");
      out.write("        $('#labelMalLogin').css(\"color\", \"red\");\r\n");
      out.write("        $('#inputDNI').val(\"\");\r\n");
      out.write("        $('#inputPassword').val(\"\");\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
