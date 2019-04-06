<%-- 
    Document   : thanhtoan
    Created on : Oct 29, 2017, 8:20:46 PM
    Author     : NSH
--%>

<%@page import="entity.DonGoi"%>
<%@page import="entity.MonAn"%>
<%@page import="entity.ChiTietDon"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Quản lý thanh toán</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">
        <script type="text/javascript" src="<c:url value='/resource/jquery/jquery.min.js'/>"></script>
        <script src="<c:url value='/resource/bootstrap/js/bootstrap.min.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/index.css"/>">
    </head>
    <body style="background-image: url(<c:url value="/resource/images/bggoimon.png"/>)">
        <div style="margin-top: -25px;height: 124px; width: 100%; background:linear-gradient(to right, #1b1209, #fff);
                                               background:-moz-linear-gradient(right,#1b1209, #fff);
                                               background:-webkit-linear-gradient(right,#4a1f1fe0, #1b1209 65%);
                                               background:-o-linear-gradient(right,#1b1209, #fff);">
            <h2 style="color: #ffffff; text-align: center; line-height: 130px;">QUẢN LÝ THANH TOÁN</h2>
        </div>
        <div class="container" style="margin-top: 50px;">
            <table class="table table-bordered" style="border: 2px solid #ddd;">
                <thead>
                    <tr>
                        <th colspan="4" style="background: #43292452;text-align: center; font-size: 20px; color: #d01717;">Hóa đơn</th>
                    </tr>
                    <tr>
                                    <td style="text-align: left; border: none;">Số hóa đơn: 
                                        <%
                                            DonGoi donGoi = (DonGoi) request.getAttribute("donTT");
                                            out.print(donGoi.getDon_id());
                                        %>
                                    </td>
                                    <td colspan="2" style="text-align: left; border: none;">Bàn:
                                        <%
                                            out.print(donGoi.getBan_id());
                                        %>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="text-align: left; border: none;">Thời gian: 
                                        <%
                                            out.print(donGoi.getBan_gioGoi() + " - " + donGoi.getBan_ngayGoi());
                                        %>
                                    </td>
                                    <td colspan="2" style="text-align: left; border: none;">Nhân viên thanh toán:                                         
                                            ${sessionScope.Suser}                                       
                                    </td>
                                </tr>
                    
                </thead>
                <tbody>
                    <tr style="background: #9875723b;color:#1b1209">
                        <td width="50%" style="font-weight: bold;">Tên món</td>
                        <td width="10%" style="font-weight: bold;">Số lượng</td>
                        <td width="10%" style="font-weight: bold;">Đơn vị</td>
                        <td width="30%" style="font-weight: bold;">Thành tiền</td>
                    </tr>
                    <%
                        ArrayList<ChiTietDon> lstCT = (ArrayList<ChiTietDon>) request.getAttribute("lstCTD");
                        ArrayList<MonAn> lstM = (ArrayList<MonAn>) request.getAttribute("lstMA");
                        int tongTien = 0;
                        for (int i = 0; i < lstCT.size(); i++) {
                            out.print("<tr>");
                            out.print("<td>" + lstCT.get(i).getMon_ten() + "</td>");
                            out.print("<td style=\"text-align: right;\" >" + lstCT.get(i).getMon_soLuong() + "</td>");
                            out.print("<td>" + lstCT.get(i).getMon_DonVi() + "</td>");
                            if (lstCT.get(i).getMon_DonVi().equals("Dia")) {
                                out.print("<td style=\"text-align: right;\" >" + lstCT.get(i).getMon_soLuong() * lstM.get(i).getMon_gia() + "</td>");
                                tongTien += lstCT.get(i).getMon_soLuong() * lstM.get(i).getMon_gia();
                            } else {
                                out.print("<td style=\"text-align: right;\" >" + lstCT.get(i).getMon_soLuong() * lstM.get(i).getMon_giaN() + "</td>");
                                tongTien += lstCT.get(i).getMon_soLuong() * lstM.get(i).getMon_giaN();
                            }
                            out.print("</tr>");
                        }
                        out.print("<tr style=\"background: #43292452;\">");
                        out.print("<td colspan=\"3\" style=\"font-weight: bold; text-align: right; padding-right: 5px; color: #d01717; border: none;\">TỔNG TIỀN</td>");
                        out.print("<td colspan=\"1\" style=\"text-align: right; color: #d01717; font-weight: bold; \" >" + tongTien + "</td>");
                        out.print("</tr>");
                    %>
                    <tr>
                                    <%
                                        out.print("<th colspan=\"4\"><a  href=\"xacNhanThanhtoan.htm?idBan=" + donGoi.getBan_id()+ "\"/> <button style=\"height: 30px;margin-left: 440px;width: 230px;font-weight: bold;font-size: 16px;background-color: #8f2623;color: white;\">XÁC NHẬN THANH TOÁN</button> </a></th>");
                                    %>
                                </tr>

                </tbody>
            </table>
        </div>
    </body>
</html>
