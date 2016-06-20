<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="generator" content="" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<link href="resources/css/news-css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="resources/css/news-css/news_fabu.css" rel="stylesheet" type="text/css" media="screen,print" />
<link href="resources/css/news-css/print.css" rel="stylesheet" type="text/css"  media="print" />
<script src="resources/js/jquery-1.10.1.min.js"></script>
<script src="resources/js/side.js" type="text/javascript"></script>

<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body>
<header>
<!-- Header -->
<div id="Header">
<!-- Head -->
<div id="Head">
<h1 class="title">惠家网新闻发布</h1>
<script language="javascript">
function showmenu(id){id.style.visibility = "visible";}
function hidmenu(){UserList.style.visibility = "hidden";}
document.onclick = hidmenu;
</script>
<script type="text/javascript">    
 function preview(file)  
 {  
 var prevDiv = document.getElementById('preview'); 
 testValue=document.getElementById("preview").innerHTML; 
 if (file.files && file.files[0])  
 {  
 var reader = new FileReader();  
 reader.onload = function(evt){  
 prevDiv.innerHTML = '<img src="' + evt.target.result + '" />';  
}    
 reader.readAsDataURL(file.files[0]);  
}  
 else    
 {  
 prevDiv.innerHTML = '<div class="img" style="filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';  
 }  
 }  
 </script>  




<div class="user"><a href="javascript:showmenu(UserList)">admin</a>
<div id="UserList"><a href="">修改</a>
<a href="">注销</a>
<a href="">退出</a></div>
</div>
</div>
<!-- /Head -->
<nav>
<ul id="Navi">
<li><a href=""><img src="resources/images/common/navi01.png" width="30" height="36" alt="主页管理"><span>主页管理</span></a></li>
<li><a href=""><img src="resources/images/common/navi02.png" width="36" height="36" alt="系统管理"><span>系统管理</span></a></li>
<li ><a href=""><img src="resources/images/common/navi03.png" width="26" height="36" alt="合同信息"><span>新闻管理</span></a></li>
<li><a href=""><img src="resources/images/common/navi04.png" width="34" height="36" alt="查看新闻"><span>查看新闻</span></a></li>
<li class="active"><a href=""><img src="resources/images/common/navi05.png" width="24" height="36" alt="添加新闻"><span>添加新闻</span></a></li>
<li><a href=""><img src="resources/images/common/navi06.png" width="36" height="36" alt="项目管理"><span>项目管理</span></a></li>
</ul>
</nav>

</div>
<!-- /Header -->
</header>

<div class="fabu">
	<form action="addnews" method="post"  enctype="multipart/form-data"  class="bootstrap-frm">
<div ><h1>新闻发布
<span>惠家网新闻发布</span>
</h1>
</div>
<label>
<span>新闻标题</span>
<input id="name" type="text" name="title" placeholder="新闻标题" />
</label>
<label>
<span>UP主</span>
<input id="email" type="text" name="up" placeholder="副标题" />
</label>
<label>
<span>新闻类容 :</span>
<textarea id="message" name="content" placeholder="新闻类容"></textarea>
<div id="preview"></div>  
<input type="file" name = "imageFile"  onchange="preview(this)" />  
</label>
<label>
<span>类别 :</span><select name="selection">
<option value="社区">社区</option>
<option value="服务">服务</option>
</select>
</label>
<label>
<span>&nbsp;</span>
<input type="submit" class="button" value="Send" />
</label>
</form>
</div>
</body>
</html>