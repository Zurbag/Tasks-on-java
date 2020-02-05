package com.javatasks.a_7_tsa_22;

import java.util.Scanner;

/*
 В диапазоне Integer найти все числа, которые делятся нацело на сумму их первой и последней цифры. Узнать, сколько таких чисел.

 */
public class tsa_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну диапазона Integer: ");
        int diapasonLength = scanner.nextInt();
        int[] diapason = new int[diapasonLength];
        for (int i = 0; i < diapason.length; i++) {
            diapason[i] = (int) (Math.random() * diapasonLength/2);
        }
        for (int number : diapason
        ) {
            System.out.print(number + " ");
        }
        int sumFistandEndNumbers = diapason[0] + diapason[diapason.length - 1];
        System.out.println("\nСумма первого и последнего числа диапазона: " + sumFistandEndNumbers);
        int counter = 0;
        System.out.print("Найденные числа: ");
        for (int number : diapason
        ) {
            if (number % sumFistandEndNumbers == 0) {
                System.out.print(number+" ");
                counter++;
            }
        }

        System.out.println("\nКоличество чисел: " + counter);
    }
}
