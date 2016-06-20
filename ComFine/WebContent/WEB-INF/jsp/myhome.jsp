<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="./resources/css/header.css" rel="stylesheet">
<title>我的主页 </title>
</head>
<script>
	
</script>
<style>
	*{
		margin:0px;
		padding:0px;
		border:none;
	}
	body{
		background:#edeced;
	}
	.content{
		width:980px;
		margin:0 auto;
		margin-top:70px;
		
	}
	.home_menu{
		font-size:13px;
		color:black;
		width:125px;
		height:425px;
		padding:25px;
		margin-right:50px;
		background:white;
	}
	.fl{
		float:left;
	}
	.home_menu ul{
		list-style:none;
		text-align:left;
	}
	.home_menu li{
		line-height:15px;
		padding:10px;
	}
	.home_content{
		width:655px;
		height:425px;
		padding:25px;
		background:white;
		text-align:center;
		font-size:13px;
	}
	.bold{
		text-style:bold;
	}
	.myacount{
		margin-top:20px;
	}
	.username{
		width:90px;
		position:relative;
		top:8px;
		text-align:center;
		font-weight:600;
		font-size:14px;
	}
	.na_pic{
		width:90px;
		text-align:center;
	}
</style>
<body>
<%@include file="header.jsp" %>
<div class="content">
	<div class="home_menu fl">
		<ul>
		<li><a href="">我的订单</a></li>
		<li><a href="">我的服务</a></li>
		<li><a href="">个人信息</a></li>
		<li class="myacount bold">我的账户</li>
			<ul> 
				<li><a href="">账户信息</a></li>
				<li><a href="">我的余额</a></li>
				<li><a href="">修改密码</a></li>
			</ul>
		</ul>
	</div>
	<div class="home_content fl">
		<div class="user_info">
			 <div class="na_pic">
  					<p><img class="usrface" src="../../img/91218.png" width="78" height="78" alt=""/></p>
  					<span class="username">PeterYeasdfgh</span>
  			</div>
		</div>
	</div>
</div>
<div class="footer">
	
</div>
</body>
</html>