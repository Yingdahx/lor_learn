package com.ecsolutions.controller;

import com.ecsolutions.common.ObjectHelp;
import com.ecsolutions.entity.Apply_entity;
import com.ecsolutions.service.ApplyCompany_Service;
import com.ecsolutions.soaClient.TransferClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
public class ApplyCompany {

    @Autowired
    private ApplyCompany_Service applyCompany_service;


    @GetMapping("/apply")
    public String getApplyPage(Model model) {
        List<String> banks = this.applyCompany_service.getBanks();
        model.addAttribute("banks", banks);

        List<String> custManagerNames = this.applyCompany_service.getCustManagerNames();
        model.addAttribute("custManagerNames", custManagerNames);

        List<String> areaNames = this.applyCompany_service.getAreaNames();
        model.addAttribute("areaNames", areaNames);

        List<String> flagTexts = this.applyCompany_service.getFlagTexts();
        model.addAttribute("flagTexts", flagTexts);

        List<String> countryTexts = this.applyCompany_service.getCountryTexts();
        model.addAttribute("countryTexts", countryTexts);

        List<String> cityTexts = this.applyCompany_service.getCityTexts();
        model.addAttribute("cityTexts", cityTexts);

        List<String> bizRegTypeCorFlagTexts = this.applyCompany_service.getBizRegTypeCorFlagTexts();
        model.addAttribute("bizRegTypeCorFlagTexts", bizRegTypeCorFlagTexts);

        List<String> bizTypeTexts = this.applyCompany_service.getBizTypeText ();
        model.addAttribute("bizTypeTexts", bizTypeTexts);

        List<String> industryClasses = this.applyCompany_service.getIndustryClasses();
        model.addAttribute("industryClasses", industryClasses);

        List<String> industryCategories = this.applyCompany_service.getIndustryCategories();
        model.addAttribute("industryCategories", industryCategories);

        List<String> industrySecCategories = this.applyCompany_service.getSecIndustryCategories();
        model.addAttribute("industrySecCategories", industrySecCategories);

        List<String> secExchTexts = this.applyCompany_service.getSecExchTexts();
        model.addAttribute("secExchTexts", secExchTexts);

        model.addAttribute("apply_entity", new Apply_entity());
        return "applyCompany";
    }

    @PostMapping("/apply")
    public String saveApplyInfo(@ModelAttribute Apply_entity apply_entity, BindingResult result, Model model) {
        model.addAttribute("apply_entity", apply_entity);
        //TransferClient.transfer(model);
        if(!result.hasErrors()) {
            System.out.println("call TransferClient.transfer");

            String mess= ObjectHelp.InitTransferData("ApplyCompanyTx",apply_entity);
            TransferClient client=new TransferClient();
            client.transfer(mess);
        }
        return "applyCompany";
    }
}
