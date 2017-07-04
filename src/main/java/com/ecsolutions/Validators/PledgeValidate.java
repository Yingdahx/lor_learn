package com.ecsolutions.Validators;

import com.ecsolutions.entity.PledgeEnt;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by tim on 2017/7/4.
 */

@Component
public class PledgeValidate implements Validator {

    @Override
    public void validate(Object target, Errors errors) {

        PledgeEnt userForm = (PledgeEnt) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Amount", "amountrequired", "必须大于0");

    }

    @Override
    public boolean supports(Class<?> clazz) {
        return PledgeEnt.class.isAssignableFrom(clazz);
    }

}
