package com.admin;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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




public class AdminLogin extends HttpServlet
{
	RequestDispatcher rd = null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		

		try
		{
			String submit=req.getParameter("submit");
			
			if(submit.equals("signin"))
			{
				HttpSession hs=req.getSession();	
				
				String uid=req.getParameter("name").trim();
				String pass=req.getParameter("pass").trim();
				
				boolean flag=Admin.checkAdmin(uid,pass);
				
				
				
				if(flag)
				{
					
					hs.setAttribute("adminid",uid);
					
					
					
					
					rd = req.getRequestDispatcher("/jsp/Admin/adminhome.jsp");
					rd.forward(req, resp);
				}
				else
				{
					 RequestDispatcher rd=req.getRequestDispatcher("index.jsp?no=2");
					rd.forward(req, resp);
				}
			}
			
			
			
			
							            

			
			
			
			
			
			
		} catch (Exception e)
		{
			System.out.println("********* Exception In New User Servlet ********\n");
			e.printStackTrace();
		}

	}

}
