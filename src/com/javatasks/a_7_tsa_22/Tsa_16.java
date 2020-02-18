package com.javatasks.a_7_tsa_22;

import java.math.BigInteger;
import java.util.Scanner;

public class Tsa_16 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000000 ; i++) {
            if (isPrimeNumder(i) == true){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumder(int number){
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean isProbablePrime = bigInteger.isProbablePrime((int) Math.log(number));
        if (isProbablePrime == true){
            return true;
        }else {
            return false;
        }

    }
}
