/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import model.ChiTietDonModel;

/**
 *
 * @author thisi
 */
public class ChiTietDon {

    private int Don_id;
    private int ChiTiet_id;
    private String Mon_ten;
    private int Mon_gia;
    private int Mon_soLuong;
    private int CTT_Trang_Thai;
    private String Mon_DonVi;

    public ChiTietDon() {
    }

    public ChiTietDon(int Don_id, int ChiTiet_id, String Mon_ten, int Mon_gia, int Mon_soLuong, int CTT_Trang_Thai, String Mon_DonVi) {
        this.Don_id = Don_id;
        this.ChiTiet_id = ChiTiet_id;
        this.Mon_ten = Mon_ten;
        this.Mon_gia = Mon_gia;
        this.Mon_soLuong = Mon_soLuong;
        this.CTT_Trang_Thai = CTT_Trang_Thai;
        this.Mon_DonVi = Mon_DonVi;
    }

    public int getDon_id() {
        return Don_id;
    }

    public void setDon_id(int Don_id) {
        this.Don_id = Don_id;
    }

    public int getChiTiet_id() {
        return ChiTiet_id;
    }

    public void setChiTiet_id(int ChiTiet_id) {
        this.ChiTiet_id = ChiTiet_id;
    }

    public String getMon_ten() {
        return Mon_ten;
    }

    public void setMon_ten(String Mon_ten) {
        this.Mon_ten = Mon_ten;
    }

    public int getMon_gia() {
        return Mon_gia;
    }

    public void setMon_gia(int Mon_gia) {
        this.Mon_gia = Mon_gia;
    }

    public int getMon_soLuong() {
        return Mon_soLuong;
    }

    public void setMon_soLuong(int Mon_soLuong) {
        this.Mon_soLuong = Mon_soLuong;
    }

    public int getCTT_Trang_Thai() {
        return CTT_Trang_Thai;
    }

    public void setCTT_Trang_Thai(int CTT_Trang_Thai) {
        this.CTT_Trang_Thai = CTT_Trang_Thai;
    }

    public String getMon_DonVi() {
        return Mon_DonVi;
    }

    public void setMon_DonVi(String Mon_DonVi) {
        this.Mon_DonVi = Mon_DonVi;
    }
    
    @Override
    public String toString() {
        return "ChiTietDon{" + "Don_id=" + Don_id + ", ChiTiet_id=" + ChiTiet_id + ", Mon_ten=" + Mon_ten + ", Mon_gia=" + Mon_gia + ", Mon_soLuong=" + Mon_soLuong + ", CTT_Trang_Thai=" + CTT_Trang_Thai + ", Mon_DonVi=" + Mon_DonVi + '}';
    }

}
