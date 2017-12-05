package Servelet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String email = "";
	private String password = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		email = request.getParameter("m_login_email");
		password = request.getParameter("m_login_password");
		//控制台输出测试
		System.out.println("获取的邮箱" + email);
		System.out.println("获取的密码" + password);
		
		//链接数据库。验证
		checkUser(response);
		
		//跳转
		toAnotherPage(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	//链接数据库，验证
	public void checkUser(HttpServletResponse response) throws IOException
	{
		response.setCharacterEncoding("utf-8");
		response.getWriter().println("测试值");
	}

	public void toAnotherPage(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException
	{
		RequestDispatcher rd = request.getRequestDispatcher("UserPage.jsp");
		rd.forward(request, response);
	}
	
}
