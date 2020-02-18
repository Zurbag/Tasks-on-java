package com.javatasks.a_7_tsa_22;

import java.math.BigInteger;
import java.util.Scanner;

/*
Дано простое число p. Найти и вывести на экран следующее за ним простое число.
 */
public class Tsa_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrimeNumber = isPrimeNumber(number);
        System.out.println(nextPrimeNumber(number));

    }

    public static boolean isPrimeNumber(int number){
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(number));
        if (probablePrime){
            return true;
        }else {
            return false;
        }
    }

    private static int nextPrimeNumber(int number){
        boolean isPrimeNumber = false;
        while (isPrimeNumber == false){
            number = number+1;
            isPrimeNumber = isPrimeNumber(number);
        }
        return number;
    }
}
