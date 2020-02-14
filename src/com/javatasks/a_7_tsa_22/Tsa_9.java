package com.javatasks.a_7_tsa_22;

import java.util.Scanner;

/*
Дано натуральное число. Определить, является ли это число перевертышем
 */
public class Tsa_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int numLength = numLength(num);

        if (numPolindrom(num, numLength) == true) {
            System.out.println("Число является полиндромом");
        } else {
            System.out.println("Число не является полиндромом");
        }


    }

    public static int numLength(int num) {
        int numLength = 0;
        while (num > 0) {
            num /= 10;
            numLength++;
        }
        return numLength;
    }

    public static boolean numPolindrom(int num, int numLength) {
        boolean numPolindrom = false;
        int numHalfLength = 0;
        int firstPart = 0;
        int seconfPart = 0;
        int seconfPartRevers = 0;

        if (numLength % 2 == 0) {
            numHalfLength = numLength / 2;
            firstPart = num / (int) Math.pow(10, numHalfLength);
            seconfPart = num % (int) Math.pow(10, numHalfLength);


            while (numHalfLength > 0) {
                seconfPartRevers = seconfPartRevers + (seconfPart % 10 * (int) Math.pow(10, numHalfLength - 1));
                seconfPart /= 10;
                numHalfLength--;
            }

            if (firstPart == seconfPartRevers) {
                numPolindrom = true;
            }

        } else {
            numPolindrom = false;
        }
        return numPolindrom;
    }


}
