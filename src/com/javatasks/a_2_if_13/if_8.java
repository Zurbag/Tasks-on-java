package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Написать прграмму, которая для заданных трех чисел A, B, C проверяет, упорядочены ли они (A < B < C).
*/
public class if_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());

        if (a<b && b<c){
            System.out.println("Упорядоченно");
        }else {
            System.out.println("Неупорядоченно");
        }
    }
}
