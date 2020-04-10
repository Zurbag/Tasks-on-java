package com.javatasks.a_8_str24;
/*
Составьте программу, которая каждую встречную в слове букву "б" заменяла сочетанием букв "ку"
 */
public class Str_8v2 {
    public static void main(String[] args) {
        String stringInput = "быть или не быть вот в чем бытовой большой вопрос";
        String [] stringTemp = stringInput.split("");
        for (String x:stringTemp
             ) {
            if (x.equals("б")){
                x = "ку";
                System.out.print(x);
            }else {
                System.out.print(x);
            }

        }
    }
}
