package com.ecsolutions.service;

import com.ecsolutions.dao.ApplyCompany_dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/4.
 */
@Service
public class ApplyCompany_ServiceImpl implements ApplyCompany_Service{
    private ApplyCompany_dao applyCompany_dao;

    @Autowired
    public ApplyCompany_ServiceImpl(ApplyCompany_dao applyCompany_dao) {
        this.applyCompany_dao = applyCompany_dao;
    }

    @Override
    public List<String> getBanks() {
        return this.applyCompany_dao.getBanks();
    }

    @Override
    public List<String> getCustManagerNames() {
        return this.applyCompany_dao.getCustManagerNames();
    }

    @Override
    public List<String> getAreaNames() {
        return this.applyCompany_dao.getAreaNames();
    }

    @Override
    public List<String> getFlagTexts() {
        return this.applyCompany_dao.getFlagTexts();
    }

    @Override
    public List<String> getCountryTexts() {
        return this.applyCompany_dao.getCountryTexts();
    }

    @Override
    public List<String> getCityTexts() {
        return this.applyCompany_dao.getCityTexts();
    }

    @Override
    public List<String> getBizRegTypeCorFlagTexts() {
        return this.applyCompany_dao.getBizRegTypeCorFlagTexts();
    }

    @Override
    public List<String> getBizTypeText() {
        return this.applyCompany_dao.getBizTypeTexts();
    }

    @Override
    public List<String> getIndustryClasses() {
        return this.applyCompany_dao.getIndustryClasses();
    }

    @Override
    public List<String> getIndustryCategories() {
        return this.applyCompany_dao.getIndustryCategories();
    }

    @Override
    public List<String> getSecIndustryCategories() {
        return this.applyCompany_dao.getSecIndustryCategories();
    }

    @Override
    public List<String> getSecExchTexts() {
        return this.applyCompany_dao.getSecExchTexts();
    }
}
