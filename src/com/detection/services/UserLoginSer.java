package com.detection.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connect.services.Connect;

/**
 * Servlet implementation class UserLoginSer
 */
public class UserLoginSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String userem=request.getParameter("usemail");
		String userpw=request.getParameter("uspassword");
		try
		{
			Connection con=Connect.getConnect();
			PreparedStatement ps9= con.prepareStatement("select * from usertbl where uemail=? and upassword=? ");
			ps9.setString(1, userem);
			ps9.setString(2, userpw);
			ResultSet rs=ps9.executeQuery();
			if(rs.next())
			{
				UserData.setEmail(rs.getString("uemail"));
				UserData.setPassword(rs.getString("upassword"));
				response.sendRedirect("login3.html");
				
			}
			else
			{
				response.sendRedirect("userlogin.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
