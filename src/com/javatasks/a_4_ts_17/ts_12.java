package com.javatasks.a_4_ts_17;

import java.util.Scanner;

/*
 Задано целое A > 1. Найти наименьшее целое неотрицательное k, при котором 5k > A.
 */
public class ts_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        int k = 0;
        while (true){
            if (Math.pow(5,k++) > a){
                System.out.println(k);
                return;
            }
        }
    }
}
