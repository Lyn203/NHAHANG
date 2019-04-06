/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import entity.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectDB;

/**
 *
 * @author NSH
 */
public class TaiKhoanModel {
    //Lay ra 1 tai khoan tu user pass
    public ArrayList<TaiKhoan> getTK(TaiKhoan TK) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from taikhoan where user = '" + TK.getUser() + "' and password = '" + TK.getPassword()+ "'";
        Statement st = null;
        ArrayList<TaiKhoan> lstTK = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7));
                lstTK.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstTK;
    }
    public ArrayList<TaiKhoan> getTKbyU(String user) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from taikhoan where user = '" + user + "'";
        Statement st = null;
        ArrayList<TaiKhoan> lstTK = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7));
                lstTK.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstTK;
    }
    
    public boolean updateObject(TaiKhoan m) throws SQLException {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "update taikhoan set password = ?, ten_nv = ?,quyen= ?, diachi = ?, sdt = ?, namSinh = ? where user = ? ";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);  
            pst.setString(1, m.getPassword());
            pst.setString(2, m.getTen_nv());
            pst.setInt(3, m.getQuyen());   
            pst.setString(4, m.getDiachi());
            pst.setInt(5, m.getSdt());           
            pst.setInt(6, m.getNamSinh());
            pst.setString(7, m.getUser());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }
    
     public ArrayList<TaiKhoan> getAll() {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from taikhoan";
        Statement st = null;
        ArrayList<TaiKhoan> lstTK = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getString(1), rs.getString(2),rs.getInt(3), rs.getString(4),
                       rs.getString(5), rs.getInt(6), rs.getInt(7));
                lstTK.add(tk);
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
        return lstTK;
    }
    
    public boolean insertObject(TaiKhoan m) throws SQLException {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "insert into taikhoan value(?,?,?,?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setString(1, m.getUser());
            pst.setString(2, m.getPassword());
            pst.setInt(3, m.getQuyen());  
            pst.setString(4, m.getTen_nv());             
            pst.setString(5, m.getDiachi());
            pst.setInt(6, m.getSdt());           
            pst.setInt(7, m.getNamSinh());            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MonAnModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        pst.close();
        conn.closeConnection();
        return true;
    }
    
    public boolean DeleteObject(TaiKhoan tk) {        
        ConnectDB conn = new ConnectDB();
        PreparedStatement pst = null;
        String sqlCommand = "delete from taikhoan where user = ?";
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setString(1, tk.getUser());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanModel.class.getName()).log(Level.SEVERE, null, ex);
        }          
        try {
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
    public static void main(String[] args) throws SQLException {
        TaiKhoanModel tkmd= new TaiKhoanModel();
        TaiKhoan TK = new TaiKhoan("a","a",1,"sssss","aaaaa",1,11);
        if(tkmd.DeleteObject(TK)){
             System.out.println(tkmd.getTK(TK).get(0).toString());
        }
    }
}
