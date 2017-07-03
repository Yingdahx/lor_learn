package com.ecsolutions.controller;

import com.ecsolutions.entity.Credit_Save_Entity;
import com.ecsolutions.service.Credit_Service;
import com.ecsolutions.soaClient.TransferClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/creditList")
    public String getCreditList(Model model){

        return "Credit/creditList";
    }

    @GetMapping("/creditOne/new")
    public String getNewCreditInfo(Model model){
        model.addAttribute("credit_info", credit_service.getNewCreditInfo("188688000007"));
        return "Credit/credit";
    }

    @GetMapping("/creditOne/edit")
    public String getOldCreditInfo(@RequestParam(value="customer_code", defaultValue = "") String customer_code,
                                   @RequestParam(value = "lineNo") String lineNo, Model model){
        model.addAttribute("credit_info", credit_service.getOldCreditInfo(customer_code,lineNo));
        return "Credit/credit";
    }

    @PostMapping("/creditOne/save")
    public String saveCreditInfo(@ModelAttribute Credit_Save_Entity credit_save_entity, Model model) {
//        if (!credit_service.validateFinancing(credit_save_entity.getFinancing())){
//            model.addAttribute("MESSAGE", "融资：产品表中不存在"+ credit_save_entity.getFinancing());
//            return "Credit/credit";
//        }else if(!credit_service.validateLineGrade(credit_save_entity.getLineGrade())){
//            model.addAttribute("MESSAGE", "额度等级：额度等级表中不存在"+ credit_save_entity.getLineGrade());
//            return "Credit/credit";
//        }else if(!credit_service.validateCollateralMethod(credit_save_entity.getCollateralMethod())){
//            model.addAttribute("MESSAGE", "抵押担保方式：抵押担保方式表中不存在"+ credit_save_entity.getCollateralMethod());
//            return "Credit/credit";
//        }else if(!credit_service.validateDocumentMark(credit_save_entity.getDocumentMark())){
//            model.addAttribute("MESSAGE", "文档标示：文档标示表中不存在"+ credit_save_entity.getDocumentMark());
//            return "Credit/credit";
//        }else if(!credit_service.validateCountryRisk(credit_save_entity.getCountryRisk())){
//            model.addAttribute("MESSAGE", "国别风险：国别 风险表中不存在"+ credit_save_entity.getCountryRisk());
//            return "Credit/credit";
//        }else {
//            return "Credit/credit";
//        }
        model.addAttribute("credit_save_entity", credit_save_entity);
        TransferClient.transfer(model);
        return "Credit/credit";
    }
}
