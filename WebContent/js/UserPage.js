/**
 * 2017.12.9 Armon Good Job
 */
window.onload = function(){
	
	var img_more = document.getElementById("img_more");
	
	img_more.onclick = forwardAnotherPage;
}

function forwardAnotherPage(){
	//jquery跳转页面
	window.location.href = "VideoList.jsp";
//	$.post(
//			"toAnotherPage",
//			{
//				"id":"img_more",
//				"page" : "VideoList.jsp"
//			},
//			function(data,status){
//				alert(data);
//			}		
//		);
}

function playVideo()
{
	alert("test");
}
