package com.javatasks.a_8_str24;
/*
 Дана строка str и символ s. Строку str "сжать", удалив из нее каждый второй символ. Узнать, сколько символов s в "сжатой" строке.
 */
public class Str_10 {
    public static void main(String[] args) {
        String str = "system otpost readings";
        String [] strSplit = str.split("");
        for (int i = 1; i < str.length(); i= i+2) {
            strSplit[i] = "";
        }
        int count = 0;
        for (String x:strSplit
             ) {
            if(x.equals("s")){
                count++;
            }
            System.out.print(x);
        }
        System.out.println("\nКоличество S = "+ count);
    }
}
