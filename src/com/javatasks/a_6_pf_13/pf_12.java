package com.javatasks.a_6_pf_13;
/*
Составить программу вычисления суммы трехзначных чисел, в десятичной записи которых нет четной цифры.


 */
public class pf_12 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            sum(i);
        }
    }

    public static void sum(int num ){
        int a = num/100;
        int b = num/10%10;
        int c = num%10;
        if (b%2 != 0 || c%2 != 0) {
            System.out.print(num+" = ");
            System.out.println(a+b+c);
        }
    }
}
