package com.javatasks.a_7_tsa_22;

import java.util.Scanner;

/*
Даны два натуральных числа. Определить, ялвяется ли первое перевертышем второго.
 */
public class Tsa_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        int numLength = getNumLength(firstNum);
        int firstNumInverted = getInvertedNumber(firstNum, numLength);
        if (firstNumInverted == secondNum) {
            System.out.println("Первое число полиндром второго");
        } else {
            System.out.println("Первое число не полиндром второго");
        }

    }

    public static int getNumLength(int num) {
        int numLength = 0;
        while (num > 0) {
            num /= 10;
            numLength++;
        }
        return numLength;
    }

    public static int getInvertedNumber(int num, int numLength) {
        int numInverted = 0;

        while (num > 0) {
            numInverted = numInverted + num % 10 * (int) Math.pow(10, numLength - 1);
            num /= 10;
            numLength--;
        }
        return numInverted;
    }
}
