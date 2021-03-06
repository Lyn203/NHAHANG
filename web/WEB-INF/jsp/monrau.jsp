<%-- 
    Document   : monrau
    Created on : Oct 27, 2017, 1:17:01 AM
    Author     : NSH
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Món rau</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">
        <script type="text/javascript" src="<c:url value='/resource/jquery/jquery.min.js'/>"></script>
        <script src="<c:url value='/resource/bootstrap/js/bootstrap.min.js'/>"></script>
        <script src="<c:url value='/resource/sliderengine/jquery.js'/>"></script>
        <script src="<c:url value='/resource/sliderengine/amazingslider.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/sliderengine/amazingslider-1.css"/>">
        <script src="<c:url value='/resource/sliderengine/initslider-1.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/index.css"/>">
    </head>
    <body style="background-image: url(<c:url value="/resource/images/bggoimon.png"/>)">
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <a class="navbar-brand" href="<c:url value="/TrangChu/tc.htm"/>"><img style="border-radius: 50% 50% 50% 50%" src="<c:url value="/resource/images/logo.png"/>" alt="" class="logo clearfix"></a>
                <ul class="nav navbar-nav">
                    <li>
                        <a href="<c:url value="/TrangChu/tc.htm"/>" style="color: #ffffff">TRANG CHỦ</a>
                    </li>
                    <li>
                        <a href="<c:url value="/MonAn/KhaiVi.htm"/>" style="color: #ffffff">THỰC ĐƠN</a>
                    </li>
                    <li>
                        <a href="<c:url value="/TrangChu/gt.htm"/>" style="color: #ffffff">GIỚI THIỆU</a>
                    </li>
                    <li>
                        <a href="<c:url value="/TrangChu/db.htm"/>" style="color: #ffffff">ĐẶT BÀN</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div id="amazingslider-wrapper-1" style="display:block;position:relative;max-width:100%;margin:0px auto 0px;">
        <div id="amazingslider-1" style="display:block;position:relative;margin:0 auto;">
            <ul class="amazingslider-slides" style="display:none;">
                <li><img src="<c:url value="/resource/images/68623503-restaurant-wallpapers.jpg" />">
                </li>
                <li><img src="<c:url value="/resource/esource/images/desk_restaurant_wine_glasses_plates_flowers_roses_80713_1920x1080.jpg" />">
                </li>
                <li><img src="<c:url value="/resource/images/maxresdefault%20%281%29.jpg"/> ">
                </li>
                <li><img src="<c:url value="/resource/images/maxresdefault.jpg" />">
                </li>
                <li><img src="<c:url value="/resource/images/restaurant_table-interior-modern-style-wide-hd-wallpaper-download-restaurant-pictures-windows-wallpaper-hd-free-images-amazing-1920x1080.jpg" />">
                </li>
                <li><img src="<c:url value="/resource/images/restaurant-wide-hd-wallpaper-download-restaurant-photos-free-best-backgrounds-hd-free-images-widescreen-1920x1200.jpg"  />">
                </li>
            </ul>
            <ul class="amazingslider-thumbnails" style="display:none;">
                <li><img src="<c:url value="/resource/images/68623503-restaurant-wallpapers-tn.jpg" />"></li>
                <li><img src="<c:url value="/resource/images/desk_restaurant_wine_glasses_plates_flowers_roses_80713_1920x1080-tn.jpg" />"></li>
                <li><img src="<c:url value="/resource/images/maxresdefault%20%281%29-tn.jpg" />"></li>
                <li><img src="<c:url value="/resource/images/maxresdefault-tn.jpg" />"></li>
                <li><img src="<c:url value="/resource/images/restaurant_table-interior-modern-style-wide-hd-wallpaper-download-restaurant-pictures-windows-wallpaper-hd-free-images-amazing-1920x1080-tn.jpg" />"></li>
                <li><img src="<c:url value="/resource/images/restaurant-wide-hd-wallpaper-download-restaurant-photos-free-best-backgrounds-hd-free-images-widescreen-1920x1200-tn.jpg"/>"></li>
            </ul>
        </div>
    </div>
        <div style="margin-top: -18px; height: 124px; width: 100%; background-image: url(<c:url value="/resource/images/thucdon-img.PNG"/>">
            <h2 style="color: #ffffff; text-align: center; line-height: 135px;">THỰC ĐƠN CHÍNH</h2>
        </div>
        <div class="navbar" style="width: 100%; margin: auto; border: none;">
            <div class="container-fluid" style="background-color: #ffe6cc;padding-left: 35%;">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="<c:url value="/MonAn/KhaiVi.htm"/>" style="color: black;">KHAI VỊ</a>
                    </li>
                    <li>
                        <a href="<c:url value="/MonAn/MonThit.htm"/>" style="color: black;">MÓN THỊT</a>
                    </li>
                    <li class="active">
                        <a href="<c:url value="/MonAn/MonHaiSan.htm"/>" style="color: black;">MÓN HẢI SẢN</a>
                    </li>
                    <li>
                        <a href="<c:url value="/MonAn/MonRau.htm"/>" style="color: black;">MÓN RAU</a>
                    </li>
                </ul>
            </div>
        </div>
        <h2 style="text-align: center; color: #5f040d; font-weight: bold;"><span style="padding-right: 5px;font-size:0.8em;color: #5f040d" class="glyphicon glyphicon-cog"></span>MÓN RAU<span style="padding-left: 5px;font-size:0.8em;color: #5f040d" class="glyphicon glyphicon-cog"></span></h2>

        <div class="container">
            <div class="row">
                <c:forEach var="mgs" items="${lstMonRau}">
                    <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4" style="margin-top: 50px; margin-bottom: 50px;">
                        <img src="<c:url value="/resource/images/${mgs.getMon_hinhAnh()}"/>" style="border-radius: 20px;"><br><br>
                        <span class="tenMon">${mgs.getMon_ten()}</span><br>
                        <span>${mgs.getMon_gia()} VND/Đĩa</span><br>
                        <span>${mgs.getMon_giaN()} VND/Người</span>
                    </div>
                </c:forEach>
            </div>
        </div>
       <div class="container-fluid" style="background-color: #1b1209; height: 195px; width: 100%;">
        <div class="row" style="color: white; font-size: 15px;font-weight: bold;">
            <div class="col-xs12 col-sm-12 col-md-5 col-lg-5" style="padding-top: 40px; margin: auto;">

                <h3 style="color: #ffffff;">ĐỊA CHỈ ?</h3>
                <span>Địa chỉ: 2B Nguyễn Thị Thập, <br>phường Trung Hòa, quận Cầu Giấy, Hà Nội</span><br>
                
            </div>
            <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4" style="padding-top: 40px;  background-color: #1b1209;">
                <h3 style="color: #ffffff;">GIỜ MỞ CỬA</h3>
                <span>Thứ 2- Chủ nhật</span><br>
                <span>7:30 - 24:00</span>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-3 col-lg-3" style="padding-top: 40px;  background-color: #1b1209;">
                <br>
                <i class="fa fa-facebook-square fa-2x" aria-hidden="true"></i>
                <i class="fa fa-instagram fa-2x" aria-hidden="true"></i>
                <i class="fa fa-google-plus-square fa-2x" aria-hidden="true"></i><br>
                <span>Điện thoại: 19201080 </span><br>
                <span>HOTLINE: 0988242947</span>  
            </div>				
        </div>			
    </div>
        <footer style="background: #100a06;padding-bottom: 5px">
            <p style="color: white;text-align: center;padding-top: 17px;">© 2017 All Rights Reserved. Developed by NSH</p>
    </footer>
    </body>
</html>
