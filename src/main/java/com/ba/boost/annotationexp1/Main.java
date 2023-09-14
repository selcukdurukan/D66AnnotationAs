package com.ba.boost.annotationexp1;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> exampleClass = Class.forName("com.ba.boost.annotationexp1.ExampleClass");

        if (exampleClass.isAnnotationPresent(Example.class)) {
            System.out.println("Successful");
        } else {
            System.out.println("Not Successful");
        }
    }
}
