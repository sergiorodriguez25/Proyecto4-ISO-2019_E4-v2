/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2019-11-05 17:42:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>The Good Health</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <link href=\"../../assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"signin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("\t<form class=\"form-signin\">\n");
      out.write("        <h2 class=\"text-center\">BIENVENID@ A THE GOOD HEALTH</h2>\n");
      out.write("    </form>\n");
      out.write("\t<div class=\"text-center\">\n");
      out.write("    \t<div></div>\n");
      out.write("    \t\n");
      out.write("    \t<!--  <div class=\"col-lg-4\"> -->\n");
      out.write("    \t<div class=\"text-center\">\n");
      out.write("    \t\n");
      out.write("\t\t\t<a><img src='http://s2.subirimagenes.com/otros/previo/thump_9911960iconotgh.jpg' alt='subir imagenes' border='0' ></a>    \t</div>\n");
      out.write("        </div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <form class=\"form-signin\">\n");
      out.write("        <h2 class=\"form-signin-heading\">Introduce tus datos para iniciar sesión</h2>\n");
      out.write("        <label for=\"inputDNI\" class=\"sr-only\">DNI</label>\n");
      out.write("        <input type=\"text\" id=\"inputDNI\" name = \"dni\" class=\"form-control\" placeholder=\"DNI\" required autofocus>\n");
      out.write("        <label for=\"inputPassword\" class=\"sr-only\">Contraseña</label>\n");
      out.write("        <input type=\"password\" id=\"inputPassword\" name = \"password\" class=\"form-control\" placeholder=\"Contraseña\" required>\n");
      out.write("        <div>\n");
      out.write("        <label id=\"labelMalLogin\"></label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"checkbox\">\n");
      out.write("          <label>\n");
      out.write("            <input type=\"checkbox\" value=\"remember-me\"> Recordar contraseña\n");
      out.write("          </label>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <a id=\"logearseBtn\" type=\"submit\" class=\"btn btn-lg btn-primary btn-block\">Iniciar sesión</a>\n");
      out.write("        <a href = \"/registro\" class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Registrarse</a>\n");
      out.write("        \n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("    </div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("    jQuery(document).ready(function($) {\n");
      out.write("    \t$('#logearseBtn').click(function(event) {\n");
      out.write("    \t\tevent.preventDefault();\n");
      out.write("    \t\tenviarDatos();\n");
      out.write("    \t});\n");
      out.write("    });\n");
      out.write("    \n");
      out.write("\tfunction enviarDatos(){\n");
      out.write("\t\tvar data = {\n");
      out.write("\t\t\tDNI : convertirDNI($('#inputDNI').val()),\n");
      out.write("\t\t\tpassword : $('#inputPassword').val(),\n");
      out.write("\t\t};\n");
      out.write("\t\tvar url = \"/home\";\n");
      out.write("\t\tvar type = \"POST\";\n");
      out.write("\t\tvar success;\n");
      out.write("\t\tvar xhrFields;\n");
      out.write("\t\tvar headers = {\n");
      out.write("\t\t\t'Content-Type' : 'application/json'\n");
      out.write("\t\t};\n");
      out.write("\t\t\n");
      out.write("\t\tdata = JSON.stringify(data);\n");
      out.write("\t\tconsole.log(data);\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\ttype: type,\n");
      out.write("\t\t\turl: url,\n");
      out.write("\t\t\tdata: data,\n");
      out.write("\t        headers : headers,\n");
      out.write("\t        xhrFields: {\n");
      out.write("\t            withCredentials: true\n");
      out.write("\t        },\n");
      out.write("\t        success : loginOK,\n");
      out.write("\t        error : loginError\n");
      out.write("\t\t});\n");
      out.write("\t};\n");
      out.write("\t\n");
      out.write("\tfunction convertirDNI(dni){\n");
      out.write("\t\tif (dni.length == 0 || dni.length == 1)\n");
      out.write("\t\t\treturn dni;\n");
      out.write("\t\telse {\n");
      out.write("\t\t\tif (/[A-Z]/.test(dni.charAt(dni.length-1)) || /[a-z]/.test(dni.charAt(dni.length-1))){\n");
      out.write("\t\t\t\treturn dni.substring(0,dni.length-1)+dni.charAt(dni.length-1).toUpperCase();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\treturn dni;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction loginOK(respuesta) {\n");
      out.write("\t\tconsole.log(respuesta);\t\n");
      out.write("\t\tconsole.log(jso);\n");
      out.write("\t\tvar jso = JSON.parse(respuesta);\n");
      out.write("\t\tsessionStorage.usuario=JSON.stringify(jso);\n");
      out.write("\t\tif(jso.type==\"CredencialesMal\"){\n");
      out.write("\t\t\tconsole.log(\"Credenciales incorrectas\");\n");
      out.write("\t        $('#labelMalLogin').html(\"Credenciales inválidas. Por favor vuelva a introducir los datos\");\n");
      out.write("\t        $('#labelMalLogin').css(\"color\", \"red\");\n");
      out.write("\t        $('#inputDNI').val(\"\");\n");
      out.write("\t        $('#inputPassword').val(\"\");\n");
      out.write("\t\t}\n");
      out.write("\t\telse {\n");
      out.write("\t\t\tconsole.log(\"Credenciales correctas\");\n");
      out.write("\t        location.href=\"/citas\";\n");
      out.write("\t\t}\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("\tfunction encode_utf8(s) {\n");
      out.write("\t\t  return unescape(encodeURIComponent(s));\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction loginError() {\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
