package com.javatasks.a_3_case;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Написать программу нахождения числа дней в месяце, если даны: номер месяца n, целое число a, равное 1 для високосного года и равное 0 в противном случае.
*/
public class с_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfMonth = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        String nameMonth = null;
        String leapYear = "не високосный год";

        switch (numberOfMonth){
            case (1):
                nameMonth = "Январь";
                break;
            case (2):
                nameMonth = "Февраль";
                if (a ==1){
                    leapYear = "високосный год";
                }
                break;
            case (3):
                nameMonth = "Март";
                break;
            case (4):
                nameMonth = "Апрель";
                break;
            case (5):
                nameMonth = "Май";
                break;
            case (6):
                nameMonth = "Июнь";
                break;
            case (7):
                nameMonth = "Июль";
                break;
            case (8):
                nameMonth = "Август";
                break;
            case (9):
                nameMonth = "Сентябрь";
                break;
            case (10):
                nameMonth = "Октябрь";
                break;
            case (11):
                nameMonth = "Ноябрь";
                break;
            case (12):
                nameMonth = "Декабрь";
                break;
            default:
                System.out.println("Введите номер месяца");
        }

        System.out.println("Выбран "+nameMonth+" "+leapYear);

    }
}
