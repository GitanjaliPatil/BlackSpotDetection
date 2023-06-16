package com.detection.services;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connect.services.Connect;

/**
 * Servlet implementation class AdminLoginSer
 */
public class AdminLoginSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginSer() {
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
		
		
		
		String adem=request.getParameter("ademail");
		String adpw=request.getParameter("adpass");
		try
		{
			Connection con=Connect.getConnect();
			if(adem.equals("admin@gmail.com")&& adpw.equals("admin"))
			{
				response.sendRedirect("login1.html");
			}
			else
			{
				response.sendRedirect("login.html");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
