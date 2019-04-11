<%-- 
    Document   : datban
    Created on : Oct 27, 2017, 9:40:18 AM
    Author     : NSH
--%>

<%@page import="model.BanGoiModel"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Thực đơn điện tử</title>
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
        <div style="width: 100%; height: 550px; background-image: url(<c:url value="/resource/images/gtkg.jpg"/>);">
            <div>
                <br>
                <table class="table table-hover" style="width: 30%; margin-left: 475px; text-align: center;">
                    <h2 style="text-align: center; color: #ffffff; line-height: 80px;">ĐẶT BÀN</h2>
                    <tbody>
                        <s:form action="../DatBan.htm" method="get" commandName="thongtinban" modelAttribute="thongtinban">
                            <tr>
                                <td><s:input path="TT_ten_KH" class="form-control" required="required" placeholder="HỌ VÀ TÊN" /></td>
                            </tr>
                            <tr>s
                                <td><s:input path="TT_sdt" type="text" class="form-control" required="required" placeholder="SỐ ĐIỆN THOẠI"/></td>
                            </tr>
                            <tr>
                                <td><s:input path="TT_email" type="text" class="form-control" required="required" placeholder="EMAIL" /></td>
                            </tr>
                            <tr>
                                <td>
                                    <% 
                                        BanGoiModel bgm = new BanGoiModel();
                                        List<Integer> listChuaGoi = bgm.getBanChuaDat();
                                    %>
                                        <s:select path="Ban_id" class="form-control">
                                            <option selected="selected">Chọn bàn đang trống</option>
                                            <%for(Integer inte : listChuaGoi){%>
                                            <s:option value="<%=inte%>">Bàn <%=inte%></s:option>
                                            <%}%>
                                        </s:select>
                                            
                                </td>
                            </tr>
                            <tr>
                                <td colspan="" rowspan="" headers=""><button type="submit" class="btn btn-default">ĐẶT BÀN</button></td>
                            </tr>
                        </s:form>
                    </tbody>
                </table>
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
