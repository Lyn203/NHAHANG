<%-- 
    Document   : admin
    Created on : Dec 3, 2017, 2:19:01 PM
    Author     : NSH
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DHQ</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">
        <script type="text/javascript" src="<c:url value='/resource/jquery/jquery.min.js'/>"></script>
        <script src="<c:url value='/resource/bootstrap/js/bootstrap.min.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/menu.css"/>">
    </head>    
    <body style="background-image: url(<c:url value="/resource/images/bggoimon.png"/>)">        
        <div class="container-fluid" style="height: 74px; background-color: #504f4f">             
            <a class="navbar-brand" href="<c:url value="/TrangChu/tc.htm"/>"><img style="border-radius: 50% 50% 50% 50%; height: 60px;width: 60px;margin-top: -8px;margin-left: -20px" src="<c:url value="/resource/images/logo.png"/>" alt="" class="logo clearfix"></a>
            <a style="float: right;padding-top: 25px" href="/BTLPORTAL/TaiKhoan/logout.htm">Log out <span class="glyphicon glyphicon-log-out"></span></a>
        </div>
        <div class="col-xs-12 col-sm-12 col-md-2 col-lg-2" style="margin-left: -15px">
            <nav class="navbar navbar-default sidebar" role="navigation">
                <div class="container-fluid">

                    <div class="collapse navbar-collapse" id="bs-sidebar-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="#">Tài khoản ${sessionScope.Suser}<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-user"></span></a></li>
                            <li ><a href="<c:url value="/TaiKhoan/QLTK.htm"/>">Quản lý tài khoản<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-th-list"></span></a></li>        
                            <li ><a href="<c:url value="/MonAn/QLTD.htm"/>">Quản lý món ăn<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-cutlery"></span></a></li>
                            <li ><a href="<c:url value="/Don/DsBan.htm"/>">Quản lý bàn đặt<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-th-large"></span></a></li>
                            <li ><a href="<c:url value="/MonAn/QLTD.htm"/>">Quản lý đặt món online<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-equalizer"></span></a></li>
                            <li ><a href="<c:url value="/MonAn/QLMDG.htm"/>">Nhà bếp<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-equalizer"></span></a></li>
                            
                        </ul>
                    </div>
                </div>
            </nav>
        </div>

        <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10" style="padding-top: 10px">
            <s:form action="XuLyTaiKhoan.htm" commandName="capNhap" method="get">
                <table class="table table-bordered">
                    <tr class="info">
                        <td style="width: 10%">Tài khoản</td>
                        <td style="width: 20%"><s:input type="text" path="user" name="" size="55" readonly="true"/></td>
                        <td style="width: 10%">Mật Khẩu</td>
                        <td style="width: 20%"><s:input type="text" path="password" name="" size="55" /></td> 
                    </tr>
                    <tr class="info">
                        <td>Họ tên</td>
                        <td><s:input type="text" path="ten_nv" name="" size="55" /></td>
                        <td>Địa chỉ</td>
                        <td><s:input type="text" path="diachi" name="" size="55" /></td> 
                    </tr>
                    <tr class="info">
                        <td>SĐT</td>
                        <td><s:input type="text" path="sdt" name="" size="55" /></td>
                        <td>Năm sinh</td>
                        <td><s:input type="text" path="namSinh" name="" size="55" /></td> 
                    </tr>                
                </table>
                <input type="submit" name="submit" value="Cập nhập" class="btn btn-info" style="float: right">               

            </s:form>



        </div>
    </body>
</html>
