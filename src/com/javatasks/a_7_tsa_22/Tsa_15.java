package com.javatasks.a_7_tsa_22;

import java.math.BigInteger;
import java.util.Scanner;

public class Tsa_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        double sqrtNumber = Math.sqrt(number);
        boolean isPrimeNumber = isPrimeNumder(sqrtNumber);
        if (isPrimeNumber){
            System.out.println(number+ " - является квадратом простого числа " + (int)sqrtNumber);
        } else {
            System.out.println(number+ " - не является квадратом простого числа");
        }
    }

    public static boolean isPrimeNumder(double sqrtNumder){
        int temt = (int)sqrtNumder; //назвал бы костылем но действительно нужная штука иначе 27 может быть квадратом 5 из за отбразываня дробной части в типе инт
        if (sqrtNumder-temt == 0){
            BigInteger integer = BigInteger.valueOf((int)sqrtNumder);
            return integer.isProbablePrime((int)Math.log(sqrtNumder));
        } else {
            return false;
        }

    }
}
