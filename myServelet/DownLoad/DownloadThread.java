package DownLoad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class DownloadThread implements Runnable{

	private String url = "127.0.0.1";
	public static String msg = "";
	
	public DownloadThread(String url)
	{
		this.url =url;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		try {
			Socket sc = new Socket(url,3000);
			BufferedReader bfr = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			String line = bfr.readLine();
			msg = line;
			bfr.close();
			sc.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
