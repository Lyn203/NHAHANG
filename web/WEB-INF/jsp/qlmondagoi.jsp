<%-- 
    Document   : dsban
    Created on : Oct 27, 2017, 11:41:50 AM
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
        <title>Nhà Bếp</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">
        <script type="text/javascript" src="<c:url value='/resource/jquery/jquery.min.js'/>"></script>
        <script src="<c:url value='/resource/bootstrap/js/bootstrap.min.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/index.css"/>">
    </head>
    <body style="border-radius: 50% 50% 50% 50%">
        <div style="height: 124px; width: 100%; background-image: url(<c:url value="/resource/images/thucdon-img.PNG"/>);">
            <h2 style="color: #ffffff; text-align: center; line-height: 130px;">DANH SÁCH MÓN ĂN MỖI BÀN</h2>
        </div>
        <a style="padding-right: 16px;padding-top: 10px;float: right" href="<c:url value="/TaiKhoan/taikhoan.htm"/>" title=""><button type="button" class="btn btn-success">Trang quản lý</button></a>

        <div class="container-fluid" style="margin-top: 50px; margin-bottom: 50px;">
            <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="1"/>
                                    BÀN 1</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon1_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="2"/>
                                    BÀN 2</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon2}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon2_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="3"/>
                                    BÀN 3</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon3}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon3_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="4"/>
                                    BÀN 4</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon4}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon4_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="5"/>
                                    BÀN 5</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon5}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon5_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="6"/>
                                    BÀN 6</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon6}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon6_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="7"/>
                                    BÀN 7</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon7}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon7_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="8"/>
                                    BÀN 8</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon8}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon8_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="9"/>
                                    BÀN 9</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon9}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon9_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="10"/>
                                    BÀN 10</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon10}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon10_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="11"/>
                                    BÀN 11</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon11}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon11_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
                <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 50px;">
                        <thead>
                            <tr>
                                <th colspan="4" style="text-align: center; color: white; background-color: #493326c7">
                                    <s:input type="hidden" path="Ban_id" value="12"/>
                                    BÀN 12</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td style="font-weight: bold; width: 50%;">Tên món</td>
                                <td style="font-weight: bold; width: 20%;">Số lượng</td>
                                <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                                <td style="font-weight: bold; width: 10%;"></td>
                            </tr>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đang chờ</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon12}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td><a href="<c:url value="XuLyHoanThanhMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-ok"></span></button></a></td>
                                </tr>
                            </c:forEach>
                            <tr>
                                <td colspan="4" style="text-align: center; font-weight: bold; color: white; background-color: #715f5596;">Danh sách món đã hoàn thành</td>
                            </tr>
                            <c:forEach var="msg" items="${lstDsMon12_1}">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>${msg.getMon_soLuong()}</td>
                                    <td>${msg.getMon_DonVi()}</td>
                                    <td></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </s:form>
            </div>
        </div>     
    </body>
</html>
