<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid fitColumns="false" checkbox="true" name="${entityName?uncap_first}List" title="${ftl_description}" actionUrl="${entityName?uncap_first}Controller.do?datagrid" idField="id" fit="true" queryMode="group">
  <#list columns as po>
   <t:dgCol title="${po.content}"  field="${po.fieldName}" <#if po.showType?index_of("datetime")!=-1>formatter="yyyy-MM-dd hh:mm:ss"<#else><#if po.showType?index_of("date")!=-1>formatter="yyyy-MM-dd"</#if></#if> <#if po.isShowList?if_exists?html =='N'>hidden="false"<#else>hidden="true"</#if> <#if po.isQuery =='Y'>query="true"</#if> <#if po.queryMode =='single'>queryMode="single"<#elseif po.queryMode =='group'>queryMode="group"</#if> <#if po.dictTable?if_exists?html!="">dictionary="${po.dictTable},${po.dictField},${po.dictText}"<#else><#if po.dictTable?if_exists?html=="" && po.dictField?if_exists?html!="">dictionary="${po.dictField}"</#if></#if> width="${po.fieldLength}"></t:dgCol>
  </#list>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="${entityName?uncap_first}Controller.do?doDel&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="${entityName?uncap_first}Controller.do?goAdd" funname="add" height="450"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="${entityName?uncap_first}Controller.do?goUpdate" funname="update" height="450"></t:dgToolBar>
   <t:dgToolBar title="批量删除"  icon="icon-remove" url="${entityName?uncap_first}Controller.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="${entityName?uncap_first}Controller.do?goUpdate" funname="detail" height="450"></t:dgToolBar>
   <#list buttons as btn>
   <#if btn.buttonStyle =='button' && btn.buttonStatus == '1'>
   	<t:dgToolBar title="${btn.buttonName}" icon="${btn.buttonIcon}" <#if btn.optType=='action'> url="${entityName?uncap_first}Controller.do?do${btn.buttonCode?cap_first}" funname="do${btn.buttonCode?cap_first}"<#else> funname="${btn.buttonCode}"</#if> ></t:dgToolBar>
  	</#if>
   </#list> 
  </t:datagrid>
  </div>
 </div>
 <script src = "webpage/${bussiPackage?replace('.','/')}/${entityPackage}/${entityName?uncap_first}List.js"></script>		
 <script type="text/javascript">
  $(document).ready(function(){
 		//给时间控件加上样式
 		<#list columns as po>
 		<#if (po.showType?index_of("datetime")!=-1 || po.showType?index_of("date")!=-1) && po.queryMode=="single">
 			$("#${entityName?uncap_first}Listtb").find("input[name='${po.fieldName}']").attr("class","Wdate").attr("style","height:20px;width:90px;").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 		<#else>
 		<#if (po.showType?index_of("datetime")!=-1 || po.showType?index_of("date")!=-1) && po.queryMode=="group">
 			$("#${entityName?uncap_first}Listtb").find("input[name='${po.fieldName}_begin']").attr("class","Wdate").attr("style","height:20px;width:90px;").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 			$("#${entityName?uncap_first}Listtb").find("input[name='${po.fieldName}_end']").attr("class","Wdate").attr("style","height:20px;width:90px;").click(function(){WdatePicker({dateFmt:'yyyy-MM-dd'});});
 		</#if>
 		</#if>
		</#list>
 });
 <#list buttons as btn>
 	<#if btn.buttonStyle =='button' && btn.optType=='action'>
 	//自定义按钮-sql增强-${btn.buttonName}
 	function do${btn.buttonCode?cap_first}(title,url,id){
 		var rowData = $('#'+id).datagrid('getSelected');
		if (!rowData) {
			tip('请选择${btn.buttonName}项目');
			return;
		}
		url = url+"&id="+rowData['id'];
 		createdialog('确认 ', '确定'+title+'吗 ?', url,gridname);
 	}
 	</#if>
 </#list> 
 </script>