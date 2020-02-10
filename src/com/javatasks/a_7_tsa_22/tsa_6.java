package com.javatasks.a_7_tsa_22;
/*
 Дано число. Напечатать это же число "задом наперед", как число.

 */

import java.util.Scanner;

public class tsa_6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = scanner.nextInt();
//        System.out.print("Перевернутое число: ");
//        while (number > 0){
//            System.out.print(number%10);
//            number /=10;
//        }
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int buffer = number;
        int numberLength = 0;
        while (buffer > 0) {
            buffer /= 10;
            numberLength++;
        }
        int result = 0, mod;

        while (numberLength >= 0) {
            mod = number % 10;
            result = result + mod * (int) Math.pow(10, numberLength-1);
            number /= 10;
            numberLength--;

        }
        System.out.print(result);
    }
}

