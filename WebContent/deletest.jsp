<%@ page import="com.connect.services.*" %>
<%@ page import="java.sql.*" %>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--
	Author: W3layouts
	Author URL: http://w3layouts.com
	License: Creative Commons Attribution 3.0 Unported
	License URL: http://creativecommons.org/licenses/by/3.0/
-->

<html lang="zxx">

<head>
    <title>Black Spot Detection</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta name="keywords" content="Shipment a Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script>
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="css/owl.theme.css" type="text/css" media="all">
    <link rel="stylesheet" href="css/owl.carousel.css" type="text/css" media="screen" property="" />
    <link href="css/prettyPhoto.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="css/minimal-slider.css" type="text/css" media="all" />
    <link href="css/fontawesome-all.css" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800" rel="stylesheet">
    
   
</head>

<body>
    <div class="mian-content">
        <!-- main image slider container -->
        <div class="slide-window">
            <div class="slide-wrapper" style="width: 300%;">
                <div class="slide">
                   
                </div>
               
               
            </div>
            <div class="slide-controller">
                <div class="slide-control-left">
                    <div class="slide-control-line"></div>
                    <div class="slide-control-line"></div>
                </div>
                <div class="slide-control-right">
                    <div class="slide-control-line"></div>
                    <div class="slide-control-line"></div>
                </div>
            </div>
        </div>
        <!-- main image slider container -->

        <div class="header-top-w3layouts">
            <div class="container">

                
                    <div class="top-head-w3-agile text-left">
                        <div class="row top-content-info-wthree">
                            
                            <div class="col-lg-7 top-content-right">
                                <div class="row">
                                    <div class="col-md-6 callnumber text-left">
                                        
                                    </div>
                                    <div class="col-md-6 top-social-icons p-0">
                                       
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <div class="clearfix"></div>
                    <nav class="navbar navbar-expand-lg navbar-light">
                        <div class="text-center">
                            <h1>
                               
                            
                            </h1>
                        </div>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon">
                              
                            </span>

                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ml-lg-auto text-right">
                             
                              
                                
                                

                            </ul>

                           
                        </div>

                    </nav>
                <h2 class="text-center mb-4"> 
                               
                            
                            </h2>
                            <h2 class="text-center mb-4"> 
                              <p style="color:white;"> Delete Station</p>  
                            
                            </h2>
                        <form >
                          
								<div class="form-group">
									<label for="focusedinput" class="col-sm-2 control-label"><h4><p style="color:white;">Station ID</p></h4></label>
									<div class="col-sm-8">
										<input type="text" class="form-control1" id="focusedinput" placeholder="Enter station id" name="stid" required>
									</div>
									
								</div>
								
								
								
							
								<div class="text-center">
 									<button TYPE="submit" ONCLICK="alert('Delete Station Successfully')">Delete Station</button>
								</div>
								
								
							
								
								
								<table class="table">
								
							   <tbody>
							
							<%
							try
							{
								int staid=Integer.parseInt(request.getParameter("stid"));
								
								Connection con=Connect.getConnect();
								PreparedStatement ps3=con.prepareStatement("select * from admintbl1 where sid=?");
								ps3.setInt(1, staid);
								ResultSet rs1=ps3.executeQuery();
								while(rs1.next())
								{
									rs1.getInt(1);
							 	
								
								}
								PreparedStatement ps4=con.prepareStatement("delete from admintbl1 where sid=?");
								ps4.setInt(1, staid);
								int i=ps4.executeUpdate();
								if(i>0)
								{
									response.sendRedirect("login1.html");
								}
								else
								{
									response.sendRedirect("deletest.jsp");
								}
							}
							catch(Exception e)
							{
								e.printStackTrace();
							}
							
							%>
								
								
								
								
										  </tbody>
								</table>
							 
								
						
								
								
								
                           
                        </form>
                   
            </div>
        </div>

    </div>
    <!-- end of main image slider container -->
    <!-- banner-text -->
    <!-- ab -->
  
    <!-- //ab -->
    <!-- banner-bottom-w3ls -->
   
    <!-- //banner-bottom-w3ls -->
    <!-- /services -->
   
    <!-- //services -->
    <!--gallery  -->
    
    <!-- //gallery -->
    <!--/pricing -->
    
    <!-- //pricing -->
    <!-- /bottom-last -->
 
    <!-- //bottom-last -->
    <!--/Blog-Posts-->
  
    <!--//Blog-Posts-->
    <!--/testimonials-->
    
    <!--//testimonials-->

    <!--/newsletter-->
    
     
   
    <!--//newsletter-->
    <!--model-forms-->
    <!--/Login-->
    
        
            
                
               

                    
                        
               

           
        
    
    <!--//Login-->
    <!--/Register-->

    <!--//Register-->

    <!--//model-form-->
    <!-- js -->
    <script src="js/jquery-2.2.3.min.js"></script>
    <script src="js/minimal-slider.js"></script>
    <!-- carousel -->
    <script src="js/owl.carousel.js"></script>
    <script>
        $(document).ready(function() {
            $('.owl-carousel').owlCarousel({
                loop: true,
                margin: 10,
                responsiveClass: true,
                responsive: {
                    0: {
                        items: 1,
                        nav: true
                    },
                    600: {
                        items: 1,
                        nav: false
                    },
                    900: {
                        items: 1,
                        nav: false
                    },
                    1000: {
                        items: 3,
                        nav: true,
                        loop: false,
                        margin: 20
                    }
                }
            })
        })
    </script>
    <!-- //carousel -->
    <script>
        $(document).ready(function() {
            $(".dropdown").hover(
                function() {
                    $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                    $(this).toggleClass('open');
                },
                function() {
                    $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                    $(this).toggleClass('open');
                }
            );
        });
    </script>
    <!-- //dropdown nav -->
    <!-- password-script -->
    <script>
        window.onload = function() {
            document.getElementById("password1").onchange = validatePassword;
            document.getElementById("password2").onchange = validatePassword;
        }

        function validatePassword() {
            var pass2 = document.getElementById("password2").value;
            var pass1 = document.getElementById("password1").value;
            if (pass1 != pass2)
                document.getElementById("password2").setCustomValidity("Passwords Don't Match");
            else
                document.getElementById("password2").setCustomValidity('');
            //empty string means no validation error
        }
    </script>
    <!-- //password-script -->
    <!--/ start-smoth-scrolling -->
    <script src="js/move-top.js"></script>
    <script src="js/easing.js"></script>
    <script>
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event) {
                event.preventDefault();
                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 900);
            });
        });
    </script>
    <script>
        $(document).ready(function() {
            /*
            						var defaults = {
            							  containerID: 'toTop', // fading element id
            							containerHoverID: 'toTopHover', // fading element hover id
            							scrollSpeed: 1200,
            							easingType: 'linear' 
            						 };
            						*/

            $().UItoTop({
                easingType: 'easeOutQuart'
            });

        });
    </script>
    <!--// end-smoth-scrolling -->
	<!-- /js -->
    <script src="js/bootstrap.js"></script>
    <!-- //js -->
    <!-- jQuery-Photo-filter-lightbox-Gallery-plugin -->
    <!--// end-smoth-scrolling -->
    <script src="js/jquery-1.7.2.js"></script>
    <script src="js/jquery.quicksand.js"></script>
    <script src="js/pretty-script.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <!-- //jQuery-Photo-filter-lightbox-Gallery-plugin -->

</body>

</html>