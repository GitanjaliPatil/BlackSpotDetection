package com.connect.services;

import java.sql.*;
import java.sql.DriverManager;
public class Connect 
{
	
	public static Connection con = null;
		public static Connection getConnect()
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/detectionsysdb","root","");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return con;
		}
	}


