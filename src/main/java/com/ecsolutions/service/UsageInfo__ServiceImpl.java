package com.ecsolutions.service;

import com.ecsolutions.dao.UsageInfo_Get_DAO;
import com.ecsolutions.entity.UsageInfo_Get_Entity;
import com.ecsolutions.entity.UsageInfo_Save_Entity;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/29.
 */
public class UsageInfo__ServiceImpl implements UsageInfo_Service {
    private UsageInfo_Get_DAO dao;
    private  UsageInfo_Get_Entity entity;


    @Autowired
    public UsageInfo__ServiceImpl(){}

    @Override
    public UsageInfo_Get_Entity getCombineInfo(String lineno){

        setusageinfo(lineno);
        setproducts();
        setrate();
        setcollFlag();
        setdocFlag();
        setManagerInfo();
        return entity;
    }

    @Override
    public String saveUsageInfo(UsageInfo_Save_Entity saveEntity){
        return "Developing";
    }


    private void setusageinfo(String lineno)
    {
        this.entity=dao.getusageinfo(lineno);
    }

    private void  setproducts(){
        List<String> prods;
        prods=dao.getproducts();
        this.entity.setProd_types(prods);

    }

    private void setrate(){
        Map<String,BigDecimal> rate;
        rate=dao.getrate();
        this.entity.setRate(rate);

    }

    private void setcollFlag(){
        List<String> colls;
        colls=dao.getcollFlag();
        this.entity.setCollflag(colls);

    }

    private void setdocFlag(){
        List<String> docs;
        docs=dao.getdocFlag();
        this.entity.setDocflag(docs);
    }

    private void setManagerInfo(){
        Map<String,String> mng;
        mng=dao.getManagerInfo();
        this.entity.setManagers(mng);
    }
}
