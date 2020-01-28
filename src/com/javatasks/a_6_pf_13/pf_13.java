package com.javatasks.a_6_pf_13;

import java.util.Scanner;

/*
Написать программу с использованием оператора CASE, которая вводит число от 0 до
 MAXLONGINT и выводит это число прописью с указанием единицы измерения.

 */
public class pf_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int[] split = split(number, getNumberLength(number));
        int numberLength = getNumberLength(number);
        switch (numberLength){
            case 1:
                System.out.println(convertNumderToString(split[0],numberLength));
                break;
            case 2:
                System.out.println();
        }
    }

    public static int getNumberLength(int number){
        int buffer = number;
        int counter = 0;
        while (buffer > 0){
            buffer  = buffer/10;
            counter++;
        }
        return counter;
    }

    public static String convertNumderToString(int number, int numberLength){
        switch (number){
            case 1:
                switch (numberLength){
                    case 1:
                        return "один";
                    case 2:
                        return "десять";
                    case 3:
                        return "сто";
                }

            case 2:
                switch (numberLength){
                    case 1:
                        return "два";
                    case 2:
                        return "двадцать";
                    case 3:
                        return "двести";
                }
            case 3:
                switch (numberLength){
                    case 1:
                        return "три";
                    case 2:
                        return "тридцать";
                    case 3:
                        return "триста";
                }
            case 4:
                switch (numberLength){
                    case 1:
                        return "четыре";
                    case 2:
                        return "сорок";
                    case 3:
                        return "четыреста";
                }
            case 5:
                switch (numberLength){
                    case 1:
                        return "пять";
                    case 2:
                        return "пятьдесят";
                    case 3:
                        return "пятьсот";
                }
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            case 10:
                return "десять";
            default:
                return "";

        }
    }

    public static int [] split(int number, int decimal){
        int [] split = new int[decimal];
        int buffer = number;
        for (int i = split.length-1; i >= 0; i--) {
            split[i] = buffer%10;
            buffer = buffer/10;
        }
        return split;
    }
}
