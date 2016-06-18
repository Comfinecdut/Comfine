<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册</title>
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
			height:849px;
			margin:0px auto;
		}
	
	.content{
		height:600px;
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
		height:524px;
		border-radius:5px;
		
	}
	.pic{
		margin:0px auto;
		text-align:center;
	}
	.pic{
		width:50px;
		height:50px;
		border-radius:50px;
		background:#47cc8c;
	}
	#up_pic{
		margin-top:15px;
		width:60px;
		padding:5px 0px;
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
	.footer{
		height:50px;
		text-align:center;
	}
	
</style>
</head>
<div class="container">
	<%@include file="header.jsp" %>
    <div class="content">
		<div class="login_panel">
			<p class="title">用户注册</p>
			<div class="user_pic">
				<div class="pic">
				</div>
				<button id="up_pic">上传</button>
			</div>
			<div>
			
				<table>
				<tbody>
					<form method="post" action="adduser">
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
						<td>
							<label>手&nbsp;机</label>
						</td>
						<td>
							<input type="text" name="tel" id="tel"/>
						</td>
					</tr>
					<tr>
						<td>
							<label>验证码</label>
						</td>
						<td>
							<input type="text" name="vacode" id="vacode"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<p id="va_info">${info}<p>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit"  id="btn_next" value="下一步"/>
						</td>
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



