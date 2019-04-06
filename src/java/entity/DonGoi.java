/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author thisi
 */
public class DonGoi {

    private int Don_id;
    private int Ban_id;
    private String Ban_gioGoi;
    private String Ban_ngayGoi;
    private String Don_nv_thanhToan;
    private int Trang_thai_don;
    private int Don_thanhTien;

    public DonGoi() {
    }

    public DonGoi(int Don_id) {
        this.Don_id = Don_id;
    }
    
    
    
    public DonGoi(int Don_id, int Ban_id, String Ban_gioGoi, String Ban_ngayGoi, String Don_nv_thanhToan, int Trang_thai_don, int Don_thanhTien) {
        this.Don_id = Don_id;
        this.Ban_id = Ban_id;
        this.Ban_gioGoi = Ban_gioGoi;
        this.Ban_ngayGoi = Ban_ngayGoi;
        this.Don_nv_thanhToan = Don_nv_thanhToan;
        this.Trang_thai_don = Trang_thai_don;
        this.Don_thanhTien = Don_thanhTien;
    }

    public int getDon_id() {
        return Don_id;
    }

    public void setDon_id(int Don_id) {
        this.Don_id = Don_id;
    }

    public int getBan_id() {
        return Ban_id;
    }

    public void setBan_id(int Ban_id) {
        this.Ban_id = Ban_id;
    }

    public String getBan_gioGoi() {
        return Ban_gioGoi;
    }

    public void setBan_gioGoi(String Ban_gioGoi) {
        this.Ban_gioGoi = Ban_gioGoi;
    }

    public String getBan_ngayGoi() {
        return Ban_ngayGoi;
    }

    public void setBan_ngayGoi(String Ban_ngayGoi) {
        this.Ban_ngayGoi = Ban_ngayGoi;
    }

    public String getDon_nv_thanhToan() {
        return Don_nv_thanhToan;
    }

    public void setDon_nv_thanhToan(String Don_nv_thanhToan) {
        this.Don_nv_thanhToan = Don_nv_thanhToan;
    }

    public int getTrang_thai_don() {
        return Trang_thai_don;
    }

    public void setTrang_thai_don(int Trang_thai_don) {
        this.Trang_thai_don = Trang_thai_don;
    }

    public int getDon_thanhTien() {
        return Don_thanhTien;
    }

    public void setDon_thanhTien(int Don_thanhTien) {
        this.Don_thanhTien = Don_thanhTien;
    }

    @Override
    public String toString() {
        return "DonGoi{" + "Don_id=" + Don_id + ", Ban_id=" + Ban_id + ", Ban_gioGoi=" + Ban_gioGoi + ", Ban_ngayGoi=" + Ban_ngayGoi + ", Don_nv_thanhToan=" + Don_nv_thanhToan + ", Trang_thai_don=" + Trang_thai_don + ", Don_thanhTien=" + Don_thanhTien + '}';
    }
    
    

}
