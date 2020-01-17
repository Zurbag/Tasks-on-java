package com.javatasks.a_1_input_and_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Написать программу, которая вычисляет площадь треугольника по формуле Герона:
S =√︀p(p−a)(p−b)(p−c),где a,b,c – стороны треугольника, а p – его полупериметр8/
 */
public class io_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вычисление площади треугольника по формуле Геона");
        System.out.println("Введите стороны треугольника a,b,c и  его полупериметр p ");
        System.out.print("a = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("b = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("c = ");
        int c = Integer.parseInt(reader.readLine());
        System.out.print("p = ");
        int p = Integer.parseInt(reader.readLine());
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Прощадь треугольника равна: " +s);
    }
}
