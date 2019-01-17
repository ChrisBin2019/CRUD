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

<script type="text/javascript" src="script/index.js"></script>
</head>
<body>
	<div id="window" class="easyui-window" title="登录" style="width: 300px;height: 180px;">
		<form action="login.do" method="post" style="padding: 10px 20px 10px 40px;">
			<p>邮箱：<input class="easyui-validatebox" type="text" name="email" id="email" required="true"/></p>
			<p>密码：<input class="easyui-validatebox" type="text" name="passWord" id="passWord" required="true"/></p>
			<div style="padding: 5px;text-align: center;">
				<a id="submit" href="#" class="easyui-linkbutton" icon="icon-ok">登录</a>
				<a id="cancel" href="#" class="easyui-linkbutton" icon="icon-cancel">取消</a>
			</div>
		</form>
	</div>
</body>
</html>