package com.javatasks.a_8_str24;

import java.util.Scanner;

/*
str_15. Написать программу, которая подсчитывает количество слов во введенной строке, первый и последний символ которых равны
 */
public class Str_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        char[] chars;
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            chars = strings[i].toCharArray();
            if(chars[0]==chars[chars.length-1]){
                System.out.print(chars);
                count++;
            }

        }
        System.out.println("\nКоличество слов во введенной строке, первый и последний символ которых равны: "+count);
    }
}
