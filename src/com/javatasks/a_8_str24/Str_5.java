package com.javatasks.a_8_str24;

import java.util.Scanner;

/*
Составьте программу, запрашивающую символьную строку и выводящую ее же, но в обратном порядке.
Например, "Коза" - "азоК".
 */
public class Str_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = scanner.nextLine();
        System.out.print("Результат: ");
        char[] chars = str.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
