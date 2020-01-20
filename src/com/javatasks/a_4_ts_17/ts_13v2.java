package com.javatasks.a_4_ts_17;

import java.util.Scanner;

/*
Написать программу вычисления суммы всех нечетных n чисел. Записать варианты программы с разными видами циклов while, repeat, for-to, for-downto.

 */
public class ts_13v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для подсчета их суммы: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        int sumFor = 0;
        for (int i = 0; i < n ; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i]+ " ");
            sumFor = sumFor+array[i];
        }

        int sumWhile = 0;
        int count = 0;
        while (count < n){
            sumWhile = sumWhile+array[count];
            count++;
        }
        System.out.println(" ");
        System.out.println("Сумма чисел в отрезке равна: "+ sumFor+"(Посчитано через For)");
        System.out.println("Сумма чисел в отрезке равна: "+ sumWhile+"(Посчитано через While)");
        System.out.println();

    }
}
