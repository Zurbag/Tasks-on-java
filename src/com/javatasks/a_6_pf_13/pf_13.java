package com.javatasks.a_6_pf_13;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
Написать программу с использованием оператора CASE, которая вводит число от 0 до
 MAXLONGINT и выводит это число прописью с указанием единицы измерения.

 */
public class pf_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int numberLength = getNumberLength(number);

        int[] numberSplit = getNumberSplit(number, numberLength);

        System.out.println("=============");
        System.out.println(numberLength);

        System.out.println(getNumberWord(numberSplit[0],3));
        System.out.println(getNumberWord(numberSplit[1],2));
        System.out.println(getNumberWord(numberSplit[2],1));



    }

    public static int getNumberLength(int number) {
        int buffer = number;
        int counter = 0;
        while (buffer > 0) {
            buffer = buffer / 10;
            counter++;
        }
        return counter;
    }

    public static int[] getNumberSplit(int number, int numberLength) {
        int[] array = new int[numberLength];
        int buffer = number;
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = buffer % 10;
            buffer = buffer / 10;
        }

        return array;
    }

    public static String [] getNumberWord(int [] number, int numberLength) {
        for (int i = 0; i < number.length; i++) {
            switch (number) {
                case 1:

                    switch (numberLength){
                        case 1:
                            return "Один";
                        case 2:
                            return "Десять";
                        case 3:
                            return "Сто";
                    }
                case 2:
                    switch (numberLength){
                        case 1:
                            return "Два";
                        case 2:
                            return "Двадцать";
                        case 3:
                            return "Двести";
                    }
                case 3:
                    switch (numberLength){
                        case 1:
                            return "Три";
                        case 2:
                            return "Тридцать";
                        case 3:
                            return "Тристо";
                    }
                case 4:
                    switch (numberLength){
                        case 1:
                            return "Четыре";
                        case 2:
                            return "Сорок";
                        case 3:
                            return "Четыре";
                    }
                case 5:
                    switch (numberLength){
                        case 1:
                            return "Пять";
                        case 2:
                            return "Пятьдесят";
                        case 3:
                            return "Пятьсот";
                    }
                case 6:
                    switch (numberLength){
                        case 1:
                            return "Шесть";
                        case 2:
                            return "Шестьдесят";
                        case 3:
                            return "Шестьслот";
                    }
                case 7:
                    switch (numberLength){
                        case 1:
                            return "Семь";
                        case 2:
                            return "Семьдесят";
                        case 3:
                            return "Семьсот";
                    }
                case 8:
                    switch (numberLength){
                        case 1:
                            return "Восемь";
                        case 2:
                            return "Восемьдесят";
                        case 3:
                            return "Восемьсот";
                    }
                case 9:
                    switch (numberLength){
                        case 1:
                            return "Девять";
                        case 2:
                            return "Девяносто";
                        case 3:
                            return "Девятьсот";
                    }

                default:
                    return "Введите друго число";
            }

        }


    }


}
