package com.ba.boost.annotationexp2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Math math = new Math(48, 4, 2);

        Class clazzMath = math.getClass();

        Method[] matDeclaredMethods = clazzMath.getDeclaredMethods();

        for (Method m : matDeclaredMethods) {
            if (m.isAnnotationPresent(MathAnnotation.class)) {
                MathAnnotation annotation = m.getAnnotation(MathAnnotation.class);
                if (annotation.enable()) {
                    m.invoke(math);
                }
            }
        }
    }
}
