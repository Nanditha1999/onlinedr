package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class cancelapp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Statement st=null;
Statement st1=null;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/connection.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write('\n');
Connection con=null;
      out.write('\n');
      out.write('\n');
Connection conn=null;
      out.write('\n');

Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online","root","");
st=con.createStatement();

      out.write('\n');
String user=(String)session.getAttribute("username");
      out.write('\n');
ResultSet rs;
String query="select * from appointments where doctor='"+user+"'";
rs=st.executeQuery(query);

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Dr.care - Free Bootstrap 4 Template by Colorlib</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Work+Sans:100,200,300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("     <body>\n");
      out.write("    <nav class=\"navbar py-4 navbar-expand-lg ftco_navbar navbar-light bg-light flex-row\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"row no-gutters d-flex align-items-start align-items-center px-3 px-md-0\">\n");
      out.write("    \t\t\t<div class=\"col-lg-2 pr-4 align-items-center\">\n");
      out.write("\t\t    \t\t<a class=\"navbar-brand\" href=\"index.html\">Dr.<span>care</span></a>\n");
      out.write("\t    \t\t</div>\n");
      out.write("\t    \t\t<div class=\"col-lg-10 d-none d-md-block\">\n");
      out.write("\t\t    \t\t<div class=\"row d-flex\">\n");
      out.write("\t\t\t    \t\t<div class=\"col-md-4 pr-4 d-flex topper align-items-center\">\n");
      out.write("\t\t\t    \t\t\t<div class=\"icon bg-white mr-2 d-flex justify-content-center align-items-center\"><span class=\"icon-map\"></span></div>\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\">Address: 198 West 21th Street, Suite 721 New York NY 10016</span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <div class=\"col-md pr-4 d-flex topper align-items-center\">\n");
      out.write("\t\t\t\t\t    \t<div class=\"icon bg-white mr-2 d-flex justify-content-center align-items-center\"><span class=\"icon-paper-plane\"></span></div>\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\">Email: youremail@email.com</span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t    <div class=\"col-md pr-4 d-flex topper align-items-center\">\n");
      out.write("\t\t\t\t\t    \t<div class=\"icon bg-white mr-2 d-flex justify-content-center align-items-center\"><span class=\"icon-phone2\"></span></div>\n");
      out.write("\t\t\t\t\t\t    <span class=\"text\">Phone: + 1235 2355 98</span>\n");
      out.write("\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t  </div>\n");
      out.write("    </nav>\n");
      out.write("\t  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n");
      out.write("\t    <div class=\"container d-flex align-items-center\">\n");
      out.write("\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t        <span class=\"oi oi-menu\"></span> Menu\n");
      out.write("\t      </button>\n");
      out.write("\t      <p class=\"button-custom order-lg-last mb-0\"><a href=\"appointment.html\" class=\"btn btn-secondary py-2 px-3\">Cancel Appointment</a></p>\n");
      out.write("\t      <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n");
      out.write("\t        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\t        \t<li class=\"nav-item active\"><a href=\"cancelapp.jsp\" class=\"nav-link pl-0\">HOME</a></li>\n");
      out.write("\t                 <li class=\"nav-item\"><a href=\"APP.jsp\" class=\"nav-link\">VIEW APPOINTMENT</a></li>\n");
      out.write("\t        \t<li class=\"nav-item\"><a href=\"cancelapp.jsp\" class=\"nav-link\">CANCEL APPOINTMENT</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"prescription4pat.html\" class=\"nav-link\">PRESCRIPTION</a></li>\n");
      out.write("                         <li class=\"nav-item\"><a href=\"DRLOGIN.html\" class=\"nav-link\">LOGOUT</a></li>\n");
      out.write("\t        </ul>\n");
      out.write("\t      </div>\n");
      out.write("\t    </div>\n");
      out.write("\t  </nav>\n");
      out.write("    <!-- END nav -->\n");
      out.write("    ");
