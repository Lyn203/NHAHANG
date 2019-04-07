
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="entity.MonAn"%>
<%@page import="entity.ChiTietDon"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Gọi món</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/fontawesome/css/font-awesome.css"/>">
        <script type="text/javascript" src="<c:url value='/resource/jquery/jquery.min.js'/>"></script>
        <script src="<c:url value='/resource/bootstrap/js/bootstrap.min.js'/>"></script>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resource/ConfigCSS/index.css"/>">
    </head>
    <body>
        <div style="height: 124px;margin-top: -20px; width: 100%; background-image: url(<c:url value="/resource/images/thucdon-img.PNG"/>">
            <h2 style="color: #ffffff; text-align: center; line-height: 135px;">THỰC ĐƠN</h2>
        </div>
        <div class="container-fluid" style="background-image: url(<c:url value="/resource/images/bggoimon.png"/>)">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8">
                    <div class="row">
                        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                            <h2 style="text-align: center; color: #5f040d; font-weight: bold;">DANH SÁCH MÓN</h2>
                                                      <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Tìm kiếm theo tên món..." title="Type in a name">
                                                        <ul id="myUL">
                            <c:forEach var="msg" items="${lstMonAn}">
                                <s:form action="XuLyThemMon.htm" commandName="chitietdon" method="get" modelAttribute="chitietdon">
                                    <!--                                        <li><a href="#">-->
                                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" style="margin-top: 38px;">
                                        <img src="<c:url value="/resource/images/${msg.getMon_hinhAnh()}"/>" style="border-radius: 20px;"><br><br>
                                        <s:input path="Mon_ten" value="${msg.getMon_ten()}" style="width: 100%; border: none; font-weight: bold;" readonly="true"></s:input>
                                        <s:input path="Mon_gia" value="${msg.getMon_gia()}" style="width: 80px; border: none;" readonly="true"></s:input>VND/Đĩa<br>
                                        <s:input path="Mon_gia" value="${msg.getMon_giaN()}" style="width: 80px; border: none;" readonly="true"></s:input>VND/Người<br>
                                        <s:input path="Mon_soLuong" type="number" min="1" style="width: 60px" class="form-control" ></s:input>
                                        <s:select path="Mon_DonVi" class="form-control" style="width: 100px;">
                                            <s:option value="Đĩa">Đĩa</s:option>
                                            <s:option value="Người">Người</s:option>
                                        </s:select>   
                                        <s:input type="hidden" path="Don_id" value="${sessionScope.SIdDon}"></s:input>
                                            <input type="submit" value="Đặt món" class="btn btn-info"/>
                                        </div>
                                        <!--                                            </a></li>-->
                                </s:form>
                            </c:forEach>
                            <!--</ul>-->
                        </div>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4">
                    <!--<a  href="<c:url value="XyLyDatMon.htm?Don_id=${sessionScope.SIdHD}"/>"><button type="button" class="btn btn-danger" style="float: right; margin-top: 50px;">Xác nhận đặt món</button></a>-->
                    <a  href="<c:url value="/Don/DsBan.htm"/>"><button type="button" class="btn btn-success" style="float: right; margin-top: 50px;">Xác nhận đặt món</button></a>

                    <table class="table table-bordered" style="border: 4px solid #ddd; margin-top: 100px;">
                        <thead>
                            <tr>
                                <th colspan="5" style="text-align: center;">DANH SÁCH CÁC MÓN ĐÃ GỌI</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style="font-weight: bold; width: 35%">Tên món</td>
                                <td style="font-weight: bold; width: 15%">Số lượng</td>
                                <td style="font-weight: bold; width: 15%">Đơn vị</td>
                                <td style="font-weight: bold;">Thành tiền</td>
                                <td></td>
                            </tr>

                            <%                               
                                ArrayList<ChiTietDon> lstCT = (ArrayList<ChiTietDon>) request.getAttribute("lstChiTiet");
                                ArrayList<MonAn> lstM = (ArrayList<MonAn>) request.getAttribute("lstMonAn");
                                int tongTien = 0;
                                for (int i = 0; i < lstCT.size(); i++) {
                                    out.print("<tr>");
                                    out.print("<td>" + lstCT.get(i).getMon_ten() + "</td>");
                                    out.print("<td style=\"text-align: right;\" >" + lstCT.get(i).getMon_soLuong() + "</td>");
                                    out.print("<td>" + lstCT.get(i).getMon_DonVi() + "</td>");
                                    if (lstCT.get(i).getMon_DonVi().equals("Đĩa")) {
                                        out.print("<td style=\"text-align: right;\" >" + lstCT.get(i).getMon_soLuong() * lstM.get(i).getMon_gia() + "</td>");
                                        tongTien += lstCT.get(i).getMon_soLuong() * lstM.get(i).getMon_gia();
                                    } else {
                                        out.print("<td style=\"text-align: right;\" >" + lstCT.get(i).getMon_soLuong() * lstM.get(i).getMon_giaN() + "</td>");
                                        tongTien += lstCT.get(i).getMon_soLuong() * lstM.get(i).getMon_giaN();
                                    }
                                    out.print("<td><a href=\"XuLyXoaChiTietMon2.htm?ChiTiet_id="+lstCT.get(i).getChiTiet_id()+"\"/><button type=\"button\" class=\"btn btn-danger\">Xóa</button></a>"
                                            + "</td>");
                                    out.print("</tr>");
                                }
                                out.print("<tr>");
                                out.print("<td colspan=\"3\" style=\"font-weight: bold; text-align: right; padding-right: 5px; color: #5f040d; border: none;\">TỔNG TIỀN</td>");
                                out.print("<td colspan=\"3\" style=\"text-align: right; color: #5f040d; font-weight: bold; \" >" + tongTien + "</td>");
                                out.print("</tr>");
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script>
            function tai_lai_trang() {
                location.reload();
            }
        </script>
        
    </body>
</html>
