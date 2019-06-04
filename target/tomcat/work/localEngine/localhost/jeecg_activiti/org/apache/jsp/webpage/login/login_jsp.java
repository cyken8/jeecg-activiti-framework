package org.apache.jsp.webpage.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/fc/images/icon/favicon.ico\">\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("   <script src=\"plug-in/login/js/html5.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("<!--[if lt IE 7]>\r\n");
      out.write("  <script src=\"plug-in/login/js/iepng.js\" type=\"text/javascript\"></script>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("\tEvPNG.fix('div, ul, img, li, input'); //EvPNG.fix('包含透明PNG图片的标签'); 多个标签之间用英文逗号隔开。\r\n");
      out.write("</script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("<link href=\"plug-in/login/css/zice.style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"plug-in/login/css/buttons.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"plug-in/login/css/icon.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/login/css/tipsy.css\" media=\"all\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("html {\r\n");
      out.write("\tbackground-image: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label.iPhoneCheckLabelOn span {\r\n");
      out.write("\tpadding-left: 0px\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#versionBar {\r\n");
      out.write("\tbackground-color: #212121;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 35px;\r\n");
      out.write("\tz-index: 11;\r\n");
      out.write("\t-webkit-box-shadow: black 0px 10px 10px -10px inset;\r\n");
      out.write("\t-moz-box-shadow: black 0px 10px 10px -10px inset;\r\n");
      out.write("\tbox-shadow: black 0px 10px 10px -10px inset;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".copyright {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 10px;\r\n");
      out.write("\tcolor: #CCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".copyright a {\r\n");
      out.write("\tcolor: #A31F1A;\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".on_off_checkbox {\r\n");
      out.write("\twidth: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login .logo {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 51px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"alertMessage\"></div>\r\n");
      out.write("<div id=\"successLogin\"></div>\r\n");
      out.write("<div class=\"text_success\"><img src=\"plug-in/login/images/loader_green.gif\" alt=\"Please wait\" /> <span>登陆成功!请稍后....</span></div>\r\n");
      out.write("<div id=\"login\">\r\n");
      out.write("<div class=\"ribbon\" style=\"background-image: url(plug-in/login/images/typelogin.png);\"></div>\r\n");
      out.write("<div class=\"inner\">\r\n");
      out.write("<div class=\"logo\"><img src=\"plug-in/login/images/head.png\" /><img src=\"plug-in/login/images/foot.png\" /></div>\r\n");
      out.write("<div class=\"formLogin\">\r\n");
      out.write("<form name=\"formLogin\" id=\"formLogin\" action=\"loginController.do?login\" check=\"loginController.do?checkuser\" method=\"post\"><input name=\"userKey\" type=\"hidden\" id=\"userKey\"\r\n");
      out.write("\tvalue=\"D1B5CC2FE46C4CC983C073BCA897935608D926CD32992B5900\" />\r\n");
      out.write("<div class=\"tip\"><input class=\"userName\" name=\"userName\" type=\"text\" id=\"userName\" title=\"用户名\" iscookie=\"true\" value=\"admin\" nullmsg=\"请输入用户名!\" /></div>\r\n");
      out.write("<div class=\"tip\"><input class=\"password\" name=\"password\" type=\"password\" id=\"password\" title=\"密码\" value=\"123456\" nullmsg=\"请输入密码!\" /></div>\r\n");
      out.write("<div class=\"loginButton\">\r\n");
      out.write("<div style=\"float: left; margin-left: -9px;\"><input type=\"checkbox\" id=\"on_off\" name=\"remember\" checked=\"ture\" class=\"on_off_checkbox\" value=\"0\" /> <span class=\"f_help\">是否记住用户名 ?</span></div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"float: right; padding: 3px 0; margin-right: -12px;\">\r\n");
      out.write("<div>\r\n");
      out.write("<ul class=\"uibutton-group\">\r\n");
      out.write("\t<li><a class=\"uibutton normal\" href=\"#\" id=\"but_login\">登陆</a></li>\r\n");
      out.write("\t<li><a class=\"uibutton normal\" href=\"#\" id=\"forgetpass\">重置</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"float: left; margin-left: 30px;\"><a href=\"init.jsp\"><span class=\"f_help\">是否初始化数据</span></a></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"shadow\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--Login div-->\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<div id=\"versionBar\">\r\n");
      out.write("<div class=\"copyright\">&copy; 版权所有 <span class=\"tip\"><a href=\"#\" title=\"JEECG 微云快速开发平台\">jeecg</a> (推荐使用IE8+,谷歌浏览器可以获得更快,更安全的页面响应速度)技术支持:<a href=\"#\" title=\"JEECG 微云快速开发平台\">jeecg</a></span></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Link JScript-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery.cookie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/jquery-jrumble.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/jquery.tipsy.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/iphone.check.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/login/js/login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/lhgDialog/lhgdialog.min.js\"></script>\r\n");
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
