package com.javatasks.whire_rabbit.lesson_13;

public class ForLoop {

    int[] array = {1,2,3};
    public void foo() {
        for (int i = 0; i <10; i++ ) {
            System.out.println(i);
        }

        for (int elemet:array
             ) {
            System.out.println(elemet);
        }
    }
}
