<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.util.Utility" %> 
      <%@ page import="com.DAOFactory.User" %> 
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Graphical_Authentication_System</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />

    <!-- CSS FILES -->
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="css/layout/wide.css" data-name="layout">
    <link rel="stylesheet" href="css/animate.css" type="text/css"/>

    <link rel="stylesheet" type="text/css" href="css/switcher.css" media="screen" />
    
    
    
    <link rel="stylesheet" type="text/css" href="Style/css/vendor/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="Style/css/style.css">
    <link rel="stylesheet" type="text/css" href="Style/css/style.css" media="screen" data-name="skins">
    <link rel="stylesheet" href="Style/css/style-fraction.css" type="text/css" charset="utf-8" />
    <link rel="stylesheet" href="Style/css/fractionslider.css">

    <link rel="stylesheet" type="text/css" href="Style/css/switcher.css" media="screen" />
    
    <style>
    td{
        cursor:pointer;
        background: -moz-linear-gradient(top, #ffffff, #D1E3E9);
        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#ffffff), to(#D1E3E9));
        text-align:center;
        width: 50px;
        height: 50px;
    }
    
    td img {
    max-width:100%;
    height:auto;
}
 
    td:hover{
        background: -moz-linear-gradient(top, #249ee4, #057cc0);
        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#249ee4), to(#057cc0));
    }
 
    td:active
    {
        background: -moz-linear-gradient(top, #057cc0, #249ee4);
        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#057cc0), to(#249ee4));
    }
 
    #result{
        font-weight:bold;
        font-size:16pt;
    }
    
    #myTable{
        width:100%; height:auto;

}

img {
  width: 100%;
  display: block;
}

    
</style>



<script  src="js/jquery-1.9.1.min.js" ></script>     

<link href="<%=request.getContextPath() %>/tablecss/CSS/style.css" rel="stylesheet" type="text/css" />

<script class="jsbin"
	src="js/jquery.min.js"></script>

    
    <%String uid=session.getAttribute("uid").toString();
String image3=session.getAttribute("image3").toString();
%>
</head>
<body>

<!--Start Header-->
<header id="header">
    <div id="top-bar">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 top-info hidden-xs">
                   
                </div>
                
            </div>
        </div>
    </div>
    <div id="logo-bar">
        <div class="container">
            <div class="row">
                <!-- Logo / Mobile Menu -->
                <div  class="col-lg-3 col-sm-3 ">
                    <div id="logo">
                         <h1><a href="index.jsp"><img alt="logo" style="width: 1200px; height: 100px" src="images/title.png"/></a></h1>
                    </div>
                </div>
                <!-- Navigation
================================================== -->
                
            </div>
        </div>
    </div>
    
    <div id="top-bar" style="position:absolute; top: 170px; width:100%;"  >
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 top-info hidden-xs" >
                        
                    </div>
                   
                </div>
            </div>
        </div>
</header>
<!--End Header-->

<!--start wrapper-->
<section class="wrapper">
    <section class="page_head">
        <div class="container">
          
        </div>
    </section>
    <div class="container">
        <div class="row sub_content">
            
           
            <div class="col-lg-6 col-sm-6" style="position:absolute; top: -30px;left: 300px;">
                <div class="dividerHeading">
                    <h4><span>Image Password Setting</span></h4>
                </div>
                
                <form action="<%=request.getContextPath()%>/Recievescriptdata" method="get">
<%

	if(Utility.parse(request.getParameter("no"))==0)
    {
		
		
		
		
		%>
		
	<div style="position:absolute; top: 229px;left: 250px;">
			<button type="submit" name="submit" value="left3" class="btn btn-default btn-lg button"><<</button> 
	
		</div>
		
	
		<div style="position:absolute; top: 229px;left: 300px;">
		<img src="6.jpg">
			</div>
			
			<div style="position:absolute; top: 229px;left: 602px;">
			 <button type="submit" name="submit" value="right3" class="btn btn-default btn-lg button">>></button>
	
		</div>
		
		
		
		<div style="position:absolute; top: 280px;left: 200px;">
		<button type="submit" name="submit" value="up3" class="btn btn-default btn-lg button">^</button>  <br><br> <br><br><br><br><br><br> <br><br> <br><br> <br><br> <br><br><br> <button type="submit" name="submit" value="down3" class="btn btn-default btn-lg button">v</button>
		</div>
		
		
		
		<div style="position:absolute; top: 280px;left: 250px;">
		<img src="28.jpg">	
		</div>
		
		<div style="position:absolute; top: 280px;left: 300px;">
		<img src="<%=request.getContextPath()%>/PasswordImages/<%=image3%>/<%=image3%>.jpg">	
		</div>
		
		

		
    <%
      }
		


	
	
	
	

	if(Utility.parse(request.getParameter("no"))==1)
    {
		String gethorizantalimage=User.gethorizantalimage(uid);
		String getverticalimage=User.getverticalimage(uid);
		
		if(gethorizantalimage.equals("1"))
		{
		%>
	
		<div style="position:absolute; top: 229px;left: 250px;">
			<button type="submit" name="submit" value="left3" disabled="disabled" class="btn btn-default btn-lg button"><<</button> 
	
		</div>
		
		
		<div style="position:absolute; top: 229px;left: 300px;">
		<img src="<%=gethorizantalimage%>.jpg">
			</div>
			
			
			<div style="position:absolute; top: 229px;left: 602px;">
			 <button type="submit" name="submit" value="right3" class="btn btn-default btn-lg button">>></button>
	
		</div>
		
		
		
		<%}
		else if(gethorizantalimage.equals("11"))
		{
		%>
		
		
		<div style="position:absolute; top: 229px;left: 250px;">
			<button type="submit" name="submit" value="left3"  class="btn btn-default btn-lg button"><<</button> 
	
		</div>
		
		
		<div style="position:absolute; top: 229px;left: 300px;">
		<img src="<%=gethorizantalimage%>.jpg">
			</div>
			
			
			<div style="position:absolute; top: 229px;left: 602px;">
			 <button type="submit" name="submit" value="right3" disabled="disabled"  class="btn btn-default btn-lg button">>></button>
	
		</div>
		
		
		<%} 
		else
		{%>
		
		
		
		<div style="position:absolute; top: 229px;left: 250px;">
			<button type="submit" name="submit" value="left3"  class="btn btn-default btn-lg button"><<</button> 
	
		</div>
		
		
		<div style="position:absolute; top: 229px;left: 300px;">
		<img src="<%=gethorizantalimage%>.jpg">
			</div>
			
			
			<div style="position:absolute; top: 229px;left: 602px;">
			 <button type="submit" name="submit" value="right3"  class="btn btn-default btn-lg button">>></button>
	
		</div>
		
		
		<%}%>
		
		<%if(getverticalimage.equals("21"))
			{%>
		
		
		
		<div style="position:absolute; top: 280px;left: 200px;">
		<button type="submit" name="submit" value="up3" disabled="disabled" class="btn btn-default btn-lg button">^</button>  <br><br> <br><br><br><br><br><br> <br><br> <br><br> <br><br> <br><br><br> <button type="submit" name="submit" value="down3" class="btn btn-default btn-lg button">v</button>
		</div>
		
		
		
		<div style="position:absolute; top: 280px;left: 250px;">
		<img src="<%=getverticalimage%>.jpg">	
		</div>
		
		
		
		<%} 
		else if(getverticalimage.equals("35"))
		{
		%>
		
		
		<div style="position:absolute; top: 280px;left: 200px;">
		<button type="submit" name="submit" value="up3"  class="btn btn-default btn-lg button">^</button>  <br><br> <br><br><br><br><br><br> <br><br> <br><br> <br><br> <br><br><br> <button type="submit" name="submit" value="down3" disabled="disabled" class="btn btn-default btn-lg button">v</button>
		</div>
		
		
		
		<div style="position:absolute; top: 280px;left: 250px;">
		<img src="<%=getverticalimage%>.jpg">	
		</div>
		<%}
		
		else
		{
		%>
		<div style="position:absolute; top: 280px;left: 200px;">
		<button type="submit" name="submit" value="up3"  class="btn btn-default btn-lg button">^</button>  <br><br> <br><br><br><br><br><br> <br><br> <br><br> <br><br> <br><br><br> <button type="submit" name="submit" value="down3" class="btn btn-default btn-lg button">v</button>
		</div>
		
		
		
		<div style="position:absolute; top: 280px;left: 250px;">
		<img src="<%=getverticalimage%>.jpg">	
		</div>
		
		<%} %>
		
		<div style="position:absolute; top: 280px;left: 300px;">
		<img src="<%=request.getContextPath()%>/PasswordImages/<%=image3%>/<%=image3%>.jpg">	
		</div>
		
		
		
		
		
	
    <%
      }
		


	%>
	


<div style="position:absolute; top: 690px;left: 350px;">
		<button type="submit" name="submit" value="slider3" class="btn btn-default btn-lg button">Submit</button>
		
        </div>
        
         <div style="position:absolute; top: 690px;left: 450px;">
		<button type="submit" name="submit" value="back" class="btn btn-default btn-lg button">Back To Login</button>
		</div>
        


</form>
            </div>
            
             
            </div>
            </div>
            </section>
  
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/retina-1.1.0.min.js"></script>
<script type="text/javascript" src="js/jquery.cookie.js"></script> <!-- jQuery cookie -->
<script type="text/javascript" src="js/styleswitch.js"></script> <!-- Style Colors Switcher -->
<script type="text/javascript" src="js/jquery.smartmenus.min.js"></script>
<script type="text/javascript" src="js/jquery.smartmenus.bootstrap.min.js"></script>
<script type="text/javascript" src="js/owl.carousel.js"></script><!-- Popover-JS -->
<script type="text/javascript" src="js/jflickrfeed.js"></script>
<script type="text/javascript" src="js/jquery.magnific-popup.min.js"></script>
<script type="text/javascript" src="js/jquery.isotope.min.js"></script>
<script type="text/javascript" src="js/swipe.js"></script>
<script type="text/javascript" src="js/jquery-scrolltofixed-min.js"></script>

<script src="js/main.js"></script>


</body>
</html>