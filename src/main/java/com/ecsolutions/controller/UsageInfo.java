package com.ecsolutions.controller;

import com.ecsolutions.entity.UsageInfo_Get_Entity;
import com.ecsolutions.entity.UsageInfo_Save_Entity;
import com.ecsolutions.service.UsageInfo_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2017/6/30.
 */

@Controller
public class UsageInfo {

    private UsageInfo_Get_Entity getInfo;

    @Autowired
    private UsageInfo_Service getservice;


    @GetMapping("/UsageInfo")
    public String getUsageInfo(@ModelAttribute String lineno, Model model){
        model.addAttribute("UsageInfo",getservice.getCombineInfo(lineno));

        return "Usage";

    }

    @PostMapping("/UsageInfo/Save")
    public String saveUsageInfo(@ModelAttribute UsageInfo_Save_Entity saveEntity,Model model){

        return ("waiting~");
    }

}
