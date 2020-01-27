package com.javatasks.a_6_pf_13;

/*
Составить программу вычисления суммы трехзначных чисел, в
десятичной записи которых нет четной цифры. Использовать функцию обнаружения таких чисел.
 */
public class pf_9 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            summ(i);
        }
    }

    public static void summ(int i) {
        int a = i / 100;
        int b = i / 10 % 10;
        int c = i % 10;

        if (b % 2 != 0) {
            System.out.println(i+" - "+(a + b + c));
        }
    }
}
