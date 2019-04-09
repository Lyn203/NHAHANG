/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.BanGoi;
import util.ConnectDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thisi
 */
public class BanGoiModel {

    private final String table = "BanGoi";

    public ArrayList<BanGoi> getAllObject(){
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table;
        Statement st = null;
        ArrayList<BanGoi> lstBanGoi = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                BanGoi bg = new BanGoi(rs.getInt(1), rs.getString(2), rs.getInt(3));
                lstBanGoi.add(bg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lstBanGoi;
    }

    public BanGoi getObject(int id) throws SQLException {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Ban_id = ?";
        PreparedStatement pst = null;
        BanGoi banGoi = new BanGoi();
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                banGoi = new BanGoi(rs.getInt(1), rs.getString(2), rs.getInt(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        pst.close();
        conn.closeConnection();
        return banGoi;
    }

    public boolean deleteObject(int id) throws SQLException{
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "delete from " + table + " where Ban_id = ?";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }
    
    public boolean insertObject(int id, int trangThai) throws SQLException{
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "insert into " + table + " value(?,?)";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, id);
            pst.setInt(2, trangThai);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }
    
    public boolean updateObject(BanGoi bg) throws SQLException{
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "update " + table + " set Trang_thai_ban = ? where Ban_id = ? ";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, bg.getTrang_thai_ban());
            pst.setInt(2, bg.getBan_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }
    
    public List<Integer> getBanChuaDat(){
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select distinct Ban_id from dongoi order by Ban_id asc";
        Statement st = null;
        ArrayList<Integer> lstBanDaGoi = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                lstBanDaGoi.add(rs.getInt("Ban_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BanGoiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Integer> listBanChuaGoi = new ArrayList<>();
        for(int i =  0; i < lstBanDaGoi.size(); i++){
            if(i+1 > lstBanDaGoi.size() - 1)
                break;
            Integer between = Math.abs(lstBanDaGoi.get(i) - lstBanDaGoi.get(i+1));
            if(between == 1) continue;
            else{
                while(between > 1){
                    between--;
                    listBanChuaGoi.add(lstBanDaGoi.get(i)+between);
                }
            }
        }
        
        return listBanChuaGoi;
    }
    
    
    public static void main(String[] args) throws SQLException {
        
        BanGoiModel bgm = new BanGoiModel();
        
        System.out.println("Thong tin tat ca cac ban");
//        ArrayList<BanGoi> lstTest = bgm.getAllObject();
//        for (BanGoi banGoi : lstTest) {
//            System.out.println(banGoi.toString());
//        }
         List<Integer> listBanChuaGoi = bgm.getBanChuaDat();
         for(Integer inte : listBanChuaGoi){
             System.out.println(inte);
         }
        
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
//        bgm.insertObject(6, 0);
//        ArrayList<BanGoi> lstTest3 = bgm.getAllObject();
//        for (BanGoi banGoi : lstTest3) {
//            System.out.println(banGoi.toString());
//        }
        
//        System.out.println("Cap nhap");
//        bgm.updateObject(6, 1);
//        ArrayList<BanGoi> lstTest4 = bgm.getAllObject();
//        for (BanGoi banGoi : lstTest4) {
//            System.out.println(banGoi.toString());
//        }
    }
}
