package com.util;

import java.io.IOException;
import java.net.MalformedURLException;


public class BMICalculation

{
	
	
	public static String getbmi(String weight,String height) throws IOException, MalformedURLException
	{
		StringBuffer sb=new StringBuffer();
		double bmi=0;
		
		bmi=Double.parseDouble(weight)/(Double.parseDouble(height)*Double.parseDouble(height));
		
		
		sb.append(weight);
		sb.append("~~");
		sb.append(height);
		sb.append("~~");
		sb.append(bmi);
		
		
		
		return sb.toString();
		
	}
	
	
	

    public static void main(String[] args)
    {
       try
       {
    	   
    	/*   
    	  String weather=WeightCalculation.getWeight( weight, planet);
    	  System.out.println("================="+weather);*/
		
	   } 
       catch (Exception e)
       {
		// TODO: handle exception
	   }
    	
    	
    	
      
    }
    
    
}