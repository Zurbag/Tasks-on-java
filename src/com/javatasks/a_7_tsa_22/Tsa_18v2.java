package com.javatasks.a_7_tsa_22;

import java.util.Scanner;

/*
Написать программу определения палиндрома.
 */

public class Tsa_18v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Polindom polindom = new Polindom();
        System.out.print("Введите число: ");
        polindom.setNumber(scanner.nextInt());
        polindom.showResult();
    }

    public static class Polindom {

        private int number;

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumberRevers() {
            int numberRevers = 0;
            int temp = number;
            int length = 0;
            while (temp > 0) {
                temp /= 10;
                length++;
            }
            temp = number;
            while (length > 0) {
                numberRevers = temp % 10 * (int) Math.pow(10, length - 1) + numberRevers;
                temp /= 10;
                length--;
            }
            return numberRevers;
        }

        public void showResult() {
            if (getNumberRevers() == number) {
                System.out.println("Число полиндром");
            } else {
                System.out.println("Число не полиндром");
            }
        }
    }
}
