/**
 * 2017.12.9 Armon Good Job
 */
window.onload = function(){
	alert("da");
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

function playVideo(i)
{
	alert("tt" + i);
	//var video = document.getElementById("video");
	//video.setAttribute("src","video/test2.mp4");
	//video.setAttribute("autoplay","true");
//	var sources = video.getElementsByTagName("source");
//	sources[0] = "video/test2.mp4";
//	video.load();
	//alert("test" + sources);
}
