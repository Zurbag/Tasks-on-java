package com.javatasks.a_7_tsa_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Найти количество четных цифр целого положительного числа.
 */
public class tsa_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целое положительное число: ");
        int numder = Integer.parseInt(reader.readLine());

        int buffer = numder;
        int counter = 0;
        int modulo;
        while (buffer > 0){
            modulo = buffer%2;
            buffer = buffer/10;
            if (modulo%2 == 0){
                counter++;
            }
        }

        System.out.println("Четных цифр в числе: "+counter);

    }
}
