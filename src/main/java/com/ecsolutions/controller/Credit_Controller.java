package com.ecsolutions.controller;

import com.ecsolutions.entity.Credit_Entity;
import com.ecsolutions.entity.Credit_Save_Entity;
import com.ecsolutions.service.Credit_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2017/6/28.
 */

@Controller
public class Credit_Controller {
    @Autowired
    private Credit_Service credit_service;

    public Credit_Service getCredit_service() {
        return credit_service;
    }

    @GetMapping("/credit")
    public String getCreditInfo(Model model){
        model.addAttribute("credit_info", credit_service.getCreditInfo());
        return "credit";
    }

    @PostMapping("/credit/save")
    public String saveCreditInfo(@ModelAttribute Credit_Save_Entity credit_save_entity, Model model) {
        if (!credit_service.validateFinancing(credit_save_entity.getFinancing())){
            model.addAttribute("MESSAGE", "融资：产品表中不存在"+ credit_save_entity.getFinancing());
            return "credit";
        }else if(!credit_service.validateLineGrade(credit_save_entity.getLineGrade())){
            model.addAttribute("MESSAGE", "额度等级：额度等级表中不存在"+ credit_save_entity.getLineGrade());
            return "credit";
        }else if(!credit_service.validateCollateralMethod(credit_save_entity.getCollateralMethod())){
            model.addAttribute("MESSAGE", "抵押担保方式：抵押担保方式表中不存在"+ credit_save_entity.getCollateralMethod());
            return "credit";
        }else if(!credit_service.validateDocumentMark(credit_save_entity.getDocumentMark())){
            model.addAttribute("MESSAGE", "文档标示：文档标示表中不存在"+ credit_save_entity.getDocumentMark());
            return "credit";
        }else if(!credit_service.validateCountryRisk(credit_save_entity.getCountryRisk())){
            model.addAttribute("MESSAGE", "国别风险：国别风险表中不存在"+ credit_save_entity.getCountryRisk());
            return "credit";
        }else {
            return "credit";
        }
    }
}
