package com.javatasks.a_7_tsa_22;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

/*
Найти самую большую цифру целого числа.
 */
public class tsa_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String str = scanner.nextLine();
        int [] numbers  = new int[str.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        Arrays.sort(numbers);
        System.out.println("Самая большая цифра: "+numbers[numbers.length-1]);



    }
}
