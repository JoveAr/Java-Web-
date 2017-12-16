package Servelet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dataBase.toDatabase;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String email = "";
	private String password = "";
       
	
	private String sql = "";
	private Statement sta = null;
	private Connection con = null;
	
	private String result = "-1";
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
		//����̨�������
		System.out.println("��ȡ������" + email);
		System.out.println("��ȡ������" + password);
		
		//�������ݿ⡣��֤
		try {
			checkUser(response);
			if(this.result.equals("1"))
			{
				String page = "UserPage.jsp";
				//��ת
				toAnotherPage(request,response,page);
			}
			else if(this.result.equals("0"))
			{
				String page = "NullUser.jsp";
				//��ת
				toAnotherPage(request,response,page);
			}
			else {
				String page = "LoginError.jsp";
				//��ת
				toAnotherPage(request,response,page);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	//�������ݿ⣬��֤
	public void checkUser(HttpServletResponse response) throws IOException, SQLException
	{
		//�������ݿ������
		toDatabase.ConnectToDatabase();
		sta = toDatabase.statement;
		con = toDatabase.con;
		
		
		sql = "select * from User where UserName= ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		if(rs.getRow() != 0)
		{
			while(rs.next())
			{
				String UserPass = rs.getString("UserPassword");
				if(UserPass.equals(password))
				{
					this.result = "1";
				}
				else
				{
					this.result = "�û������������";
				}
			}
		}
		else
		{
			System.out.println("jk");
			this.result = "0";
		}
		toDatabase.Close();
	}

	public void toAnotherPage(HttpServletRequest request,HttpServletResponse response,String page)throws IOException, ServletException
	{
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
	
}
