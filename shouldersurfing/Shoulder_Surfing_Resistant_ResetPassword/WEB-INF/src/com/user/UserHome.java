package com.user;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOFactory.User;
import com.util.Send_SMS_Service;




public class UserHome extends HttpServlet
{
	RequestDispatcher rd = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		

		try
		{
			
			
			
				
					RequestDispatcher rd=req.getRequestDispatcher("/jsp/User/userhome.jsp");
					rd.forward(req, resp);
				
			
			
		}	
		catch (Exception e)
		{
			System.out.println("********* Exception In New User Servlet ********\n");
			e.printStackTrace();
		}

	}

}
