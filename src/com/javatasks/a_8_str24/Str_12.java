package com.javatasks.a_8_str24;
/*
Заданы две строки str1 и str2, каждая из которых содержит n
литер. Подсчитать число цифр в str1 и количество строчных латинских букв в str2.
 */
public class Str_12 {
    public static void main(String[] args) {
        String str1 = "You’ll chase after 2 hares. Do not catch 1, then the hare will be 0";
        String str2 = "Klara stole corals from Karl and Karl stole from Klara";
        System.out.println("Количество цифр в строке: " + countTheNumbers(str1));
        System.out.println("Количество строчных латинцких букв в строке: " + countTheLetters(str2));
    }

    public static int countTheNumbers(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char x : chars
        ) {
            if (x >= 48 && x <= 58) {
                count++;
            }
        }
        return count;
    }

    public static int countTheLetters(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char x : chars
        ) {
            if (x >= 91 && x <= 122) {
                count++;
            }
        }
        return count;
    }


}
