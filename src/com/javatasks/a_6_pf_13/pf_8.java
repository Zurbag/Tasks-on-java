package com.javatasks.a_6_pf_13;
/*
Описать процедуру fib (f, n), записывающую в ряд f все числа Фибоначчи (1, 1, 2, 3, 5, ...), не превосходящие целого положительнорго числа N.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pf_8 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите предел функции: ");
        int n = Integer.parseInt(reader.readLine());

        Fib(n);
    }

    public static void Fib(int n){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        do {
            System.out.print(n3+ " ");
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }while (n3 < n);
    }
}
