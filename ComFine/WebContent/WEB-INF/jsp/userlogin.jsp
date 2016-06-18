<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>用户登录</title>
<link href="./resources/css/header.css" rel="stylesheet">
<style>
	*{
		padding:0px;
		margin:0px;
		border:none;
	}
	body{
		background:#edeced;
	}
	.container{
			height:700px;
			margin:0px auto;
		}
	.content{
		height:500px;
		text-align:center;
	}
	.title{
		font-size:25px;
		color:#47cc8c;
		margin-top:15px;
	}
	.login_panel{
		margin-left:auto;
		margin-right:auto;
		margin-top:82px;
		background:white;
		padding:9px;
		width:386px;
		height:430px;
		border-radius:5px;
		
	}
	.pic{
		margin:0px auto;
		text-align:center;
		margin-top:30px;
	}
	.pic{
		width:60px;
		height:60px;
		border-radius:60px;
		background:#47cc8c;
	}
	table{
		 text-align:left;
		width:280px;
		color:#47cc8c;
		margin:15px auto;
	}
	table label{
		padding-right:10px;
		font-size:15px;
		position:relative;
		top:10px;
	}
	table input{
		width:216px;
		height:36px;
		border: 1px solid #47cc8c;
		margin-top:24px;
		border-radius:2px;
		padding:2px;
		font-size:13px;
	}
	#btn_next{
		margin-top:40px;
		width:290px;
		color:white;
		background:#47cc8c;

	}
	#btn_next:hover{
		width:290px;
		color:white;
		background:#47c18c;

	}
	#va_info{
		font-size:12px;
		color:red;
		text-align:center;
	}
	.forgetpwd{
		font-size:12px;
		color:#47cc8c;
		position:relative;
		top:15px;
	}
	.footer{
		height:50px;
		text-align:center;
		font-size:12px;
		color:#acacac;
	}
	
</style>
</head>
<div class="container">
	<%@include file="header.jsp" %>
    <div class="content">
		<div class="login_panel">
			<p class="title">登录</p>
			<div class="user_pic">
				<div class="pic">
				</div>
			</div>
			<div>
			
				<table>
				<tbody>
					<form method="post" action="dologin">
					<tr>
						<td>
							<label>用户名</label>
						</td>
						<td>
							<input type="text" name="userName" id="userName"/>
						</td>
					</tr>
						
					<tr>
						<td>
							<label> 密&nbsp;码</label>
						</td>
						<td>
							<input type="password" name="userPwd" id="userPwd"/>
						</td>
					</tr>
					<tr>
						<td colspan="2"]>
							<p id="va_info">${info}<p>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit"  id="btn_next" value="登录"/>
						</td>
					</tr>
					<tr>
						<td><a class="forgetpwd" href="#">忘记密码</a></td>
					</tr>
					</from>
					</tbody>
				</table>
			</div>
		</div>
    </div>
    <div class="footer">
		<p class="copyinfo">版权所有2016ComFine。保留所有权利。</p>
    </div>
</div>
<body>
</body>
</html>




