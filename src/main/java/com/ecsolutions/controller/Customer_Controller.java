package com.ecsolutions.controller;

import com.ecsolutions.entity.Customer_entity;
import com.ecsolutions.service.Customer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class Customer_Controller {

    @Autowired
    private Customer_Service customer_service;

    public Customer_Service getCustomer_service() {
        return customer_service;
    }

//    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/customerInfo")
    public String getApplyPage(Model model) {
        model.addAttribute("customer_entity", new Customer_entity());
        model.addAttribute("customer_info", customer_service.getPopupInfo());
        return "customer";
    }

    @PostMapping("/customerInfo")
    public String saveApplyInfo(@ModelAttribute Customer_entity customer_entity, Model model) {
        model.addAttribute("customer_entity", customer_entity);
        return "customer";
    }
}
