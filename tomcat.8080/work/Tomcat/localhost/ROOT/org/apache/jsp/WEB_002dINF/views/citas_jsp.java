/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2019-11-05 17:43:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class citas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("<link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("<link rel=\"canonical\"\n");
      out.write("\thref=\"https://getbootstrap.com/docs/3.4/examples/signin/\">\n");
      out.write("\n");
      out.write("<title>Citas</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap core CSS -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("<link href=\"../../assets/css/ie10-viewport-bug-workaround.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("<link href=\"signin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("<!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("<script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".bd-placeholder-img {\n");
      out.write("\tfont-size: 1.125rem;\n");
      out.write("\ttext-anchor: middle;\n");
      out.write("\t-webkit-user-select: none;\n");
      out.write("\t-moz-user-select: none;\n");
      out.write("\t-ms-user-select: none;\n");
      out.write("\tuser-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media ( min-width : 768px) {\n");
      out.write("\t.bd-placeholder-img-lg {\n");
      out.write("\t\tfont-size: 3.5rem;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!-- Custom styles for this template -->\n");
      out.write("<link href=\"starter-template.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-expand-md navbar-dark bg-dark fixed-top\">\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"#\">THE GOOD HEALTH</a>\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\tdata-target=\"#navbarsExampleDefault\"\n");
      out.write("\t\t\taria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\"\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t</button>\n");
      out.write("\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto\">\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\" href=\"#\">Mis\n");
      out.write("\t\t\t\t\t\tcitas <span class=\"sr-only\">(current)</span>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\n");
      out.write("\t\t\t\t\thref=\"/formularioCitas\" tabindex=\"-1\" aria-disabled=\"true\">Pedir\n");
      out.write("\t\t\t\t\t\tcita</a></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown01\"\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Cuenta</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"#\">Mi Perfil</a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"#\">Información</a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"/\">Cerrar sesión</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("\t\t\t\t<input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Buscar\"\n");
      out.write("\t\t\t\t\taria-label=\"Search\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Buscar</button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<main role=\"main\" class=\"container\">\n");
      out.write("\t\t<div class=\"span\">\n");
      out.write("\t\t\t<div></div>\n");
      out.write("\t\t\t<div class=\"hero-unit\">\n");
      out.write("\t\t\t\t<br></br>\n");
      out.write("\t\t\t\t</br>\n");
      out.write("\t\t\t\t</br>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Mis Citas</h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tBienvenido/a a la página de \"Mis citas\" en la que aparecen\n");
      out.write("\t\t\t\t\t\t\t\t\ttodas las citas que tiene programadas. Si desea modificar(<img\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/png/512/23/23187.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded\" width=\"25\" height=\"25\">) o\n");
      out.write("\t\t\t\t\t\t\t\t\tanular(<img\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"https://image.flaticon.com/icons/png/512/39/39220.png\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"img-fluid rounded\" width=\"25\" height=\"25\">) una\n");
      out.write("\t\t\t\t\t\t\t\t\tcita, pulse el botón de la acción que quiera realizar y que se\n");
      out.write("\t\t\t\t\t\t\t\t\tencuentra a la derecha de la cita con la que quiera\n");
      out.write("\t\t\t\t\t\t\t\t\tinteractuar.\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tSi desea solicitar una cita pulse el siguiente botón <a\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"/formularioCitas\" class=\"btn btn-primary btn-large\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"submit\">Pedir cita</a>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-1\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"getParametersURL\"></form>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label id=\"nombreApellidos\"></label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<br></br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row d-flex justify-content-center\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div align='center'>\n");
      out.write(" \t\t\t\t\t<h2>Próximas Citas</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<table id=\"Table\" class=\"table\">\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("    \t\t\t\t\t\t\t<tr>\n");
      out.write("      \t\t\t\t\t\t\t\t<td align=\"center\" scope=\"col\"><b>Hora</b></td>\n");
      out.write("\t\t\t\t\t\t\t\t    <td align=\"center\" scope=\"col\"><b>Fecha</b></td>\n");
      out.write("\t\t\t\t\t\t\t\t    <td align=\"center\" scope=\"col\"><b>Especialidad</b></td>\n");
      out.write("\t\t\t\t\t\t\t\t    <td align=\"center\" scope=\"col\"><b>Médico</b></td>\n");
      out.write("\t\t\t\t\t\t\t\t    <td align=\"center\" scope=\"col\"><b>Centro</b></td>\n");
      out.write("    \t\t\t\t\t\t\t</tr>\n");
      out.write(" \t\t\t\t\t\t\t </thead>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t<div align='center'>\n");
      out.write("\t\t\t\t\t\t\t<label id=\"noHayCitas\"></label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</br>\n");
      out.write("\t</main>\n");
      out.write("\t<!-- /.container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\n");
      out.write("\t\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\n");
      out.write("\t\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tjQuery(document).ready(function($) {\n");
      out.write("    \t\tenviardni();\n");
      out.write("\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\t * Control para que no acceda a través de la url a alguna página que no sea el home\n");
      out.write("\t\t\t\t\t\t\t * Hay que ponerlo en todos los jsp que se hagan próximamente\n");
      out.write("\t\t\t\t\t\t\t */\n");
      out.write("\t\t\t\t\t\t\tvar referrer = document.referrer;\n");
      out.write("\t\t\t\t\t\t\tif (referrer != 'http://localhost:8080/'\n");
      out.write("\t\t\t\t\t\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/'\n");
      out.write("\t\t\t\t\t\t\t\t\t&& referrer != 'http://localhost:8080/registro'\n");
      out.write("\t\t\t\t\t\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/registro'\n");
      out.write("\t\t\t\t\t\t\t\t\t&& referrer != 'http://localhost:8080/formularioCitas'\n");
      out.write("\t\t\t\t\t\t\t\t\t&& referrer != 'https://the-good-health.herokuapp.com/formularioCitas') {\n");
      out.write("\t\t\t\t\t\t\t\tvar forma = document.forms[0];\n");
      out.write("\t\t\t\t\t\t\t\tforma.action = \"/error\";\n");
      out.write("\t\t\t\t\t\t\t\tforma.submit();\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t//     \t\tgetParametersURL();\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\tponerNombreApellidos();\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\tfunction enviardni(){\n");
      out.write("\t\t\tvar jsoUser = JSON.parse(sessionStorage.usuario);\n");
      out.write("\t\t\tvar data = {\n");
      out.write("\t\t\t\t\tDNI : jsoUser.resultado.usuario.dni\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t\tvar url = \"/citas\";\n");
      out.write("\t\t\t\tvar type = \"POST\";\n");
      out.write("\t\t\t\tvar success;\n");
      out.write("\t\t\t\tvar xhrFields;\n");
      out.write("\t\t\t\tvar headers = {\n");
      out.write("\t\t\t\t\t'Content-Type' : 'application/json'\n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tdata = JSON.stringify(data);\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\ttype: type,\n");
      out.write("\t\t\t\t\turl: url,\n");
      out.write("\t\t\t\t\tdata: data,\n");
      out.write("\t\t\t        headers : headers,\n");
      out.write("\t\t\t        xhrFields: {\n");
      out.write("\t\t\t            withCredentials: true\n");
      out.write("\t\t\t        },\n");
      out.write("\t\t\t        success : CitasOK,\n");
      out.write("\t\t\t        error : CitasError\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction CitasOK(respuesta) {\n");
      out.write("\t\t\tconsole.log(respuesta);\n");
      out.write("\t\t\tvar jsoCitas = JSON.parse(respuesta);\n");
      out.write("\t\t\tconsole.log(jsoCitas);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(jsoCitas.length==0) $('#noHayCitas').html(\"No tienes citas pendientes\");\n");
      out.write("\t\t\telse{\n");
      out.write("\t\t\t\tfor (i = 0; i < jsoCitas.length; i++){\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\t $(\"#Table\").append('<tr>' + \n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + jsoCitas[i].hora + '</td>'+\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + jsoCitas[i].dia + '</td>'+\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + jsoCitas[i].especialidad + '</td>'+\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + jsoCitas[i].nombreApe + '</td>'+\n");
      out.write("\t\t\t\t\t \t'<td align=\"center\" style=\"dislay: none;\">' + jsoCitas[i].centro + '</td>'+'</tr>');\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction CitasError(respuesta) {\n");
      out.write("\t\t\tconsole.log(respuesta);\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction ponerNombreApellidos() {\n");
      out.write("\t\t\tvar jsoUser = JSON.parse(sessionStorage.usuario);\n");
      out.write("\t\t\tconsole.log(jsoUser.resultado.usuario.nombre);\n");
      out.write("\t\t\t$('#nombreApellidos').html(\n");
      out.write("\t\t\t\t\tjsoUser.resultado.usuario.nombre + \" \"\n");
      out.write("\t\t\t\t\t\t\t+ jsoUser.resultado.usuario.apellidos);\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t\t//     function getParametersURL() {\n");
      out.write("\t\t//     \tvar name=\"nombre\";\n");
      out.write("\t\t//     \tvar surname=\"apellidos\";\n");
      out.write("\t\t//         name = name.replace(/[\\[]/, \"\\\\[\").replace(/[\\]]/, \"\\\\]\");\n");
      out.write("\t\t//         var regex = new RegExp(\"[\\\\?&]\" + name + \"=([^&#]*)\"),\n");
      out.write("\t\t//         results = regex.exec(location.search);\n");
      out.write("\t\t//         var regex2 = new RegExp(\"[\\\\?&]\" + surname + \"=([^&#]*)\"),\n");
      out.write("\t\t//         results2 = regex2.exec(location.search);\n");
      out.write("\t\t//         console.log(results);\n");
      out.write("\t\t//         console.log(decodeURIComponent(results2[1].replace(/\\+/g, \" \")));\n");
      out.write("\t\t//         $('#nombreApellidos').html(decodeURIComponent(results[1].replace(/\\+/g, \" \")) + \" \" + decodeURIComponent(results2[1].replace(/\\+/g, \" \")));\n");
      out.write("\t\t//         return results === null ? \"\" : decodeURIComponent(results[1].replace(/\\+/g, \" \"));\n");
      out.write("\t\t//     }\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
