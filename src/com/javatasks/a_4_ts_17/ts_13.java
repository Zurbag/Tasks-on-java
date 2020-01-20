package com.javatasks.a_4_ts_17;
/* Написать программу вычисления суммы всех нечетных N чисел.
*/

import java.util.Scanner;

public class ts_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для подсчета их суммы: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i]+ " ");
            sum = sum+array[i];
        }
        System.out.println(" ");
        System.out.println("Сумма чисел в отрезке равна: "+ sum);
    }
}
