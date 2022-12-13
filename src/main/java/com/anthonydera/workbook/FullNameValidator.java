package com.anthonydera.workbook;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FullNameValidator implements ConstraintValidator<ValidFullName, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
        return !(user.getFirstName().contentEquals(user.getLastName()));
    }
}
