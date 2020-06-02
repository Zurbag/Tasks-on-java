package com.javatasks.a_8_str24;

import java.util.ArrayList;
import java.util.Arrays;

/*
str_14. Дано предложение. Напечатать все слова, отличные от слова "hello"
 */
public class Str_14 {
    public static void main(String[] args) {
        String string = "Hello is an english word, hello is usually used instead of the word Hi";
        ArrayList<String> strings= new ArrayList<String>(Arrays.asList(string.split(" ")));
        for (String x:strings
             ) {
            if (x.equalsIgnoreCase("hello")){
                continue;
            }else {
                System.out.println(x);
            }

        }
    }
}
