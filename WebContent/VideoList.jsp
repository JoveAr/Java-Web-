<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" 
    import="java.io.File,
	java.util.ArrayList,
	java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<p>This is video list!!</p>
	<%
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
		out.println("<a href='DownloadServelet'>" +  file1.getName() + "</a><br/>");
		System.out.println("te" + fl.size());
	}
	//out.print(sb.toString() );
	%>
</body>
</html>