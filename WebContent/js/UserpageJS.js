/**
 * 
 */
window.onload=function(){
	
	var download = document.getElementById("img_down");
	download.onclick = myFunction;
}

function myFunction(){
	$.post(
		"Download",
		{
			"author":"armon"
		},
		function(data,status){
			alert(data);
		}		
	);
}