package com.javatasks.a_7_tsa_22;

import java.util.Scanner;

/*
Три алгоритма о том, чтобы узнать, является ли число простым.
 */
public class Tsa_13 {
    public static void main(String args[]) {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.print("Введите число: ");
        int number=scan.nextInt();


        for (int i=2; i<=number/2; i++) {
            temp = number % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime == true) {
            System.out.println(number + " - простое число");
        } else {
            System.out.println(number + " - составное число");
        }
    }
}
