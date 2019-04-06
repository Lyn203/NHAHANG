/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.ChiTietDon;
import entity.MonAn;
import java.util.ArrayList;
import model.ChiTietDonModel;
import model.MonAnModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author meo
 */
@Controller
public class DatMonController {
    @RequestMapping(value = "/khachGoiMon",method = RequestMethod.GET)
    public ModelAndView khachGoiMon(){

        ModelAndView model = new ModelAndView("/khachgoimon");

            MonAnModel monAnModel = new MonAnModel();
            ArrayList<MonAn> lstMonAn = monAnModel.getAll();
            model.addObject("lstMonAn", lstMonAn);
            
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
        ModelAndView model = new ModelAndView("/goimon"); // Them trang goi mon

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
}
    
