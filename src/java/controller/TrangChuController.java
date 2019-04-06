/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
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
        ModelAndView model = new ModelAndView("/datban");
        return model;
    }
}
