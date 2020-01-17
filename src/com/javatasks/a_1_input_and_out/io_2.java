package com.javatasks.a_1_input_and_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Даны два действительных числа a и b.
Получить их сумму, разность и произведение.
Написать программу так, чтобы результат выводился полным ответом (например, 4 * 5 = 20, если были введены числа 4 и 5).
 */
public class io_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число");
        int b = Integer.parseInt(reader.readLine());
        System.out.println(a+" + "+b+ " = " +(a+b));
        System.out.println(a+" - "+b+ " = " +(a-b));
        System.out.println(a+" * "+b+ " = " +(a*b));
    }
}
