package com.anthonydera.workbook;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator implements ConstraintValidator <Username, String> {
    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern = Pattern.compile("[^a-z0-9 ]");
        Matcher matcher = pattern.matcher(username);
        return !matcher.find(); //false if characters are a-z or 0-9
    }
}
