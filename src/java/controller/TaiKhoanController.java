/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.MonAn;
import entity.TaiKhoan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import model.TaiKhoanModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author NSH
 */
@Controller
@RequestMapping(value = "/TaiKhoan", method = RequestMethod.GET)
public class TaiKhoanController {

    TaiKhoanModel tkmd = new TaiKhoanModel();

    @RequestMapping(value = "/XulyDangNhap")
    public String xlLogin(HttpSession session, @ModelAttribute("/login") TaiKhoan tk) {
        ModelAndView model = new ModelAndView("/login");
        model.getModelMap().put("login", tk);
        ArrayList<TaiKhoan> cttk = tkmd.getTK(tk);
        if (!cttk.isEmpty()) {
            session.putValue("Suser", tk.getUser());
            return "redirect:taikhoan.htm";
        } else {
            return "redirect:login.htm";
        }
    }

    @RequestMapping(value = "/login")
    public ModelAndView showLogin() {
        ModelAndView model = new ModelAndView("/login");
        TaiKhoan tk = new TaiKhoan();
        model.getModelMap().put("login", tk);
        return model;
    }
    @RequestMapping(value = "/logout")
    public ModelAndView showLogout(HttpSession session) {
        ModelAndView model = new ModelAndView("/login");
        session.setAttribute("Suser","");
        
        TaiKhoan tk = new TaiKhoan();
        model.getModelMap().put("login", tk);
        return model;
    }

    @RequestMapping(value = "/taikhoan")
    public ModelAndView htpq(HttpSession session) {
        ModelAndView model = new ModelAndView("/taikhoan");
        String user = String.valueOf(session.getAttribute("Suser").toString());
        TaiKhoan tk = new TaiKhoan();
        ArrayList<TaiKhoan> ArrTk = tkmd.getTKbyU(user);
        tk=ArrTk.get(0);
        model.addObject("capNhap",tk);        
        return model;
    }

   
    
    @RequestMapping(value = "/XuLyTaiKhoan")
    public String xuLyThemMon(@ModelAttribute("/taikhoan") TaiKhoan tk) {
        try {
            if (tkmd.updateObject(tk)) {
                return "redirect:taikhoan.htm";
            } else {
                return "redirect:error.htm";
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error";
    }
    
    @RequestMapping(value = "/QLTK")
    public ModelAndView QLTK(HttpSession session) {
        String Suser = String.valueOf(session.getAttribute("Suser").toString());
        ArrayList<TaiKhoan> tk= tkmd.getTKbyU(Suser);
        int quyen= tk.get(0).getQuyen();
        if(Suser.length()<1||quyen!=1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/QLTK");
        ArrayList<TaiKhoan> ls = tkmd.getAll();
        model.addObject("lstTK", ls);
        return model;
    }
    
    @RequestMapping(value = "/ThemTK")
    public ModelAndView showThemTK(HttpSession session) {
        String user = String.valueOf(session.getAttribute("Suser").toString());
        if(user.length()<1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/themTK");
        TaiKhoan tk = new TaiKhoan();
        model.getModelMap().put("ThemTK", tk);
        return model;
    }
    @RequestMapping(value = "/XuLyThemTK")
    public String xuLyThemTK(@ModelAttribute("/themTK") TaiKhoan tk) {
        try {
            if (tkmd.insertObject(tk)) {
                return "redirect:QLTK.htm";
            } else {
                return "redirect:CapNhapTK.htm";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnController.class.getName()).log(Level.SEVERE, null, ex);
            return "redirect:CapNhapTK.htm";
        }
    }
    
    @RequestMapping(value = "/CapNhapTK")
    public ModelAndView showCapNhapTK(@RequestParam("user") String user,HttpSession session) {
        String Suser = String.valueOf(session.getAttribute("Suser").toString());
        if(Suser.length()<1){
            ModelAndView model = new ModelAndView("/login");
            return model;
        }
        ModelAndView model = new ModelAndView("/capnhapTK");
        TaiKhoan tk = new TaiKhoan();
        ArrayList<TaiKhoan> arr = tkmd.getTKbyU(user);
        tk=arr.get(0);
        model.addObject("capNhap",tk);
        return model;
    }

    @RequestMapping(value = "/XuLyCapNhapTK")
    public String xuLyCapNhap(@ModelAttribute("/capnhapTK") TaiKhoan tk) {
        try {
            if (tkmd.updateObject(tk)) {
                return "redirect:QLTK.htm";
            } else {
                return "redirect:CapNhapTK.htm";
            }
        } catch (SQLException ex) {
            Logger.getLogger(MonAnController.class.getName()).log(Level.SEVERE, null, ex);
            return "redirect:CapNhapTK.htm";
        }
    }
    
    @RequestMapping(value = "/XuLyXoaTK")
    public String xuLyXoaMon(@ModelAttribute("/xoaTK") TaiKhoan tk) {
        if (tkmd.DeleteObject(tk)) {
            return "redirect:QLTK.htm";
        } else {
            return "redirect:QLTK.htm";
        }
    }
}
