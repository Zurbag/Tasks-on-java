package com.javatasks.a_8_str24;
/*
Удвоить каждую букву в заданном тексте.
 */
public class Str_6 {
    public static void main(String[] args) {
        String str = "Строка";
        char[]chars = str.toCharArray();
        char[]resultChars = new char[chars.length*2];
        int j=0;
        char buffer;

        for (int i = 0; i <resultChars.length ; i=i+2) {
            buffer = chars[j];
            resultChars[i]=buffer;
            resultChars[i+1]=buffer;
            j++;
        }

        for (char x:resultChars
             ) {
            System.out.print(x);
        }



    }
}
