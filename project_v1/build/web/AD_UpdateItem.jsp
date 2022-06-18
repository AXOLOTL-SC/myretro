<%-- 
    Document   : AD_UpdateCheckAvailability
    Created on : Feb 1, 2021, 10:34:24 PM
    Author     : GoGoBe
--%>

<%@page import="bean.item"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="bean.AD_ItemAvailability" %>

<!DOCTYPE html>
<html>
   
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Admin Update Check Availability Page</title>
     <link rel="stylesheet" type="text/css" href="style/type.css">
        <link href="css/main.css" rel="stylesheet" media="all">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
    <!-- Custom Stylesheet -->
    <link href="css/style_1.css" rel="stylesheet">

</head>

<body>

    <!--*******************
        Preloader start
    ********************-->
    <div id="preloader">
        <div class="loader">
            <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
            </svg>
        </div>
    </div>
    <!--*******************
        Preloader end
    ********************-->

    
    <!--**********************************
        Main wrapper start
    ***********************************-->
    <div id="main-wrapper">

        <!--**********************************
            Nav header start
        ***********************************-->
        <div class="nav-header">
            <div class="brand-logo">
                <a href="index.html">
                    <b class="logo-abbr"><img src="images/logo.png" alt=""> </b>
                    <span class="logo-compact"><img src="./images/logo-compact.png" alt=""></span>
                    <span class="brand-title">
                        <img src="images/logo-text.png" alt="">
                    </span>
                </a>
            </div>
        </div>
        <!--**********************************
            Nav header end
        ***********************************-->

        <!--**********************************
            Header start
        ***********************************-->
        <div class="header">    
            <div class="header-content clearfix">
                
                <div class="nav-control">
                    <div class="hamburger">
                        <span class="toggle-icon"><i class="icon-menu"></i></span>
                    </div>
                </div>
                <div class="header-right">
                    <ul class="clearfix">
                        
                        <li class="icons dropdown d-none d-md-flex">
                            <a href="javascript:void(0)" class="log-user"  data-toggle="dropdown">
                                <span><%
                                        String hello=(String) session.getAttribute("hello");
                                        out.println(hello);
                                        %></span>  <i class="fa fa-angle-down f-s-14" aria-hidden="true"></i>
                            </a>
                            <div class="drop-down dropdown-language animated fadeIn  dropdown-menu">
                                <div class="dropdown-content-body">
                                    <ul>
                                        
                                        <li><a href="./login.jsp">Logout</a></li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                      
                    </ul>
                </div>
            </div>
        </div>
        <!--**********************************
            Header end ti-comment-alt
        ***********************************-->

        <!--**********************************
            Sidebar start
        ***********************************-->
        <div class="nk-sidebar">           
            <div class="nk-nav-scroll">
                <ul class="metismenu" id="menu">
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false"></i><span class="nav-text">DASHBOARD</span>
                        </a>
                         <ul aria-expanded="false">
                           <li><a href="./AD_ItemPage.jsp">ITEM PAGE</a></li>
                            <li><a href="./ADaddItem.jsp">ADD ITEM</a></li>
                            <li><a href="./AD_TaskStatus">TASK STATUS</a></li>
                            <li><a href="./AD_CheckAvailability">CHECK AVAILABILITY</a></li>
                            <li><a href="./AD_ReturnItem">RETURN ITEM</a></li>
                        </ul>
                    </li>
                    
            </div>
        </div>
       <div class="content-body">


            <div class="container-fluid">
                <h1>Update Item</h1>
            </div>
 
       <%

            
           // HttpSession session = request.getSession(true);
            
            item profile=(item)session.getAttribute("itemU");

            %>
         <form  method="post" >
                    <br>
                    <label for="fullname" color="black" >ID:</label><br>
                    <input type="text" name="id" value="<%=profile.getId()%>" readonly>
                    <br>
                    <br>
                     <label for="address" color="black" >ITEM NAME:</label><br>
                      <textarea name="name" rows="2" cols="100" ><%=profile.getName() %></textarea>
                    <br>
                    <br>
                      <label for="phone_num" color="black" >IMAGE URL:</label><br>
                      <textarea  name="image"  rows="3" cols="100" ><%=profile.getImage() %></textarea>
                   
                    <br>
                    <br>
                     <label for="email" color="black" >PRICE:</label><br>
                    <input type="text" name="price" value="<%= profile.getPrice() %>">
                    <br>
                    <br>
                     <label for="username" color="black" >DESCRIPTION:</label><br>
                     <textarea name="des"  rows="5" cols="100" ><%= profile.getDescription() %></textarea>
                    <br>
                   
                    <br>
                    <button class="btn btn--pill btn--green" type="submit"  formaction="AD_insert_item?type=<%=profile.getType()%>">UPDATE</button>
                </form>

        </div>
        
       
        <div class="footer">
            <div class="copyright">
                <footer>Copyright &copy; <b><i>MyRetro's@UTM</i></b>  Store</footer>
            </div>
        </div>
        <!--**********************************
            Footer end
        ***********************************-->
    </div>
    <!--**********************************
        Main wrapper end
    ***********************************-->

    <!--**********************************
        Scripts
    ***********************************-->
    <script src="plugins/common/common.min.js"></script>
    <script src="js/custom.min.js"></script>
    <script src="js/settings.js"></script>
    <script src="js/gleek.js"></script>
    <script src="js/styleSwitcher.js"></script>

</body>
</html>

