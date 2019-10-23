package com.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class TestMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		try{
		
		 String postData = "";
		 String mobileno="9916119479";
		 String message="lll";
         String retval = "";
         String User = "blrstore";
         String passwd = "dhscvs123";
         String sid = "dhs";
         String mtype = "N";
         String DR = "Y";
         postData = postData + "User=" + URLEncoder.encode(User, "UTF-8") + "&passwd=" + passwd + "&mobilenumber=" + mobileno + "&message=" + URLEncoder.encode(message, "UTF-8") + "&sid=" + sid + "&mtype=" + mtype + "&DR=" + DR;
         URL url = new URL("http://smscountry.com/SMSCwebservice.asp");
         HttpURLConnection urlconnection = (HttpURLConnection)url.openConnection();
         urlconnection.setRequestMethod("POST");
         urlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
         urlconnection.setDoOutput(true);
         OutputStreamWriter out = new OutputStreamWriter(urlconnection.getOutputStream());
         out.write(postData);
         out.close();
         BufferedReader in = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));
         String decodedString;
         while((decodedString = in.readLine()) != null) 
             retval = retval + decodedString;
         in.close();
         System.out.println(retval);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
