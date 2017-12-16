package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class toDatabase {
	
	public static Statement statement;
	public static Connection con;
	public static String ConnectionMessage = "";
	
	public static void ConnectToDatabase()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("未找到该类，信息：jdbc");
		}
	
		//数据库的url
		String url = "jdbc:mysql://localhost:3306/finalproject?user=root&password=Ilovelm417520";
		//String url = "jdbc:mysql://120.79.21.64:3306/myusersystem?user=Armon&password=Ilovelm417520";
		//String url = "jdbc:mysql://localhost:3306/myusersystem?user=Armon&password=Ilovelm417520";
		try {
			con = DriverManager.getConnection(url);
			statement = con.createStatement();
			toDatabase.ConnectionMessage = "Success";
			System.out.println("已链接上数据库！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("未链接上数据库！");
			toDatabase.ConnectionMessage = "Fail";
		}
	}
	
	public static ResultSet Query(String sql)
	{
		ResultSet rs = null;
		try {
			rs = statement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public static int Updata(String sql)
	{
		int rs = 0;
		try {
			rs = statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	
	//关闭数据库连接
	public static void Close()
	{
		if(statement != null)
		{
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
