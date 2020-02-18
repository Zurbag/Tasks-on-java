package com.javatasks.a_7_tsa_22;

import java.math.BigInteger;
import java.util.Scanner;

/*
Три алгоритма о том, чтобы узнать, является ли число простым.
 */
public class Tsa_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        Integer integer = scanner.nextInt();
        BigInteger bigInteger = BigInteger.valueOf(integer);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        if (probablePrime == true){
            System.out.println(integer+" простое число");
        }else {
            System.out.println(integer+ " составное число");
        }
    }
    //    public static void main(String args[]) {
    //        int temp;
    //        boolean isPrime=true;
    //        Scanner scan= new Scanner(System.in);
    //        System.out.print("Введите число: ");
    //        int number=scan.nextInt();
    //
    //
    //        for (int i=2; i<=number/2; i++) {
    //            temp = number % i;
    //            if (temp == 0) {
    //                isPrime = false;
    //                break;
    //            }
    //        }
    //
    //        if(isPrime == true) {
    //            System.out.println(number + " - простое число");
    //        } else {
    //            System.out.println(number + " - составное число");
    //        }
    //    }


}
