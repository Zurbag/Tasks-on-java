package com.javatasks.a_1_input_and_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

Найти значение выражения: (a + (d−12)·3)·(c−5·k), где значения переменных a, d, c и k вводятся с клавиатуры.
Если, например, были введены числа 1, 1, 1, 1, то на рабочий экран программы напечатать ответ следующим образом: (1 + (1−12)*3)*(1−5*1) = 128.

 */
class io_3{

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("d = ");
        int d = Integer.parseInt(reader.readLine());
        System.out.print("c = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.print("k = ");
        int k = Integer.parseInt(reader.readLine());
        int result = (a + (d-12)*3)*(c-5*k);
        System.out.println("(a + (d−12)·3)·(c−5·k) = " + result);

    }
}
