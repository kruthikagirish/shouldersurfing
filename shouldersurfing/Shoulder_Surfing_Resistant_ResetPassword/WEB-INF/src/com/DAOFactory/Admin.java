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




public class Admin 
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	




	public static boolean checkAdmin(String uid, String pass) {
		boolean flag=false;
		try
		{
			String tablename="m_data_collection";
			Class.forName(Global.Driver);
			connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
			statement = connection.createStatement();
			String sql="select  *  from m_admin where adminid='"+uid+"' and adminpass='"+pass+"'";
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


	

public static ResultSet getAdminDetails(String uid) {
	boolean flag=false;
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="select * from m_admin where adminid='"+uid+"'";
		System.out.println(sql);
		resultSet=statement.executeQuery(sql);
		
		
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	
	
	return resultSet;
}

public static ResultSet getUsersDetails() {
	boolean flag=false;
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="select * from m_user";
		System.out.println(sql);
		resultSet=statement.executeQuery(sql);
		
		
		
	}
	catch(Exception e)
	{
		System.out.println("Opp's Error is in AdminDAO-register()....."+e);
	}
	
	
	return resultSet;
}

public static boolean updateAdminDetails(String uid,String uname,String phone,String email,String city,String gender) {
	boolean flag=false;
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="update m_admin set adminname='"+uname+"',gender='"+gender+"',email='"+email+"',phone='"+phone+"',city='"+city+"' where adminid='"+uid+"'";
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


public static boolean updateAdminpass(String uid,String currpass,String newpass) {
	boolean flag=false;
	try
	{
		
		Class.forName(Global.Driver);
		connection = DriverManager.getConnection(Global.URL, Global.Uname, Global.Pass);
		statement = connection.createStatement();
		String sql="update m_admin set adminpass='"+newpass+"' where adminid='"+uid+"'";
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

}
