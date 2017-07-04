package com.ecsolutions.dao;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Repository
public interface Customer_DAO {
    // select idType
    @Select("SELECT distinct pidTypeId,name FROM adsuser.PIDTypeText WHERE localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getIdType();

    // select 婚姻状况
    @Select("SELECT distinct maritalStatusId,name FROM adsuser.maritalStatusText  WHERE localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getMaritalStatus();

    //select 居住状况
    @Select("select distinct typeid,name from dbo.LivingConditionsText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getJuzhuStatus();

    //select 职业
    @Select("select distinct typeid,name from dbo.VocationalText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getZhiye();

    //select 职务
    @Select("select distinct typeid,name from dbo.DutyText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getZhiWu();

    //select 职称
    @Select("select distinct typeid,name from dbo.DutyTitleText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getZhiChen();

    //select 年收入币种
    @Select("select distinct ccyid,ccytext from dbo.ccyText where localeid=4")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCcy();

    //select 最高学历
    @Select("select distinct educationLevelId,name from adsuser.educationLevelText where localeid=1 order by educationLevelId desc")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getXueli();

    //select 最高学位
    @Select("select distinct TypeId,name from dbo.highestDegreeText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getXueWei();

    //select 国家
    @Select("select distinct code,name from adsuser.countryText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getGuoJia();

    //select 省市
    @Select("select distinct cityid,name from adsuser.cityText where localeid=1")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getShengShi();

//    @Select("SELECT DISTINCT  FROM  )")
//    @ResultType(String.class)
//    List<String> getFinancingList();


}
