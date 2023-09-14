package com.ba.boost.annotationexp2;

public class Math {

    private int number1;
    private int number2;
    private int number3;

    public Math(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    @MathAnnotation
    public void addition() {
        System.out.println("Addition result: " + (number1 + number2 + number3));
    }

    @MathAnnotation(enable = false)
    public void subtraction() {
        System.out.println("Subtraction result: " + (number1 - number2 - number3));
    }

    @MathAnnotation
    public void multiplication() {
        System.out.println("Multiplication result: " + (number1 * number2 * number3));
    }

    public void division() {
        System.out.println("Division result: " + (number1 / number2 / number3));
    }


}
