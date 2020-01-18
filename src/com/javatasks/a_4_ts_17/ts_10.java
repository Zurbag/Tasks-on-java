package com.javatasks.a_4_ts_17;

import java.util.Arrays;

/*
Дано целое N > 0 и последовательность из N вещественных
чисел, среди которых есть хотя бы одно отрицательное число.
Найти величину наибольшего из отрицательных чисел этой последовательности.
 */
public class ts_10 {
    public static void main(String[] args) {
        int n = 10;
        int largestNegative = 0;
        int[] sequence = new int[n];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = -500 + (int) (Math.random() * 1000);
        }
        for (int num : sequence
        ) {
            System.out.print(num + " ");
        }

        int[] sequenceSort = new int[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            sequenceSort[i] = sequence[i];
        }

        Arrays.sort(sequenceSort);

        for (int i = 0; i < sequenceSort.length-1; i++) {
            if ((sequenceSort[i] < 0) && (sequenceSort[i+1] >= 0)) {
                largestNegative = sequenceSort[i];
            }
        }

        System.out.println(" ");
        System.out.print("Наибольшее отрицательное: "+ largestNegative);
    }
}
