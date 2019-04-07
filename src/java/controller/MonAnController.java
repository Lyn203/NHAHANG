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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import model.BanGoiModel;
import model.ChiTietDonModel;
import model.MonAnModel;
import model.TaiKhoanModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author thisi
 */
@Controller
@RequestMapping(value = "/MonAn", method = RequestMethod.GET)
public class MonAnController {

    private MonAnModel monAnModel;

    public MonAnController() {
        this.monAnModel = new MonAnModel();
    }
    
    @RequestMapping(value = "/QLMDG")
    public ModelAndView initDsBan(HttpSession session) {
        String Suser = String.valueOf(session.getAttribute("Suser").toString());
        TaiKhoanModel tkmd= new TaiKhoanModel();
        ArrayList<TaiKhoan> tk= tkmd.getTKbyU(Suser);
        int quyen= tk.get(0).getQuyen();
        int ck=0;
        if(quyen==3||quyen==1){
            ck=4;
        }
        if(Suser.length()<1||ck!=4){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/qlmondagoi");
        BanGoiModel banGoiModel = new BanGoiModel();
        ArrayList<BanGoi> bg;
        bg = banGoiModel.getAllObject();
        model.addObject("dsban", bg);
        DonGoi dg = new DonGoi();
        model.getModelMap().put("dongoi", dg);

        ChiTietDonModel chiTietDonModel1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst1 = chiTietDonModel1.getDsCTD0(1);
        model.addObject("lstDsMon1", lst1);

        ChiTietDonModel chiTietDonModel2 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst2 = chiTietDonModel2.getDsCTD0(2);
        model.addObject("lstDsMon2", lst2);

        ChiTietDonModel chiTietDonModel3 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst3 = chiTietDonModel3.getDsCTD0(3);
        model.addObject("lstDsMon3", lst3);

        ChiTietDonModel chiTietDonModel4 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst4 = chiTietDonModel4.getDsCTD0(4);
        model.addObject("lstDsMon4", lst4);

        ChiTietDonModel chiTietDonModel5 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst5 = chiTietDonModel5.getDsCTD0(5);
        model.addObject("lstDsMon5", lst5);

        ChiTietDonModel chiTietDonModel6 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst6 = chiTietDonModel6.getDsCTD0(6);
        model.addObject("lstDsMon6", lst6);

        ChiTietDonModel chiTietDonModel7 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst7 = chiTietDonModel7.getDsCTD0(7);
        model.addObject("lstDsMon7", lst7);

        ChiTietDonModel chiTietDonModel8 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst8 = chiTietDonModel8.getDsCTD0(8);
        model.addObject("lstDsMon8", lst8);

        ChiTietDonModel chiTietDonModel9 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst9 = chiTietDonModel9.getDsCTD0(9);
        model.addObject("lstDsMon9", lst9);

        ChiTietDonModel chiTietDonModel10 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst10 = chiTietDonModel10.getDsCTD0(10);
        model.addObject("lstDsMon10", lst10);

        ChiTietDonModel chiTietDonModel11 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst11 = chiTietDonModel11.getDsCTD0(11);
        model.addObject("lstDsMon11", lst11);

        ChiTietDonModel chiTietDonModel12 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst12 = chiTietDonModel12.getDsCTD0(12);
        model.addObject("lstDsMon12", lst12);
        
        ChiTietDonModel chiTietDonModel1_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst1_1 = chiTietDonModel1_1.getDsCTD1(1);
        model.addObject("lstDsMon1_1", lst1_1);

        ChiTietDonModel chiTietDonModel2_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst2_1 = chiTietDonModel2_1.getDsCTD1(2);
        model.addObject("lstDsMon2_1", lst2_1);

        ChiTietDonModel chiTietDonModel3_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst3_1 = chiTietDonModel3_1.getDsCTD1(3);
        model.addObject("lstDsMon3_1", lst3_1);

        ChiTietDonModel chiTietDonModel4_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst4_1 = chiTietDonModel4_1.getDsCTD1(4);
        model.addObject("lstDsMon4_1", lst4_1);

        ChiTietDonModel chiTietDonModel5_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst5_1 = chiTietDonModel5_1.getDsCTD1(5);
        model.addObject("lstDsMon5_1", lst5_1);

        ChiTietDonModel chiTietDonModel6_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst6_1 = chiTietDonModel6_1.getDsCTD1(6);
        model.addObject("lstDsMon6_1", lst6_1);

        ChiTietDonModel chiTietDonModel7_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst7_1 = chiTietDonModel7_1.getDsCTD1(7);
        model.addObject("lstDsMon7_1", lst7_1);

        ChiTietDonModel chiTietDonModel8_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst8_1 = chiTietDonModel8_1.getDsCTD1(8);
        model.addObject("lstDsMon8_1", lst8_1);

        ChiTietDonModel chiTietDonModel9_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst9_1 = chiTietDonModel9_1.getDsCTD1(9);
        model.addObject("lstDsMon9_1", lst9_1);

        ChiTietDonModel chiTietDonModel10_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst10_1 = chiTietDonModel10_1.getDsCTD1(10);
        model.addObject("lstDsMon10_1", lst10_1);

        ChiTietDonModel chiTietDonModel11_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst11_1 = chiTietDonModel11_1.getDsCTD1(11);
        model.addObject("lstDsMon11_1", lst11_1);

        ChiTietDonModel chiTietDonModel12_1 = new ChiTietDonModel();
        ArrayList<ChiTietDon> lst12_1 = chiTietDonModel12_1.getDsCTD1(12);
        model.addObject("lstDsMon12_1", lst12_1);

        return model;
    }
    
    @RequestMapping(value = "/XuLyHoanThanhMon")
    public String xuLyHoanThanhMon(@ModelAttribute("/hoanthanhchittiet") ChiTietDon ctd) {
        
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
        if (chiTietDonModel.udObject(ctd)) {
            return "redirect:QLMDG.htm";
        } else {
            return "redirect:QLMDG.htm";
        }
    }
    
    @RequestMapping(value = "/XuLyHuyMonHoanThanh")
    public String XuLyHuyMonHoanThanh(@ModelAttribute("/hoanthanhchittiet") ChiTietDon ctd) {
        
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
        if (chiTietDonModel.udObjectReback(ctd)) {
            return "redirect:QLMDG.htm";
        } else {
            return "redirect:QLMDG.htm";
        }
    }
    
    @RequestMapping(value = "/KhaiVi")
    public ModelAndView showKhaiVi() {
        ModelAndView model = new ModelAndView("/thucdon");
        ArrayList<MonAn> ls = monAnModel.getAllObject("Khai vi");
        model.addObject("thucdon", ls);
        return model;
    }

    @RequestMapping(value = "/MonThit")
    public ModelAndView showMonThit() {
        ModelAndView model = new ModelAndView("/monthit");
        ArrayList<MonAn> ls = monAnModel.getAllObject("Mon thit");
        model.addObject("lstMonThit", ls);
        return model;
    }

    @RequestMapping(value = "/MonHaiSan")
    public ModelAndView showHaiSan() {
        ModelAndView model = new ModelAndView("/monhaisan");
        ArrayList<MonAn> ls = monAnModel.getAllObject("Mon hai san");
        model.addObject("lstMonHaiSan", ls);
        return model;
    }

    @RequestMapping(value = "/MonRau")
    public ModelAndView showMonRau() {
        ModelAndView model = new ModelAndView("/monrau");
        ArrayList<MonAn> ls = monAnModel.getAllObject("Mon rau");
        model.addObject("lstMonRau", ls);
        return model;
    }

    @RequestMapping(value = "/GoiMon")
    public ModelAndView htThucDon() {
        ModelAndView model = new ModelAndView("/goimon");
        ArrayList<MonAn> ls = monAnModel.getAll();
        model.addObject("lstTD", ls);
        return model;
    }
    
    @RequestMapping(value = "/QLTD")
    public ModelAndView showThucDon(HttpSession session) {
        String Suser = String.valueOf(session.getAttribute("Suser").toString());
        TaiKhoanModel tkmd= new TaiKhoanModel();
        ArrayList<TaiKhoan> tk= tkmd.getTKbyU(Suser);
        int quyen= tk.get(0).getQuyen();
        if(Suser.length()<1||quyen!=1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/qlthucdon");
        ArrayList<MonAn> ls = monAnModel.getAll();
        model.addObject("lstTD", ls);
        return model;
    }


    @RequestMapping(value = "/ThemMon")
    public ModelAndView showThemmon(HttpSession session) {
        String user = String.valueOf(session.getAttribute("Suser").toString());
        if(user.length()<1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/themmon");
        MonAn u = new MonAn();
        model.getModelMap().put("Themmon", u);
        return model;
    }

    @RequestMapping(value = "/XuLyThemMon")
    public String xuLyThemMon(@ModelAttribute("/themmon") MonAn m) {
        try {
            if (monAnModel.insertObject(m)) {
                return "redirect:QLTD.htm";
            } else {
                return "themmon";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnController.class.getName()).log(Level.SEVERE, null, ex);
            return "themmon";
        }
    }

    @RequestMapping(value = "/XuLyXoaMon")
    public String xuLyXoaMon(@ModelAttribute("/xoamon") MonAn m) {
        try {
            if (monAnModel.deleteObject(m)) {
                return "redirect:QLTD.htm";
            } else {
                return "redirect:QLTD.htm";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnController.class.getName()).log(Level.SEVERE, null, ex);
            return "redirect:QLTD.htm";
        }
    }

    @RequestMapping(value = "/CapNhap")
    public ModelAndView showCapNhapMon(@RequestParam("Mon_id") int id, HttpSession session) {
        String user = String.valueOf(session.getAttribute("Suser").toString());
        if(user.length()<1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/capnhap");
        MonAn u = new MonAn();
        u = monAnModel.getObject(id);
        model.addObject("capNhap",u);
        return model;
    }

    @RequestMapping(value = "/XuLyCapNhap")
    public String xuLyCapNhap(@ModelAttribute("/capnhap") MonAn m) {
        try {
            if (monAnModel.updateObject(m)) {
                return "redirect:QLTD.htm";
            } else {
                return "redirect:CapNhap.htm";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnController.class.getName()).log(Level.SEVERE, null, ex);
            return "redirect:CapNhap.htm";
        }
    }
    
}
