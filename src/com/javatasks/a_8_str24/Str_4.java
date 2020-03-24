package com.javatasks.a_8_str24;

import java.util.Arrays;

/*
Задано число, записанное двумя римскими цифрами. Вывести
его значение в общепринятой арабской системе счисления.

 */
public class Str_4 {
    public static void main(String[] args) {
        String romanNumber = "IV";

        String[] romanNumbers = new String[romanNumber.length()];
        for (int i = 0; i < romanNumber.length(); i++) {
            romanNumbers[i] = String.valueOf(romanNumber.charAt(i));
        }

        int[] arabicNumbers = new int[romanNumber.length()];
        for (int i = 0; i < romanNumber.length(); i++) {
            arabicNumbers[i] = converting(romanNumbers[i]);
        }

        for (int i = 0; i < arabicNumbers.length-1; i++) {
            if (arabicNumbers[i] == 1 && arabicNumbers[i+1]==5 ){
                arabicNumbers[i+1] = 3;
            }
        }

        int sum = 0;
        for (int i = 0; i < arabicNumbers.length ; i++) {
            sum +=arabicNumbers[i];
        }
        System.out.println(sum);
        
    }

    public static int converting(String string) {
        switch (string) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                System.out.println("Введите римскую цифру");
                return 0;
        }


    }
}

