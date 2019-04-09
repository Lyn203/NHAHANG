/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.istack.internal.logging.Logger;
import entity.TaiKhoan;
import entity.ThongTinBan;
import java.util.List;
import model.BanGoiModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author thisi
 */
@Controller
@RequestMapping(value = "/TrangChu", method = RequestMethod.GET)
public class TrangChuController {
    Logger logger = Logger.getLogger("Trang Chu", TrangChuController.class);
    @RequestMapping(value = "/tc")
    public ModelAndView showTrangChu() {
        ModelAndView model = new ModelAndView("/trangchu");
        return model;
    }
    
    @RequestMapping(value = "/gt")
    public ModelAndView showGioiThieu() {
        ModelAndView model = new ModelAndView("/gioithieu");
        return model;
    }
    
    @RequestMapping(value = "/db")
    public ModelAndView showDatBan() {
//        BanGoiModel banGoiModel = new BanGoiModel();
        ModelAndView model = new ModelAndView("/datban");
//        List<Integer> listBanChuaDat = banGoiModel.getBanChuaDat();
//        model.addObject("listBanChuaDat", listBanChuaDat);
//        logger.info(listBanChuaDat.toString());
        return model;
    }
    
    @ModelAttribute("thongtinban")
    public ThongTinBan getThongTinBan(){
        return new ThongTinBan();
    }
}
