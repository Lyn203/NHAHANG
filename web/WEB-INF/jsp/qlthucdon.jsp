<%-- 
    Document   : qlthucdon
    Created on : Oct 28, 2017, 9:35:57 AM
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
        <title>Quản lý thực đơn</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">

        <script src="<c:url value="/resource/bootstrap/js/bootstrap.min.js"/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/index.css"/>">
        <script type="text/javascript" src="<c:url value="/resource/jquery/jquery.min.js"/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/search.css"/>">
        <script type="text/javascript" src="<c:url value="/resource/search.js"/>"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#myTable').DataTable();
            });
        </script>
    </head>
    <body style="border-radius: 50% 50% 50% 50%">
        <div style="margin-bottom: 10px;margin-top: -25px;height: 124px; width: 100%; background:linear-gradient(to right, #1b1209, #fff);
                                               background:-moz-linear-gradient(right,#1b1209, #fff);
                                               background:-webkit-linear-gradient(right,#4a1f1fe0, #1b1209 65%);
                                               background:-o-linear-gradient(right,#1b1209, #fff);">
            <h2 style="color: #ffffff; text-align: center; line-height: 130px;">QUẢN LÝ THỰC ĐƠN</h2>
            
        </div>       
        <a style="padding-left: 16px;" href="<c:url value="/MonAn/ThemMon.htm"/>" title=""><button type="button" class="btn btn-primary">Thêm món</button></a>
        <a style="padding-right: 16px;float: right" href="<c:url value="/TaiKhoan/taikhoan.htm"/>" title=""><button type="button" class="btn btn-success">Trang quản lý</button></a>
    </div>
    <div class="container-fluid" style="margin-top: 20px; margin-bottom: 0px;">
        <table class="table table-striped" style="border: 2px solid #ddd;" id="myTable">
            <thead style="background: #f9ede5">
                <tr>
                    <td width="5%" style="font-weight: bold;">ID</td>
                    <td width="37%" style="font-weight: bold;">Tên món</td>
                    <td width="10%" style="font-weight: bold;">Loại</td>
                    <td width="15%" style="font-weight: bold;">Hình ảnh</td>
                    <td width="10%" style="font-weight: bold;">Giá/Đĩa</td>
                    <td width="10%" style="font-weight: bold;">Giá/Người</td>
                    <td width="8%" style="font-weight: bold;"></td>
                </tr>
            </thead>    
            <tbody>
                <c:forEach var="msg" items="${lstTD}">
                    <tr>
                        <td>${msg.getMon_id()}</td>
                        <td>${msg.getMon_ten()}</td>
                        <td>${msg.getMon_loai()}</td>
                        <td>${msg.getMon_hinhAnh()}</td>
                        <td>${msg.getMon_gia()}</td>
                        <td>${msg.getMon_giaN()}</td>
                        <td><a href="<c:url value="XuLyXoaMon.htm?Mon_id=${msg.getMon_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></button></a>
                        <a href="<c:url value="CapNhap.htm?Mon_id=${msg.getMon_id()}"/>"><button type="button" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button></a></td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</div>
<div style="height: 34px; width: 100%; background:#1b1209;margin-top: 22px"></div>
</body>
</html>
