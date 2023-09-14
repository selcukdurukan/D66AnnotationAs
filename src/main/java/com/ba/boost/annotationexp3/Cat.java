package com.ba.boost.annotationexp3;

public class Cat {

    @OverAgainAnnotation(again = 5)
    public void meowing() {
        System.out.println("Meoooooowwwwww...");
    }
}
