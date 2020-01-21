package com.javatasks.a_4_ts_17;

import java.util.Arrays;
import java.util.Scanner;

/*
Дана последовательность целых чисел, длина которой не менее двух.
Найти произведение двух максимальных чисел этой последовательности.
 */
public class ts_15 {
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
            System.out.print(" \nПроизведение двух максимальных чисел последовательности " + (sequens[sequens.length - 1] * sequens[sequens.length - 2]));
        } else {
            System.out.println("Длинна последовательности должна быть больше 2");
        }
    }
}
