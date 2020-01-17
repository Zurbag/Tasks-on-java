package com.javatasks.a_1_input_and_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Поменять местами значения переменных x и y без использования промежуточной переменной.
 */
public class io_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Поменять местами X и Y без использование третьей переменной");
        System.out.print("x = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.print("y = ");
        int y = Integer.parseInt(reader.readLine());
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = " + x );
        System.out.println("y = " + y );
    }
}
