package com.ecsolutions.controller;

import com.ecsolutions.entity.PledgeEnt;
import com.ecsolutions.service.Pledge_Service;
import com.ecsolutions.soaClient.TransferClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String addOne(@ModelAttribute PledgeEnt pleage_entity, Model model)
    {
        System.out.println("post call");
        model.addAttribute("pleage_entity", pleage_entity);
        TransferClient.transfer(model);
        return "Pledge/PledgeOne";
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(method = RequestMethod.GET, value = "/Pledge/getList")
    public String getPledgeList()
    {
        return "Pledge/PledgeList";
    }

}
