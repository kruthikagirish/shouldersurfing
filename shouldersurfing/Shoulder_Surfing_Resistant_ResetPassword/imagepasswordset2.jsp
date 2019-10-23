<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" class="no-js" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html class="no-js" lang="en"> <!--<![endif]-->
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.util.Utility"%> 
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
        width:300px; height:400px;

}

img {
  width: 100%;
  display: block;
}

    
</style>



<!-- <script  src="http://code.jquery.com/jquery-1.9.1.min.js" ></script>  -->   
<script  src="js/jquery-1.9.1.min.js" ></script>   
<script>
    $(document).ready(function(){
        $("#myTable td").click(function() {     
 
            var column_num = parseInt( $(this).index() ) + 1;
            var row_num = parseInt( $(this).parent().index() )+1;    
            window.location.href = "imagepasswordset2.jsp?no="+2+"&x="+column_num+"&y="+row_num;
            /* $("#result").html( "Row_num =" + row_num + "  ,  Rolumn_num ="+ column_num );  */  
        });
    });
</script>
<link href="<%=request.getContextPath() %>/tablecss/CSS/style.css" rel="stylesheet" type="text/css" />

<script class="jsbin"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.0/jquery.min.js"></script>


    
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<%String image=session.getAttribute("randomimage2").toString();
System.out.println("------randimg2---"+image);
%>
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
</header>
<!--End Header-->

<!--start wrapper-->
<section class="wrapper">
    <section class="page_head">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12">
                    <div class="page_title">
                       
                    </div>
                   
                </div>
            </div>
        </div>
    </section>
    <div class="container">
        <div class="row sub_content">
            
           
            <div class="col-lg-6 col-sm-6" style="position:absolute; top: 250px;left: 400px;height:200px;">
                <div class="dividerHeading">
                    <h4><span>Image Password Setting</span></h4>
                </div>
                
                
                <table id="myTable" border="1" style="border-collapse: collapse;"  >
        <!--1st ROW-->
        <tr>
            <td ><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img0.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img1.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img2.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img3.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img4.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img5.jpg"></td>
        </tr>
 
        <!--2nd ROW-->
        <tr>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img6.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img7.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img8.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img9.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img10.jpg"></td>
              <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img11.jpg"></td>
        </tr>
 
        <!--3rd ROW-->
        <tr>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img12.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img13.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img14.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img15.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img16.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img17.jpg"></td>
        </tr>
 
        <!--4th ROW-->
        <tr>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img18.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img19.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img20.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img21.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img22.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img23.jpg"></td>
        </tr>
 
        <!--5th ROW-->
        <tr>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img24.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img25.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img26.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img27.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img28.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img29.jpg"></td>
        </tr>
         <tr>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img30.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img31.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img32.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img33.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img34.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img35.jpg"></td>
        </tr>
         <tr>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img36.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img37.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img38.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img39.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img40.jpg"></td>
             <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img41.jpg"></td>
        </tr>
         <tr>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img42.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img43.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img44.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img45.jpg"></td>
            <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img46.jpg"></td>
             <td><img src="<%=request.getContextPath()%>/PasswordImages/<%=image%>/Imageblocks/img47.jpg"></td>
        </tr>
    </table>
                
    
            </div>
            
             <div class="col-lg-6 col-sm-6"  style="position:absolute; top: 300px;left: 850px; width:300px;">
              
                
                
               
                
       <%

	if(Utility.parse(request.getParameter("no"))==2)
    {
    
    String column=request.getParameter("x");
    String row=request.getParameter("y");
    
    
    System.out.println("====column==="+column);
    System.out.println("====row==="+row);
    %>         
                
                
                
                
                
                
                
                
                
                
                
                
                <form id="registerform" method="get" name="registerform" action="<%=request.getContextPath()%>/Recievescriptdata">
                    <div class="form-group">
                        Column:<input type="text" class="form-control" name="column" value="<%=column%>">
                        Row:<input type="text"  class="form-control" name="row" value="<%=row%>">
                    </div>
                    
 
 
   
                   
                    
                    
                    <div class="form-group">
                     <button type="submit" name="submit" value="recieve2" class="btn btn-default btn-lg button">Submit</button>
                    
                        
                        
                    </div>
                </form>
                
                <%} %>
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

<!-- Start Style Switcher -->

<!-- End Style Switcher -->
</body>
</html>