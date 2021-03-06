<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员登录页面</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp"%>


</head>
<script>

</script>
<body>
		<div id="adminlogin_header">
			<img class="logo_img" alt="" src="static/img/logo.jpg" >
		</div>
		
			<div class="adminlogin_banner">
			
				<div id="l_content">
					<span class="adminlogin_word">欢迎登录</span>
				</div>
				
				<div id="content">
					<div class="login_for m">
						<div class="login_box">
							<div class="tit">
								<h1>管理员登录</h1>
<%--
								<a href="pages/user/regist.jsp">立即注册</a>
--%>
							</div>
							<div class="msg_cont">
								<b></b>
								<span class="errorMsg">
									${ empty requestScope.msg ? "请输入用户名和密码":requestScope.msg }
								</span>
							</div>
							<div class="form">
								<form action="adminServlet" method="post">
									<input type="hidden" name="action" value="login" />
									<label>用户名称：</label>
									<input class="itxt" type="text" placeholder="请输入用户名"
										   autocomplete="off" tabindex="1" name="adminname"
										   value="${requestScope.adminname}" />
									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入密码"
										   autocomplete="off" tabindex="1" name="password" />
									<br />
									<br />
									<input type="submit" value="登录" id="sub_btn" />
								</form>
							</div>
							
						</div>
					</div>
				</div>
			</div>

		<%--静态包含页脚内容--%>
		<%@include file="/pages/common/footer.jsp"%>


</body>
</html>