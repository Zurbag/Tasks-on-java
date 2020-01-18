package com.javatasks.a_4_ts_17;
/*
Имеется последовательность целых чисел. Найти сумму первых
из них, произведение которых не превышает заданного числа 𝑀.
 */

public class ts_11 {
    public static void main(String[] args) {
        int m = 100;
        int sum = 0;
        int mult = 1;
        int[] sequence = new int[10];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = (int) (Math.random() * 11);
        }
        for (int num : sequence
        ) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < sequence.length; i++) {
            if (mult < m) {
                mult = mult * sequence[i];
                if (mult < m) {
                    sum = sum + sequence[i];
                }
            }
        }
        System.out.println(" ");
        System.out.println("Сумма: " + sum);
    }
}
