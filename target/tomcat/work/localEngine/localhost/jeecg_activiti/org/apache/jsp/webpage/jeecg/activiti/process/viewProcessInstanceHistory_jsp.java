package org.apache.jsp.webpage.jeecg.activiti.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class viewProcessInstanceHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
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
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("<div region=\"center\" style=\"padding: 1px;\">\r\n");
      out.write("\t<img src=\"activitiController.do?traceImage&processInstanceId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${processInstanceId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&isIframe\">\r\n");
      out.write("</div>\r\n");
      out.write("<div data-options=\"region:'south',split:true\" style=\"height:180px;\">\r\n");
      out.write("\t<table id=\"taskHistoryList\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th field=\"name\">名称</th>\r\n");
      out.write("\t\t\t\t<th field=\"processInstanceId\" width=\"50\">流程实例ID</th>\r\n");
      out.write("\t\t\t\t<th field=\"startTime\" width=\"50\">开始时间</th>\r\n");
      out.write("\t\t\t\t<th field=\"endTime\" width=\"50\">结束时间</th>\r\n");
      out.write("\t\t\t\t<th field=\"assignee\" width=\"50\">负责人</th>\r\n");
      out.write("\t\t\t\t<th field=\"deleteReason\" width=\"50\">处理结果</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t    // 编辑初始化数据\r\n");
      out.write("\t\tfunction getData(data){\r\n");
      out.write("\t\t\tvar rows = [];\t\t\t\r\n");
      out.write("\t\t\tvar total = data.total;\r\n");
      out.write("\t\t\tfor(var i=0; i<data.rows.length; i++){\r\n");
      out.write("\t\t\t\trows.push({\r\n");
      out.write("\t\t\t\t\tname: data.rows[i].name,\r\n");
      out.write("\t\t\t\t\tprocessInstanceId: data.rows[i].processInstanceId,\r\n");
      out.write("\t\t\t\t\tstartTime: data.rows[i].startTime,\r\n");
      out.write("\t\t\t\t\tendTime: data.rows[i].endTime,\r\n");
      out.write("\t\t\t\t\tassignee: data.rows[i].assignee,\r\n");
      out.write("\t\t\t\t\tdeleteReason: data.rows[i].deleteReason\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar newData={\"total\":total,\"rows\":rows};\r\n");
      out.write("\t\t\treturn newData;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    \r\n");
      out.write("\t\t// 设置datagrid属性\r\n");
      out.write("\t\t$('#taskHistoryList').datagrid({\r\n");
      out.write("\t\t\ttitle: '流程历史跟踪',\r\n");
      out.write("\t        idField: 'id',\r\n");
      out.write("\t        fit:true,\r\n");
      out.write("\t        loadMsg: '数据加载中...',\r\n");
      out.write("\t        pageSize: 10,\r\n");
      out.write("\t        pagination:true,\r\n");
      out.write("\t        sortOrder:'asc',\r\n");
      out.write("\t        rownumbers:true,\r\n");
      out.write("\t        singleSelect:true,\r\n");
      out.write("\t        fitColumns:true,\r\n");
      out.write("\t        showFooter:true,\r\n");
      out.write("\t        url:'activitiController.do?taskHistoryList&processInstanceId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${processInstanceId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',  \r\n");
      out.write("\t        loadFilter: function(data){\r\n");
      out.write("\t        \treturn getData(data);\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t        \r\n");
      out.write("\t    }); \r\n");
      out.write("\t    //设置分页控件  \r\n");
      out.write("\t    $('#taskHistoryList').datagrid('getPager').pagination({  \r\n");
      out.write("\t        pageSize: 10,  \r\n");
      out.write("\t        pageList: [10,20,30],  \r\n");
      out.write("\t        beforePageText: '',  \r\n");
      out.write("\t        afterPageText: '/{pages}',\r\n");
      out.write("\t        displayMsg: '{from}-{to}共{total}条',\r\n");
      out.write("\t        showPageList:true,\r\n");
      out.write("\t        showRefresh:true,\r\n");
      out.write("\t        onBeforeRefresh:function(pageNumber, pageSize){\r\n");
      out.write("\t            $(this).pagination('loading');\r\n");
      out.write("\t            $(this).pagination('loaded');\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t</script>\r\n");
      out.write("</div>\r\n");
      out.write("</div>");
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
    // /webpage/jeecg/activiti/process/viewProcessInstanceHistory.jsp(3,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }
}
