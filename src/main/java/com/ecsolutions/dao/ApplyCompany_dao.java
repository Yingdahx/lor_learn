package com.ecsolutions.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/7/4.
 */
@Repository
public interface ApplyCompany_dao {
    @Select("select name from adsuser.BankText")
    List<String> getBanks();

    @Select("select name from adsuser.accountOfficerText")
    List<String> getCustManagerNames();

    @Select("select AreaName from adsuser.AreaIdText")
    List<String> getAreaNames();

    @Select("select flagText from adsuser.ccyFlageText")
    List<String> getFlagTexts();

    @Select("select name from adsuser.CountryText")
    List<String> getCountryTexts();

    @Select("select name from adsuser.CityText")
    List<String> getCityTexts();

    @Select("select distinct MenLei from dbo.HangYe order by MenLei")
    List<String> getIndustryClasses();

    @Select("select flagText from dbo.bizRegTypeCorFlagText")
    List<String> getBizRegTypeCorFlagTexts();

    @Select("select name from dbo.BizTypeText")
    List<String> getBizTypeTexts();

    @Select("select distinct DaLei from dbo.HangYe order by DaLei")
    List<String> getIndustryCategories();

    @Select("select distinct DaLei from dbo.HangYe order by DaLei")
    List<String> getSecIndustryCategories();

    @Select("select name from dbo.secExchText")
    List<String> getSecExchTexts();
}
