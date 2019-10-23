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




public class EditUserProfile extends HttpServlet
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
				    
				    if(submit.equals("edit"))
				    {
				    	 ResultSet rs=User.getUserDetails(uid) ;
					        req.setAttribute("rs", rs);
							RequestDispatcher rd=req.getRequestDispatcher("/jsp/User/edituserprofile.jsp");
							rd.forward(req, resp);
				    }
				    
				    if(submit.equals("update"))
				    {
				    	
				    	String uid1=req.getParameter("uid").trim();
						String uname=req.getParameter("uname").trim();
						
						String phone=req.getParameter("phone").trim();
						
						String email=req.getParameter("email").trim();
						
						String city=req.getParameter("city").trim();
						
						String gender=req.getParameter("gender").trim();
						
						
				    boolean updateuser=User.updateUserDetails(uid,uname,phone,email,city,gender) ;
				    ResultSet rs=User.getUserDetails(uid) ;
			        req.setAttribute("rs", rs);
			        if(updateuser)
			        {
					RequestDispatcher rd=req.getRequestDispatcher("/jsp/User/userprofile.jsp?no=1");
					rd.forward(req, resp);
			        }
			        else
			        {
					RequestDispatcher rd=req.getRequestDispatcher("/jsp/User/userprofile.jsp?no=2");
					rd.forward(req, resp);
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
