package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class next_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Enter Your House Information</title>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://v4-alpha.getbootstrap.com/dist/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container p-t-3\">\n");
      out.write("\n");
      out.write("    <h1>House Information Form</h1>\n");
      out.write("    <h3>Enter your house information here</h3>\n");
      out.write("\n");
      out.write("    <div class=\"card p-a-3\">\n");
      out.write("\n");
      out.write("        <form name=\"form1\" id=\"form1\" method=\"POST\" ACTION=\"Evaluation\" onsubmit=\"ShowLoading()\" showvalid>\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"area\">Area</label>\n");
      out.write("                <input type=number name=\"area\" id=\"area\" class=\"form-control\" placeholder=\"Colombo 15\" value=15 readonly>\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"lsize\">Land Size</label>\n");
      out.write("                <input type=number name=\"lsize\" id=\"lsize\" class=\"form-control\" placeholder=\"Enter your land size here in perches\" required minlength=\"1\" maxlength=\"3\" onchange=\"calculate()\">\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"lvalue\">Land Value</label>\n");
      out.write("                <input type=number name=\"lvalue\" id=\"lvalue\" class=\"form-control\" readonly>\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("                      \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label for=\"hsize\">Living Space</label>\n");
      out.write("                <select name=\"hsize\" id=\"hsize\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether your house is built full/ quarter/ half on the land</option>\n");
      out.write("                        <option value=1>Full built</option>\n");
      out.write("                        <option value=0>Quarter built</option>\n");
      out.write("                        <option value=0>Half built</option>\n");
      out.write("                </select>\n");
      out.write("            </div>          \n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"stories\">No of Stories</label>\n");
      out.write("                <input type=number name=\"stories\" id=\"stories\" class=\"form-control\" placeholder=\"Enter your house's no of stories here\" required minlength=\"1\" maxlength=\"1\">\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"bed\">No of Bedrooms</label>\n");
      out.write("                <input type=number name=\"bed\" id=\"bed\" class=\"form-control\" placeholder=\"Enter your house's no of bedrooms here\" required minlength=\"1\" maxlength=\"1\">\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"bath\">No of Bathrooms</label>\n");
      out.write("                <input type=number name=\"bath\" id=\"bath\" class=\"form-control\" placeholder=\"Enter your house's no of bathrooms here\" required minlength=\"1\" maxlength=\"1\">\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"year\">Built Year</label>\n");
      out.write("                <select name=\"year\" id=\"year\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select the year your house was built</option>\n");
      out.write("                        <option value=9>2015 - 2017</option>\n");
      out.write("                        <option value=8>2010 - 2014</option>\n");
      out.write("                        <option value=7>2005 - 2009</option>\n");
      out.write("                        <option value=6>2000 - 2004</option>\n");
      out.write("                        <option value=5>1995 - 1999</option>\n");
      out.write("                        <option value=4>1990 - 1994</option>\n");
      out.write("                        <option value=3>1980 - 1989</option>\n");
      out.write("                        <option value=2>1970 - 1979</option>\n");
      out.write("                        <option value=1>Before 1970</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"reno\">Previous Renovation <font color=\"red\" >--- NOTE: In the case of the house is built within ten years of time, the client has to select 'Yes' </font></label>\n");
      out.write("                <select name=\"reno\" id=\"reno\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Does your house got renovated within 10 years?</option>\n");
      out.write("                        <option value=1>Yes</option>\n");
      out.write("                        <option value=0>No</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"highway\">Highway Within 1 KM</label>\n");
      out.write("                <select name=\"highway\" id=\"highway\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a highway is available within 1km</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"mainrd\">Main Road Within 1 KM</label>\n");
      out.write("                <select name=\"mainrd\" id=\"mainrd\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a main road is available within 1km</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"hos\">Hospital Within 1 KM</label>\n");
      out.write("                <select name=\"hos\" id=\"hos\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a hospital is available within 1km</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"col\">College Within 1 KM</label>\n");
      out.write("                <select name=\"col\" id=\"col\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a college is available within 1km</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label for=\"supermarket\">Supermarket Within 1 KM</label>\n");
      out.write("                <select name=\"supermarket\" id=\"supermarket\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a supermarket is available within 1km</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"scl\">School Within 1 KM</label>\n");
      out.write("                <select name=\"scl\" id=\"scl\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a school is available within 1km</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"bus\">Bus Station Within 1 KM</label>\n");
      out.write("                <select name=\"bus\" id=\"bus\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a bus station is available within 1km</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label for=\"wne\">Availability of Water & Electricity Facilities</label>\n");
      out.write("                <select name=\"wne\" id=\"wne\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether both the water & Electricity available</option>\n");
      out.write("                        <option value=1>Yes, Both Available</option>\n");
      out.write("                        <option value=0>No, Not Both Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"gar\">Availability of Private Garden</label>\n");
      out.write("                <select name=\"gar\" id=\"gar\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a private garden is available at your house</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"cashcr\">No of Cash-Crops Available in The Garden</label>\n");
      out.write("                <input type=number name=\"cashcr\" id=\"cashcr\" class=\"form-control\" placeholder=\"Enter the no of cashcrops in your garden\" required minlength=\"1\" maxlength=\"2\">\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"sec\">Implementation of Home-Security-System</label>\n");
      out.write("                <select name=\"sec\" id=\"sec\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a home security system is implemented</option>\n");
      out.write("                        <option value=1>Yes, Implemented</option>\n");
      out.write("                        <option value=0>No, Not Implemented</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"garage\">Availability of Garage</label>\n");
      out.write("                <select name=\"garage\" id=\"garage\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a private garage is available at your house</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"ac\">Availability of Air-conditioner</label>\n");
      out.write("                <select name=\"ac\" id=\"ac\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether a Air-conditioner is fixed at your house</option>\n");
      out.write("                        <option value=1>Yes, Available</option>\n");
      out.write("                        <option value=0>No, Not Available</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"tiled\">Fully Tiled</label>\n");
      out.write("                <select name=\"tiled\" id=\"tiled\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether your house is fully tiled</option>\n");
      out.write("                        <option value=1>Yes, Fully Tiled</option>\n");
      out.write("                        <option value=0>No, Not Fully Tiled</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"citypoint\">Nearest City-Points<font color=\"red\" >--- City-points: Crow Island Beach/ Harbour Gate/ Hettiyawatha/ Kotahena/ Armour Street/ Wattala Main Road  </font></label>\n");
      out.write("                <select name=\"citypoint\" id=\"citypoint\" class=\"c-select form-control\" required>\n");
      out.write("                        <option value=\"\" selected>Select whether your house is situated within 3km distance to from any of above mentioned popular city-point</option>\n");
      out.write("                        <option value=1>Yes, My house is situated within 5km to main city-points in Colombo</option>\n");
      out.write("                        <option value=0>No, My house is not situated within 5km to main city-points in Colombo</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label for=\"frontal\">Frontal Feature</label>\n");
      out.write("                ");
      java.lang.String s = null;
      synchronized (request) {
        s = (java.lang.String) _jspx_page_context.getAttribute("s", PageContext.REQUEST_SCOPE);
        if (s == null){
          s = new java.lang.String();
          _jspx_page_context.setAttribute("s", s, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("                <input type=number name=\"frontal\" id=\"frontal\" class=\"form-control\" placeholder=");
      out.print(s );
      out.write(" value=");
      out.print(s );
      out.write(" readonly >\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label for=\"bedroom\">Bedroom Feature</label>\n");
      out.write("                ");
      java.lang.String s2 = null;
      synchronized (request) {
        s2 = (java.lang.String) _jspx_page_context.getAttribute("s2", PageContext.REQUEST_SCOPE);
        if (s2 == null){
          s2 = new java.lang.String();
          _jspx_page_context.setAttribute("s2", s2, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("                <input type=bedroom name=\"bedroom\" id=\"bedroom\" class=\"form-control\" placeholder=");
      out.print(s2 );
      out.write(" value=");
      out.print(s2 );
      out.write(" readonly >\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label for=\"bathroom\">Bathroom Feature</label>\n");
      out.write("                ");
      java.lang.String s3 = null;
      synchronized (request) {
        s3 = (java.lang.String) _jspx_page_context.getAttribute("s3", PageContext.REQUEST_SCOPE);
        if (s3 == null){
          s3 = new java.lang.String();
          _jspx_page_context.setAttribute("s3", s3, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("                <input type=bathroom name=\"bathroom\" id=\"bathroom\" class=\"form-control\" placeholder=");
      out.print(s3 );
      out.write(" value=");
      out.print(s3 );
      out.write(" readonly >\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("                <label for=\"kitchen\">Kitchen Feature</label>\n");
      out.write("                ");
      java.lang.String s4 = null;
      synchronized (request) {
        s4 = (java.lang.String) _jspx_page_context.getAttribute("s4", PageContext.REQUEST_SCOPE);
        if (s4 == null){
          s4 = new java.lang.String();
          _jspx_page_context.setAttribute("s4", s4, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("                <input type=kitchen name=\"kitchen\" id=\"kitchen\" class=\"form-control\" placeholder=");
      out.print(s4 );
      out.write(" value=");
      out.print(s4 );
      out.write(" readonly >\n");
      out.write("                <label>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("            <input type=\"submit\" name=\"form1_submit\" id=\"form1_submit\" class=\"btn btn-primary\" value=\"Submit\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("function calculate() {\n");
      out.write("\n");
      out.write("var lsize = document.form1.lsize.value;\n");
      out.write("var CALC1 = lsize;\n");
      out.write("var CALC2 = CALC1*20;\n");
      out.write("document.form1.lvalue.value = CALC2;\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function ShowLoading(e) {\n");
      out.write("        var div = document.createElement('div');\n");
      out.write("        var img = document.createElement('img');\n");
      out.write("        img.src = 'images/ajax-loader.gif';\n");
      out.write("        div.innerHTML = \"It may take a few minutes, Please wait!<br />\";\n");
      out.write("        div.style.cssText = 'position: fixed; top: 5%; left: 40%; z-index: 5000; width: 422px; text-align: center; background: #EDDBB0; border: 1px solid #000';\n");
      out.write("        div.appendChild(img);\n");
      out.write("        document.body.appendChild(div);\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"dist/index.js\"></script>\n");
      out.write("</body>\n");
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
