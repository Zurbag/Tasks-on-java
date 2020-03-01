package com.javatasks.a_8_str24;

import java.util.Scanner;

/*
В заданной последовательности слов найти все слова, начинающиеся c заданной приставки.
 */
public class Str_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите приставку: ");
        String str2 = scanner.nextLine();

        String [] strings = str1.split(" ");

        boolean prefix;
        for (String x:strings
             ) {
            prefix = x.startsWith(str2);
            if(prefix = x.startsWith(str2)){
                System.out.print(x+" ");
            }
        }
    }
}
