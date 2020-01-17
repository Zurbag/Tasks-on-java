package com.javatasks.a_4_ts_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Для последовательности из N целых чисел. Найти суммы положительных и отрицательных элементов.
 */
public class ts_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите длинну последовательности: ");
        int n = Integer.parseInt(reader.readLine());
        int[] sequence = new int[n];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = -100 + (int) (Math.random() * 200);
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
        System.out.println("Сумма чисел последовательности: " + sum);

    }
}
