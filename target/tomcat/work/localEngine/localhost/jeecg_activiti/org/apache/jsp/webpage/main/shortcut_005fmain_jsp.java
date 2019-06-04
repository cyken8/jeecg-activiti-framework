package org.apache.jsp.webpage.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shortcut_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>JEECG 微云快速开发平台</title>\r\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/favicon.ico\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a {\r\n");
      out.write("\tcolor: Black;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#layout_jeecg_onlineDatagrid').datagrid({\r\n");
      out.write("\t\t\turl : 'systemController.do?datagridOnline&field=ip,logindatetime,user.userName,',\r\n");
      out.write("\t\t\ttitle : '',\r\n");
      out.write("\t\t\ticonCls : '',\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\tpageSize : 10,\r\n");
      out.write("\t\t\tpageList : [ 10 ],\r\n");
      out.write("\t\t\tnowarp : false,\r\n");
      out.write("\t\t\tborder : false,\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\tsortName : 'logindatetime',\r\n");
      out.write("\t\t\tsortOrder : 'desc',\r\n");
      out.write("\t\t\tfrozenColumns : [ [ {\r\n");
      out.write("\t\t\t\ttitle : '编号',\r\n");
      out.write("\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\thidden : true\r\n");
      out.write("\t\t\t} ] ],\r\n");
      out.write("\t\t\tcolumns : [ [ {\r\n");
      out.write("\t\t\t\ttitle : '登录名',\r\n");
      out.write("\t\t\t\tfield : 'user.userName',\r\n");
      out.write("\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\tformatter : function(value, rowData, rowIndex) {\r\n");
      out.write("\t\t\t\t\treturn formatString('<span title=\"{0}\">{1}</span>', value, value);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\ttitle : 'IP',\r\n");
      out.write("\t\t\t\tfield : 'ip',\r\n");
      out.write("\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\tformatter : function(value, rowData, rowIndex) {\r\n");
      out.write("\t\t\t\t\treturn formatString('<span title=\"{0}\">{1}</span>', value, value);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\ttitle : '登录时间',\r\n");
      out.write("\t\t\t\tfield : 'logindatetime',\r\n");
      out.write("\t\t\t\twidth : 150,\r\n");
      out.write("\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\tformatter : function(value, rowData, rowIndex) {\r\n");
      out.write("\t\t\t\t\treturn formatString('<span title=\"{0}\">{1}</span>', value, value);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\thidden : true\r\n");
      out.write("\t\t\t} ] ],\r\n");
      out.write("\t\t\tonClickRow : function(rowIndex, rowData) {\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t$('#layout_jeecg_onlinePanel').panel('setTitle', '( ' + data.total + ' )人在线');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}).datagrid('getPager').pagination({\r\n");
      out.write("\t\t\tshowPageList : false,\r\n");
      out.write("\t\t\tshowRefresh : false,\r\n");
      out.write("\t\t\tbeforePageText : '',\r\n");
      out.write("\t\t\tafterPageText : '/{pages}',\r\n");
      out.write("\t\t\tdisplayMsg : ''\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#layout_jeecg_onlinePanel').panel({\r\n");
      out.write("\t\t\ttools : [ {\r\n");
      out.write("\t\t\t\ticonCls : 'icon-reload',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t$('#layout_jeecg_onlineDatagrid').datagrid('load', {});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#layout_east_calendar').calendar({\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tcurrent : new Date(),\r\n");
      out.write("\t\t\tborder : false,\r\n");
      out.write("\t\t\tonSelect : function(date) {\r\n");
      out.write("\t\t\t\t$(this).calendar('moveTo', new Date());\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\".layout-expand\").click(function(){\r\n");
      out.write("\t\t\t$('#layout_east_calendar').css(\"width\",\"auto\");\r\n");
      out.write("\t\t\t$('#layout_east_calendar').parent().css(\"width\",\"auto\");\r\n");
      out.write("\t\t\t$(\"#layout_jeecg_onlinePanel\").find(\".datagrid-view\").css(\"max-height\",\"200px\");\r\n");
      out.write("\t\t\t$(\"#layout_jeecg_onlinePanel .datagrid-view .datagrid-view2 .datagrid-body\").css(\"max-height\",\"180px\").css(\"overflow-y\",\"auto\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\tvar onlineInterval;\r\n");
      out.write("\t\r\n");
      out.write("\tfunction easyPanelCollapase(){\r\n");
      out.write("\t\twindow.clearTimeout(onlineInterval);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction easyPanelExpand(){\r\n");
      out.write("\t\tonlineInterval = window.setInterval(function() {\r\n");
      out.write("\t\t\t$('#layout_jeecg_onlineDatagrid').datagrid('load', {});\r\n");
      out.write("\t\t}, 1000 * 20);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"overflow-y: hidden\" scroll=\"no\">\r\n");
      out.write("<!-- 顶部-->\r\n");
      out.write("<div region=\"north\" border=\"false\" title=\"\" style=\"BACKGROUND: #A8D7E9; height: 105px; padding: 1px; overflow: hidden;\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"left\" style=\"vertical-align: text-bottom\"><img src=\"plug-in/login/images/logo.jpg\"> <!--\r\n");
      out.write("\t\t        <img src=\"plug-in/login/images/toplogo.png\" width=\"550\" height=\"52\" alt=\"\">-->\r\n");
      out.write("\t\t<div style=\"position: absolute; top: 78px; left: 33px;\">JEECG Framework <span style=\"letter-spacing: -1px;\">3.4.3 GA</span></div>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td align=\"right\" nowrap>\r\n");
      out.write("\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t<tr style=\"height: 25px;\" align=\"right\">\r\n");
      out.write("\t\t\t\t<td style=\"\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t<div style=\"background: url(plug-in/login/images/top_bg.jpg) no-repeat right center; float: right;\">\r\n");
      out.write("\t\t\t\t<div style=\"float: left; line-height: 25px; margin-left: 70px;\"><span style=\"color: #386780\">当前用户:</span> <span style=\"color: #FFFFFF\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>&nbsp;&nbsp;&nbsp;&nbsp; <span\r\n");
      out.write("\t\t\t\t\tstyle=\"color: #386780\">职务:</span> <span style=\"color: #FFFFFF\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${roleName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></div>\r\n");
      out.write("\t\t\t\t<div style=\"float: left; margin-left: 18px;\">\r\n");
      out.write("\t\t\t\t<div style=\"right: 0px; bottom: 0px;\"><a href=\"javascript:void(0);\" class=\"easyui-menubutton\" menu=\"#layout_north_kzmbMenu\" iconCls=\"icon-comturn\" style=\"color: #FFFFFF\">控制面板</a>&nbsp;&nbsp;<a\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0);\" class=\"easyui-menubutton\" menu=\"#layout_north_zxMenu\" iconCls=\"icon-exit\" style=\"color: #FFFFFF\">注销</a></div>\r\n");
      out.write("\t\t\t\t<div id=\"layout_north_kzmbMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("\t\t\t\t\t<div onclick=\"openwindow('用户信息','userController.do?userinfo')\">个人信息</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t\t\t\t<div onclick=\"add('修改密码','userController.do?changepassword')\">修改密码</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"menu-sep\"></div>\t\r\n");
      out.write("\t\t\t\t\t<div onclick=\"add('修改首页风格','userController.do?changestyle')\">首页风格</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"layout_north_zxMenu\" style=\"width: 100px; display: none;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"menu-sep\"></div>\r\n");
      out.write("\t\t\t\t\t<div onclick=\"exit('loginController.do?logout','确定退出该系统吗 ?',1);\">退出系统</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr style=\"height: 80px;\">\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<ul class=\"shortcut\">\r\n");
      out.write("\t\t\t\t\t<!-- 动态生成并赋值过来 -->\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${primaryMenuList }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 左侧-->\r\n");
      out.write("<div region=\"west\" split=\"true\" href=\"loginController.do?shortcut_top\" title=\"导航菜单\" style=\"width: 150px; padding: 1px;\"></div>\r\n");
      out.write("<!-- 中间-->\r\n");
      out.write("<div id=\"mainPanle\" region=\"center\" style=\"overflow: hidden;\">\r\n");
      out.write("<div id=\"maintabs\" class=\"easyui-tabs\" fit=\"true\" border=\"false\">\r\n");
      out.write("<div class=\"easyui-tab\" title=\"首页\" href=\"loginController.do?home\" style=\"padding: 2px; overflow: hidden;\"></div>\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 右侧 -->\r\n");
      out.write("<div collapsed=\"true\" region=\"east\" iconCls=\"icon-reload\" title=\"辅助工具\" split=\"true\" style=\"width: 190px;\"\r\n");
      out.write("\tdata-options=\"onCollapse:function(){easyPanelCollapase()},onExpand:function(){easyPanelExpand()}\">\r\n");
      out.write("<div id=\"tabs\" class=\"easyui-tabs\" border=\"false\" style=\"height: 240px\">\r\n");
      out.write("<div title=\"日历\" style=\"padding: 0px; overflow: hidden; color: red;\">\r\n");
      out.write("<div id=\"layout_east_calendar\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"layout_jeecg_onlinePanel\" data-options=\"fit:true,border:false\" title=\"用户在线列表\">\r\n");
      out.write("<table id=\"layout_jeecg_onlineDatagrid\"></table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 底部 -->\r\n");
      out.write("<div region=\"south\" border=\"false\" style=\"height: 25px; overflow: hidden;\">\r\n");
      out.write("<div align=\"center\" style=\"color: #1fa3e5; padding-top: 2px\">&copy; 版权所有 <span class=\"tip\"><a href=\"http://www.jeecg.org\" title=\"JEECG Framework 3.4.3 GA版本\">JEECG Framework 3.4.3GA</a> (推荐谷歌浏览器，获得更快响应速度) 技术支持:<a href=\"#\" title=\"JEECG Framework 3.4.3 GA版本\">JEECG Framework 3.4.3 GA</a> </span></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"mm\" class=\"easyui-menu\" style=\"width: 150px;\">\r\n");
      out.write("<div id=\"mm-tabupdate\">刷新</div>\r\n");
      out.write("<div id=\"mm-tabclose\">关闭</div>\r\n");
      out.write("<div id=\"mm-tabcloseall\">全部关闭</div>\r\n");
      out.write("<div id=\"mm-tabcloseother\">除此之外全部关闭</div>\r\n");
      out.write("<div class=\"menu-sep\"></div>\r\n");
      out.write("<div id=\"mm-tabcloseright\">当前页右侧全部关闭</div>\r\n");
      out.write("<div id=\"mm-tabcloseleft\">当前页左侧全部关闭</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/main/shortcut_main.jsp(7,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools,DatePicker,autocomplete");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /webpage/main/shortcut_main.jsp(174,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map=='1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<div class=\"easyui-tab\" title=\"地图\" style=\"padding: 1px; overflow: hidden;\"><iframe name=\"myMap\" id=\"myMap\" scrolling=\"no\" frameborder=\"0\" src=\"mapController.do?map\"\r\n");
        out.write("\t\tstyle=\"width: 100%; height: 99.5%;\"></iframe></div>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
