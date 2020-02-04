package com.javatasks.whire_rabbit.lesson_10;

public class ControlOperators {

    int a = 5, b = 7;
    boolean value = true;

    public void foo() {
        if (value) {
            System.out.println("True");
            if (a < b) {
                System.out.println("Yes");
            }
        } else if (b > a) {
            System.out.println("False");
        }
    }
}
