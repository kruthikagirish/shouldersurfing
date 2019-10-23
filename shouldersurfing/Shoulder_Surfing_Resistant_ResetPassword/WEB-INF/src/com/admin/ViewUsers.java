package com.admin;

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

import com.DAOFactory.Admin;
import com.DAOFactory.User;
import com.util.Send_SMS_Service;

public class ViewUsers extends HttpServlet
{
	RequestDispatcher rd = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		

		try
		{
			String submit=req.getParameter("submit");
			
			
				HttpSession hs=req.getSession();	
				
				
				
				    String uid=hs.getAttribute("adminid").toString();
				    
				    if(submit.equals("view"))
				    {
				    	 ResultSet rs=Admin.getUsersDetails() ;
				    	 req.setAttribute("rs", rs);
							RequestDispatcher rd=req.getRequestDispatcher("/jsp/Admin/viewusers.jsp");
							rd.forward(req, resp);
				    }
				    
				   
			
			
		}	
		catch (Exception e)
		{
			System.out.println("********* Exception In New User Servlet ********\n");
			e.printStackTrace();
		}

	}

}
