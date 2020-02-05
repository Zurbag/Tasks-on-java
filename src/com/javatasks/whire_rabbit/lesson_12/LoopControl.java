package com.javatasks.whire_rabbit.lesson_12;

public class LoopControl {
    boolean value = true;
    int a = 5;
    int b = 7;

    public void foo(){

        do{
            System.out.println(a);
            a++;
        }while (a<b);
    }
}
