package com.javatasks.a_6_pf_13;

import java.util.Scanner;

/*
Составьте программу подсчета числа всех натуральных чисел, меньших M, квадрат суммы цифр которых равен X.

 */
public class pf_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите M: ");
        int m = scanner.nextInt();
        System.out.print("Введите X: ");
        int x = scanner.nextInt();
        searchAndCount(m, x);

    }

    public static void searchAndCount(int m, int x) {
        int num = 0;
        int exponentianOfsumNumbers = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {

            exponentianOfsumNumbers = (int) (Math.pow(sumOfNumbers(i), 2));
            if (exponentianOfsumNumbers == x) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println(count);
    }

    public static int sumOfNumbers(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
