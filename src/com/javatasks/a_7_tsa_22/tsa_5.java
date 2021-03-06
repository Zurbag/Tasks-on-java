package com.javatasks.a_7_tsa_22;

import java.util.Arrays;
import java.util.Scanner;

/*
Вводится число N. Определить максимальную четную цифру этого числа.
 */

public class tsa_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность: ");
        int number = scanner.nextInt();

        int buffer = number;
        int count = 0;

        while (buffer > 0) {

            if(buffer%10%2==0){
                count++;
            }
            buffer = buffer / 10;
        }
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            if(number%10%2==0){
                numbers[i] = number%10;
            }
            number = number / 10;
        }
        Arrays.sort(numbers);
        System.out.println("Самая большая четная цифра: "+numbers[numbers.length-1]);
    }
}
