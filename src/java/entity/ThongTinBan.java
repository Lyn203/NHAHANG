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
public class ThongTinBan {
    
    private int TT_id;
    private int Ban_id;
    private String TT_ngayDat;
    private String TT_gioDat;
    private String TT_ten_KH;
    private int TT_sdt;
    private String TT_email;
    private int TT_trangThai;

    public ThongTinBan() {
    }

    public ThongTinBan(int TT_id, int Ban_id, String TT_ngayDat, String TT_gioDat, String TT_ten_KH, int TT_sdt, String TT_email, int TT_trangThai) {
        this.TT_id = TT_id;
        this.Ban_id = Ban_id;
        this.TT_ngayDat = TT_ngayDat;
        this.TT_gioDat = TT_gioDat;
        this.TT_ten_KH = TT_ten_KH;
        this.TT_sdt = TT_sdt;
        this.TT_email = TT_email;
        this.TT_trangThai = TT_trangThai;
    }

    public int getTT_id() {
        return TT_id;
    }

    public void setTT_id(int TT_id) {
        this.TT_id = TT_id;
    }

    public int getBan_id() {
        return Ban_id;
    }

    public void setBan_id(int Ban_id) {
        this.Ban_id = Ban_id;
    }

    public String getTT_ngayDat() {
        return TT_ngayDat;
    }

    public void setTT_ngayDat(String TT_ngayDat) {
        this.TT_ngayDat = TT_ngayDat;
    }

    public String getTT_gioDat() {
        return TT_gioDat;
    }

    public void setTT_gioDat(String TT_gioDat) {
        this.TT_gioDat = TT_gioDat;
    }

    public String getTT_ten_KH() {
        return TT_ten_KH;
    }

    public void setTT_ten_KH(String TT_ten_KH) {
        this.TT_ten_KH = TT_ten_KH;
    }

    public int getTT_sdt() {
        return TT_sdt;
    }

    public void setTT_sdt(int TT_sdt) {
        this.TT_sdt = TT_sdt;
    }

    public String getTT_email() {
        return TT_email;
    }

    public void setTT_email(String TT_email) {
        this.TT_email = TT_email;
    }

    public int getTT_trangThai() {
        return TT_trangThai;
    }

    public void setTT_trangThai(int TT_trangThai) {
        this.TT_trangThai = TT_trangThai;
    }

    @Override
    public String toString() {
        return "ThongTinBan{" + "TT_id=" + TT_id + ", Ban_id=" + Ban_id + ", TT_ngayDat=" + TT_ngayDat + ", TT_gioDat=" + TT_gioDat + ", TT_ten_KH=" + TT_ten_KH + ", TT_sdt=" + TT_sdt + ", TT_email=" + TT_email + ", TT_trangThai=" + TT_trangThai + '}';
    }
    
    
}
