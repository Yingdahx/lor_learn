package com.ecsolutions.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by Administrator on 2017/6/28.
 */

@Repository
public interface Credit_DAO {
    @Select("SELECT DISTINCT  FROM  )")
    @ResultType(String.class)
    List<String> getFinancingList();

    @Select("SELECT DISTINCT  FROM  )")
    @ResultType(String.class)
    List<String> getLineGradeList();

    @Select("SELECT DISTINCT  FROM  )")
    @ResultType(String.class)
    List<String> getCollateralMethodList();

    @Select("SELECT DISTINCT  FROM  )")
    @ResultType(String.class)
    List<String> getDocumentMarkList();

    @Select("SELECT DISTINCT  FROM  )")
    @ResultType(String.class)
    List<String> getCountryRiskList();

    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{financing})")
    @ResultType(String.class)
    List<String> findFinancing(@Param("financing") String financing);

    @Select("SELECT   FROM   WHERE TRIM() = TRIM(#{line_grade})")
    @ResultType(String.class)
    List<String> findLineGrade(@Param("line_grade") String lineGrade);

    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{collateral_method})")
    @ResultType(String.class)
    List<String> findCollateralMethod(@Param("collateral_method") String collateralMethod);

    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{document_mark})")
    @ResultType(String.class)
    List<String> findDocumentMark(@Param("document_mark") String documentMark);

    @Select("SELECT  FROM  WHERE TRIM() = TRIM(#{country_risk})")
    @ResultType(String.class)
    List<String> findCountryRisk(@Param("country_risk") String countryRisk);
}
