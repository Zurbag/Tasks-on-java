package com.javatasks.a_8_str24;

import java.util.ArrayList;

/*
. Из данной строки получить новую строку, удалив все звездочки
и повторив каждый символ, отличный от звездочки.
 */
public class Str_7 {
    public static void main(String[] args) {
        String str = "*Поворот*";
        ArrayList<Character> characters = new ArrayList<Character>();

        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '*') {
                characters.add(j, str.charAt(i));
                j++;
            }
        }

        char[] chars = new char[characters.size() * 2];
        int k = 0;
        char buffer;
        for (int i = 0; i < chars.length; i = i + 2) {
            buffer = characters.get(k);
            chars[i] = buffer;
            chars[i + 1] = buffer;
            k++;
        }

        String resultString = new String(chars);
        System.out.println(resultString);
    }

}
