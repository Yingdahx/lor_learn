package com.ecsolutions.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Repository
public interface Credit_DAO {
    // for new credit
    @Select("SELECT DISTINCT line_no FROM adsuser.Loanapplicantfacilityinfo WHERE LTRIM(RTRIM(custCode)) = LTRIM(RTRIM(#{customer_code})) ORDER BY line_no")
    @ResultType(String.class)
    List<String> getLineNumberList(@Param("customer_code")String customerCode);

//    @Select("SELECT DISTINCT  FROM  )")
//    @ResultType(String.class)
//    List<String> getFinancingList();

    @Select("SELECT DISTINCT flagtext, linerrflag FROM dbo.LineRRFlagText WHERE LTRIM(RTRIM(localeid)) = 1 ORDER BY linerrflag")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getLineGradeList();

    @Select("SELECT DISTINCT ccytext, ccyid FROM dbo.ccyText WHERE LTRIM(RTRIM(localeid)) = 1 ORDER BY ccyid")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCurrencyList();

//    @Select("SELECT DISTINCT  FROM  )")
//    @ResultType(String.class)
//    List<String> getCollateralMethodList();

    @Select("SELECT DISTINCT flagtext, condindflag FROM dbo.CondIndFlagText WHERE LTRIM(RTRIM(localeid)) = 1 ORDER BY condindflag")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getDocumentMarkList();

    @Select("SELECT DISTINCT name, code FROM adsuser.CountryText WHERE LTRIM(RTRIM(localeid)) = 1 ORDER BY code")
    @ResultType(HashMap.class)
    List<HashMap<String,String>> getCountryRiskList();

//    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{financing})")
//    @ResultType(String.class)
//    List<String> findFinancing(@Param("financing") String financing);
//
//    @Select("SELECT   FROM   WHERE TRIM() = TRIM(#{line_grade})")
//    @ResultType(String.class)
//    List<String> findLineGrade(@Param("line_grade") String lineGrade);
//
//    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{collateral_method})")
//    @ResultType(String.class)
//    List<String> findCollateralMethod(@Param("collateral_method") String collateralMethod);
//
//    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{document_mark})")
//    @ResultType(String.class)
//    List<String> findDocumentMark(@Param("document_mark") String documentMark);
//
//    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{country_risk})")
//    @ResultType(String.class)
//    List<String> findCountryRisk(@Param("country_risk") String countryRisk);
}
