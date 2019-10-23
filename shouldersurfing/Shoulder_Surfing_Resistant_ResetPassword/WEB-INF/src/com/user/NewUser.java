package com.user;

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

import com.DAOFactory.User;
import com.util.Send_Mail_Attachment;
import com.util.Send_SMS_Service;




public class NewUser extends HttpServlet
{
	RequestDispatcher rd = null;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)	throws ServletException, IOException 
	{
		

		try
		{
			String submit=req.getParameter("submit");
			if(submit.equals("Reset"))
			{
				rd = req.getRequestDispatcher(req.getRealPath("")+"/jsp/User/registration.jsp");
				rd.forward(req, resp);
			}
			if(submit.equals("forgotpass"))
			{
				rd = req.getRequestDispatcher(req.getRealPath("")+"/jsp/User/enteruid.jsp");
				rd.forward(req, resp);
			}
			
			if(submit.equals("ResetPass"))
			{
				String uid=req.getParameter("uid");
				boolean flag=User.checkUser(uid);
				
				
				HttpSession hs=req.getSession();
				Random r1 = new Random();
				int Low1 = 1;
				int High1 = 6;
				int randomimage1 = r1.nextInt(High1-Low1) + Low1;
				
				Random r2 = new Random();
				int Low2 = 1;
				int High2 = 6;
				int randomimage2 = r2.nextInt(High2-Low2) + Low2;
				while(randomimage1==randomimage2)
				{
					randomimage2 = r2.nextInt(High2-Low2) + Low2;
				}
				
				Random r3 = new Random();
				int Low3 = 1;
				int High3 = 6;
				int randomimage3 = r3.nextInt(High3-Low3) + Low3;
				while(randomimage3==randomimage1 || randomimage3==randomimage2 )
				{
					randomimage3 = r3.nextInt(High3-Low3) + Low3;
				}
				
				
				
				String randimage1="Image"+randomimage1;
				String randimage2="Image"+randomimage2;
				String randimage3="Image"+randomimage3;
				
				hs.setAttribute("randomimage1", randimage1);
				hs.setAttribute("randomimage2", randimage2);
				hs.setAttribute("randomimage3", randimage3);
				hs.setAttribute("uid",uid);
				
				boolean flag2=User.ResetUserPass(uid, randimage1, randimage2, randimage3) ;
				String message = "Hello  "+uid+", Reset Your  Graphical Password By clicking on below link 'http://localhost:8080/Graphical_Authentication_System/Resetimagepasswordset1.jsp' Thank You....";
				
				//String message = "Hello  "+uid+", Reset Your  Graphical Password By clicking on below link 'http://localhost:8080/Graphical_Authentication_System/jsp/User/Forgetpwd.jsp' Thank You....";
				String usermail=User.getMailid(uid); 
				
				Send_Mail_Attachment.sendPersonalizedMail(usermail, "Graphical Password Reset Password Link", message, "no");
			    if(flag2)	
			    {
				rd = req.getRequestDispatcher("/jsp/User/enteruid.jsp?no=1");
				rd.forward(req, resp);
			    }
				
				else
				{
					System.out.println("<<<<<<<<<<<its came inside else part>>>>>>>>>>>>>>.");
					rd = req.getRequestDispatcher("/jsp/User/enteruid.jsp?no1=2");
					rd.forward(req, resp);
				}
			}
			
			
			if(submit.equals("Register"))
			{
			HttpSession hs=req.getSession();	
			
			String uid=req.getParameter("uid").trim();
			String uname=req.getParameter("uname").trim();
			String password=req.getParameter("password").trim();
			String phone=req.getParameter("phone").trim();
			
			String email=req.getParameter("email").trim();
			//String street=req.getParameter("street").trim();
			String city=req.getParameter("city").trim();
			//String state=req.getParameter("state").trim();
			
			//String country=req.getParameter("country").trim();
			String gender=req.getParameter("gender").trim();
			//String pin=req.getParameter("pin").trim();
			
			
			boolean flag7=User.checkUserexists(uid);
			
			if(flag7)
			{
				rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);
			}
			
			
			//=================================================
					
			
			///================================================
			else
			{
			
			
		
				Random r1 = new Random();
				int Low1 = 1;
				int High1 = 6;
				int randomimage1 = r1.nextInt(High1-Low1) + Low1;
				
				Random r2 = new Random();
				int Low2 = 1;
				int High2 = 6;
				int randomimage2 = r2.nextInt(High2-Low2) + Low2;
				while(randomimage1==randomimage2)
				{
					randomimage2 = r2.nextInt(High2-Low2) + Low2;
				}
				
				Random r3 = new Random();
				int Low3 = 1;
				int High3 = 6;
				int randomimage3 = r3.nextInt(High3-Low3) + Low3;
				while(randomimage3==randomimage1 || randomimage3==randomimage2 )
				{
					randomimage3 = r3.nextInt(High3-Low3) + Low3;
				}
				
				
				
				
				
				
				
				String randimage1="Image"+randomimage1;
				String randimage2="Image"+randomimage2;
				String randimage3="Image"+randomimage3;
				
				hs.setAttribute("randomimage1", randimage1);
				hs.setAttribute("randomimage2", randimage2);
				hs.setAttribute("randomimage3", randimage3);
				hs.setAttribute("uid",uid);
				
				boolean flag=User.insertUser( uid,  uname,  password,
						 gender,  email,  phone,  city, randimage1,  randimage2,  randimage3) ;
				
				
				
				
				rd = req.getRequestDispatcher("imagepasswordset1.jsp");
				rd.forward(req, resp);
			}
			}
			}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			
							            

			
			
			
			
			
			
	}
}
