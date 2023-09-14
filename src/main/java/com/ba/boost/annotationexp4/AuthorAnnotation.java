package com.ba.boost.annotationexp4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface AuthorAnnotation {
    String authorName() default "";

    String dateOfBirth() default "";
}
