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
public class BanGoi {
    
    private int Ban_id;
    private String Ban_ten;
    private int Trang_thai_ban;

    public BanGoi() {
    }

    public BanGoi(int Ban_id, String Ban_ten, int Trang_thai_ban) {
        this.Ban_id = Ban_id;
        this.Ban_ten = Ban_ten;
        this.Trang_thai_ban = Trang_thai_ban;
    }

    public int getBan_id() {
        return Ban_id;
    }

    public void setBan_id(int Ban_id) {
        this.Ban_id = Ban_id;
    }

    public String getBan_ten() {
        return Ban_ten;
    }

    public void setBan_ten(String Ban_ten) {
        this.Ban_ten = Ban_ten;
    }

    public int getTrang_thai_ban() {
        return Trang_thai_ban;
    }

    public void setTrang_thai_ban(int Trang_thai_ban) {
        this.Trang_thai_ban = Trang_thai_ban;
    }

    @Override
    public String toString() {
        return "BanGoi{" + "Ban_id=" + Ban_id + ", Ban_ten=" + Ban_ten + ", Trang_thai_ban=" + Trang_thai_ban + '}';
    }
    
}
