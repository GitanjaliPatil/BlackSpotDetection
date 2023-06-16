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
 * Servlet implementation class AddStationSer
 */
public class AddStationSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStationSer() {
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
		
		
		String stnm=request.getParameter("stname");
		String stadd=request.getParameter("staddr");
		String stmb=request.getParameter("stmob");
		String stem=request.getParameter("stemail");
		String stpw=request.getParameter("stpass");
		
		
		try
		{
			Connection con=Connect.getConnect();
			PreparedStatement ps1=con.prepareStatement("insert into admintbl1 values(?,?,?,?,?,?)");
			ps1.setInt(1, 0);
			ps1.setString(2, stnm);
			ps1.setString(3, stadd);
			ps1.setString(4, stmb);
			ps1.setString(5, stem);
			ps1.setString(6, stpw);
			
			int i=ps1.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("login1.html");
			}
			else
			{
				response.sendRedirect("addstation.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
