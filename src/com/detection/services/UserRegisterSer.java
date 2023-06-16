package com.detection.services;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connect.services.Connect;

/**
 * Servlet implementation class UserRegisterSer
 */
public class UserRegisterSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterSer() {
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
		
		
		int uroll=Integer.parseInt(request.getParameter("usid"));
		String unm=request.getParameter("usname");
		String uem=request.getParameter("usem");
		String umob=request.getParameter("usmobile");
		String upw=request.getParameter("uspass");
		String ucity=request.getParameter("uscity");
		
		
		try
		{
			Connection con=Connect.getConnect();
			PreparedStatement ps1=con.prepareStatement("insert into usertbl values(?,?,?,?,?,?)");
			ps1.setInt(1, uroll);
			ps1.setString(2, unm);
			ps1.setString(3, uem);
			ps1.setString(4, umob);
			ps1.setString(5, upw);
			ps1.setString(6, ucity);
			
			int i=ps1.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("index.html");
			}
			else
			{
				response.sendRedirect("userregister.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
