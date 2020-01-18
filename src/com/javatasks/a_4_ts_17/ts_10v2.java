package com.javatasks.a_4_ts_17;

import java.util.Arrays;

/*
Дано целое n > 0 и последовательность из n вещественных чи8
сел. Найти величину наибольшего из отрицательных чисел этой
последовательности.
 */
public class ts_10v2 {
    public static void main(String[] args) {
        int n = 10;
        double largestNegative = 0;
        double[] sequence = new double[n];
        double[] sequenseSort = new double[n];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = -500 + (Math.random() * 1000);
        }
        for (double num : sequence
        ) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < sequenseSort.length ; i++) {
            sequenseSort[i] = sequence[i];
        }

        Arrays.sort(sequenseSort);

        for (int i = 0; i < sequenseSort.length-1; i++) {
            if((sequenseSort[i]<0)&& (sequenseSort[i+1] >= 0)){
                largestNegative = sequenseSort[i];
            }
        }

        System.out.println(" ");
        System.out.print("Наибольшее отрицательное: "+ largestNegative);
    }
}

