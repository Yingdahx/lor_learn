package com.ecsolutions.controller;

import com.ecsolutions.entity.UsageInfo_Get_Entity;
import com.ecsolutions.entity.UsageInfo_Save_Entity;
import com.ecsolutions.service.UsageInfo_Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Administrator on 2017/6/30.
 */
public class UsageInfo {

    private UsageInfo_Get_Entity getInfo;
    private UsageInfo_Service getservice;


    @GetMapping("/UsageInfo")
    public UsageInfo_Get_Entity getUsageInfo(@ModelAttribute String lineno, Model model){
        model.addAttribute("UsageInfo",getservice.getCombineInfo(lineno));

        return getInfo;

    }

    @PostMapping("/UsageInfo/Save")
    public String saveUsageInfo(@ModelAttribute UsageInfo_Save_Entity saveEntity,Model model){

        return ("waiting~");
    }

}
