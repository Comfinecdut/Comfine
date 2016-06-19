<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#acount").keydown(function(){
		getAjax($("#acount").val());
	});
		
})
function getAjax(msg){
	$.ajax({
		url:'<%= request.getContextPath()%>/he',
		type:'get',
		dataType:'json',
		data:{acount:msg},
		error:function(){
			alert("something is wrong");
		},
		success:function(data){
			//alert(data.name);
			$.each(data.array,function(index){
				$.each(data.array[index],function(key,value){
					$(".play").append(key+":"+value+"<br/>");
				});
				
			});		
		}
	});	
}
</script>
</head>
<body>
<input type="text" id="acount">
<p class="play">ddd</p>



</body>
</html>