package com.javatasks.a_7_tsa_22;

import java.util.Arrays;
import java.util.Scanner;

/*
Поменять местами первую и последнюю цифру натурального
числа.
 */

/*
Два решения, быстрое закоментил.
 */
public class tsa_7 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String number = scanner.nextLine();
//        int[] numbers = new int[number.length()];
//        for (int i = 0; i < number.length(); i++) {
//            numbers[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
//        }
//        int buffer = numbers[numbers.length - 1];
//        numbers[numbers.length - 1] = numbers[0];
//        numbers[0] = buffer;
//
//        System.out.println(Arrays.toString(numbers));
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int lengtNumber = lengthNumber(number);
        int firstNumber = firstNumber(number, lengtNumber);
        int lastNumber = lastNumber(number);
        int resultNumder = ((number - lastNumber + firstNumber) % (int) Math.pow(10, lengtNumber - 1)) + lastNumber * (int) Math.pow(10, lengtNumber - 1);
        System.out.print("Результат рокировки первой и последней цифры: " + resultNumder);
    }

    public static int lengthNumber(int number) {
        int lengthNumber = 0;
        while (number > 0) {
            number /= 10;
            lengthNumber++;
        }
        return lengthNumber;
    }

    public static int lastNumber(int number) {
        return number % 10;
    }

    private static int firstNumber(int number, int lengthNumber) {
        while (lengthNumber > 1) {
            number /= 10;
            lengthNumber--;
        }
        return number;
    }


}
