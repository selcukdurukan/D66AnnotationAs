package com.ba.boost.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {
            Class<?> clazz = Class.forName("com.ba.boost.reflection.Dog");

            for (Method m : clazz.getDeclaredMethods()) {
                System.out.println("Name of method: " + m.getName());
            }

            System.out.println();

            for (Field f: clazz.getDeclaredFields()) {
                System.out.println("Name of field: " + f.getName());
            }
            System.out.println();

            for (Constructor c : clazz.getDeclaredConstructors()) {
                System.out.println("Name of constructor: " + c.getParameterCount());
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}