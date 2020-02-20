package com.javatasks.a_7_tsa_22;

import java.util.Scanner;

/*
Узнать, является ли данное число палиндромом.
 */
public class Tsa_18 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int tmp = number;
        int length = 0;
        int numberRevers = 0;
        while (tmp > 0) {
            tmp /= 10;
            length++;
        }
        tmp = number;

        while (length > 0) {
            numberRevers = tmp % 10 * (int) Math.pow(10, length - 1) + numberRevers;
            tmp /= 10;
            length--;
        }
        System.out.println(numberRevers);

        if(number == numberRevers){
            System.out.println("Число полиндром");
        } else {
            System.out.println("Число не является полиндромом");
        }
    }
}