out.print("welcome "+user);
      out.write(" \n");
      out.write("    \n");
      out.write("    <section class=\"hero-wrap hero-wrap-2\" style=\"background-image: url('images/bg_1.jpg');\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("      <div class=\"overlay\"></div>\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row no-gutters slider-text align-items-center justify-content-center\">\n");
      out.write("          <div class=\"col-md-9 ftco-animate text-center\">\n");
      out.write("            <h1 class=\"mb-2 bread\">Cancel Appointment</h1>\n");
      out.write("            <p class=\"breadcrumbs\"><span class=\"mr-2\"><a href=\"index.html\">Home <i class=\"ion-ios-arrow-forward\"></i></a></span> <span> Cancel Appointment <i class=\"ion-ios-arrow-forward\"></i></span></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section> \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <table style=\"width:50%\">\n");
      out.write("  <tr>\n");
      out.write("    <th> PATIENT NUMBER</th>\n");
      out.write("    <th>NAME</th> \n");
      out.write("    <th>GENDER</th>\n");
      out.write("    <th>AGE</th>\n");
      out.write("    <th>MOBILE NUMBER</th>\n");
      out.write("    <th>DOCTOR </th>\n");
      out.write("    <th>DATE</th>\n");
      out.write("    <th>CANCEL</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  ");
 while(rs.next())
  {
      
      out.write("\n");
      out.write("      <tr><td>\n");
      out.write("              ");
 out.print(rs.getString("patient_number"));
      out.write(" </td> \n");
      out.write("          <td> ");
 out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("          <td> ");
 out.print(rs.getString("gender"));
      out.write("</td>\n");
      out.write("          <td> ");
 out.print(rs.getString("age"));
      out.write("</td>\n");
      out.write("          <td> ");
 out.print(rs.getString("mobile_number"));
      out.write("</td>\n");
      out.write("          <td> ");
 out.print(rs.getString("doctor"));
      out.write("</td>\n");
      out.write("          <td> ");
 out.print(rs.getString("date"));
      out.write("</td>\n");
      out.write("          <td> <a href=\"cancel.jsp?id=");
out.print(rs.getString("patient_number")); 
      out.write("\">Cancel</a></td>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                  </tr>\n");
      out.write("  ");
}
  
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <BR><BR><BR>\n");
      out.write("    \n");
      out.write("    <footer class=\"ftco-footer ftco-bg-dark ftco-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row mb-5\">\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-5\">\n");
      out.write("              <h2 class=\"ftco-heading-2 logo\">Dr.<span>care</span></h2>\n");
      out.write("              <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ftco-footer-widget mb-5\">\n");
      out.write("            \t<h2 class=\"ftco-heading-2\">Have a Questions?</h2>\n");
      out.write("            \t<div class=\"block-23 mb-3\">\n");
      out.write("\t              <ul>\n");
      out.write("\t                <li><span class=\"icon icon-map-marker\"></span><span class=\"text\">203 Fake St. Mountain View, San Francisco, California, USA</span></li>\n");
      out.write("\t                <li><a href=\"#\"><span class=\"icon icon-phone\"></span><span class=\"text\">+2 392 3929 210</span></a></li>\n");
      out.write("\t                <li><a href=\"#\"><span class=\"icon icon-envelope\"></span><span class=\"text\">info@yourdomain.com</span></a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t            </div>\n");
      out.write("\n");
      out.write("\t            <ul class=\"ftco-footer-social list-unstyled float-md-left float-lft mt-3\">\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-twitter\"></span></a></li>\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-facebook\"></span></a></li>\n");
      out.write("                <li class=\"ftco-animate\"><a href=\"#\"><span class=\"icon-instagram\"></span></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-5 ml-md-4\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Links</h2>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Home</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>About</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Services</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Deparments</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Contact</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ftco-footer-widget mb-5 ml-md-4\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Services</h2>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Neurolgy</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Dentist</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Ophthalmology</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Cardiology</a></li>\n");
      out.write("                <li><a href=\"#\"><span class=\"ion-ios-arrow-round-forward mr-2\"></span>Surgery</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("            <div class=\"ftco-footer-widget mb-5\">\n");
      out.write("              <h2 class=\"ftco-heading-2\">Recent Blog</h2>\n");
      out.write("              <div class=\"block-21 mb-4 d-flex\">\n");
      out.write("                <a class=\"blog-img mr-4\" style=\"background-image: url(images/image_1.jpg);\"></a>\n");
      out.write("                <div class=\"text\">\n");
      out.write("                  <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\n");
      out.write("                  <div class=\"meta\">\n");
      out.write("                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> Dec 25, 2018</a></div>\n");
      out.write("                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n");
      out.write("                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"block-21 mb-5 d-flex\">\n");
      out.write("                <a class=\"blog-img mr-4\" style=\"background-image: url(images/image_2.jpg);\"></a>\n");
      out.write("                <div class=\"text\">\n");
      out.write("                  <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\n");
      out.write("                  <div class=\"meta\">\n");
      out.write("                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> Dec 25, 2018</a></div>\n");
      out.write("                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n");
      out.write("                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md\">\n");
      out.write("          \t<div class=\"ftco-footer-widget mb-5\">\n");
      out.write("            \t<h2 class=\"ftco-heading-2\">Opening Hours</h2>\n");
      out.write("            \t<h3 class=\"open-hours pl-4\"><span class=\"ion-ios-time mr-3\"></span>We are open 24/7</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ftco-footer-widget mb-5\">\n");
      out.write("            \t<h2 class=\"ftco-heading-2\">Subscribe Us!</h2>\n");
      out.write("              <form action=\"#\" class=\"subscribe-form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" class=\"form-control mb-2 text-center\" placeholder=\"Enter email address\">\n");
      out.write("                  <input type=\"submit\" value=\"Subscribe\" class=\"form-control submit px-3\">\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12 text-center\">\n");
      out.write("\n");
      out.write("            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"icon-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- loader -->\n");
      out.write("  <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("  <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("  <script src=\"js/jquery.animateNumber.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("  <script src=\"js/jquery.timepicker.min.js\"></script>\n");
      out.write("  <script src=\"js/scrollax.min.js\"></script>\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("  <script src=\"js/google-map.js\"></script>\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
