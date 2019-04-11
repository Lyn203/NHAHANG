/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.BanGoi;
import entity.DonGoi;
import entity.ChiTietDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;

/**
 *
 * @author thisi
 */
public class DonGoiModel {

    private final String table = "DonGoi";

    //Lay ra cac chi tiet cua don dang goi
    public ArrayList<ChiTietDon> getCTObject(int Banid) throws SQLException {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Trang_thai_don = 0 and Ban_id = ?";
        PreparedStatement pst = null;
        ArrayList<DonGoi> lstDonGoi = new ArrayList<>();
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, Banid);
            rs = pst.executeQuery();
            while (rs.next()) {
                DonGoi bg = new DonGoi(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                lstDonGoi.add(bg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
        ArrayList<ChiTietDon> lstCTD = chiTietDonModel.getAll(lstDonGoi.get(0).getDon_id());
        pst.close();
        conn.closeConnection();
        return lstCTD;
    }

    public DonGoi getIDBan(int id) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from dongoi where Don_id = (select Don_id from chitietdon where chitietdon.ChiTiet_id = ?)";
        PreparedStatement pst = null;
        DonGoi donGoi = new DonGoi();
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                donGoi = new DonGoi(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return donGoi;
    }
    
    
    //Lay ra don dang goi o ban do
    public DonGoi getIDDon(int Banid) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Trang_thai_don = 0 and Ban_id = ?";
        PreparedStatement pst = null;
        DonGoi donGoi = new DonGoi();
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, Banid);
            rs = pst.executeQuery();
            while (rs.next()) {
                donGoi = new DonGoi(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return donGoi;
    }

    public boolean deleteObject(DonGoi dg) {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "update " + table + " set Trang_thai_don = ?, Don_nv_thanhToan=? where Don_id = ? ";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, 1);
            pst.setString(2, dg.getDon_nv_thanhToan());
            pst.setInt(3, dg.getDon_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    public boolean insertObject(DonGoi dg) {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "insert into " + table + " (Ban_id, Ban_gioGoi, Ban_ngayGoi, Trang_thai_don, Don_thanhTien) values(?,?,?,?,?)";
        PreparedStatement pst = null;

        Calendar cl = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df2 = new SimpleDateFormat("HH:mm");

        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, dg.getBan_id());
            pst.setString(2, df.format(cl.getTime()));
            pst.setString(3, df2.format(cl.getTime()));
            pst.setInt(4, 0);
            pst.setInt(5, 0);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }
    
    public ResultSet insertObjectVer2(DonGoi dg) {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "insert into " + table + " (Ban_id, Ban_gioGoi, Ban_ngayGoi, Don_thanhTien) value(?,?,?,?)";
        PreparedStatement pst = null;

        Calendar cl = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df2 = new SimpleDateFormat("HH:mm");
        ResultSet rs = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, dg.getBan_id());
            pst.setString(2, df.format(cl.getTime()));
            pst.setString(3, df2.format(cl.getTime()));
            pst.setInt(4, 0);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
            return rs;
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public boolean updateObject(DonGoi dg) throws SQLException {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "update " + table + " set Ban_id = ?, Ban_gioGoi = ?, Ban_ngayGoi = ?, Don_nv_thanhToan = ?, Trang_thai_don = ?, Don_thanhTien = ? where Don_id = ? ";
        PreparedStatement pst = null;

        Calendar cl = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat df2 = new SimpleDateFormat("HH:mm");

        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, dg.getBan_id());
            pst.setString(2, df.format(cl.getTime()));
            pst.setString(3, df2.format(cl.getTime()));
            pst.setString(4, null);
            pst.setInt(5, dg.getTrang_thai_don());
            pst.setInt(6, dg.getDon_thanhTien());
            pst.setInt(7, dg.getDon_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }
    
    //select max(Don_id) as MaxId from dongoi
    public int getMaxDon_id(){
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select max(Don_id) as maxdonid from dongoi";
        Statement pst = null;
         
        try {
            pst = conn.openConnect().createStatement();
            rs = pst.executeQuery(sqlCommand);
            rs.next();
            return rs.getInt("maxdonid");
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ArrayList<DonGoi> getCTDDangGoi(int Banid) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Trang_thai_don = 0 and Ban_id = ?";
        PreparedStatement pst = null;
        ArrayList<DonGoi> lstDG = new ArrayList<>();

        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, Banid);
            rs = pst.executeQuery();
            while (rs.next()) {
                DonGoi dg = new DonGoi(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                lstDG.add(dg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DonGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lstDG;
    }
    // lay ra don goi co chua cua ban do, chua thi tao co thi lay ra
    public DonGoi getDonGoi(DonGoi dg, int Banid) {
        if (getCTDDangGoi(Banid).size() == 0) {
            insertObject(dg);
            System.out.println("null");
            return getCTDDangGoi(Banid).get(0);
        } else {
            System.out.println("K null");
            return getCTDDangGoi(Banid).get(0);
        }
    }
    
    
    
    public static void main(String[] args) throws SQLException {

        DonGoiModel dgm = new DonGoiModel();
        DonGoi dg = new DonGoi();
        dg.setBan_id(6);
        dg.setTrang_thai_don(0);
        dg.setDon_thanhTien(0);
        dgm.insertObject(dg);
       

//        System.out.println(dgm.getCTDDangGoi(1).toString());
//        System.out.println("Thong tin tat ca cac ban");
//        ArrayList<ChiTietDon> lstTest = dgm.getAllObject(2);
//        for (ChiTietDon donGoi : lstTest) {
//            System.out.println(donGoi.toString());
//        }
//        System.out.println("Thong tin ban co id 1");
//        BanGoi bg = bgm.getObject(1);
//        System.out.println(bg.toString());
//        
//        System.out.println("Xoa");
//        bgm.deleteObject(3);
//        ArrayList<BanGoi> lstTest2 = bgm.getAllObject();
//        for (BanGoi banGoi : lstTest2) {
//            System.out.println(banGoi.toString());
//        }
//        System.out.println("Them");
//        dgm.insertObject(4, 90000);
//        System.out.println("Cap nhap");
//        DonGoi dg = new DonGoi(1, 2, df.format(cl.getTime()), df2.format(cl.getTime()), "ABC", 0, 100000);
//        dgm.updateObject(dg);
//        ArrayList<DonGoi> lstTest3 = dgm.getAllObject(2);
//        for (DonGoi donGoi : lstTest3) {
//            System.out.println(donGoi.toString());
//        }
    }
}
