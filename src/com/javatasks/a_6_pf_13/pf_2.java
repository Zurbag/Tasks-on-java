package com.javatasks.a_6_pf_13;

import java.util.Scanner;

/*
 Напишите программу, которая выбирает максимальное из четырех заданных чисел, используя функцию, которая выбирает максимальное из двух чисел.

 */
public class pf_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Compare(Compare(scanner.nextInt(),scanner.nextInt()),Compare(scanner.nextInt(),scanner.nextInt())));

    }

    static public int Compare(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}


