package DownLoad;

public class DownLoadUtils {
	
	public void start()
	{
		DownloadThread dth = new DownloadThread("127.0.0.1");
		new Thread(dth,"DownloadThread").start();;
	}
}
