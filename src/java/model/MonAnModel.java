/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.MonAn;
import util.ConnectDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thisi
 */
public class MonAnModel {

    private final String table = "monan";
    
    public ArrayList<MonAn> getAll() {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Mon_trangThai = '0'";
        Statement st = null;
        ArrayList<MonAn> lstMonAn = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                MonAn monAn = new MonAn(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getInt(6), rs.getInt(7));
                lstMonAn.add(monAn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstMonAn;
    }

    public ArrayList<MonAn> getAllObject(String loai) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Mon_loai = '" + loai + "' and Mon_trangThai = 0";
        Statement st = null;
        ArrayList<MonAn> lstMonAn = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                MonAn monAn = new MonAn(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getInt(6), rs.getInt(7));
                lstMonAn.add(monAn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstMonAn;
    }

    // lay ra doi tuong mon an theo ten DK : chua xoa
    public MonAn getObjectTen(String ten) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Mon_ten = ? and Mon_trangThai = '0'";
        PreparedStatement pst = null;
        MonAn monAn = new MonAn();
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setString(1, ten);
            rs = pst.executeQuery();
            while (rs.next()) {
                monAn = new MonAn(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getInt(6), rs.getInt(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return monAn;
    }
    public MonAn getObject(int id) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Mon_id = ? and Mon_trangThai = 0";
        PreparedStatement pst = null;
        MonAn banGoi = new MonAn();
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                banGoi = new MonAn(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getInt(5), rs.getInt(6), rs.getInt(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return banGoi;
    }

    public boolean insertObject(MonAn m) throws SQLException {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "insert into " + table + " value(?,?,?,?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, m.getMon_id());
            pst.setString(2, m.getMon_ten());
            pst.setString(3, m.getMon_loai());
            pst.setString(4, m.getMon_hinhAnh());
            pst.setInt(5, m.getMon_gia());
            pst.setInt(6, m.getMon_trangThai());
            pst.setInt(7, m.getMon_giaN());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }

    public boolean updateObject(MonAn m) throws SQLException {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "update " + table + " set Mon_ten = ?, Mon_loai = ?, Mon_hinhAnh = ?, Mon_gia = ?, Mon_trangThai = ?, Mon_giaN = ? where Mon_id = ? ";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);  
            pst.setString(1, m.getMon_ten());
            pst.setString(2, m.getMon_loai());
            pst.setString(3, m.getMon_hinhAnh());
            pst.setInt(4, m.getMon_gia());
            pst.setInt(5, m.getMon_trangThai());
            pst.setInt(6, m.getMon_giaN());
            pst.setInt(7, m.getMon_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }
    
    public boolean deleteObject(MonAn m) throws SQLException {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "update " + table + " set Mon_trangThai = ? where Mon_id = ? ";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);  
            pst.setInt(1, 1);
            pst.setInt(2, m.getMon_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }

    public static void main(String[] args) {
        MonAnModel model = new MonAnModel();
        MonAn monAn = model.getObjectTen("SÚP HẢI SẢN ĐẬU PHỤ");
        System.out.println(monAn.toString());
//        ArrayList<MonAn> lstMonAn = model.getAllObject("Mon hai san");
//        for (int i = 0; i < lstMonAn.size(); i++) {
//            System.out.println(lstMonAn.get(i).toString());
//        }
//        MonAn m;
//        try {
//            model.deleteObject(m = new MonAn(26));
//        } catch (SQLException ex) {
//            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        ArrayList<MonAn> lstMonAn2 = model.getAll();
//        for (int i = 0; i < lstMonAn2.size(); i++) {
//            System.out.println(lstMonAn2.get(i).toString());
//        }
    }
    
}
