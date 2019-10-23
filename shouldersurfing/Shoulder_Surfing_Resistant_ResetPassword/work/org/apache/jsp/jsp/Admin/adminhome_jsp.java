package org.apache.jsp.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.*;
import java.sql.*;

public final class adminhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" class=\"no-js\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html class=\"no-js\" lang=\"en\"> <!--<![endif]-->\n");
      out.write("  \n");
      out.write("   \n");
      out.write("    \n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Graphical_Authentication_System</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("\n");
      out.write("    <!-- CSS FILES -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"screen\" data-name=\"skins\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/layout/wide.css\" data-name=\"layout\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/switcher.css\" media=\"screen\" />\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"Style/css/vendor/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Style/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"Style/css/style.css\" media=\"screen\" data-name=\"skins\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Style/css/style-fraction.css\" type=\"text/css\" charset=\"utf-8\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"Style/css/fractionslider.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"Style/css/switcher.css\" media=\"screen\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"HomepageCss/css/styles.css\" type=\"text/css\" />\n");
      out.write("    <style>\n");
      out.write("    td{\n");
      out.write("        cursor:pointer;\n");
      out.write("        background: -moz-linear-gradient(top, #ffffff, #D1E3E9);\n");
      out.write("        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#ffffff), to(#D1E3E9));\n");
      out.write("        text-align:center;\n");
      out.write("        width: 50px;\n");
      out.write("        height: 50px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    td img {\n");
      out.write("    max-width:100%;\n");
      out.write("    height:auto;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("    td:hover{\n");
      out.write("        background: -moz-linear-gradient(top, #249ee4, #057cc0);\n");
      out.write("        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#249ee4), to(#057cc0));\n");
      out.write("    }\n");
      out.write(" \n");
      out.write("    td:active\n");
      out.write("    {\n");
      out.write("        background: -moz-linear-gradient(top, #057cc0, #249ee4);\n");
      out.write("        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#057cc0), to(#249ee4));\n");
      out.write("    }\n");
      out.write(" \n");
      out.write("    #result{\n");
      out.write("        font-weight:bold;\n");
      out.write("        font-size:16pt;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    #myTable{\n");
      out.write("        width:100%; height:auto;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  width: 100%;\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script  src=\"http://code.jquery.com/jquery-1.9.1.min.js\" ></script>     \n");
      out.write("\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/tablecss/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<script class=\"jsbin\"\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");

String uid=session.getAttribute("adminid").toString(); 

      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!--Start Header-->\n");
      out.write("<header id=\"header\">\n");
      out.write("        <div id=\"top-bar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8 top-info hidden-xs\">\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div id=\"logo-bar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                   \n");
      out.write("                    <div  class=\"col-lg-3 col-sm-3 \" style=\"position:absolute; top: 5px;height:100px;\">\n");
      out.write("                        <div id=\"logo\">\n");
      out.write("                            <h1><a href=\"\"><img alt=\"logo\" style=\"width: 1024px;height:100px;\" src=\"images/title.png\"/></a></h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div id=\"top-bar\" style=\"position:absolute; top: 150px; width:100%;\"  >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8 top-info hidden-xs\" >\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"logo-bar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                   \n");
      out.write("                    <div  class=\"col-lg-3 col-sm-3 \">\n");
      out.write("                        <div id=\"logo\">\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Navigation\n");
      out.write("    ================================================== -->\n");
      out.write("                    <div class=\"col-lg-9 col-sm-9\" style=\"position:absolute; top: 150px;\">\n");
      out.write("                        <div class=\"navbar navbar-default navbar-static-top\" role=\"navigation\">\n");
      out.write("                            <!--  <div class=\"container\">-->\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"navbar-collapse collapse\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/AdminHome?submit=get\">Home</a>\n");
      out.write("                                      \n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"#\">Show Profile</a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/AdminProfile\">View Profile</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/EditAdminProfile?submit=edit\">Edit Profile</a></li>\n");
      out.write("                                           \n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                     <li> <a href=\"");
      out.print(request.getContextPath() );
      out.write("/ViewUsers?submit=view\">View Users</a>\n");
      out.write("                                       \n");
      out.write("                                    </li>\n");
      out.write("                                      <li> <a href=\"");
      out.print(request.getContextPath() );
      out.write("/ViewImages?submit=view\">View Password Images</a>\n");
      out.write("                                       \n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li> <a href=\"");
      out.print(request.getContextPath() );
      out.write("/ChangePassAdmin?submit=pass\">Change Password</a>\n");
      out.write("                                       \n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                    <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/index.jsp\">LogOut</a>\n");
      out.write("                                        \n");
      out.write("                                            </li>\n");
      out.write("                                           \n");
      out.write("\n");
      out.write("                                       \n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("<!--End Header-->\n");
      out.write("\n");
      out.write("<!--start wrapper-->\n");
      out.write("<section class=\"wrapper\">\n");
      out.write("    <section class=\"page_head\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    ");
      out.write("\n");
      out.write("            </section>\n");
      out.write("  \n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("<script src=\"js/retina-1.1.0.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.cookie.js\"></script> <!-- jQuery cookie -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/styleswitch.js\"></script> <!-- Style Colors Switcher -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.smartmenus.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.smartmenus.bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/owl.carousel.js\"></script><!-- Popover-JS -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jflickrfeed.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.isotope.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/swipe.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-scrolltofixed-min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
