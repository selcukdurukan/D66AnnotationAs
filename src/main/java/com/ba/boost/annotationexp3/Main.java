package com.ba.boost.annotationexp3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Cat cat = new Cat();

        Class<?> clazz = cat.getClass();

        Method[] catDeclaredMethods = clazz.getDeclaredMethods();

        for (Method m : catDeclaredMethods) {
            if (m.isAnnotationPresent(OverAgainAnnotation.class)) {
                OverAgainAnnotation ann = m.getAnnotation(OverAgainAnnotation.class);
                for (int i = 0; i < ann.again(); i++) {
                    m.invoke(cat);
                }
            }

        }


    }
}
