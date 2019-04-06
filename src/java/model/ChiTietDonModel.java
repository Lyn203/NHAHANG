/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.ChiTietDon;
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
 * @author thisi
 */
public class ChiTietDonModel {

    private final String table = "chitietdon";

    public ChiTietDon getObject(int id) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where ChiTiet_id = '" + id + "'";
        Statement st = null;

        ChiTietDon chiTietDon = new ChiTietDon();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                chiTietDon = new ChiTietDon(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chiTietDon;
    }

    //Lay ra ds chi tiet don cua ban
    public ArrayList<ChiTietDon> getDsCTD(int Banid) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;

        String sqlCommand = "select * from ChiTietDon inner join DonGoi on ChiTietDon.Don_id = DonGoi.Don_id where (ChiTietDon.CTT_Trang_Thai = 0 or ChiTietDon.CTT_Trang_Thai = 1) and DonGoi.Ban_id = " + Banid;
        Statement st = null;

        ArrayList<ChiTietDon> lstDsCTD = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                ChiTietDon monAn = new ChiTietDon(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7));
                lstDsCTD.add(monAn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstDsCTD;
    }

    public ArrayList<ChiTietDon> getDsCTD0(int Banid) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;

        String sqlCommand = "select * from ChiTietDon inner join DonGoi on ChiTietDon.Don_id = DonGoi.Don_id where ChiTietDon.CTT_Trang_Thai = '0' and DonGoi.Ban_id = " + Banid;
        Statement st = null;

        ArrayList<ChiTietDon> lstDsCTD = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                ChiTietDon monAn = new ChiTietDon(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7));
                lstDsCTD.add(monAn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstDsCTD;
    }

    public ArrayList<ChiTietDon> getDsCTD1(int Banid) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;

        String sqlCommand = "select * from ChiTietDon inner join DonGoi on ChiTietDon.Don_id = DonGoi.Don_id where ChiTietDon.CTT_Trang_Thai = '1' and DonGoi.Ban_id = " + Banid;
        Statement st = null;

        ArrayList<ChiTietDon> lstDsCTD = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                ChiTietDon monAn = new ChiTietDon(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7));
                lstDsCTD.add(monAn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstDsCTD;
    }

    public ArrayList<ChiTietDon> getAll(int id) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Don_id = " + id;
        Statement st = null;

        ArrayList<ChiTietDon> lstCTDon = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                ChiTietDon monAn = new ChiTietDon(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7));
                lstCTDon.add(monAn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstCTDon;
    }

    // Lay ra cac chi tiet don cua ban dang doi
    public ArrayList<ChiTietDon> getAllCT_Ban(int id) {
        ConnectDB conn = new ConnectDB();
        ResultSet rs = null;
        String sqlCommand = "select * from " + table + " where Don_id = " + id;
        Statement st = null;

        ArrayList<ChiTietDon> lstCTD_ban = new ArrayList<>();
        try {
            st = conn.openConnect().createStatement();
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
                ChiTietDon ct = new ChiTietDon(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7));
                lstCTD_ban.add(ct);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstCTD_ban;
    }

    public boolean insertObject(ChiTietDon d) {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "insert into " + table + " value(?,?,?,?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, d.getDon_id());
            pst.setInt(2, d.getChiTiet_id());
            pst.setString(3, d.getMon_ten());
            pst.setInt(4, d.getMon_gia());
            pst.setInt(5, d.getMon_soLuong());
            pst.setInt(6, 0);
            pst.setString(7, d.getMon_DonVi());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean updateObject(ChiTietDon d) {
        try {
            ConnectDB conn = new ConnectDB();
            String sqlCommand = "update " + table + " set Don_id = ?, Mon_ten = ?, Mon_gia = ?, Mon_soLuong = ? CTT_Trang_Thai = ? Mon_DonVi = ? where ChiTiet_id = ? ";
            PreparedStatement pst = null;
            try {
                pst = conn.openConnect().prepareStatement(sqlCommand);
                pst.setInt(1, d.getDon_id());
                pst.setString(2, d.getMon_ten());
                pst.setInt(3, d.getMon_gia());
                pst.setInt(4, d.getMon_soLuong());
                pst.setInt(5, d.getCTT_Trang_Thai());
                pst.setString(6, d.getMon_DonVi());
                pst.setInt(7, d.getChiTiet_id());
                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            pst.close();
            conn.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;

    }

    public boolean updateObjectCTD(ChiTietDon d) {
        try {
            ConnectDB conn = new ConnectDB();
            String sqlCommand = "update " + table + " set Mon_soLuong = ?, Mon_DonVi = ? where ChiTiet_id = ? ";
            PreparedStatement pst = null;
            try {
                pst = conn.openConnect().prepareStatement(sqlCommand);
                pst.setInt(1, d.getMon_soLuong());
                pst.setString(2, d.getMon_DonVi());
                pst.setInt(3, d.getChiTiet_id());
                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            pst.close();
            conn.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean udObject(ChiTietDon d) {
        try {
            ConnectDB conn = new ConnectDB();
            String sqlCommand = "update " + table + " set CTT_Trang_Thai = ? where ChiTiet_id = ? and CTT_Trang_Thai = '0'";
            PreparedStatement pst = null;
            try {
                pst = conn.openConnect().prepareStatement(sqlCommand);
                pst.setInt(1, 1);
                pst.setInt(2, d.getChiTiet_id());
                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            pst.close();
            conn.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean udObjectTT2(ChiTietDon d) {
        try {
            ConnectDB conn = new ConnectDB();
            String sqlCommand = "update " + table + " set CTT_Trang_Thai = ? where ChiTiet_id = ? and CTT_Trang_Thai = '0'";
            PreparedStatement pst = null;
            try {
                pst = conn.openConnect().prepareStatement(sqlCommand);
                pst.setInt(1, 2);
                pst.setInt(2, d.getChiTiet_id());
                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            pst.close();
            conn.closeConnection();

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public boolean deleteObject(ChiTietDon d) {
        ConnectDB conn = new ConnectDB();
        String sqlCommand = "delete from " + table + " where ChiTiet_id = ? ";
        PreparedStatement pst = null;
        try {
            pst = conn.openConnect().prepareStatement(sqlCommand);
            pst.setInt(1, d.getChiTiet_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            pst.close();
            conn.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public static void main(String[] args) {

        ChiTietDonModel model = new ChiTietDonModel();
        ChiTietDon ctd = new ChiTietDon(138, 129, "SÚP HẢI SẢN ĐẬU PHỤ", 58000, 3, 0, "Đĩa");
        model.updateObjectCTD(ctd);
//        ArrayList<ChiTietDon> lstCTD = new ArrayList<>();
//        lstCTD = model.getDsCTD(1);
//        for (int i = 0; i < lstCTD.size(); i++) {
//            System.out.println(lstCTD.get(i).toString());
//        }
//        try {
//            model.insertObject(new ChiTietDon(1, 0, "Mon_ten", 10000, 2));
//            
////        ChiTietDon d;
////        model.deleteObject(d = new ChiTietDon(0));
////
////        ArrayList<ChiTietDon> lstCTD2 = model.getAll();
////        for (int i = 0; i < lstCTD2.size(); i++) {
////            System.out.println(lstCTD2.get(i).toString());
////        }
//        } catch (SQLException ex) {
//            Logger.getLogger(ChiTietDonModel.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
