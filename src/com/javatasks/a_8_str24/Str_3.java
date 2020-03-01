package com.javatasks.a_8_str24;

import java.util.Scanner;

/*
Дан произвольный текст. Подсчитать общее число
вхождений символов "+", "-", "*" в тексте.
 */
public class Str_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String[] strings = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            strings[i] = String.valueOf(text.charAt(i));
        }

        String[] chars = {"+", "-", "*"};
        int[] counts = {0, 0, 0};

        for (String x : strings
        ) {
            if (x.contains(chars[0])) counts[0]++;
            if (x.contains(chars[1])) counts[1]++;
            if (x.contains(chars[2])) counts[2]++;
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i] + " встречается " + counts[i] + " раз.");
        }
    }
}
