<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
<div region="center" style="padding: 1px;"><t:datagrid name="jeecgOrderMainList" title="订单信息" actionUrl="jeecgOrderMainController.do?datagrid" idField="id" fit="true">
	<t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
	<t:dgCol title="订单号" frozenColumn="true" field="goOrderCode"></t:dgCol>
	<t:dgCol title="订单类型" field="goderType" replace="优质订单_1,普通订单_2"></t:dgCol>
	<t:dgCol title="顾客类型 " field="usertype" replace="签约客户_1,普通客户_2"></t:dgCol>
	<t:dgCol title="联系人" field="goContactName"></t:dgCol>
	<t:dgCol title="手机" field="goTelphone"></t:dgCol>
	<t:dgCol title="订单人数" field="goOrderCount"></t:dgCol>
	<t:dgCol title="总价(不含返款)" field="goAllPrice"></t:dgCol>
	<t:dgCol title="返款" field="goReturnPrice"></t:dgCol>
	<t:dgCol title="备注" field="goContent"></t:dgCol>
	<t:dgCol title="操作" field="opt" width="100"></t:dgCol>
	<t:dgDelOpt title="删除" url="jeecgOrderMainController.do?del&id={id}" />
	<t:dgToolBar title="录入" icon="icon-add" url="jeecgOrderMainController.do?addorupdate" funname="add" width="1000" height="400"></t:dgToolBar>
	<t:dgToolBar title="编辑" icon="icon-edit" url="jeecgOrderMainController.do?addorupdate" funname="update" width="1000" height="400"></t:dgToolBar>
</t:datagrid></div>
</div>

