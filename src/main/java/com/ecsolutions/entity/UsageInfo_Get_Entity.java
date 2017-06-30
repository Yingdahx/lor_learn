package com.ecsolutions.entity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/29.
 */
public class UsageInfo_Get_Entity {
    private String Loan_RefNo;
    private String Line_No;
    private String Line_desc="test";
    private String Line_CCY="RMB";
    private String Line_AMT="10000.00";
    private String AvaLine_AMT="10000.00";
    private List<String> prod_types;
    private Map<String,BigDecimal> rate;
    private List<String> collflag;
    private List<String> docflag;
    private Map<String,String> managers;

    public List<String> getProd_types() {
        return prod_types;
    }

    public void setProd_types(List<String> prod_types) {
        this.prod_types = prod_types;
    }

    public Map<String, BigDecimal> getRate() {
        return rate;
    }

    public void setRate(Map<String, BigDecimal> rate) {
        this.rate = rate;
    }

    public List<String> getCollflag() {
        return collflag;
    }

    public void setCollflag(List<String> collflag) {
        this.collflag = collflag;
    }

    public List<String> getDocflag() {
        return docflag;
    }

    public void setDocflag(List<String> docflag) {
        this.docflag = docflag;
    }

    public Map<String, String> getManagers() {
        return managers;
    }

    public void setManagers(Map<String, String> managers) {
        this.managers = managers;
    }



}
