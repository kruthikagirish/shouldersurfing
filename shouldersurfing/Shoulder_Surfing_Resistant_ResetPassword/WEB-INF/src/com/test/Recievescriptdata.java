package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOFactory.User;
import com.util.MD5ForString;

public class Recievescriptdata extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String alpha="";
	static int Result=0;
	String horizantalimage="";
	String verticalimage="";
	HttpSession session=null;
	HttpSession session2=null;
	HttpSession session3=null;
	String upperbuttonvalue=null;
	String lowerbuttonvalue=null;
	String leftbuttonvalue=null;
	String rightbuttonvalue=null;
	
	

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		HttpSession hs=request.getSession(true);
		String uid=hs.getAttribute("uid").toString();
				
		String path=request.getRealPath("")+"/Vertical/"	;	
		
	
		try
		{
		String submit=request.getParameter("submit");
		
		if(submit.equals("left1"))
		{
			boolean flag=User.updateleftbutton(uid);
			RequestDispatcher rd=request.getRequestDispatcher("slider1.jsp?no=1");
			  rd.forward(request, response);
		}
		
		if(submit.equals("right1"))
		{
			boolean flag=User.updaterightbutton(uid);
			RequestDispatcher rd=request.getRequestDispatcher("slider1.jsp?no=1");
			  rd.forward(request, response);
		}
		
		
		if(submit.equals("up1"))
		{
			boolean flag=User.updateupbutton(uid);
			RequestDispatcher rd=request.getRequestDispatcher("slider1.jsp?no=1");
			  rd.forward(request, response);
		}
		
		
		if(submit.equals("down1"))
		{
			boolean flag=User.updatedownbutton(uid);
			RequestDispatcher rd=request.getRequestDispatcher("slider1.jsp?no=1");
			  rd.forward(request, response);
		}
			
		//==================================================================================	
			
		
		if(submit.equals("left2"))
		{
			boolean flag=User.updateleftbutton2(uid);
			RequestDispatcher rd=request.getRequestDispatcher("slider2.jsp?no=1");
			  rd.forward(request, response);
		}
		
		if(submit.equals("right2"))
		{
			boolean flag=User.updaterightbutton2(uid);
			RequestDispatcher rd=request.getRequestDispatcher("slider2.jsp?no=1");
			  rd.forward(request, response);
		}
		
		
		if(submit.equals("up2"))
		{
			boolean flag=User.updateupbutton2(uid);
			RequestDispatcher rd=request.getRequestDispatcher("slider2.jsp?no=1");
			  rd.forward(request, response);
		}
		
		
		if(submit.equals("down2"))
		{
			boolean flag=User.updatedownbutton2(uid);
			RequestDispatcher rd=request.getRequestDispatcher("slider2.jsp?no=1");
			  rd.forward(request, response);
		}
		
			//===========================================================================================
		
		
		
		
		//==================================================================================	
		
		
				if(submit.equals("left3"))
				{
					boolean flag=User.updateleftbutton3(uid);
					RequestDispatcher rd=request.getRequestDispatcher("slider3.jsp?no=1");
					  rd.forward(request, response);
				}
				
				if(submit.equals("right3"))
				{
					boolean flag=User.updaterightbutton3(uid);
					RequestDispatcher rd=request.getRequestDispatcher("slider3.jsp?no=1");
					  rd.forward(request, response);
				}
				
				
				if(submit.equals("up3"))
				{
					boolean flag=User.updateupbutton3(uid);
					RequestDispatcher rd=request.getRequestDispatcher("slider3.jsp?no=1");
					  rd.forward(request, response);
				}
				
				
				if(submit.equals("down3"))
				{
					boolean flag=User.updatedownbutton3(uid);
					RequestDispatcher rd=request.getRequestDispatcher("slider3.jsp?no=1");
					  rd.forward(request, response);
				}
				
					//===========================================================================================

			if(submit.equals("slider1"))
			{
				
				
				
		         String getfirstcoordinate=User.getfirstcoordinate(uid);
		         
		         boolean Updatetoloc=User.updateloc1(uid,getfirstcoordinate);
		         boolean reset=User.resetverticalandhorizantal(uid);
		         
				
				 RequestDispatcher rd=request.getRequestDispatcher("slider2.jsp?no=0");
				  rd.forward(request, response);
			}
			
			//===========================================================================================
			
			
			if(submit.equals("slider2"))
			{
				
				
				
		         String getsecondcoordinate=User.getsecondtcoordinate(uid);
		         
		         boolean Updatetoloc=User.updateloc(uid,getsecondcoordinate);
		         boolean reset=User.resetverticalandhorizantal(uid);
		         
				
				 RequestDispatcher rd=request.getRequestDispatcher("slider3.jsp?no=0");
				  rd.forward(request, response);
			}
			
			//===========================================================================================
			
	//===========================================================================================
			
			
			if(submit.equals("slider3"))
			{
				
				
				
		         String getsecondcoordinate=User.getthirdcoordinate(uid);
		         
		         boolean Updatetoloc=User.updateloc(uid,getsecondcoordinate);
		         String loc= User.getallsliderloc(uid);
		         
		         boolean reset=User.resetverticalandhorizantal(uid);
		         String hashkey1= MD5ForString.getMD5(loc);
		         
		         String hashkey2=User.getUserHashKey(uid);
		         
		         if(hashkey1.equals(hashkey2))
		         {
		        	 boolean flag=User.deleteotp(uid);
		        	 RequestDispatcher rd=request.getRequestDispatcher("/jsp/User/userhome.jsp");
					  rd.forward(request, response); 
		         }
		         else
		         {
		        	 boolean flag=User.deleteotp(uid);
				
				 RequestDispatcher rd=request.getRequestDispatcher("index.jsp?no=7");
				  rd.forward(request, response);
		         }
			}
			
			//===========================================================================================

			if(submit.equals("back"))
			{
				
				 boolean flag=User.deleteotp(uid);
			
			    
				 RequestDispatcher rd=request.getRequestDispatcher("index.jsp?no=0");
				  rd.forward(request, response);
			}
			
			//===========================================================================================
			
			
			if(submit.equals("recieve"))
			{
				 String column=request.getParameter("column");
				    String row=request.getParameter("row");
				    
				    System.out.println("====column=servlet=="+column);
				    System.out.println("====row=servlet=="+row);
				    String corodinates=column+","+row;
				
				
				  
				  boolean flag=User.updatecoordinates1(corodinates,uid);
			     
					 RequestDispatcher rd=request.getRequestDispatcher("imagepasswordset2.jsp");
					  rd.forward(request, response);
				
			    
			}
			
			if(submit.equals("recieve2"))
			{
				 String column=request.getParameter("column");
				    String row=request.getParameter("row");
				    
				    System.out.println("====column=servlet=="+column);
				    System.out.println("====row=servlet=="+row);
				    String corodinates=column+","+row;
				
				
			      boolean flag=User.updatecoordinates2(corodinates,uid);
			    
					 RequestDispatcher rd=request.getRequestDispatcher("imagepasswordset3.jsp");
				  rd.forward(request, response);
				 
				  
				  
			    
			}
			
			if(submit.equals("recieve3"))
			{
				 String column=request.getParameter("column");
				    String row=request.getParameter("row");
				    
				    System.out.println("====column=servlet=="+column);
				    System.out.println("====row=servlet=="+row);
				    String corodinates=column+","+row;
				
				
			      boolean flag=User.updatecoordinates3(corodinates,uid);
			      String allcoordinates=User.getallcoordinates(uid);
			     String hashkey= MD5ForString.getMD5(allcoordinates);
			     boolean hashflag=User.Updatehashkey(uid,hashkey);
			     if(hashflag)
			     {
					 RequestDispatcher rd=request.getRequestDispatcher("index.jsp?no=8");
					  rd.forward(request, response);
			     }
			     else
			     {
			    	 RequestDispatcher rd=request.getRequestDispatcher("index.jsp?no=9");
					  rd.forward(request, response);
			    	 
			     }
			
			}
			
			
			
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
}
