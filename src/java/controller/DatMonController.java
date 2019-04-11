/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.ChiTietDon;
import entity.DonGoi;
import entity.MonAn;
import entity.ThongTinBan;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ChiTietDonModel;
import model.DonGoiModel;
import model.MonAnModel;
import model.ThongTinBanModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author meo
 */
@Controller
public class DatMonController {
    Logger logger = Logger.getLogger("DatMonController");
    private MonAnModel monAnModel;
    
    public DatMonController(){
        monAnModel = new MonAnModel();
    }
    // Toi dang o day
    @RequestMapping(value = "/khachGoiMon",method = RequestMethod.GET)
    public ModelAndView khachGoiMon(@ModelAttribute("thongtinban") ThongTinBan thongtinban){
        ModelAndView model = new ModelAndView("/khachgoimon");
//        model.addObject("banid");
//        model.addObject("email");
//        model.addObject("tenkh");
//        model.addObject("sodienthoai");
            MonAnModel monAnModel = new MonAnModel();
            ArrayList<MonAn> lstMonAn = monAnModel.getAll();
            model.addObject("listMonAn", lstMonAn);
            //insert don goi
        
            DonGoiModel dongoiModel = new DonGoiModel();
            DonGoi dongoi = new DonGoi();
            dongoi.setBan_id(thongtinban.getBan_id());
//            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//            Date date = new Date();
//            dongoi.setBan_gioGoi(dateFormat.format(date));
//            dongoi.setBan_ngayGoi(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
            dongoiModel.insertObject(dongoi);
            
//            model.addObject("IdDon",thongtinban.getBan_id()); // sai 
            model.addObject("IdDon",dongoiModel.getMaxDon_id());
            logger.info(thongtinban.getBan_id()+"");
            logger.info(thongtinban.getTT_id()+"");
            logger.info(thongtinban.getTT_email()+"");
//            ArrayList<MonAn> lstMonAns = new ArrayList<>();
//            MonAnModel monAnModel2 = new MonAnModel();
//            
//            for (ChiTietDon i : lstChitiet) {
//                ChiTietDon ctd2 = chiTietDonModel.getObject(i.getChiTiet_id());
//                MonAn monAn = monAnModel2.getObjectTen(ctd2.getMon_ten());
//                lstMonAns.add(monAn);
//            }
//            model.addObject("lstMonAn", lstMonAns);
            return model;
    }
    
    @RequestMapping(value = "/XuLyThemMon", method = RequestMethod.GET)
    public ModelAndView xuLyThemMon(@ModelAttribute("chitietdon") ChiTietDon ctd){
        ModelAndView model = new ModelAndView("khachgoimon"); // Them trang goi mon
        //model.addObject("IdDon", );
        ChiTietDonModel chiTietDonModel = new ChiTietDonModel();
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
    
    static ThongTinBan thongtinban;
    
    @RequestMapping(value = "/DatBan")
    public String datBan(@ModelAttribute("thongtinban") ThongTinBan thongtinban, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("thongtinban", thongtinban);
        DatMonController.thongtinban = thongtinban;
        return "redirect:khachGoiMon.htm";
    }
    
    @RequestMapping(value = "/ThemMonAn")
    public String xuLyThemMonAn(@ModelAttribute("/themmon") MonAn m) {
        try {
            if (monAnModel.insertObject(m)) {
                return "redirect:QuanLyThucDon.htm";
            } else {
                return "themmon";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnController.class.getName()).log(Level.SEVERE, null, ex);
            return "themmon";
        }
    }
    @RequestMapping(value = "/XacNhanDatMon")
    public String xacNhanDatMon(){
        //if(DatMonController.thongtinban == null) //say error
        // insert thong tin ban
        DatMonController.thongtinban.getBan_id();
        Date now = new Date();
        thongtinban.setTT_ngayDat(now.getYear()+"-"+now.getMonth()+"-"+now.getDay());
        thongtinban.setTT_trangThai(1); // trang thai = 1 da dat ban
        thongtinban.setTT_gioDat(now.getHours()+":"+now.getMinutes()+":"+now.getSeconds());
        //insert thong tin ban
        ThongTinBanModel thonTinBanModel = new ThongTinBanModel();
        try {
            thonTinBanModel.insertObject(thongtinban);
        } catch (SQLException ex) {
            Logger.getLogger(DatMonController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "redirect:/Don/DsBan.htm";
    }
    // Model Attributes
    @ModelAttribute("chitietdon")
    public ChiTietDon getChiTietDon(){
        return new ChiTietDon();
    }
    
    @ModelAttribute("thongtinban")
    public ThongTinBan getThongTinBan(){
        return new ThongTinBan();
    }
    
}
    
