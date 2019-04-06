<%-- 
    Document   : themTK
    Created on : Dec 4, 2017, 2:03:25 PM
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
        <title>Thêm tài khoản</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">
        <script type="text/javascript" src="<c:url value='/resource/jquery/jquery.min.js'/>"></script>
        <script src="<c:url value='/resource/bootstrap/js/bootstrap.min.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/index.css"/>">
    </head>
    <body style="border-radius: 50% 50% 50% 50%">
        <div style="height: 124px; width: 100%; background-image: url(<c:url value="/resource/images/thucdon-img.PNG"/>);margin-top: -22px">
            <h2 style="color: #fff; text-align: center; line-height: 130px;">THÊM THÔNG TIN TÀI KHOẢN</h2>
        </div>
        <s:form action="XuLyThemTK.htm" commandName="ThemTK" method="get">
            <div class="container" style="margin-top: 30px;">
                <table class="table table-bordered" style="border: 2px solid #ddd; width: 33%; margin: auto;">
                    <thead>
                        <tr>
                            <th colspan="2" style="font-size: 20px; color: #524cad; text-align: center;background: #f9ede5">Nhập thông tin tài khoản</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td style="float: right; border: none;">User</td>
                            <td style="border: none;"><s:input type="text" path="user" name="" size="30"/></td>
                        </tr>
                        <tr>
                            <td style="float: right; border: none;">Password</td>
                            <td style="border: none;"><s:input type="text" path="password" name="" size="30"/></td>
                        </tr>
                        <tr>
                            <td style="float: right; border: none;">Quyền</td>
                            <td style="border: none;">
                                <s:select name="" path="quyen">
                                    <s:option type="number" value="1">Adminstrator</s:option>
                                    <s:option type="number" value="2">Nhân viên</s:option>
                                    <s:option type="number" value="3">Nhân viên nhà bếp</s:option>                                  
                                </s:select>
                            </td>
                        </tr>
                        <tr>
                            <td style="float: right; border: none;">Họ Tên</td>
                            <td style="border: none;"><s:input type="text" path="ten_nv" name="" size="30"/></td>
                        </tr><tr>
                            <td style="float: right; border: none;">Địa chỉ</td>
                            <td style="border: none;"><s:input type="text" path="diachi" name="" size="30"/></td>
                        </tr><tr>
                            <td style="float: right; border: none;">Số điện thoại</td>
                            <td style="border: none;"><s:input type="number" path="sdt" name="" size="30"/></td>
                        </tr>
                        <tr>
                            <td style="float: right; border: none;">Năm sinh</td>
                            <td style="border: none;"><s:input type="number" path="namSinh" name="" size="30"/></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="navbar-fixed-bottom">
                <div  style="text-align: center; height: 160px; background-color: #1b1209;">
                    <br><br><br>
                    <button type="submit" class="btn btn-success">Thêm</button>
                    <input type="button" class="btn btn-warning" name="Quay lại" value="Quay lại" onclick="history.go(-1)">
                </div>
            </div>
        </s:form>
    </div>
</div>
</body>
</html>

