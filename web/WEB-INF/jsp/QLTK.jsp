<%-- 
    Document   : QLTK
    Created on : Dec 4, 2017, 1:36:47 PM
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
        <title>Quản lý tài khoản</title>
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
            <h2 style="color: #ffffff; text-align: center; line-height: 130px;">QUẢN LÝ TÀI KHOẢN</h2>
        </div>       
        <a style="padding-left: 16px;" href="<c:url value="/TaiKhoan/ThemTK.htm"/>" title=""><button type="button" class="btn btn-primary">Thêm Tài Khoản</button></a>
        <a style="padding-right: 16px;float: right" href="<c:url value="/TaiKhoan/taikhoan.htm"/>" title=""><button type="button" class="btn btn-success">Trang quản lý</button></a>
    </div>
    <div class="container-fluid" style="margin-top: 20px; margin-bottom: 0px;">
        <table class="table table-striped" style="border: 2px solid #ddd;" id="myTable">
            <thead style="background: #f9ede5">
                <tr>
                    <td width="13%" style="font-weight: bold;">User</td>
                    <td width="13%" style="font-weight: bold;">Password</td>
                    <td width="5%" style="font-weight: bold;">Quyền</td>
                    <td width="15%" style="font-weight: bold;">Tên</td>
                    <td width="20%" style="font-weight: bold;">Địa chỉ</td>
                    <td width="9%" style="font-weight: bold;">SĐT</td>
                    <td width="8%" style="font-weight: bold;">Năm Sinh</td>
                    <td width="8%" style="font-weight: bold;"></td>
                </tr>
            </thead>    
            <tbody>
                <c:forEach var="msg" items="${lstTK}">
                    <tr >
                        <td>${msg.getUser()}</td>
                        <td>${msg.getPassword()}</td>
                        <td>${msg.getQuyen()}</td>
                        <td>${msg.getTen_nv()}</td>
                        <td>${msg.getDiachi()}</td>
                        <td>${msg.getSdt()}</td>
                        <td>${msg.getNamSinh()}</td>
                        <td><a href="<c:url value="XuLyXoaTK.htm?user=${msg.getUser()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></button></a>
                            <a href="<c:url value="CapNhapTK.htm?user=${msg.getUser()}"/>"><button type="button" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button></a></td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</div>
<!--<div style="height: 34px; width: 100%; background:#1b1209;margin-top: 22px"></div>-->
</body>
</html>
