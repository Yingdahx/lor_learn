package com.ecsolutions.dao;

import com.ecsolutions.entity.UsageInfo_Get_Entity;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/29.
 */
public interface UsageInfo_Get_DAO {
    @Select("")
    @ResultType(UsageInfo_Get_Entity.class)
    UsageInfo_Get_Entity getusageinfo(String lineno);

    @Select("")
    @ResultType(String.class)
    List<String> getproducts();

    @Select("")
    @ResultType(Map.class)
    Map<String,BigDecimal> getrate();

    @Select("")
    @ResultType(String.class)
    List<String> getcollFlag();

    @Select("")
    @ResultType(String.class)
    List<String> getdocFlag();

    @Select("")
    @ResultType(Map.class)
    Map<String,String> getManagerInfo();
}
