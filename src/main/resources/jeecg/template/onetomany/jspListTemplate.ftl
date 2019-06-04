<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="${entityName?uncap_first}List" fitColumns="true" title="${ftl_description}" actionUrl="${entityName?uncap_first}Controller.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
  <#list columns as po>
   <t:dgCol title="${po.filedComment}" field="${po.fieldName}" <#if po.fieldType?index_of("time")!=-1>formatter="yyyy-MM-dd hh:mm:ss"<#else><#if po.fieldType?index_of("date")!=-1>formatter="yyyy-MM-dd"</#if></#if>></t:dgCol>
  </#list>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="${entityName?uncap_first}Controller.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="${entityName?uncap_first}Controller.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="${entityName?uncap_first}Controller.do?addorupdate" funname="update"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>