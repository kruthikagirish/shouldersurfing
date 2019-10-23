package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.Utility;
import com.DAOFactory.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    \r\n");
      out.write("    \r\n");
      out.write("       \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" class=\"no-js\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html class=\"no-js\" lang=\"en\"> <!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>Graphical_Authentication_System</title>\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS FILES -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" media=\"screen\" data-name=\"skins\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/layout/wide.css\" data-name=\"layout\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/switcher.css\" media=\"screen\" />\r\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("    <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--Start Header-->\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("    <div id=\"top-bar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-8 top-info hidden-xs\">\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"logo-bar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!-- Logo / Mobile Menu -->\r\n");
      out.write("                <div  class=\"col-lg-3 col-sm-3 \">\r\n");
      out.write("                    <div id=\"logo\">\r\n");
      out.write("                         <h1><a href=\"index.jsp\"><img alt=\"logo\" style=\"width: 1200px; height:100px;\" src=\"images/title.png\"/></a></h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Navigation\r\n");
      out.write("================================================== -->\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("      <div id=\"top-bar\" style=\"position:absolute; top: 170px; width:100%;\"  >\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-8 top-info hidden-xs\" >\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("</header>\r\n");
      out.write("<!--End Header-->\r\n");
      out.write("\r\n");
      out.write("<!--start wrapper-->\r\n");
      out.write("<section class=\"wrapper\">\r\n");
      out.write("   <!--  <section class=\"page_head\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12\">\r\n");
      out.write("                    <div class=\"page_title\">\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section> -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row sub_content\">\r\n");
      out.write("             <div class=\"col-lg-5 col-sm-5 col-lg-offset-1\">\r\n");
      out.write("                <div class=\"dividerHeading\">\r\n");
      out.write("                    <h4><span>Admin Login Form</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form id=\"loginform\" method=\"post\" name=\"loginform\" action=\"");
      out.print(request.getContextPath());
      out.write("/AdminLogin\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                            <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"UserId\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\r\n");
      out.write("                            <input type=\"password\" name=\"pass\"  class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"checkbox\">\r\n");
      out.write("                            <label>\r\n");
      out.write("                                <input type=\"checkbox\"> Remember me\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <button type=\"submit\" name=\"submit\" value=\"signin\" class=\"btn btn-default btn-lg button\">Sign in</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-5 col-sm-5 col-lg-offset-1\">\r\n");
      out.write("                <div class=\"dividerHeading\">\r\n");
      out.write("                    <h4><span> User Login Form</span></h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form id=\"loginform\" method=\"post\" name=\"loginform\" action=\"");
      out.print(request.getContextPath());
      out.write("/UserLogin\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                            <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"UserId\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\r\n");
      out.write("                            <input type=\"password\" name=\"pass\" class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"checkbox\">\r\n");
      out.write("                            <label>\r\n");
      out.write("                                <input type=\"checkbox\"> Remember me\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <button type=\"submit\" name=\"submit\" value=\"signin\" class=\"btn btn-default btn-lg button\">Sign in</button>\r\n");
      out.write("                        <button type=\"submit\"  name=\"submit\" value=\"newuser\" class=\"btn btn-default btn-lg button\">New User</button>\r\n");
      out.write("                        <button type=\"submit\"  name=\"submit\" value=\"forgotpass\" class=\"btn btn-default btn-lg button\">Forgot Password?</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("                </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("<!--end wrapper-->\r\n");
      out.write("\r\n");
      out.write("<!--start footer-->\r\n");
      out.write("\r\n");
      out.write("<!--end footer-->\r\n");
      out.write("\r\n");
      out.write("<section class=\"footer_bottom\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.10.2.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("<script src=\"js/retina-1.1.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.cookie.js\"></script> <!-- jQuery cookie -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/styleswitch.js\"></script> <!-- Style Colors Switcher -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.smartmenus.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.smartmenus.bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/owl.carousel.js\"></script><!-- Popover-JS -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jflickrfeed.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.isotope.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/swipe.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-scrolltofixed-min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Start Style Switcher -->\r\n");
      out.write("\r\n");
      out.write("<!-- End Style Switcher -->\r\n");
if(Utility.parse(request.getParameter("no"))==7)
    {
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\talert('User Login  Failure!!!!!')\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write(" ");
   }
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");
if(Utility.parse(request.getParameter("no"))==2)
    {
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\talert('Admin Login  Failure!!!!!')\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write(" ");
   }
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");
if(Utility.parse(request.getParameter("no"))==8)
    {
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\talert('User added and Password Set Successfully...!')\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write(" ");
   }
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" ");
if(Utility.parse(request.getParameter("no"))==12)
    {
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\talert('Password Reset Successfully...!')\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write(" ");
   }
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
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
