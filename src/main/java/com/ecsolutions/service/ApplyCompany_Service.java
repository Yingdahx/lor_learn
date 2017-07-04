package com.ecsolutions.service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/4.
 */
public interface ApplyCompany_Service {
    List<String> getBanks();

    List<String> getCustManagerNames();

    List<String> getAreaNames();

    List<String> getFlagTexts();

    List<String> getCountryTexts();

    List<String> getCityTexts();

    List<String> getBizRegTypeCorFlagTexts();

    List<String> getBizTypeText();

    List<String> getIndustryClasses();

    List<String> getIndustryCategories();

    List<String> getSecIndustryCategories();

    List<String> getSecExchTexts();
}
