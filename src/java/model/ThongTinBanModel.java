/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.ThongTinBan;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;

/**
 *
 * @author ASUS
 */
public class ThongTinBanModel {
    public boolean insertObject(ThongTinBan thongTinBan) throws SQLException{
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "insert into thongtinban value(?,?,?,?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, thongTinBan.getBan_id());
            pst.setString(2, thongTinBan.getTT_ngayDat());
            pst.setString(3, thongTinBan.getTT_gioDat());
            pst.setString(4, thongTinBan.getTT_ten_KH());
            pst.setInt(5, thongTinBan.getTT_sdt());
            pst.setString(6, thongTinBan.getTT_email());
            pst.setInt(7, thongTinBan.getTT_trangThai());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }
}
