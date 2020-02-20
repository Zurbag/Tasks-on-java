package com.javatasks.a_7_tsa_22;
/*
Разложить число на простые множители.
 */

import java.util.Scanner;

public class Tsa_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextInt();
        double temp = number;
        while (number > 1) {
            number = divider(number);
            System.out.println((int) number + " " + (int) temp / (int) number);
            temp = number;
        }
    }




    public static int divider(double number) {
        int temp;
        double result = 0;

        for (int i = 2; i <= number; i++) {
            result = number / i;
            temp = (int) result;
            if (result - temp == 0) {
                return (int) result;
            }
        }
        return (int) result;
    }
}
