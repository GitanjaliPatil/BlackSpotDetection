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
 * Servlet implementation class AddSpotSer
 */
public class AddSpotSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSpotSer() {
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
		
		
		String sploc=request.getParameter("splocation");
		String spadd=request.getParameter("spaddr");
		String sprea=request.getParameter("spreason");
		String splv=request.getParameter("splevel");
		String spci=request.getParameter("spcity");
		String splati=request.getParameter("splatitude");
		String splongi=request.getParameter("splongitude");
		
		
		try
		{
			Connection con=Connect.getConnect();
			PreparedStatement ps1=con.prepareStatement("insert into pstbl values(?,?,?,?,?,?,?)");
			
			ps1.setString(1, sploc);
			ps1.setString(2, spadd);
			ps1.setString(3, sprea);
			ps1.setString(4, splv);
			ps1.setString(5, spci);
			ps1.setString(6, splati);
			ps1.setString(7, splongi);
			
			int i=ps1.executeUpdate();
			if(i>0)
			{
				response.sendRedirect("login2.html");
			}
			else
			{
				response.sendRedirect("addspot.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
