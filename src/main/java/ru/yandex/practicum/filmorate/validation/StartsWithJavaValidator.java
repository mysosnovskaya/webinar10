package ru.yandex.practicum.filmorate.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StartsWithJavaValidator implements ConstraintValidator<StartsWith, String> {
    private String startsWithPrefix;

    @Override
    public void initialize(StartsWith constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        startsWithPrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.startsWith(startsWithPrefix);
    }
}
