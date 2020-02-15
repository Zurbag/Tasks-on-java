package com.javatasks.a_7_tsa_22;
/*
Из цифр числа составить наибольшее число. Ответ получить не
как набор последовательных цифр, а как настоящее число.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Tsa_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int length = getLengthOfNumber(number);
        int[] numbersSort = getSortedArrayFromNumber(number, length);
        int maxNumber = getNumberFromArray(numbersSort, length);
        System.out.println("Максимальная комбинация цифр: " + maxNumber);

    }

    public static int getLengthOfNumber(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] getSortedArrayFromNumber(int number, int length) {
        int[] array = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        Arrays.sort(array);
        int[] max = new int[length];
        for (int i = 0; i < length; i++) {
            max[i] = array[length - 1 - i];
        }
        return max;
    }

    public static int getNumberFromArray(int[] numbersSort, int length) {
        int max = 0;
        for (int i = 0; i < numbersSort.length; i++) {
            max = max + numbersSort[i] * (int) Math.pow(10, length - 1 - i);
        }
        return max;
    }
}


