package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class if_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[]array = new int[3];
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int num;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0 && array[i] > 0){
                System.out.println(array[i]*array[i]);
            } else {
                System.out.println(array[i]);
            }
        }
    }
}
