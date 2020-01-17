package com.javatasks.a_1_input_and_out;
/*Поменять местами значения переменных Х и Y с использованием промежуточной переменной.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class io_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Поменять местами X и Y");
        System.out.print("x = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.print("y = ");
        int y = Integer.parseInt(reader.readLine());
        int buffer = x;
        x = y;
        y = buffer;
        System.out.println("x = " + x );
        System.out.println("y = " + y );
    }
}
