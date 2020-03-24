package com.javatasks.a_8_str24;

/*
Удвоить каждую букву в данном тексте.
 */
public class Str_6v3 {
    public static void main(String[] args) {
        String str = "Строка 3";
        char[] chars = new char[str.length()*2];
        int j = 0;
        for (int i = 0; i < chars.length; i=i+2) {
            chars[i] = str.charAt(j);
            chars[i+1] = str.charAt(j);
            j++;
        }
        String resultString = new String(chars);
        System.out.println(resultString);

    }
}
