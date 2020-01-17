package com.javatasks.a_2_if_13;
/*Даны три числа. Найти среднее*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if_12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());

        if (a < b && b < c) {
            System.out.println(b);
        } else if (a > b && b > c) {
            System.out.println(b);
        } else if (a > c && c > b) {
            System.out.println(c);
        } else if (a > b && a < c) {
            System.out.println(a);
        }
    }

}
