package com.javatasks.a_8_str24;
/*
Составьте программу, которая каждую встречную в слове букву "б" заменяла сочетанием букв "ку".
 */
public class Str_8 {
    public static void main(String[] args) {
        String str = "быть или не быть вот в чем вопрос";
        String [] splitStr = new String[str.length()];
        splitStr = str.split("");
        for (int i = 0; i < splitStr.length; i++) {
            if (splitStr[i].equals("б")){
                splitStr[i] = "ку";

            }
            System.out.print(splitStr[i]);
        }
    }
}
