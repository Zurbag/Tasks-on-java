package com.javatasks.a_4_ts_17;

/*
 Найти сумму двух минимальных элементов целочисленной последовательности. В последовательности не менее 2-х элементов.

 */

import java.util.Arrays;
import java.util.Scanner;

public class ts_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну последовательности: ");

        int length = scanner.nextInt();
        if (length > 2) {
            int[] sequens = new int[length];
            for (int i = 0; i < sequens.length; i++) {
                sequens[i] = (int) (Math.random() * 1000);
                System.out.print(sequens[i] + " ");
            }
            Arrays.sort(sequens);
            System.out.print(" \nСумма двух минимальных чисел последовательности " + (sequens[0] + sequens[1]));
        } else {
            System.out.println("Длинна последовательности должна быть больше 2");
        }
    }
}
