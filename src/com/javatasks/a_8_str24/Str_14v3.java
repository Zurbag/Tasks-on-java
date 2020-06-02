package com.javatasks.a_8_str24;
/*
str_14v3. Дана последовательность слов. Напечатать все слова, отличные от "hello"
 */
public class Str_14v3 {
    public static void main(String[] args) {
        String string = "Hello, Goodbye, Hi, Good evening, Good night, Good morning";
        String[]strings = string.split(", ");
        for (String x:strings
             ) {
            if (!x.equalsIgnoreCase("Hello")) System.out.println(x);
        }
    }
}

