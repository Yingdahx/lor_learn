package com.ecsolutions.entity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Credit_Entity {
//    private List<String> financingList;
    private String lineNumber;
    private List<HashMap<String,String>> lineGradeList;
    private String lineStatus;
    private List<HashMap<String,String>> currencyList;
    private BigDecimal usedLineAmount;
    private BigDecimal remainingLineAmount;
    private BigDecimal freezingLineAmount;
    private BigDecimal availableLineAmount;
//    private List<String> collateralMethodList;
    private List<HashMap<String,String>> documentMarkList;
    private List<HashMap<String,String>> countryRiskList;

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public List<HashMap<String, String>> getLineGradeList() {
        return lineGradeList;
    }

    public void setLineGradeList(List<HashMap<String, String>> lineGradeList) {
        this.lineGradeList = lineGradeList;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }

    public List<HashMap<String, String>> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<HashMap<String, String>> currencyList) {
        this.currencyList = currencyList;
    }

    public BigDecimal getUsedLineAmount() {
        return usedLineAmount;
    }

    public void setUsedLineAmount(BigDecimal usedLineAmount) {
        this.usedLineAmount = usedLineAmount;
    }

    public BigDecimal getRemainingLineAmount() {
        return remainingLineAmount;
    }

    public void setRemainingLineAmount(BigDecimal remainingLineAmount) {
        this.remainingLineAmount = remainingLineAmount;
    }

    public BigDecimal getFreezingLineAmount() {
        return freezingLineAmount;
    }

    public void setFreezingLineAmount(BigDecimal freezingLineAmount) {
        this.freezingLineAmount = freezingLineAmount;
    }

    public BigDecimal getAvailableLineAmount() {
        return availableLineAmount;
    }

    public void setAvailableLineAmount(BigDecimal availableLineAmount) {
        this.availableLineAmount = availableLineAmount;
    }

    public List<HashMap<String, String>> getDocumentMarkList() {
        return documentMarkList;
    }

    public void setDocumentMarkList(List<HashMap<String, String>> documentMarkList) {
        this.documentMarkList = documentMarkList;
    }

    public List<HashMap<String, String>> getCountryRiskList() {
        return countryRiskList;
    }

    public void setCountryRiskList(List<HashMap<String, String>> countryRiskList) {
        this.countryRiskList = countryRiskList;
    }
}
