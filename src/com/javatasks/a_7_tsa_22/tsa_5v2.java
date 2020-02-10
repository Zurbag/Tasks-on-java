package com.javatasks.a_7_tsa_22;

import java.util.Arrays;
import java.util.Scanner;

/*
Вводится число N. Определить максимальную четную цифру этого числа.
*/
public class tsa_5v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String numberString = scanner.nextLine();
        int[] numbers = new int[numberString.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }

        Arrays.sort(numbers);
        int minusLength = 0;
        while (true) {
            minusLength++;
            if (numbers[numbers.length - minusLength] % 2 == 0) {
                System.out.print("Самое большое четное число: "+numbers[numbers.length - minusLength]);
                break;
            }
        }
    }
}
