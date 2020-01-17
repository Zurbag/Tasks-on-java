package com.javatasks.a_4_ts_17;
/*Написать программу вычисления суммы всех двузначных чисел*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ts_1 {
    public static void main(String[] args) {
        int summ = 0;
        for (int i = 10; i < 100; i++) {
            summ = summ+i;
        }
        System.out.println(summ);
    }
}
