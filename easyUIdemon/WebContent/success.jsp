<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
<script type="text/javascript" src="easyUI/jquery.min.js"></script>
<script type="text/javascript" src="easyUI/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyUI/locale/easyui-lang-zh_Cn.js"></script>
</head>
<body>
<h1>success</h1>
${sessionScope.dbUser.name }

<div id="fengye">
	<table url="selectNews.do" iconCls="icon-save" pagination="true" id="tt" title="博文信息" class="easyui-datagrid" style="width: 550px;height: 250px;">
		<thead>
			<tr>
				<th field="id" width="80px">序号</th>
				<th field="title" width="140">标题</th>
				<th field="publishdate" width="80">发布日期</th>
				<th field="browsecount" width="80">浏览次数</th>
				<th field="name" width="100">发帖人</th>
			</tr>
		</thead>
		<tbody>
			<tr>
							
			</tr>
		</tbody>
	</table>
</div>
</body>
</html>