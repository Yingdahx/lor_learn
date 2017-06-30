package com.ecsolutions.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
public class Credit_Entity {
    private List<String> financingList;
    private String lineNumber;
    private List<String> lineGradeList;
    private String lineStatus;
    private List<String> currencyList;
    private BigDecimal usedLineAmount;
    private BigDecimal remainingLineAmount;
    private BigDecimal freezingLineAmount;
    private BigDecimal availableLineAmount;
    private List<String> collateralMethodList;
    private List<String> documentMarkList;
    private List<String> countryRiskList;

    public List<String> getFinancingList() {
        return financingList;
    }

    public void setFinancingList(List<String> financingList) {
        this.financingList = financingList;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public List<String> getLineGradeList() {
        return lineGradeList;
    }

    public void setLineGradeList(List<String> lineGradeList) {
        this.lineGradeList = lineGradeList;
    }

    public String getLineStatus() {
        return lineStatus;
    }

    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }

    public List<String> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<String> currencyList) {
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

    public List<String> getCollateralMethodList() {
        return collateralMethodList;
    }

    public void setCollateralMethodList(List<String> collateralMethodList) {
        this.collateralMethodList = collateralMethodList;
    }

    public List<String> getDocumentMarkList() {
        return documentMarkList;
    }

    public void setDocumentMarkList(List<String> documentMarkList) {
        this.documentMarkList = documentMarkList;
    }

    public List<String> getCountryRiskList() {
        return countryRiskList;
    }

    public void setCountryRiskList(List<String> countryRiskList) {
        this.countryRiskList = countryRiskList;
    }
}
