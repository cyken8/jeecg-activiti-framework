package org.apache.jsp.webpage.jeecg.activiti.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class processlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("<div region=\"center\" style=\"padding: 1px;\">\r\n");
      out.write("<table id=\"processList\" style=\"width: 700px; height: 300px\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th field=\"id\" hidden=\"hidden\">编号</th>\r\n");
      out.write("\t\t\t<th field=\"processDefinitionId\" width=\"50\">ProcessDefinitionId</th>\r\n");
      out.write("\t\t\t<th field=\"deploymentId\" width=\"50\">DeploymentId</th>\r\n");
      out.write("\t\t\t<th field=\"name\" width=\"50\">流程名称</th>\r\n");
      out.write("\t\t\t<th field=\"key\" width=\"50\">KEY</th>\r\n");
      out.write("\t\t\t<th field=\"version\" width=\"20\">版本</th>\r\n");
      out.write("\t\t\t<th field=\"xml\" width=\"50\">流程文件</th>\r\n");
      out.write("\t\t\t<th field=\"image\" width=\"50\">流程图片</th>\r\n");
      out.write("\t\t\t<th field=\"isSuspended\" width=\"50\">是否挂起</th>\r\n");
      out.write("\t\t\t<th field=\"opt\" width=\"50\">操作</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t//查看流程xml或流程图片\r\n");
      out.write("\t\tfunction readProcessResouce(processDefinitionId,resourceType) {\r\n");
      out.write("\t\t\tvar url = \"\";\r\n");
      out.write("\t\t\tvar title = \"\";\r\n");
      out.write("\t\t\tif(resourceType == \"xml\"){\r\n");
      out.write("\t\t\t\ttitle = \"查看流程文件\";\r\n");
      out.write("\t\t\t\turl = \"activitiController.do?resourceRead&processDefinitionId=\"+processDefinitionId+\"&resourceType=xml&isIframe\"\r\n");
      out.write("\t\t\t\t//url = \"activitiController.do?resourceRead&processDefinitionId=vacation:1:10&resourceType=image&isIframe\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(resourceType == \"image\"){\r\n");
      out.write("\t\t\t\ttitle = \"查看流程图片\";\r\n");
      out.write("\t\t\t\turl = \"activitiController.do?resourceRead&processDefinitionId=\"+processDefinitionId+\"&resourceType=image&isIframe\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\taddOneTab(title, url);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t    // 编辑初始化数据\r\n");
      out.write("\t\tfunction getData(data){\r\n");
      out.write("\t\t\tvar rows = [];\t\t\t\r\n");
      out.write("\t\t\tvar total = data.total;\r\n");
      out.write("\t\t\tfor(var i=0; i<data.rows.length; i++){\r\n");
      out.write("\t\t\t\trows.push({\r\n");
      out.write("\t\t\t\t\tid: data.rows[i].id,\r\n");
      out.write("\t\t\t\t\tprocessDefinitionId: data.rows[i].processDefinitionId,\r\n");
      out.write("\t\t\t\t\tdeploymentId: data.rows[i].deploymentId,\r\n");
      out.write("\t\t\t\t\tname: data.rows[i].name,\r\n");
      out.write("\t\t\t\t\tkey: data.rows[i].key,\r\n");
      out.write("\t\t\t\t\tversion: data.rows[i].version,\r\n");
      out.write("\t\t\t\t\txml: \"[<a href=\\\"#\\\" onclick=\\\"readProcessResouce('\"+data.rows[i].processDefinitionId+\"','xml')\\\">查看流程xml</a>]\",\r\n");
      out.write("\t\t\t\t\timage: \"[<a href=\\\"#\\\" onclick=\\\"readProcessResouce('\"+data.rows[i].processDefinitionId+\"','image')\\\">查看流程图片</a>]\",\r\n");
      out.write("\t\t\t\t\tisSuspended: data.rows[i].isSuspended,\r\n");
      out.write("\t\t\t\t\topt: \"[<a href=\\\"#\\\" onclick=\\\"delObj('activitiController.do?del&deploymentId=\"+data.rows[i].deploymentId+\"','processList')\\\">删除流程</a>]\"\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar newData={\"total\":total,\"rows\":rows};\r\n");
      out.write("\t\t\treturn newData;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    // 筛选\r\n");
      out.write("\t\tfunction jeecgEasyUIListsearchbox(value,name){\r\n");
      out.write("    \t\tvar queryParams=$('#processList').datagrid('options').queryParams;\r\n");
      out.write("    \t\tqueryParams[name]=value;\r\n");
      out.write("    \t\tqueryParams.searchfield=name;\r\n");
      out.write("    \t\t$('#processList').datagrid('load');\r\n");
      out.write("    \t}\r\n");
      out.write("\t    // 刷新\r\n");
      out.write("\t    function reloadTable(){\r\n");
      out.write("\t    \t$('#processList').datagrid('reload');\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t\t// 设置datagrid属性\r\n");
      out.write("\t\t$('#processList').datagrid({\r\n");
      out.write("\t\t\ttitle: '流程定义及部署管理',\r\n");
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
      out.write("\t        url:'activitiController.do?datagrid',  \r\n");
      out.write("\t        loadFilter: function(data){\r\n");
      out.write("\t        \treturn getData(data);\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t        \r\n");
      out.write("\t    }); \r\n");
      out.write("\t    //设置分页控件  \r\n");
      out.write("\t    $('#processList').datagrid('getPager').pagination({  \r\n");
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
      out.write("\t    // 设置筛选\r\n");
      out.write("    \t$('#jeecgEasyUIListsearchbox').searchbox({\r\n");
      out.write("    \t\tsearcher:function(value,name){\r\n");
      out.write("    \t\t\tjeecgEasyUIListsearchbox(value,name);\r\n");
      out.write("    \t\t},\r\n");
      out.write("    \t\tmenu:'#jeecgEasyUIListmm',\r\n");
      out.write("    \t\tprompt:'请输入查询关键字'\r\n");
      out.write("    \t});\r\n");
      out.write("\t</script></div>\r\n");
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
}
