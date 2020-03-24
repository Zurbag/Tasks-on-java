package com.javatasks.a_8_str24;

import java.util.Scanner;

/*
Составьте программу, запрашивающую символьную строку и выводящую ее же, но в обратном порядке.
Например, "Коза" - "азоК".
 */
public class Str_5v2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        char[] chars = new char[str.length()];
        int j = 0;
        for (int i = str.length()-1; i >= 0; i--) {

            chars[i] = str.charAt(j);
            j++;
        }
        System.out.print("Перевернутая строка: ");
        for (char x:chars
             ) {
            System.out.print(x);
        }
    }
}
