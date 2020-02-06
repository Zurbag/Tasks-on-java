package com.javatasks.a_7_tsa_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
Напечатать цифры числа в прямом порядке.

 */
public class tsa_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int number = Integer.parseInt(reader.readLine());
        int count = 0;
        int buffer = number;
        while (buffer > 0 ){
            buffer = buffer/10;
            count++;
        }
        int [] numbers = new int[count];

        for (int i = numbers.length-1; i >= 0; i--) {
            numbers[i] = number%10;
            number = number/10;
        }
        System.out.print("Числа в прямом порядке: ");
        for (int x:numbers
             ) {
            System.out.print(x+" ");
        }
    }
}
