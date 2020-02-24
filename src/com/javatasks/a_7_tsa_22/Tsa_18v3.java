package com.javatasks.a_7_tsa_22;

import java.util.Scanner;

/*
Написать программу определения палиндрома.
 */
public class Tsa_18v3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number == invertNumber(number)) {
            System.out.println("Число полиндром");
        } else {
            System.out.println("Число не полиндром");
        }

    }

    public static int invertNumber(int number) {
        int temp = number;
        int length = 0;
        while (temp > 0) {
            temp /= 10;
            length++;
        }
        int result = 0;
        while (number > 0) {
            result = number % 10 * (int) Math.pow(10, length - 1) + result;
            number = number / 10;
            length--;
        }

        return result;
    }
}
