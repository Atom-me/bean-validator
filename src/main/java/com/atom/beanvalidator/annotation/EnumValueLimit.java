package com.atom.beanvalidator.annotation;


import com.atom.beanvalidator.validator.EnumValueLimitValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 校验对象的属性值 只能是 指定枚举内的值
 *
 * @author Atom
 */
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = EnumValueLimitValidator.class)
@Documented
public @interface EnumValueLimit {

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 目标枚举类，即使用哪个枚举校验
     *
     * @return
     */
    Class<?>[] target() default {};
}
