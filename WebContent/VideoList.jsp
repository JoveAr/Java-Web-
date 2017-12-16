<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" 
    import="java.io.File,
	java.util.ArrayList,
	java.util.List"%>
	<!-- 修改成表格 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>所有视频</title>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
		<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
		<script type="text/javascript">
		function test(data)
		{
			$.post(
			"DownloadServelet",
			{
				"msg" : data.innerHTML
			},
			function(data,status){
				window.location.href = "DownloadServelet";
			}		
		);
			
		}
		
		</script>
</head>
<body>
	<%
	out.append("<h1 class='text-center'>所有视频</h1><br>");
	out.append("<div class='row col-md-10 col-md-offset-1'><div class='table-responsive'>" + "<table class='table table-striped table-condensed table-bordered'>"
	 + "<thead>" + "<tr>" + "<td class='text-center'>视频名称</td>" + 
	"<td class='text-center'>视频大小</td>"
	 + "<td class='text-center'>收藏</td>" + "</tr>" + "</thead>"
	    + "<tbody>");
	List<File> fl = new ArrayList<File>(); 
	File file = new File("D:\\Armon");
	String[] filepath = file.list();
	StringBuffer sb = new StringBuffer();
	for(String x : filepath)
	{
		File temp = new File(x);
		fl.add(temp);
	}
	for(File file1 : fl)
	{
		File tmpfile = new File("D:\\Armon\\" + file1.getName());
		%>
		<tr>
			<td class="text-center"><a onclick="test(this)"><%= file1.getName() %></a></td>
			<td class="text-center"><%= tmpfile.length()/(1024*1024) + "MB" %></td>
			<td class="text-center"><a>收藏</a></td>
		</tr>
		<%
	}
	out.append("</tbody></table></div></div>");
	%>
	
</body>
</html>