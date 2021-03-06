package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class room_002dbak_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_url_nobody.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>環境資訊顯示看板</title>\n");
      out.write("\n");
      out.write("        <script src=\"assets/jquery/jquery-1.11.2.min.js\"></script>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link href=\"assets/bootstrap-3.3.5-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link href=\"assets/bootstrap-3.3.5-dist/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <link href=\"assets/bootstrap-3.3.5-dist/js/bootstrap.min.js\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Font-awesome -->\n");
      out.write("        <link href=\"assets/font-awesome-4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- JQuery UI -->\n");
      out.write("        <link href=\"assets/jquery-ui-1.11.4.custom/jquery-ui.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"assets/jquery-ui-1.11.4.custom/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                text-align:center;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background: #090930;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .form-control{\n");
      out.write("                text-align:center;\n");
      out.write("                color:black;\n");
      out.write("                background-color: black;\n");
      out.write("                height: 80px;\n");
      out.write("            }\n");
      out.write("            div.input-group-addon{\n");
      out.write("                font-size:2em;\n");
      out.write("                border:none !important;\n");
      out.write("                background-color:rgba(0,0,0,0) !important;\n");
      out.write("                color:white !important;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                background-color:rgba(0,0,0,0) !important;\n");
      out.write("                border:none !important;\n");
      out.write("            }\n");
      out.write("            input.yellow{\n");
      out.write("                font-weight: bold;\n");
      out.write("                color:yellow !important;\n");
      out.write("                font-size: 2em;\n");
      out.write("            }\n");
      out.write("            input.measure{\n");
      out.write("                font-weight: normal;\n");
      out.write("                color:red !important;\n");
      out.write("                font-size: 4em;\n");
      out.write("            }\n");
      out.write("            input.comfort{\n");
      out.write("                font-weight: normal;\n");
      out.write("                //color:springgreen !important;\n");
      out.write("                font-size: 3em;\n");
      out.write("            }\n");
      out.write("            div.color-badge-active{\n");
      out.write("                opacity:1 !important;\n");
      out.write("                font-size:3em;\n");
      out.write("                //border-color: white;\n");
      out.write("                //border-style: solid;\n");
      out.write("                //border-width: 5px;\n");
      out.write("            }\n");
      out.write("            div.color-badge{\n");
      out.write("                text-align: center;\n");
      out.write("                alignment-adjust: middle;\n");
      out.write("                opacity:0.5;\n");
      out.write("                position:relative;\n");
      out.write("                height:30px;\n");
      out.write("                width:50px;\n");
      out.write("                //color: rgba(255,0,0,1);\n");
      out.write("                float:left;\n");
      out.write("            }\n");
      out.write("            .comfort-green{\n");
      out.write("                color: rgba(0,255,0,1);\n");
      out.write("            }\n");
      out.write("            .comfort-yellowgreen{\n");
      out.write("                color: rgba(122,255,0,1);\n");
      out.write("            }\n");
      out.write("            .comfort-yellow{\n");
      out.write("                color: rgba(255,255,0,1);\n");
      out.write("            }\n");
      out.write("            .comfort-redyellow{\n");
      out.write("                color: rgba(255,122,0,1);\n");
      out.write("            }\n");
      out.write("            .comfort-red{\n");
      out.write("                color: rgba(255,0,0,1);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\" style=\"margin-top:50px;\">\n");
      out.write("                    <div class=\"col-lg-10 col-lg-offset-1\">\n");
      out.write("\n");
      out.write("                        <h1>環境資訊顯示看板</h1>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-4\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <div class=\"input-group-addon\">民國</div>\n");
      out.write("                                    <input class=\"form-control yellow\" id=\"fullYear\">\n");
      out.write("                                    <div class=\"input-group-addon\">年</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"form-control yellow\" id=\"month\">\n");
      out.write("                                    <div class=\"input-group-addon\">月</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-3\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"form-control yellow\" id=\"date\">\n");
      out.write("                                    <div class=\"input-group-addon\">日</div>\n");
      out.write("                                </div>                 \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <div class=\"input-group-addon\">星期</div>\n");
      out.write("                                    <input class=\"form-control yellow\" id=\"weekDay\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br/>\n");
      out.write("                        <div class=\"row form-inline\">\n");
      out.write("                            <div class=\"col-lg-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"form-control yellow\" id=\"hours\">\n");
      out.write("                                    <div class=\"input-group-addon\">時</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"form-control yellow\" id=\"minutes\">\n");
      out.write("                                    <div class=\"input-group-addon\">分</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-2\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"form-control yellow\" id=\"seconds\">\n");
      out.write("                                    <div class=\"input-group-addon\">秒</div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>                            \n");
      out.write("                            <div class=\"col-lg-5\">\n");
      out.write("                                <div class=\"input-group has-warning\">\n");
      out.write("                                    <div class=\"input-group-addon\">室內溫度</div>\n");
      out.write("                                    <input class=\"form-control measure\" id=\"temp\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bulletin.temp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <div class=\"input-group-addon\">℃</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-1\">\n");
      out.write("                                <img src=\"images/thermometer.png\" alt=\"\" style=\"color:white;height:150px;position:absolute;top:-150px;left:500px;\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <br/>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-1\">\n");
      out.write("                            <img src=\"images/CO2.png\" alt=\"\" style=\"height:150px;\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-5\">\n");
      out.write("                            <div class=\"input-group has-success\">\n");
      out.write("                                <div class=\"input-group-addon\">二氧化碳</div>\n");
      out.write("                                <input class=\"form-control measure\" id=\"CO2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bulletin.CO2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <div class=\"input-group-addon\">ppm</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\">空氣品質</div>\n");
      out.write("                                <input class=\"form-control comfort\" id=\"CO2Comfort\" placeholder=\"計算中\">\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"CO2BadgeContainer\" class=\"row\">\n");
      out.write("                                <div style=\"position:relative;height:30px;width:175px;background-color: rgba(0,0,0,0);float:left;\"></div>\n");
      out.write("                                <div class=\"color-badge comfort-red\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-redyellow\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-yellow\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-yellowgreen\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-green\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-5\">\n");
      out.write("                            <div class=\"input-group has-error\">\n");
      out.write("                                <div class=\"input-group-addon\">相對濕度</div>\n");
      out.write("                                <input class=\"form-control measure\" id=\"humid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bulletin.humid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <div class=\"input-group-addon\">％</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <div class=\"input-group-addon\">舒適指標</div>\n");
      out.write("                                <input class=\"form-control comfort\" id=\"humidComfort\" placeholder=\"計算中\">\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"THBadgeContainer\" class=\"row\">\n");
      out.write("                                <div style=\"position:relative;height:30px;width:175px;color: rgba(0,0,0,0);float:left;\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-red\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-yellow\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-green\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-yellow\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                                <div class=\"color-badge comfort-red\"><i class=\"fa fa-smile-o\"></i></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-1\">\n");
      out.write("                            <img src=\"images/humid.png\" alt=\"\" style=\"height:150px;\">    \n");
      out.write("                        </div>\n");
      out.write("                    </div> <!--row-->\n");
      out.write("                </div><!-- col-lg-10 -->\n");
      out.write("            </div>\n");
      out.write("        </div><!-- container -->\n");
      out.write("        <script src=\"bulletin.js\"></script>\n");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("GetRoomInfoAction");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }
}
