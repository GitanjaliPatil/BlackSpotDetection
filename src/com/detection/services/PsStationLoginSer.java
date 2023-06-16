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
 * Servlet implementation class PsStationLoginSer
 */
public class PsStationLoginSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PsStationLoginSer() {
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
		
		
		
		String psem=request.getParameter("psemail");
		String pspw=request.getParameter("pspass");
		try
		{
			Connection con=Connect.getConnect();
			PreparedStatement ps5= con.prepareStatement("select * from admintbl1 where semail=? and spassword=? ");
			ps5.setString(1, psem);
			ps5.setString(2, pspw);
			ResultSet rs=ps5.executeQuery();
			if(rs.next())
			{
				Setter.setEmail(rs.getString("semail"));
				Setter.setPassword(rs.getString("spassword"));
				response.sendRedirect("login2.html");
				
			}
			else
			{
				response.sendRedirect("pslogin.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
