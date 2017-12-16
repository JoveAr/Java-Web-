package Servelet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

/**
 * Servlet implementation class DownloadServelet
 */
@WebServlet("/DownloadServelet")
public class Download extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ServletConfig config = null;
	ArrayList[] files = null;
	private String msg = "1.txt";
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Download() {
        super();
        List<File> fli =  new  ArrayList<File>();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		download(request,response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		msg = request.getParameter("msg");
		doGet(request, response);
	}

	public void download(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("" + request.getRequestURL());
		SmartUpload su = new SmartUpload();
		su.initialize(config, request, response);
		su.setContentDisposition(null);
		try {
			su.downloadFile("/video/" + msg);
		}
		catch(SmartUploadException e)
		{
			e.printStackTrace();
		}
	}

}
