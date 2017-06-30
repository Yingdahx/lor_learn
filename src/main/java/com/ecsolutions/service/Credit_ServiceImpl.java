package com.ecsolutions.service;

import com.ecsolutions.dao.Credit_DAO;
import com.ecsolutions.entity.Credit_Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Service("Credit_Service")
public class Credit_ServiceImpl implements  Credit_Service {
    private Credit_DAO credit_dao;

    @Autowired
    public Credit_ServiceImpl(Credit_DAO credit_dao) {
        this.credit_dao = credit_dao;
    }

    @Override
    public Credit_Entity getCreditInfo(){
        Credit_Entity result = new Credit_Entity();
        List<String> financings = new ArrayList<>();
        financings.add("产品1");
        financings.add("产品2");
        financings.add("产品3");
        result.setFinancingList(financings);

        result.setLineNumber("LN2333");
        result.setLineStatus("等候");
        result.setUsedLineAmount(new BigDecimal(0.00));
        result.setRemainingLineAmount(new BigDecimal(0.00));
        result.setFreezingLineAmount(new BigDecimal(0.00));
        result.setAvailableLineAmount(new BigDecimal(0.00));
        return result;
    }

    public boolean validateFinancing(String financing){
        try{
            List<String> data = credit_dao.findFinancing(financing);
            if(data.size()>0)
            {
                return true;
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validateLineGrade(String lineGrade){
        try{
            List<String> data = credit_dao.findLineGrade(lineGrade);
            if(data.size()>0)
            {
                return true;
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validateCollateralMethod(String collateralMethod){
        try{
            List<String> data = credit_dao.findCollateralMethod(collateralMethod);
            if(data.size()>0)
            {
                return true;
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validateDocumentMark(String documentMark){
        try{
            List<String> data = credit_dao.findDocumentMark(documentMark);
            if(data.size()>0)
            {
                return true;
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }

    public boolean validateCountryRisk(String countryRisk){
        try{
            List<String> data = credit_dao.findCountryRisk(countryRisk);
            if(data.size()>0)
            {
                return true;
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
