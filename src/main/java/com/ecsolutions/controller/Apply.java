package com.ecsolutions.controller;

import com.ecsolutions.entity.Apply_entity;
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

    @GetMapping("/apply")
    public String getApplyPage(Model model) {
        model.addAttribute("apply_entity", new Apply_entity());
        return "forms";
    }

    @PostMapping("/app")
    public String saveApplyInfo(@ModelAttribute Apply_entity apply_entity, Model model) {
        model.addAttribute("apply_entity", apply_entity);
        System.out.println(apply_entity.getCustomerManager());
        System.out.println(apply_entity.getRegisterType());
        return "forms";
    }
}
