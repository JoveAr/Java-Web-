<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>用户主页</title>
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
	<!-- <script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.min.js" ></script> -->
	<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
	<script type="text/javascript" src="js/UserPage.js" ></script>
</head>
	<body style="background-repeat: no-repeat;background-attachment: fixed;" background="img/671293.jpg">
		
		<!--header-->
		<div class="container">
			
			<div class="container">
				<div class="row">
					<div class="col-md-1">
						<img style="margin-top: 45px;" src="img/icon_header.svg" class="img-circle"/>
					</div>
					<div class="col-md-6">
						<div class="jumbotron" style="background-color: transparent;">
							<h2>欢迎来到开心社区</h2>
							<div class="btn-group">
								<!--此处代改动-->
   								<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      								原始 <span class="caret"></span>
   								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
			
		<!--content-->
		<div class="container" style="margin-top: 30px;">
			<h3 class="text-center">推荐视频</h3>
			<hr/>
			<div class="row">
				<div class="col-md-3">
					<ul class="list-group">
						<li class="list-group-item active text-center">列表</li>
						<div class="list-group-item text-center">
							秦时明月剪辑
							<a href="DownloadServelet">
								<img style="height: 20px;width: 20px;" src="img/download.svg" class="text-md-right" />
							</a>
							<a href="Collect">
								<img style="height: 20px;width: 20px;" src="img/uncollect.svg" class="text-md-right" />
							</a>
						</div>
						<div class="list-group-item text-center">
							秦时明月剪辑
							<a href="DownloadServelet">
								<img style="height: 20px;width: 20px;" src="img/download.svg" class="text-md-right" />
							</a>
							<a href="Collect">
								<img style="height: 20px;width: 20px;" src="img/uncollect.svg" class="text-md-right" />
							</a>
						</div>
						<div class="list-group-item text-center">
							秦时明月剪辑
							<a href="DownloadServelet">
								<img  style="height: 20px;width: 20px;" src="img/download.svg" class="text-md-right" />
							</a>
							<a href="Collect">
								<img style="height: 20px;width: 20px;" src="img/uncollect.svg" class="text-md-right" />
							</a>
						</div>
						<div class="list-group-item text-center">
							秦时明月剪辑
							<a href="DownloadServelet">
								<img style="height: 20px;width: 20px;" src="img/download.svg" class="text-md-right" />
							</a>
							<a href="Collect">
								<img style="height: 20px;width: 20px;" src="img/uncollect.svg" class="text-md-right" />
							</a>
						</div>
						<div class="list-group-item text-center">
							秦时明月剪辑
							<a href="DownloadServelet">
								<img  style="height: 20px;width: 20px;" src="img/download.svg" class="text-md-right" />
							</a>
							<a href="Collect">
								<img style="height: 20px;width: 20px;" src="img/uncollect.svg" class="text-md-right" />
							</a>
						</div>
						<div class="list-group-item text-center">
							秦时明月剪辑
							<a href="DownloadServelet">
								<img  style="height: 20px;width: 20px;" src="img/download.svg" class="text-md-right" />
							</a>
							<a href="Collect">
								<img style="height: 20px;width: 20px;" src="img/uncollect.svg" class="text-md-right" />
							</a>
						</div>
						<div class="list-group-item text-center">
							秦时明月剪辑
							<a href="DownloadServelet">
								<img  style="height: 20px;width: 20px;" src="img/download.svg" class="text-md-right" />
							</a>
							<a href="Collect">
								<img style="height: 20px;width: 20px;" src="img/uncollect.svg" class="text-md-right" />
							</a>
						</div>
						<div class="list-group-item text-center">
							秦时明月剪辑
							<a href="Collect">
								<img style="height: 20px;width: 20px;" src="img/download.svg" class="text-md-right" />
							</a>
							<a href="DownloadServelet">
								<img style="height: 20px;width: 20px;" src="img/uncollect.svg" class="text-md-right" />
							</a>
						</div>
						<div id="img_more" class="list-group-item text-center">
							更多视频
							<img style="height: 20px;width: 20px;" src="img/more.svg" class="text-md-right" />
						</div>
					</ul>
				</div>
				<video controls="controls" class="col-md-8">
					<source src="video/test1.mp4" type="audio/mp4"></source>
				</video>
			</div>
		</div>
			
		<div id="talkinlogin" class="row" style="margin-top: 30px;">
			<h3 class="text-center">博客分享</h3>
				<hr />
			<div class="row" style="margin-left: 100px;margin-right: 100px;">
				<div class="col-md-4">
					<img src="img/gainie.png" style="height: 100px;width: 100px;display: inline;"/>
					<p>测试文本</p>
				</div>
				<div class="col-md-4">
					<img src="img/gainie.png" style="height: 100px;width: 100px;display: inline;"/>
					<p>测试文本</p>
				</div>
				<div class="col-md-4">
					<img src="img/gainie.png" style="height: 100px;width: 100px;display: inline;"/>
					<p>测试文本</p>
				</div>
			</div>	
		</div>


		<div id="talkinlogin" class="row" style="margin-top: 30px;">
			<h3 class="text-center">天天音乐</h3>
				<hr />
			<div class="row" style="margin-left: 100px;margin-right: 100px;">
				<div class="col-md-4">
					<img src="img/gainie.png" style="height: 100px;width: 100px;display: inline;"/>
					<p>测试文本</p>
				</div>
				<div class="col-md-4">
					<img src="img/gainie.png" style="height: 100px;width: 100px;display: inline;"/>
					<p>测试文本</p>
				</div>
				<div class="col-md-4">
					<img src="img/gainie.png" style="height: 100px;width: 100px;display: inline;"/>
					<p>测试文本</p>
				</div>
			</div>	
		</div>
		
		<footer class="panel-footer text-center">
			页脚
		</footer>
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		
		
		
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
   		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    	<!-- Include all compiled plugins (below), or include individual files as needed -->
    	<script src="../bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	</body>
</html>