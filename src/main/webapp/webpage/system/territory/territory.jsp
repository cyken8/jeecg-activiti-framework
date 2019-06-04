<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>地域信息</title>
<t:base type="jquery,easyui,tools"></t:base>
<script type="text/javascript">
		
	$(function() {
		$('#cc').combotree({
			url : 'territoryController.do?setPTerritory',
			panelHeight:'auto',
			onClick: function(node){
				$("#territoryId").val(node.id);
			}
		});
		
		if($('#territoryLevel').val()=='1'){
			$('#pfun').show();
		}else{
			$('#pfun').hide();
		}
		
		
		$('#territoryLevel').change(function(){
			if($(this).val()=='1'){
				$('#pfun').show();
				var t = $('#cc').combotree('tree');
				var nodes = t.tree('getRoots');
				if(nodes.length>0){
					$('#cc').combotree('setValue', nodes[0].id);
					$("#territoryId").val(nodes[0].id);
				}
			}else{
				var t = $('#cc').combotree('tree');
				var node = t.tree('getSelected');
				if(node){
					$('#cc').combotree('setValue', null);
				}
				$('#pfun').hide();
			}
		});
	});
</script>
</head>
<body style="overflow-y: hidden" scroll="no">
<t:formvalid formid="formobj" layout="div" dialog="true" refresh="true" action="territoryController.do?saveTerritory">
	<input name="id" type="hidden" value="${territory.id}">
	<fieldset class="step">
	<div class="form"><label class="Validform_label"> 地域名称: </label> <input name="territoryName" class="inputxt" value="${territory.territoryName}" datatype="s2-15"> <span
		class="Validform_checktip">地域名称范围2~15位字符,且不为空</span></div>
	<div class="form"><label class="Validform_label"> 地域等级: </label> <select name="territoryLevel" id="territoryLevel" datatype="*">
		<option value="0" <c:if test="${territory.territoryLevel eq 0}">selected="selected"</c:if>>一级地域</option>
		<option value="1" <c:if test="${territory.territoryLevel>0}"> selected="selected"</c:if>>下级地域</option>
	</select> <span class="Validform_checktip"></span></div>
	<div class="form" id="pfun"><label class="Validform_label"> 父地域: </label> <input id="cc"
		<c:if test="${territory.TSTerritory.territoryLevel eq 0}">
					value="${territory.TSTerritory.id}"</c:if>
		<c:if test="${territory.TSTerritory.territoryLevel > 0}">
					value="${territory.TSTerritory.territoryName}"</c:if>> <input id="territoryId" name="TSTerritory.id" style="display: none;"
		value="${territory.TSTerritory.id}"></div>
	<div class="form" id="funorder"><label class="Validform_label"> 区域码: </label> <input name="territoryCode" class="inputxt" value="${territory.territoryCode}" datatype="*6-16"></div>
	<div class="form" id="funorder"><label class="Validform_label"> 显示顺序: </label> <input name="territorySort" class="inputxt" value="${territory.territorySort}" datatype="n1-3"></div>
	</fieldset>
</t:formvalid>
</body>
</html>
