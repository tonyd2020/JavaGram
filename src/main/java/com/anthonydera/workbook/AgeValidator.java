package com.anthonydera.workbook;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AgeValidator implements ConstraintValidator<Age, Date> {
    @Override
    public boolean isValid(Date dob, ConstraintValidatorContext constraintValidatorContext) {
        long diff = new Date().getTime() - dob.getTime();
        int age = (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
        return (age>=18);
    }
}
