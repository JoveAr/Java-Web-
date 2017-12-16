package Servelet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.toDatabase;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String email = "";
	private String password = "";
	private String password_certain  = "";
       
	private String sql = "";
	private Statement sta = null;
	private Connection con = null;
	
	private String result = "-1";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		email = request.getParameter("m_register_email");
		password = request.getParameter("m_register_password");
		password_certain = request.getParameter("m_register_certain");
		
		try {
			addUser(response);
			if(this.result.equals("1"))
			{
				String page = "registerSuccess.jsp";
				//跳转
				toAnotherPage(request,response,page);
			}
			else if(this.result.equals("0"))
			{
				String page = "registerFail.jsp";
				//跳转
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

	//链接数据库，验证
	public void addUser( HttpServletResponse response) throws SQLException
	{
		//测试数据库的链接
		toDatabase.ConnectToDatabase();
		sta = toDatabase.statement;
		con = toDatabase.con;
				
				
		sql = "insert into User(UserName,UserPassword) values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, password);
		int re = ps.executeUpdate();
		if(re > 0)
		{
			this.result = "1";
		}
		else
		{
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
