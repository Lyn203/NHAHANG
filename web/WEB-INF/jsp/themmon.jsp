<%-- 
    Document   : themmon
    Created on : Oct 28, 2017, 9:53:08 AM
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
        <title>Thêm món</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">
        <script type="text/javascript" src="<c:url value='/resource/jquery/jquery.min.js'/>"></script>
        <script src="<c:url value='/resource/bootstrap/js/bootstrap.min.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/index.css"/>">
    </head>
    <body style="border-radius: 50% 50% 50% 50%">
        <div style="height: 124px; width: 100%; background-image: url(<c:url value="/resource/images/thucdon-img.PNG"/>);margin-top: -22px">
            <h2 style="color: #fff; text-align: center; line-height: 130px;">THÊM THÔNG TIN MÓN</h2>
        </div>
        <s:form action="XuLyThemMon.htm" commandName="Themmon" method="get">
            <div class="container" style="margin-top: 65px;">
                <table class="table table-bordered" style="border: 2px solid #ddd; width: 33%; margin: auto;">
                    <thead>
                        <tr>
                            <th colspan="2" style="font-size: 20px; color: #524cad; text-align: center;background: #f9ede5">Nhập thông tin món</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td style="float: right; border: none;">Tên món</td>
                            <td style="border: none;"><s:input type="text" path="Mon_ten" name="" size="30"/></td>
                        </tr>
                        <tr>
                            <td style="float: right; border: none;">Loại</td>
                            <td style="border: none;">
                                <s:select name="" path="Mon_loai">
                                    <s:option value="Khai vi">Khai vị</s:option>
                                    <s:option value="Mon thit">Món thịt</s:option>
                                    <s:option value="Mon hai san">Món hải sản</s:option>
                                    <s:option value="Mon rau">Món rau</s:option>
                                </s:select>
                            </td>
                        </tr>
                        <tr>
                            <td style="float: right; border: none;">Hình ảnh</td>
                            <td style="border: none;"><s:input path="Mon_hinhAnh" id="fileUpload" name="FileUpload" multiple="" type="file" /></td>
                        </tr>
                        <tr>
                            <td style="float: right; border: none;">Giá/Đĩa</td>
                            <td style="border: none;"><s:input path="Mon_gia" type="" name="" value="" placeholder="" size="30" /></td>
                        </tr>
                        <tr>
                            <td style="float: right; border: none;">Giá/Người</td>
                            <td style="border: none;"><s:input path="Mon_giaN" type="" name="" value="" placeholder="" size="30" /></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="container">
                <div class="navbar-fixed-bottom" style="text-align: center; height: 160px; background-color: #1b1209;">
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
