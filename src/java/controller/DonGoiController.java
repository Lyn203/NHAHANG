/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.BanGoi;
import entity.ChiTietDon;
import entity.DonGoi;
import entity.MonAn;
import entity.TaiKhoan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import model.BanGoiModel;
import model.ChiTietDonModel;
import model.DonGoiModel;
import model.MonAnModel;
import model.TaiKhoanModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author thisi
 */
@Controller
@RequestMapping(value = "/Don")
public class DonGoiController {

    private DonGoiModel donGoiModel;

    public DonGoiController() {
        this.donGoiModel = new DonGoiModel();
    }

   

    @RequestMapping(value = "/DsBan")
    public ModelAndView initDsBan(HttpSession session) {
        String Suser = String.valueOf(session.getAttribute("Suser").toString());
        TaiKhoanModel tkmd= new TaiKhoanModel();
        ArrayList<TaiKhoan> tk= tkmd.getTKbyU(Suser);
        int quyen= tk.get(0).getQuyen();
        if(Suser.length()<1||quyen>2){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/dsban");
        BanGoiModel banGoiModel = new BanGoiModel();
        ArrayList<BanGoi> bg;
        bg = banGoiModel.getAllObject();
        model.addObject("dsban", bg);
        
        DonGoi dg = new DonGoi();
        model.getModelMap().put("dongoi", dg);
        
        ChiTietDon chiTietDon = new ChiTietDon();
        model.getModelMap().put("capnhapctd", chiTietDon);

        ChiTietDonModel chiTietDonModel1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst1 = chiTietDonModel1.getDsCTD(1);
        model.addObject("lstDsMon1", lst1);

        ChiTietDonModel chiTietDonModel2 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst2 = chiTietDonModel2.getDsCTD(2);
        model.addObject("lstDsMon2", lst2);

        ChiTietDonModel chiTietDonModel3 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst3 = chiTietDonModel3.getDsCTD(3);
        model.addObject("lstDsMon3", lst3);

        ChiTietDonModel chiTietDonModel4 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst4 = chiTietDonModel4.getDsCTD(4);
        model.addObject("lstDsMon4", lst4);

        ChiTietDonModel chiTietDonModel5 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst5 = chiTietDonModel5.getDsCTD(5);
        model.addObject("lstDsMon5", lst5);

        ChiTietDonModel chiTietDonModel6 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst6 = chiTietDonModel6.getDsCTD(6);
        model.addObject("lstDsMon6", lst6);

        ChiTietDonModel chiTietDonModel7 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst7 = chiTietDonModel7.getDsCTD(7);
        model.addObject("lstDsMon7", lst7);

        ChiTietDonModel chiTietDonModel8 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst8 = chiTietDonModel8.getDsCTD(8);
        model.addObject("lstDsMon8", lst8);

        ChiTietDonModel chiTietDonModel9 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst9 = chiTietDonModel9.getDsCTD(9);
        model.addObject("lstDsMon9", lst9);

        ChiTietDonModel chiTietDonModel10 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst10 = chiTietDonModel10.getDsCTD(10);
        model.addObject("lstDsMon10", lst10);

        ChiTietDonModel chiTietDonModel11 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst11 = chiTietDonModel11.getDsCTD(11);
        model.addObject("lstDsMon11", lst11);

        ChiTietDonModel chiTietDonModel12 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst12 = chiTietDonModel12.getDsCTD(12);
        model.addObject("lstDsMon12", lst12);

        return model;
    }

    @RequestMapping(value = "/XuLyThemDon")
    public ModelAndView xuLyThemDonGoi(HttpSession session, @ModelAttribute("dongoi") DonGoi dg) {
        
        String user = String.valueOf(session.getAttribute("Suser").toString());
        if(user.length()<1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        donGoiModel.getDonGoi(dg, dg.getBan_id());

        ModelAndView model = new ModelAndView("/goimon");

        MonAnModel monAnModel = new MonAnModel();
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
        ChiTietDon chiTietDon = new ChiTietDon();

        model.addObject("chitietdon", chiTietDon);
        ArrayList<MonAn> lstMonAn = monAnModel.getAll();
        model.addObject("listMonAn", lstMonAn);

        DonGoi donGoi = donGoiModel.getIDDon(dg.getBan_id());
        model.getModelMap().put("dongoi", donGoi);
        session.putValue("SIdDon", donGoi.getDon_id());
        ArrayList<ChiTietDon> lstChiTietDons = chiTietDonModel.getAllCT_Ban(donGoi.getDon_id());
        ArrayList<MonAn> lstDSC = new ArrayList<>();
        for (ChiTietDon i : lstChiTietDons) {
            ChiTietDon ctd2 = chiTietDonModel.getObject(i.getChiTiet_id());
            MonAn monAn = monAnModel.getObjectTen(ctd2.getMon_ten());
            lstDSC.add(monAn);
        }
        model.addObject("lstMonAn", lstDSC);
        model.addObject("lstChiTiet", lstChiTietDons);
        return model;

    }
    

    @RequestMapping(value = "/XuLyDatMon")
    public String handleUpdateTD(HttpSession session, @ModelAttribute("datmon") ChiTietDon ctd) {
        
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
        int id = Integer.valueOf(session.getAttribute("SIdHD").toString());

        ArrayList<ChiTietDon> lstDsChon = chiTietDonModel.getAllCT_Ban(id);

        boolean flag = false;
        for (int i = 0; i < lstDsChon.size(); i++) {
            flag = chiTietDonModel.udObject(lstDsChon.get(i));
        }
        if (flag == true) {
            return "redirect:Don/DsBan.htm";
        } else {
            return "Error";
        }
    }

    @RequestMapping(value = "/HienThiDsMon")
    public ModelAndView showDatMon() {
        ModelAndView model = new ModelAndView("/goimon");
        MonAnModel monAnModel = new MonAnModel();
        ChiTietDon ct = new ChiTietDon();
        model.getModelMap().put("chitietdon", ct);
        ArrayList<MonAn> lstMonAn = monAnModel.getAll();
        model.addObject("lstMonAn", lstMonAn);
        return model;
    }
    
    @RequestMapping(value="/KhachThemMon")
    public ModelAndView handleInsertCTMon(@ModelAttribute("chitietdon") ChiTietDon ctd) {
          
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();

        ModelAndView model = new ModelAndView("/khachgoimon");

        if (chiTietDonModel.insertObject(ctd)) {

            MonAnModel monAnModel = new MonAnModel();
            ArrayList<MonAn> lstMonAn = monAnModel.getAll();
            model.addObject("listMonAn", lstMonAn);

            ArrayList<ChiTietDon> lstChitiet = chiTietDonModel.getAllCT_Ban(ctd.getDon_id());
            model.addObject("lstChiTiet", lstChitiet);
            ArrayList<MonAn> lstMonAns = new ArrayList<>();
            MonAnModel monAnModel2 = new MonAnModel();
            
            for (ChiTietDon i : lstChitiet) {
                ChiTietDon ctd2 = chiTietDonModel.getObject(i.getChiTiet_id());
                MonAn monAn = monAnModel2.getObjectTen(ctd2.getMon_ten());
                lstMonAns.add(monAn);
            }
            model.addObject("lstMonAn", lstMonAns);
            return model;
        } else {
            return model;
        }
    }

    @RequestMapping(value = "/XuLyThemMon")
    public ModelAndView handleInsertCT(HttpSession session, @ModelAttribute("chitietdon") ChiTietDon ctd) {
        String user = String.valueOf(session.getAttribute("Suser").toString());
        if(user.length()<1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();

        ModelAndView model = new ModelAndView("/goimon");

        if (chiTietDonModel.insertObject(ctd)) {

            MonAnModel monAnModel = new MonAnModel();
            ArrayList<MonAn> lstMonAn = monAnModel.getAll();
            model.addObject("listMonAn", lstMonAn);

            ArrayList<ChiTietDon> lstChitiet = chiTietDonModel.getAllCT_Ban(ctd.getDon_id());
            model.addObject("lstChiTiet", lstChitiet);
            ArrayList<MonAn> lstMonAns = new ArrayList<>();
            MonAnModel monAnModel2 = new MonAnModel();
            for (ChiTietDon i : lstChitiet) {
                ChiTietDon ctd2 = chiTietDonModel.getObject(i.getChiTiet_id());
                MonAn monAn = monAnModel2.getObjectTen(ctd2.getMon_ten());
                lstMonAns.add(monAn);
            }
            model.addObject("lstMonAn", lstMonAns);
            return model;
        } else {
            return model;
        }
    }

    @RequestMapping(value = "/XuLyXoaChiTietMon")
    public String xuLyXoaMon(@ModelAttribute("/xoachittiet") ChiTietDon ctd) {
        
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
        if (chiTietDonModel.deleteObject(ctd)) {
            return "redirect:DsBan.htm";
        } else {
            return "redirect:DsBan.htm";
        }
    }
    
    @RequestMapping(value = "/XuLyXoaChiTietMon2")
    public String xuLyXoaMon2(@ModelAttribute("/xoachittiet") ChiTietDon ctd) {
        
       
        DonGoi donGoi = donGoiModel.getIDBan(ctd.getChiTiet_id());
        
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
        if (chiTietDonModel.deleteObject(ctd)) {
            return "redirect:XuLyThemDon.htm?Ban_id="+donGoi.getBan_id();
        } else {
            return "redirect:XuLyThemDon?Ban_id="+donGoi.getBan_id();
        }
    }
    
    @RequestMapping(value = "/XuLyCapNhapCTD")
    public String xuLyCapNhapCTD(@ModelAttribute("/capnhapctd") ChiTietDon ctd) {
        
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
        
        if (chiTietDonModel.updateObjectCTD(ctd)) {
            return "redirect:DsBan.htm";
        } else {
            return "redirect:DsBan.htm";
        }
    
    }
    
    @RequestMapping(value = "/xuLyThanhToan")
    public ModelAndView handleThanhToan(int ban, HttpSession session) {
        String user = String.valueOf(session.getAttribute("Suser").toString());
        if(user.length()<1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/thanhtoan");
        DonGoi donThanhToan;
        donThanhToan = donGoiModel.getIDDon(ban);

        ChiTietDonModel ctdModel = new ChiTietDonModel();
        MonAnModel monAnModel = new MonAnModel();
        ArrayList<ChiTietDon> lstCTD = ctdModel.getDsCTD(ban);

        ArrayList<MonAn> lstMA = new ArrayList<>();

        for (ChiTietDon j : lstCTD) {
            ChiTietDon x = ctdModel.getObject(j.getChiTiet_id());
            MonAn monAn = monAnModel.getObjectTen(x.getMon_ten());
            
            lstMA.add(monAn);
        }

        model.addObject("donTT", donThanhToan);
        model.addObject("lstCTD", lstCTD);
        model.addObject("lstMA", lstMA);

        return model;

    }
    
    @RequestMapping(value = "xacNhanThanhtoan")
    public String XLThanhtoan(@RequestParam("idBan") int banid,HttpSession session) {
        String user = String.valueOf(session.getAttribute("Suser").toString());
        DonGoi don = donGoiModel.getIDDon(banid);
        don.setDon_nv_thanhToan(user);
        ChiTietDonModel ctdModel= new ChiTietDonModel();
        ArrayList<ChiTietDon> lstCTDTT = ctdModel.getDsCTD(banid);
        for (ChiTietDon ctdTT : lstCTDTT) {
            ctdModel.udObjectTT2(ctdTT);
        }
        if (donGoiModel.deleteObject(don)) {
            return "redirect:DsBan.htm";
        } else {
            return "error";
        }
    }

}
