package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Даны три действительных числа а, b, c. Получить максимальное из трех.
*/
public class if_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];
        for (int i = 0; i <array.length ; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);

        System.out.println(array[array.length-1]);
    }
}
