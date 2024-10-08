package ru.yandex.practicum.filmorate.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = { StartsWithJavaValidator.class })
@Target({ FIELD })
@Retention(RUNTIME)
public @interface StartsWith {
    String message() default "строка должна начинаться с {ru.yandex.practicum.filmorate.validation.value}";

    String value();

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
