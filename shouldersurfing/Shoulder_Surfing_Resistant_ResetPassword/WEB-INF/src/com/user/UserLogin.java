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




public class UserLogin extends HttpServlet
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
				
				boolean flag=User.checkUser(uid,pass);
				
				
				
				if(flag)
				{
					
					hs.setAttribute("uid",uid);
					
					 boolean flag7=User.deleteotp(uid);
					
					
					
	                String alphaNumerics = "ABCDEF";
					
					String randomcol1="";
					for (int i = 0; i < 1; i++) 
					{
						randomcol1   += alphaNumerics.charAt((int) (Math.random() * alphaNumerics.length()));
					}
					
					String randomcol2="";
					for (int i = 0; i < 1; i++) 
					{
						randomcol2  += alphaNumerics.charAt((int) (Math.random() * alphaNumerics.length()));
					}
					
					String randomcol3="";
					for (int i = 0; i < 1; i++) 
					{
						randomcol3   += alphaNumerics.charAt((int) (Math.random() * alphaNumerics.length()));
					}
					
					int randcol1=0;
					int randcol2=0;
					int randcol3=0;
				//===================================	
					if(randomcol1.equals("A"))
					{
						randcol1=1;
					}
					if(randomcol1.equals("B"))
					{
						randcol1=2;
					}
					if(randomcol1.equals("C"))
					{
						randcol1=3;
					}
					if(randomcol1.equals("D"))
					{
						randcol1=4;
					}
					if(randomcol1.equals("E"))
					{
						randcol1=5;
					}
					if(randomcol1.equals("F"))
					{
						randcol1=6;
					}
				//=====================================	
					
					
					//===================================	
					if(randomcol2.equals("A"))
					{
						randcol2=1;
					}
					if(randomcol2.equals("B"))
					{
						randcol2=2;
					}
					if(randomcol2.equals("C"))
					{
						randcol2=3;
					}
					if(randomcol2.equals("D"))
					{
						randcol2=4;
					}
					if(randomcol2.equals("E"))
					{
						randcol2=5;
					}
					if(randomcol2.equals("F"))
					{
						randcol2=6;
					}
				//=====================================	
					
					//===================================	
					if(randomcol3.equals("A"))
					{
						randcol3=1;
					}
					if(randomcol3.equals("B"))
					{
						randcol3=2;
					}
					if(randomcol3.equals("C"))
					{
						randcol3=3;
					}
					if(randomcol3.equals("D"))
					{
						randcol3=4;
					}
					if(randomcol3.equals("E"))
					{
						randcol3=5;
					}
					if(randomcol3.equals("F"))
					{
						randcol3=6;
					}
				//=====================================	
					
					
					Random r1 = new Random();
					int Low1 = 1;
					int High1 = 6;
					int randomrow1 = r1.nextInt(High1-Low1) + Low1;
					
					Random r2 = new Random();
					int Low2 = 1;
					int High2 = 6;
					int randomrow2 = r2.nextInt(High2-Low2) + Low2;
					
					Random r3 = new Random();
					int Low3 = 1;
					int High3 = 6;
					int randomrow3 = r3.nextInt(High3-Low3) + Low3;
					String images=User.getuserimages(uid);
					String userimages[]=images.split("~~");
					
					String image1=userimages[0];
					String image2=userimages[1];
					String image3=userimages[2];
					
					int horizantal_image=6;
					int vertical_image=28;
					
					String message="Slider OTC\n"+randomcol1+randomrow1+"\n"+randomcol2+randomrow2+"\n"+randomcol3+randomrow3+"\n";
					System.out.println("==========message==="+message);
					String usermail=User.getMailid(uid);
					
					System.out.println(":::::::::::::::::::::;usermail::::::::::::::;;;;"+usermail);
					String userphone=User.getUserPhone(uid);
					System.out.println(":::::::::::::::::::::;userphone::::::::::::::;;;;"+userphone);
					Send_Mail_Attachment.sendPersonalizedMail(usermail, "OTC for Slider", message, "no");
				    Send_SMS_Service.sendSMS(userphone, message);
					
					
					boolean insertflag=User.inserttootp(uid,image1,image2,image3,randomrow1,randcol1,randomrow2,randcol2,randomrow3,randcol3,horizantal_image,vertical_image);
					hs.setAttribute("image1",image1);
					hs.setAttribute("image2",image2);
					hs.setAttribute("image3",image3);
					
					
					
					rd = req.getRequestDispatcher("slider1.jsp?no=0&image1="+image1+"&no1=1");
					rd.forward(req, resp);
				}
				else
				{
					 RequestDispatcher rd=req.getRequestDispatcher("index.jsp?no=7");
					rd.forward(req, resp);
				}
			}
			else if(submit.equals("newuser"))
			{
				 RequestDispatcher rd=req.getRequestDispatcher("/jsp/User/registration.jsp");
					rd.forward(req, resp);
			}
			
			else if(submit.equals("forgotpass"))
			{
				 RequestDispatcher rd=req.getRequestDispatcher("/jsp/User/enteruid.jsp");
					rd.forward(req, resp);
			}
			
			
		} catch (Exception e)
		{
			System.out.println("********* Exception In New User Servlet ********\n");
			e.printStackTrace();
		}

	}

}
