package com.javatasks.a_6_pf_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Напишите процедуру, которая будет возвращать среднее арифметическое двух чисел.

 */
public class pf_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(avarage(a,b));
    }

    public static double avarage(int a, int b){
        return (a+b)/2.0;
    }
}

