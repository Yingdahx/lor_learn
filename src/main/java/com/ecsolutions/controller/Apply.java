package com.ecsolutions.controller;

import com.ecsolutions.entity.Apply_entity;
import com.ecsolutions.soaClient.TransferClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class Apply {

    public Apply() {
}

//    @GetMapping("/test")
//    public String getTestPage() {
//        return "test";
//    }

    @GetMapping("/apply")
    public String getApplyPage(Model model) {
        model.addAttribute("apply_entity", new Apply_entity());
        return "applyCompany";
    }

    @PostMapping("/apply")
    public String saveApplyInfo(@ModelAttribute Apply_entity apply_entity, Model model) {
        model.addAttribute("apply_entity", apply_entity);
        TransferClient.transfer(model);
        return "applyCompany";
    }
}
