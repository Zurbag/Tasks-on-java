package com.javatasks.a_8_str24;
/*
Из слова удалить среднюю букву, если длина строки нечетна, иначе - удалить две средние буквы.

 */
public class Str_9 {
    public static void main(String[] args) {
        String str = "Выборы";
        String [] srtSplit = str.split("");

        if (srtSplit.length%2 == 0){
            int a = str.length()/2;
            srtSplit[a-1] = "";
            srtSplit[a] = "";
        } else {
            int b = (str.length()-1)/2;
            srtSplit[b] = "";
        }

        for (String x:srtSplit
             ) {
            System.out.print(x);
        }

    }
}
