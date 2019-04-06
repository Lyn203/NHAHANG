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
        <title>Danh sách bàn</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">
        <script type="text/javascript" src="<c:url value='/resource/jquery/jquery.min.js'/>"></script>
        <script src="<c:url value='/resource/bootstrap/js/bootstrap.min.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/index.css"/>">
    </head>
    <body style="background-image: url(<c:url value="/resource/images/bggoimon.png"/>)">
        <div style="height: 64px; width: 100%; background:#1b1209;margin-top: -22px">            
        </div>
        <div style="height: 28px; width: 100%; background:linear-gradient(to left, #1b1209, #fff);
                                               background:-moz-linear-gradient(left,#1b1209, #fff);
                                               background:-webkit-linear-gradient(left,#1b1209, #7b2929);
                                               background:-o-linear-gradient(left,#1b1209, #fff);
             ;margin-top: -22px;">
            <h2 style="color: #ffffff; text-align: center; ">DANH SÁCH BÀN</h2>
            <a style="padding-right: 32px;float: right" href="<c:url value="/TaiKhoan/taikhoan.htm"/>" title="">Trang quản lý</a>
        </div>
        <div style="height: 44px; width: 100%; background:#1b1209;">            
        </div>
        
        <div class="container-fluid" style="margin-top: 10px; margin-bottom: 50px;">
            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 0px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="1"/>
                                    BÀN 1</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=1"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon1}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>                                        
                                    </td>
                                    <td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon  glyphicon-retweet"></span></button></td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="2"/>
                                    BÀN 2</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=2"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon2}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td>
                                    <td> <button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon  glyphicon-retweet"></span></button>
                                    </td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="3"/>
                                    BÀN 3</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=3"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon3}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td>
                                    <td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button>
                                    </td>
                                </s:form>
                            </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="4"/>
                                    BÀN 4</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=4"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon4}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td>
                                    <td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button></td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="5"/>
                                    BÀN 5</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=5"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon5}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td>
                                    <td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button></td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="6"/>
                                    BÀN 6</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=6"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon6}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td>
                                    <td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button></td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

            </div>

            <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 0px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="7"/>
                                    BÀN 7</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=7"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon7}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td>
                                    <td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button></td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="8"/>
                                    BÀN 8</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=8"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon8}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td>
                                    <td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button></td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="9"/>
                                    BÀN 9</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=9"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon9}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td>
                                    <td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button></td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="10"/>
                                    BÀN 10</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=10"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 18%;">Thao tác</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon10}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                    </td><td><button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button>
                                    </td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="11"/>
                                    BÀN 11</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=11"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon11}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                       </td><td> <button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button>
                                    </td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

                <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 20px;;">
                    <s:form action="XuLyThemDon.htm" commandName="dongoi" method="get">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center; color: white; background-color: #1b1209">
                                    <s:input type="hidden" path="Ban_id" value="12"/>
                                    BÀN 12</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr style="margin: auto;">
                                <td colspan="3"><input type="submit" name="submit" value="Gọi món" class="btn btn-primary"></td>
                                <td colspan="2"><a href="<c:url value="xuLyThanhToan.htm?ban=12"/>" title=""><button type="button" class="btn btn-success">Thanh toán</button></a></td>
                            </tr>
                        </s:form>
                        <tr>
                            <td style="font-weight: bold; width: 47%;">Tên món</td>
                            <td style="font-weight: bold; width: 15%;">Số lượng</td>
                            <td style="font-weight: bold; width: 20%;">Đơn vị</td>
                            <td style="font-weight: bold; width: 9%;">Xóa</td>
                            <td style="font-weight: bold; width: 9%;">Sửa</td>
                        </tr>
                        <c:forEach var="msg" items="${lstDsMon12}">
                            <s:form action="XuLyCapNhapCTD.htm" commandName="capnhapctd" method="get">
                                <tr>
                                    <td>${msg.getMon_ten()}</td>
                                    <td>
                                        <s:input path="ChiTiet_id" type="hidden" value="${msg.getChiTiet_id()}"/>
                                        <s:input path="Mon_soLuong" type="number" class="form-control" value="${msg.getMon_soLuong()}" style="width: 50px;"/></td>
                                    <td>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                            <s:option value="${msg.getMon_DonVi()}" selected="${msg.getMon_DonVi()}">${msg.getMon_DonVi()}</s:option>
                                        </s:select>
                                    </td>
                                    <td><a href="<c:url value="XuLyXoaChiTietMon.htm?ChiTiet_id=${msg.getChiTiet_id()}"/>"><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button> </a>
                                       </td><td> <button type="submit" name="submit" value="Cập nhập" class="btn btn-warning"><span class="glyphicon glyphicon-retweet"></span></button>
                                    </td>
                                </tr>
                            </s:form>
                        </c:forEach>
                    </tbody>
                </table>

            </div>
        </div>  
        <div style="height: 34px; width: 100%; background:#1b1209;margin-top: -22px">
            
        </div>
    </body>
</html>
