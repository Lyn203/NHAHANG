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
public class TaiKhoan {



    private String user;
    private String password;
    private int quyen;
    private String ten_nv;
    private String diachi;
    private int sdt;
    private int namSinh;

    public TaiKhoan(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public TaiKhoan() {
    }

    public TaiKhoan(String user, String password, int quyen, String ten_nv, String diachi, int sdt, int namSinh) {
        this.user = user;
        this.password = password;
        this.quyen = quyen;
        this.ten_nv = ten_nv;
        this.diachi = diachi;
        this.sdt = sdt;
        this.namSinh = namSinh;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public String getTen_nv() {
        return ten_nv;
    }

    public void setTen_nv(String ten_nv) {
        this.ten_nv = ten_nv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "user=" + user + ", password=" + password + ", quyen=" + quyen + ", ten_nv=" + ten_nv + ", diachi=" + diachi + ", sdt=" + sdt + ", namSinh=" + namSinh + '}';
    }
    
    
}
