$(document).ready(function(){
	$(".next_page").click(function(){
		$.ajax({
			url:'newsupcontrolajax',
			type:'GET',
			dataType:'json',
			success:function(data){
				
				$.each(data.data,function(i,item){
					alert(item);
				});
			}
			
		});
		});
});


