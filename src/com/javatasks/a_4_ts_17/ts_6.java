package com.javatasks.a_4_ts_17;

/*Ввести натуральное число N. Выдать все тройки натуральных
чисел X, Y, Z, для которых N= X^2 + Y^2 + Z^2 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ts_6 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            x = i;
            for (int j = 0; j < n; j++) {
                y = j;
                for (int k = 0; k < n; k++) {
                    z = k;
                    if (x*x + y*y + z*z == n) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }
}
