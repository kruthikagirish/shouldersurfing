/**
 * 
 */
package com.DAOFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import com.database.Global;




public class User 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	



	public static boolean updaterightbutton(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set horizantal_image=horizantal_image+1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomcol1=randomcol1+1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updaterightbutton2(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set horizantal_image=horizantal_image+1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomcol2=randomcol2+1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updaterightbutton3(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set horizantal_image=horizantal_image+1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomcol3=randomcol3+1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	
	public static boolean updateleftbutton(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set horizantal_image=horizantal_image-1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomcol1=randomcol1-1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updateleftbutton2(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set horizantal_image=horizantal_image-1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomcol2=randomcol2-1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updateleftbutton3(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set horizantal_image=horizantal_image-1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomcol3=randomcol3-1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	
	public static boolean updateupbutton(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set vertical_image=vertical_image-1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomrow1=randomrow1-1 where uid='"+uid+"'";
			
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updateupbutton3(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set vertical_image=vertical_image-1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomrow3=randomrow3-1 where uid='"+uid+"'";
			
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updateupbutton2(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set vertical_image=vertical_image-1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomrow2=randomrow2-1 where uid='"+uid+"'";
			
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	
	public static boolean updatedownbutton(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set vertical_image=vertical_image+1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomrow1=randomrow1+1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			
			
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	public static boolean updatedownbutton2(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set vertical_image=vertical_image+1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomrow2=randomrow2+1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			
			
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updatedownbutton3(String uid) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user_otp set vertical_image=vertical_image+1 where uid='"+uid+"'";
			String sql2="update  m_user_otp set randomrow3=randomrow3+1 where uid='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			
			
			System.out.println(sql2);
			int j=statement.executeUpdate(sql2);
			if(j!=0)
			{
				flag=true;
			}
			
			
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	
	public static boolean resethorizantalimage(int value,String alpha) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_scroller_value set uid='1',m_horizantalvalue='"+value+"',m_image_name=6 where m_horizantal='"+alpha+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	
	public static boolean resetverticalimage(int j) {
		boolean flag=false;
	
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_scroller_vertical_value set uid='1',m_vertical_value='"+j+"',m_image_name=28 where m_vertical='"+j+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}

	




	public static String gethorizantalimage(String uid) 
	{

		String image="";
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="SELECT horizantal_image from m_user_otp where uid='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				image=resultSet.getString(1);
				
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return image;
	}
	
	public static String getverticalimage(String uid) 
	{

		String image="";
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="SELECT vertical_image from m_user_otp where uid='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				image=resultSet.getString(1);
				
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return image;
	}


	public static String getcitydatabydateandTime(String ip,
			String curdate, String curtime)
			{
		  StringBuffer sb=new StringBuffer();
		  String data=null;
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="SELECT * FROM m_data_collection where point_of_interest='"+ip+"' and dc_date='"+curdate+"' and dc_time like '"+curtime+"%' ORDER BY dc_no DESC LIMIT 1";
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~"+sql);
			resultSet=statement.executeQuery(sql);
			
			
				
			
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1));
				sb.append("~~");
				sb.append(resultSet.getString(5));
				data=sb.toString();
			}
			
			System.out.println("===DATA==="+data);
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return data;
	}


	public static int getAutoIncr() 
	{
		 int incr=0;
			try
			{
				String tablename="m_data_collection";
				Class.forName(Global.Driver);
				connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
				statement = connection.createStatement();
				String sql="SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = '"+tablename+"' AND table_schema = DATABASE( ) ;";
				System.out.println(sql);
				resultSet=statement.executeQuery(sql);
				while(resultSet.next())
				{
					incr=resultSet.getInt(1);
				}
				
				
			}
			catch(Exception e)
			{
				System.out.println("Opp's Error is in AdminDAO-register()....."+e);
			}
			return incr;
	}


	public static boolean insertUser(String uid, String uname, String password,
			String gender, String email, String phone, String city,String randomimage1, String randomimage2, String randomimage3) 
	{
		boolean flag=false;
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="insert into m_user(u_id,u_txtpwd,u_name,u_gender,u_email,u_phone,u_city,random_image1,random_image2,random_image3)values('"+uid+"','"+password+"','"+uname+"','"+gender+"','"+email+"','"+phone+"','"+city+"','"+randomimage1+"','"+randomimage2+"','"+randomimage3+"')";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean ResetUserPass(String uid, String randomimage1, String randomimage2, String randomimage3) 
	{
		boolean flag=false;
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update  m_user set random_image1='"+randomimage1+"',random_image2='"+randomimage2+"',random_image3='"+randomimage3+"' where u_id='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}


	public static boolean updatecoordinates1(String corodinates,String uid) {
		boolean flag=false;
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update m_user set selectedlocation1='"+corodinates+"' where u_id='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updatecoordinates2(String corodinates,String uid) {
		boolean flag=false;
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update m_user set selectedlocation2='"+corodinates+"' where u_id='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	
	public static boolean updatecoordinates3(String corodinates,String uid) {
		boolean flag=false;
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update m_user set selectedlocation3='"+corodinates+"' where u_id='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}


	public static boolean CheckCoordinate1(String uid) 
	{
		boolean flag=false;
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select selectedlocation1 from m_user where u_id='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return flag;
	}
	
	
	public static boolean CheckCoordinate2(String uid) 
	{
		boolean flag=false;
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select selectedlocation2 from m_user where u_id='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return flag;
	}
	
	
	
	public static boolean CheckCoordinate3(String uid) 
	{
		boolean flag=false;
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select selectedlocation3 from m_user where u_id='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return flag;
	}


	public static String getallcoordinates(String uid)
	{
		StringBuffer sb=new StringBuffer();
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select selectedlocation1,selectedlocation2,selectedlocation3 from m_user where u_id='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1));
				sb.append(",");
				sb.append(resultSet.getString(2));
				sb.append(",");
				sb.append(resultSet.getString(3));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return sb.toString();
	}


	public static boolean Updatehashkey(String uid,String hashkey) {
		boolean flag=false;
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="update m_user set hash_key='"+hashkey+"' where u_id='"+uid+"'";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}


	public static boolean checkUser(String uid, String pass) {
		boolean flag=false;
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select  *  from m_user where u_id='"+uid+"' and u_txtpwd='"+pass+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return flag;
	}
	
	public static boolean checkUser(String uid) {
		boolean flag=false;
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select  *  from m_user where u_id='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return flag;
	}


	public static String getuserimages(String uid)
	{
		StringBuffer sb=new StringBuffer();
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select random_image1,random_image2,random_image3 from m_user where u_id='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1));
				sb.append("~~");
				sb.append(resultSet.getString(2));
				sb.append("~~");
				sb.append(resultSet.getString(3));
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return sb.toString();
	}


	public static boolean inserttootp(String uid, String image1, String image2,
			String image3, int randomrow1, int randomcol1, int randomrow2,
			int randomcol2, int randomrow3, int randomcol3,
			int horizantal_image, int vertical_image)
	{
		boolean flag=false;
		try
		{
			
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="insert into m_user_otp(uid,image1,image2,image3,randomrow1,randomcol1,randomrow2,randomcol2,randomrow3,randomcol3,horizantal_image,vertical_image)values('"+uid+"','"+image1+"','"+image2+"','"+image3+"','"+randomrow1+"','"+randomcol1+"','"+randomrow2+"','"+randomcol2+"','"+randomrow3+"','"+randomcol3+"','"+horizantal_image+"','"+vertical_image+"')";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}


	public static String getfirstcoordinate(String uid) {
		StringBuffer sb=new StringBuffer();
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select randomcol1,randomrow1  from m_user_otp where uid='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1));
				sb.append(",");
				sb.append(resultSet.getString(2));
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return sb.toString();
	}
	
	public static String getsecondtcoordinate(String uid) {
		StringBuffer sb=new StringBuffer();
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select randomcol2,randomrow2  from m_user_otp where uid='"+uid+"'";
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1));
				sb.append(",");
				sb.append(resultSet.getString(2));
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return sb.toString();
	}
	
	
	public static String getthirdcoordinate(String uid) {
		StringBuffer sb=new StringBuffer();
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select randomcol3,randomrow3 from m_user_otp where uid='"+uid+"'";  
			System.out.println(sql);
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1));
				sb.append(",");
				sb.append(resultSet.getString(2));
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		
		
		return sb.toString();
	}

	public static boolean updateloc1(String uid,String coordinates) {
		boolean flag=false;
		try
		{
			String previousloc="";
			StringBuffer sb=new StringBuffer();
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			
			
						
			
			
			
			String sql2="update m_user_otp set m_locations='"+coordinates+"' where uid='"+uid+"'";
			System.out.println(sql2);
			int i=statement.executeUpdate(sql2);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	

	public static boolean updateloc(String uid,String coordinates) {
		boolean flag=false;
		try
		{
			String previousloc="";
			StringBuffer sb=new StringBuffer();
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			
			String sql="select m_locations from  m_user_otp  where uid='"+uid+"'";
			resultSet=statement.executeQuery(sql);
			if(resultSet!=null)
			{
			while(resultSet.next())
			{
				sb.append(resultSet.getString(1));
				sb.append(",");
				sb.append(coordinates);
				flag=true;
				System.out.println("===============flag======================"+flag);
				
			}
			}
			
			if(flag)
			{
				coordinates=sb.toString();	
			}
						
			
			
			
			String sql2="update m_user_otp set m_locations='"+coordinates+"' where uid='"+uid+"'";
			System.out.println(sql2);
			int i=statement.executeUpdate(sql2);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-register()....."+e);
		}
		return flag;
	}
	


public static boolean resetverticalandhorizantal(String uid) {
	boolean flag=false;
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="update m_user_otp set horizantal_image='6',vertical_image='28' where uid='"+uid+"'";
		System.out.println(sql);
		int i=statement.executeUpdate(sql);
		if(i!=0)
		{
			flag=true;
		}
		System.out.println("User Registeration Status : "+flag);
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	return flag;
}

public static String getallsliderloc(String uid) {
	String loc="";
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="select m_locations from m_user_otp where uid='"+uid+"'";  
		System.out.println(sql);
		resultSet=statement.executeQuery(sql);
		while(resultSet.next())
		{
			loc=resultSet.getString(1);
			
			
		}
		
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	
	
	return loc;
}

public static String getUserHashKey(String uid)
{
	String hash="";
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="select hash_key from m_user where u_id='"+uid+"'";  
		System.out.println(sql);
		resultSet=statement.executeQuery(sql);
		while(resultSet.next())
		{
			hash=resultSet.getString(1);
			
			
		}
		
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	
	
	return hash;
}

public static boolean deleteotp(String uid)
{
boolean flag=false;
try
{
	
	Class.forName(Global.Driver);
	connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
	statement = connection.createStatement();
	String sql="delete from m_user_otp where uid='"+uid+"'";
	System.out.println(sql);
	int i=statement.executeUpdate(sql);
	if(i!=0)
	{
		flag=true;
	}
	System.out.println("User Registeration Status : "+flag);
}
catch(Exception e)
{
	System.out.println("Opp's Error is in AdminDAO-register()....."+e);
}
return flag;
}

public static boolean checkUserexists(String uid)
{
	boolean flag=false;
	try
	{
		String tablename="m_data_collection";
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="select u_id from m_user where u_id='"+uid+"'";
		System.out.println(sql);
		resultSet=statement.executeQuery(sql);
		while(resultSet.next())
		{
			flag=true;
		}
		
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	
	
	return flag;
}

public static ResultSet getUserDetails(String uid) {
	boolean flag=false;
	try
	{
		String tablename="m_data_collection";
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="select * from m_user where u_id='"+uid+"'";
		System.out.println(sql);
		resultSet=statement.executeQuery(sql);
		
		
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	
	
	return resultSet;
}

public static boolean updateUserDetails(String uid,String uname,String phone,String email,String city,String gender) {
	boolean flag=false;
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="update m_user set u_name='"+uname+"',u_gender='"+gender+"',u_email='"+email+"',u_phone='"+phone+"',u_city='"+city+"' where u_id='"+uid+"'";
		System.out.println(sql);
		int i=statement.executeUpdate(sql);
		if(i!=0)
		{
			flag=true;
		}
		System.out.println("User Registeration Status : "+flag);
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	return flag;
}


public static boolean updateUserpass(String uid,String currpass,String newpass) {
	boolean flag=false;
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="update m_user set u_txtpwd='"+newpass+"' where u_id='"+uid+"'";
		System.out.println(sql);
		int i=statement.executeUpdate(sql);
		if(i!=0)
		{
			flag=true;
		}
		System.out.println("User Registeration Status : "+flag);
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	return flag;
}

public static String getMailid(String uid)
{
	String mail="";
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="select u_email,u_phone from m_user where u_id='"+uid+"'";  
		System.out.println(sql);
		resultSet=statement.executeQuery(sql);
		while(resultSet.next())
		{
			mail=resultSet.getString(1);
			
			
		}
		
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	
	
	return mail;
}

public static String getUserPhone(String uid)
{
	String phone="";
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="select u_phone from m_user where u_id='"+uid+"'";  
		System.out.println(sql);
		resultSet=statement.executeQuery(sql);
		while(resultSet.next())
		{
			phone=resultSet.getString(1);
					
		}
		
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	
	
	return phone;
}

}
