package com.javatasks.a_8_str24;
/*
str_14v2. Дана последовательность слов. Напечатать все слова, отличные от "hello".
 */
public class Str_14v2 {
    public static void main(String[] args) {
        String[] strings = {"Hello", "world", "hello", "beautiful", "wonderful", "world", "hello"};
        for (String x:strings
             ) {
            if(!x.equalsIgnoreCase("Hello")){
                System.out.println(x);
            }
        }
    }
}
