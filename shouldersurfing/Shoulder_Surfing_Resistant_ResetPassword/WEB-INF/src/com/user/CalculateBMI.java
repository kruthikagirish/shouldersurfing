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
import com.util.BMICalculation;
import com.util.Send_SMS_Service;

public class CalculateBMI extends HttpServlet
{
	RequestDispatcher rd = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		

		try
		{
			String submit=req.getParameter("submit");
			
			
				HttpSession hs=req.getSession();	
				
				
				
				    String uid=hs.getAttribute("uid").toString();
				    
				    if(submit.equals("get"))
				    {
				    	
							RequestDispatcher rd=req.getRequestDispatcher("/jsp/User/bmical.jsp");
							rd.forward(req, resp);
				    }
				    
				    if(submit.equals("calculate"))
				    {
				    	
				    
				    	String weight=req.getParameter("weight");
				    	String height=req.getParameter("height");
				    	
				    	try
				        {
				     	  String wei=BMICalculation.getbmi( weight, height);
				     	  System.out.println("================="+wei);
				     	  
				     	  String arr[]=wei.split("~~");
				     	  
				     	 hs.setAttribute("weight", arr[0]);
				     	hs.setAttribute("height", arr[1]);
				     	hs.setAttribute("bmi", arr[2]);
				     	
				     	
				     	
				     	RequestDispatcher rd=req.getRequestDispatcher("/jsp/User/bmical.jsp?no=1");
				     	rd.forward(req, resp);
				    }
				    	catch (Exception e)
				    	{
							e.printStackTrace();
						}
				    	
			
				    }
		}	
		catch (Exception e)
		{
			System.out.println("********* Exception In New User Servlet ********\n");
			e.printStackTrace();
		}

	}

}
