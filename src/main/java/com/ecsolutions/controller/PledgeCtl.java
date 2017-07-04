package com.ecsolutions.controller;

import com.ecsolutions.Validators.PledgeValidate;
import com.ecsolutions.entity.PledgeEnt;
import com.ecsolutions.service.Pledge_Service;
import com.ecsolutions.soaClient.TransferClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by tim on 2017/6/27.
 */

@Controller
//@RequestMapping("/Pledge")
public class PledgeCtl {

    @Autowired
    private Pledge_Service pledge_service;


    public Pledge_Service getPledge_Service() {
        return pledge_service;
    }

    @Autowired
    @Qualifier("pledgeValidate")
    private Validator validator;

    @InitBinder
    public void initBinder(DataBinder binder){
        binder.setValidator(validator);
    }

  public PledgeCtl()
  {

  }

    @GetMapping("/Pledge/getOne")
    public String getPledge( Model model)
    {
        System.out.println("get call ");
        PledgeEnt ent=new PledgeEnt();
        ent.setcustcod("1");
        ent.setline_no("1");
        java.util.Random r=new java.util.Random();
        ent.setID(String.valueOf(r.nextInt()));
        model.addAttribute("pleage_entity", ent);

        return "Pledge/PledgeOne";
    }

    @PostMapping("/Pledge/getOne")
    public String addOne(@Valid @ModelAttribute("pleage_entity") PledgeEnt pleage_entity, BindingResult result, Model model)
    {
        System.out.println("post call");
        model.addAttribute("pleage_entity", pleage_entity);
        if(!result.hasErrors()) {
            //TransferClient.transfer(model);
            System.out.println("call TransferClient.transfer");
        }
        return "Pledge/PledgeOne";
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(method = RequestMethod.GET, value = "/Pledge/getList")
    public String getPledgeList()
    {
        return "Pledge/PledgeList";
    }

}
