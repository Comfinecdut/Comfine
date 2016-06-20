<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户认证</title>
</head>
<body>
	<h2>用户 认证</h2>
	<div class="form">
		<form method="post" action="douserva">
			<div class="item">
				<label>* 身份证:</label> 
				<input type="text" name="idcard" id="idcard">
			</div>
			<div class="item">
				<label>*上传身份证</label> 
				<input type="file" name="idcardpath" id="idcardpath">
			</div>
			<div class="item">
				<img src="" width="100px" height="70px"/>
			</div>
			<div class="item">
				<label>* 生日:</label> 
				<input type="date" name="birth"	id="birth">
			</div>
			<div class="item">
				<label>身高:</label> 
				<input name="height" type="text"id="height" size="8"> cm 
				<label>体重:</label> 
				<input name="weight" type="text" id="weight" size="8"> kg
			</div>
			<div class="item">
				<label >地址:</label> <input name="addr" type="text"
					id="addr" size="14">
			</div>
			<div class="item">
				<label>兴趣:</label> <input name="hobby" type="text"
					id="hobby">
			</div>
			<div class="item">
				<label >需要的服务:</label> <input name="needs" type="text"
					id="needs">
			</div>
			<div class="item">
				<label>其他:</label> <input name="remarks" type="text"
					id="remarks">
			</div>
			<div class="item">
				<input type="submit"  id="submit" value="提交">
				<a href="/" >跳过直接登录</a>
			</div>
	</form>
	</div>

</body>
</html>
