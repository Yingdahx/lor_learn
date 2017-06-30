package com.ecsolutions.service;

import com.ecsolutions.entity.Credit_Entity;

/**
 * Created by Administrator on 2017/6/28.
 */
public interface Credit_Service {
    Credit_Entity getCreditInfo();

    boolean validateFinancing(String financing);

    boolean validateLineGrade(String lineGrade);

    boolean validateCollateralMethod(String collateralMethod);

    boolean validateDocumentMark(String documentMark);

    boolean validateCountryRisk(String countryRisk);
}
