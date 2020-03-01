package com.javatasks.a_8_str24;

import java.util.Scanner;

/*
Найти сколько раз в предложении встречается символ, введеный
с клавиатуры.

 */
public class Str_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String str = scanner.nextLine();
        System.out.print("Введите искомый символ: ");
        char searchCharacter = scanner.nextLine().charAt(0);
        char [] chars = str.toCharArray();
        int count = 0;
        for (char x:chars
             ) {
            if (x == searchCharacter) {
                count++;
            }
        }
        System.out.println("Символ встречается: "+count+" раз");
    }
}
