<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
  
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.util.*" %>
<%@ page import="java.sql.*" %>
<%@page import="java.text.DecimalFormat" %>
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
    <link rel="stylesheet" href="HomepageCss/css/styles.css" type="text/css" />
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



<script  src="http://code.jquery.com/jquery-1.9.1.min.js" ></script>     

<link href="<%=request.getContextPath() %>/tablecss/CSS/style.css" rel="stylesheet" type="text/css" />

<script class="jsbin"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.0/jquery.min.js"></script>

    
   


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
        
        <div id="logo">
                            <h1><a href=""><img alt="logo" style="width: 1024px;height:100px;" src="images/title.png"/></a></h1>
                        </div>
        
        <div id="logo-bar">
            <div class="container">
                <div class="row">
                  
                    <div  class="col-lg-3 col-sm-3 " style="position:absolute; top: 5px;height:100px;">
                        
                    </div>
                    </div>
                    </div>
                    </div>
                      <div id="top-bar" style="position:absolute; top: 150px; width:100%;"  >
            <div class="container">
                <div class="row">
                    <div class="col-sm-8 top-info hidden-xs" >
                        
                    </div>
                   
                </div>
            </div>
        </div>
        
        
        
        
        
        
       <div id="logo-bar">
            <div class="container">
                <div class="row">
                   
                    <div  class="col-lg-3 col-sm-3 ">
                        <div id="logo">
                           
                        </div>
                    </div>
                    <!-- Navigation
    ================================================== -->
                    <div class="col-lg-9 col-sm-9" style="position:absolute; top: 150px;">
                        <div class="navbar navbar-default navbar-static-top" role="navigation">
                            <!--  <div class="container">-->
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                            <div class="navbar-collapse collapse">
                                <ul class="nav navbar-nav">
                                    <li><a href="<%=request.getContextPath() %>/UserHome">Home</a>
                                      
                                    </li>

                                    <li><a href="#">Show Profile</a>
                                        <ul class="dropdown-menu">
                                            <li><a href="<%=request.getContextPath() %>/UserProfile">View Profile</a></li>
                                            <li><a href="<%=request.getContextPath() %>/EditUserProfile?submit=edit">Edit Profile</a></li>
                                           
                                        </ul>
                                    </li>
                                    
                                    
                                     <li> <a href="<%=request.getContextPath() %>/CalculateBMI?submit=get">Calculate BMI</a></li>

                                    <li> <a href="<%=request.getContextPath() %>/ChangePass?submit=pass">Change Password</a>
                                       
                                    </li>

                                    <li><a href="<%=request.getContextPath() %>/index.jsp">LogOut</a>
                                        
                                            </li>
                                           

                                       
                                </ul>
                            </div>
                        </div>
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
    
    <form id="registerform" method="get" name="registerform" action="<%=request.getContextPath()%>/CalculateBMI">
    <input type="hidden" name="submit" value="calculate">
     <div class="row sub_content">
            
           <div class="col-lg-6 col-sm-6" style="position:absolute; top: 300px;left: 300px;">
           <div class="project_details">
							
							<ul class="details">
								
								<li><span>Enter Your Weight in KG: </span>  <input type="text" class="form-control" name="weight" 	></li>
								
								
							</ul>
						</div>
						 <div class="project_details">
							
							<ul class="details">
								
								<li><span>Enter Your Height in Meters: </span>  <input type="text" class="form-control" name="height" 	></li>
								
								
							</ul>
						</div>
						 <button type="submit" name="submit" value="submit" class="btn btn-default btn-lg button">Submit</button>
           
           </div> 
           
            
             
            </div>
          </form>  
            
        
            </div>
           
            
            
            
            
            
            <%
		int noo=Utility.parse(request.getParameter("no"));
		if(noo==1)
{
			System.out.println("===============SSSSSSSSSSSS==================");
			
			String weight=session.getAttribute("weight").toString();
			
			String height=session.getAttribute("height").toString();
			
			String bmi=session.getAttribute("bmi").toString();
			
			double calculatedbmi=Double.parseDouble(bmi);
			
			
			
	%>
	
    <div class="container">
    
    <form id="registerform" method="get" name="registerform" action="<%=request.getContextPath()%>/CalculateBMI">
     <input type="hidden" name="submit" value="calculate">
     <div class="row sub_content">
            
           <div class="col-lg-6 col-sm-6" style="position:absolute; top: 300px;left: 300px;">
           <div class="project_details">
							
							<ul class="details">
								
								<li><span>Your Weight in KG: </span>  <input type="text" value=<%=weight%> class="form-control" name="weight" 	></li>
								
								
							</ul>
						</div>
						  <div class="project_details">
							
							<ul class="details">
								
								<li><span> Your Height in Meters: </span>  <input type="text" value=<%=height%> class="form-control" name="height" 	></li>
								
								
							</ul>
						</div>
						 <button type="submit" name="submit" value="changepass" class="btn btn-default btn-lg button">Submit</button>
						 
						 
						 
						  <div class="project_details">
							
							
                    <div class="form-group">
                        <div class="input-group">
                            <span ><b>BMI less than 18.5: Underweight</b></span>
                           
                        </div>
                    </div>
                    <div class="form-group">
                         <div class="input-group">
                            <span ><b> BMI between 18.5 and 25: Healthy weight </b></span>
                           
                        </div>
                    </div>
                   
                    <div class="form-group">
                         <div class="input-group">
                            <span ><b>BMI between 25 and 30: Overweight</b></span>
                           
                        </div>
                    </div>
                     <div class="form-group">
                         <div class="input-group">
                            <span ><b> BMI between 30 and 40: Obese</b> </span>
                           
                        </div>
                    </div>
                    
                     <div class="form-group">
                         <div class="input-group">
                            <span ><b>BMI over 40: Very obese</b> </span>
                           
                        </div>
                    </div>
                    
               
						</div>
						 
						 
						 
           
           </div> 
           
            
             
            </div>
          </form>  
            
        
            </div>
    
    <form id="registerform" method="get" name="registerform" action="<%=request.getContextPath()%>/CalculateBMI">
    
     <div class="row sub_content">
            
           <div class="col-lg-6 col-sm-6" style="position:absolute; top: 500px;left: 300px;">
           <div class="project_details">
							
							
                    <div class="form-group">
                        <div class="input-group">
                            <span ><b>Your BMI  is <%=new DecimalFormat("##.##").format(calculatedbmi)%></b></span>
                            
                            
                           
                           
                        </div>
                    </div>
                   
                   
                    
                    
                     
                    
               
						</div>
						
           
           </div> 
           
            
             
            </div>
          </form>  
          
          
          
            
        
           
            
			
	<%
}
		%>
            
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