package com.javatasks.a_4_ts_17;
/*Даны действительные числа. Вычислите их среднее арифметическое.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ts_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите длинну последовательности: ");
        int n = Integer.parseInt(reader.readLine());
        int[] sequence = new int[n];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = -500 + (int) (Math.random() * 1000);
        }
        System.out.print("Сгенерированные числа: ");
        for (int num : sequence
        ) {
            System.out.print(num + " ");
        }
        int sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            sum = sum + sequence[i];
        }
        System.out.println(" ");
        System.out.println("Среднее арефметическое: " + sum / n);
    }
}


