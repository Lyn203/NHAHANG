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
public class MonAn {

    int Mon_id;
    String Mon_ten;
    String Mon_loai;
    public String Mon_hinhAnh;
    int Mon_gia;
    int Mon_trangThai;
    int Mon_giaN;

    public MonAn() {
    }

    public MonAn(int Mon_id) {
        this.Mon_id = Mon_id;
    }
    
    public MonAn(int Mon_id, String Mon_ten, String Mon_loai, String Mon_hinhAnh, int Mon_gia, int Mon_trangThai, int Mon_giaN) {
        this.Mon_id = Mon_id;
        this.Mon_ten = Mon_ten;
        this.Mon_loai = Mon_loai;
        this.Mon_hinhAnh = Mon_hinhAnh;
        this.Mon_gia = Mon_gia;
        this.Mon_trangThai = Mon_trangThai;
        this.Mon_giaN = Mon_giaN;
    }

    public int getMon_id() {
        return Mon_id;
    }

    public void setMon_id(int Mon_id) {
        this.Mon_id = Mon_id;
    }

    public String getMon_ten() {
        return Mon_ten;
    }

    public void setMon_ten(String Mon_ten) {
        this.Mon_ten = Mon_ten;
    }

    public String getMon_loai() {
        return Mon_loai;
    }

    public void setMon_loai(String Mon_loai) {
        this.Mon_loai = Mon_loai;
    }

    public String getMon_hinhAnh() {
        return Mon_hinhAnh;
    }

    public void setMon_hinhAnh(String Mon_hinhAnh) {
        this.Mon_hinhAnh = Mon_hinhAnh;
    }

    public int getMon_gia() {
        return Mon_gia;
    }

    public void setMon_gia(int Mon_gia) {
        this.Mon_gia = Mon_gia;
    }

    public int getMon_trangThai() {
        return Mon_trangThai;
    }

    public void setMon_trangThai(int Mon_trangThai) {
        this.Mon_trangThai = Mon_trangThai;
    }

    public int getMon_giaN() {
        return Mon_giaN;
    }

    public void setMon_giaN(int Mon_giaN) {
        this.Mon_giaN = Mon_giaN;
    }

    @Override
    public String toString() {
        return "MonAn{" + "Mon_id=" + Mon_id + ", Mon_ten=" + Mon_ten + ", Mon_loai=" + Mon_loai + ", Mon_hinhAnh=" + Mon_hinhAnh + ", Mon_gia=" + Mon_gia + ", Mon_trangThai=" + Mon_trangThai + ", Mon_giaN=" + Mon_giaN + '}';
    }
    
}
