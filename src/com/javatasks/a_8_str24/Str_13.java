package com.javatasks.a_8_str24;

/*
Написать нерекурсивную программу, которая находит все перестановки из 6-ти символов.
 */

public class Str_13 {

    public static void main(String[] args) {
        String str = "abcdef";
        String [] strings = str.split("");
        String [] symbols = new String[6];
        int length = 6;
        int count = 0;
        for (int i = 0; i < length; i++) {
            symbols[0] = strings[i];
            for (int j = 0; j < length; j++) {
                symbols[1] = strings[j];
                for (int k = 0; k < length; k++) {
                    symbols[2] = strings[k];
                    for (int l = 0; l < length; l++) {
                        symbols[3] = strings[l];
                        for (int m = 0; m < length; m++) {
                            symbols[4] = strings[m];
                            for (int n = 0; n < length; n++) {
                                symbols[5] = strings[n];
                                if (checkRepit(symbols) != true){
                                    System.out.print(symbols[0] + "" + symbols[1] + "" + symbols[2] + "" + symbols[3] + "" + symbols[4] + "" + symbols[5] + " ");
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\nКоличество перестановок: "+count);
    }
    public static boolean checkRepit(String [] str){
        boolean check = false;
        String checkElement;
        for (int i = 0; i < str.length; i++) {
            checkElement = str[i];
            for (int j = i; j < str.length-1; j++) {
                if (checkElement.equals(str[j+1])){
                    check = true;
                }
            }
        }
        return check;
    }

}
