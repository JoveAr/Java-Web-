function bg_turn() {
	if($("body").attr("class")==="bg_black"){
		$("body").attr("class","bg-warning");
	}
	else {
		$("body").attr("class","bg_black");
	}
}