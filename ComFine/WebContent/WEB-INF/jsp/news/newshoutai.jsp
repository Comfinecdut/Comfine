<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<link href="resources/css/news-css/print.css" rel="stylesheet" type="text/css"  media="print" />
<script src="resources/js/jquery-1.10.1.min.js"></script>
<script src="resources/js/side.js" type="text/javascript"></script>
<script type="text/javascript" src ="resources/js/jquery.easing.1.3.js"></script>
<script src="resources/js/news_js/news.js" type="text/javascript"></script>
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body>
<!-- wrap_left -->
<div class="wrap_left" id="frmTitle" name="fmTitle">
<!-- Logo -->
<div id="Logo"><span>E家新闻管理</span></div>
<!-- /Logo -->

<!-- menu_list -->
<script>
$(function() {
    $(".menu_list dd");
    $(".menu_list dt").click(function(){
        $(this).toggleClass("open").next().slideToggle("slow");
    });
});
</script>
<div class="menu_list">
<dl>
<dt><span>一级分类名称</span></dt>
<dd><a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类" class="active">二级分类</a>
<a href="" title="二级分类">二级分类</a></dd>

<dt><span>一级分类名称</span></dt>
<dd><a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a></dd>

<dt><span>一级分类名称</span></dt>
<dd><a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a></dd>

<dt><span>一级分类名称</span></dt>
<dd><a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a></dd>

<dt><span>一级分类名称</span></dt>
<dd><a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a></dd>

<dt><span>一级分类名称</span></dt>
<dd><a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a></dd>

<dt><span>一级分类名称</span></dt>
<dd><a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a>
<a href="" title="二级分类">二级分类</a></dd>
</dl>
</div>
<!-- /menu_list -->
</div>
<!-- /wrap_left -->

<!-- picBox -->
<div class="picBox" onclick="switchSysBar()" id="switchPoint"></div>
<!-- /picBox -->



<!-- wrap_right -->
<div class="wrap_right">
<header>
<!-- Header -->
<div id="Header">
<!-- Head -->
<div id="Head">
<h1 title="惠家生活新闻系统管理后台">惠家生活新闻管理</h1>
<script language="javascript">
function showmenu(id){id.style.visibility = "visible";}
function hidmenu(){UserList.style.visibility = "hidden";}
document.onclick = hidmenu;
</script>
<div class="user"><a href="javascript:showmenu(UserList)">admin</a>
<div id="UserList"><a href="">修改</a>
<a href="">注销</a>
<a href="">退出</a></div>
</div>
</div>
<!-- /Head -->
<nav class="dd">
<div dsafsa></div>
<ul id="Navi">
<li><a href=""><img src="resources/images/common/navi01.png" width="30" height="36" alt="主页管理"><span>主页管理</span></a></li>
<li><a href=""><img src="resources/images/common/navi02.png" width="36" height="36" alt="系统管理"><span>系统管理</span></a></li>
<li class="active"><a href=""><img src="resources/images/common/navi03.png" width="26" height="36" alt="合同信息"><span>新闻管理</span></a></li>
<li><a href=""><img src="resources/images/common/navi04.png" width="34" height="36" alt="查看新闻"><span>查看新闻</span></a></li>
<li><a href=""><img src="resources/images/common/navi05.png" width="24" height="36" alt="添加新闻"><span>添加新闻</span></a></li>
<li><a href=""><img src="resources/images/common/navi06.png" width="36" height="36" alt="项目管理"><span>项目管理</span></a></li>

</ul>
</nav>
</div>
<!-- /Header -->
</header>


<!-- Contents -->
<div id="Contents">
<script type="text/javascript">
$(function(){

$(".form_boxA tr:odd").addClass("odd");//odd为偶数行
$(".form_boxA tr").hover(function(){
	$(this).toggleClass("tdhover");

})
  $("#table01 tr:even").addClass("even")//even为偶数行

$(".select").each(function(){
var s=$(this);
var z=parseInt(s.css("z-index"));
var dt=$(this).children("dt");
var dd=$(this).children("dd");
var _show=function(){dd.slideDown(200);dt.addClass("cur");s.css("z-index",z+1);};
var _hide=function(){dd.slideUp(200);dt.removeClass("cur");s.css("z-index",z);};
dt.click(function(){dd.is(":hidden")?_show():_hide();});
dd.find("a").click(function(){dt.html($(this).html());_hide();});
$("body").click(function(i){ !$(i.target).parents(".select").first().is(s) ? _hide():"";});})})
</script>
<!-- TopMain -->
<div id="TopMain">
<!-- selectbox -->
<div class="selectbox floatL mag_r20">
<span class="sttl">类别</span>
<dl class="select" style="width:200px;">
<dt>全部</dt>
<dd><ul>
<li><a href="#">社区活动</a></li>
<li><a href="#">热点</a></li>
<li><a href="#">要闻</a></li>
</ul></dd></dl>
</div>
<!-- /selectbox -->

<!-- selectbox -->
<div class="selectbox floatL mag_r20">
<span class="sttl">日期</span>
<dl class="select" style="width:200px;">
<dt>全部</dt>
<dd><ul>
<li><a href="#">一周</a></li>
<li><a href="#">一个月</a></li>
<li><a href="#">6个月</a></li>
<li><a href="#">一年</a></li>
</ul></dd></dl>
</div>
<!-- /selectbox -->

<!-- btn_box -->
<div class="btn_box floatL"><input name="" type="button" value="查询" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
<!-- /btn_box -->
</div>
<!-- /TopMain -->

<!-- MainForm -->
<div id="MainForm">
<div class="form_boxA">
<h2>年度预算列表</h2>
<table cellpadding="0" cellspacing="0">
<tr>

<th>新闻题目</th>
<th>新闻编号</th>
<th>撰稿人</th>
<th>提交人</th>
<th>日期</th>
<th>状态</th>
<th>操作</th>
<th>选择</th>
</tr>



<c:forEach items="${message}" var="mesg">
<tr>
<td>${mesg.title}</td><td>${mesg.news_id}</td><td>${msg.content}</td><td>${mesg.up}</td><td>${mesg.date}</td><td class="f_cA">审核通过</td>
<td><a href="#">查看</a> | <a href="#">操作</a></td><td><input type="checkbox"></td>
</tr>
</c:forEach>



</table>
<p class="msg">共找到xx条年度预算记录，当前显示从第xx条至第xx条</p>
</div>
</div>
<!-- /MainForm -->


<!-- PageNum -->
<ul id="PageNum">
<li><a href="">首页</a></li>
<li><a href="">上一页</a></li>
<li><a href="">1</a></li>
<li><a href="newsupcontrol">2 </a></li>
<li><a href="">3</a></li>
<li><a href="">4</a></li>
<li><a href="">5</a></li>
<li><a href="">6</a></li>
<li><div class=".next_page">下一页</div></li>
<li><a href="">尾页</a></li>
</ul>
<div style="width:20px;height:30px;background:black;" class="next_page">
<!-- /PageNum -->
</div>
<!-- /Contents -->

<!-- /footer -->
<footer>
<address>电子邮箱：ds_hale@qq.com  技术支持：惠家E站项目组<br>惠家生活公司版权所有  Copyright &copy; 2016 Haiersoft Corporation, All Rights.</address>
</footer>
<!-- /footer -->

</div>
<!-- /wrap_right -->
</body>
</html>