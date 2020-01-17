package com.javatasks.a_3_case;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Написать программу, позволяющую по номеру дня недели -
целому числу от 1 до 7 выдавать в качестве
результата количество уроков в классе в соответствующий день.
*/
public class c_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number_of_the_weak = Integer.parseInt(reader.readLine());
        int number_of_lesson = 0;
        switch (number_of_the_weak) {
            case (1):
                number_of_lesson = 5;
                break;
            case (2):
                number_of_lesson = 12;
                break;
            case (3):
                number_of_lesson = 8;
                break;
            case (4):
                number_of_lesson = 2;
                break;
            case (5):
                number_of_lesson = 3;
                break;
            case (6):
                number_of_lesson = 4;
                break;
            case (0):
                number_of_lesson = 0;
                break;
            default:
                System.out.println("Введите номер дня недели!!!");
        }
    }
}
