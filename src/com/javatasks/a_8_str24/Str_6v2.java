package com.javatasks.a_8_str24;
/*
String myStr = new String(temp);
Удвоить каждую букву в заданном тексте.
 */
public class Str_6v2 {
    public static void main(String[] args) {
        String str = "Строка1";
        char[] chars = new char[str.length()*2];
        int j = 0;
        char buffer;
        for (int i = 0; i < chars.length; i=i+2) {
            buffer = str.charAt(j);
            chars[i]= buffer;
            chars[i+1] = buffer;
            j++;
        }
        String resultStr = new String(chars);
        System.out.println(chars);
    }
}
