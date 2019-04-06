/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.ChiTietDon;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import model.ChiTietDonModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author thisi
 */
@Controller
@RequestMapping(value = "/ChiTietDon")
public class ChiTietDonController {

    private ChiTietDonModel chiTietDonModel;

    public ChiTietDonController() {
        this.chiTietDonModel = new ChiTietDonModel();
    }
}
