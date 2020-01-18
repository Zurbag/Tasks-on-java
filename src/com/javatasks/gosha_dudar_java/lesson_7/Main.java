package com.javatasks.gosha_dudar_java.lesson_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = false;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        isTrue = first == 51 ? true : false;

        if (first >= second || isTrue == true) {
            System.out.print("Num greated then " + second);
            System.out.println("\n");
        } else if (first == 45) {
            System.out.print("Num is equals 45");

        } else {
            System.out.print("Num is lower than " + second);

        }

        System.out.println(" ");

        switch (first) {
            case 51:
                System.out.println("Num is equals 51");
                break;
            case 52:
                System.out.println("Num is equals 52");
                break;
            case 53:
                System.out.println("Num is equals 53");
                break;
            case 54:
                System.out.println("Num is equals 54");
                break;
            default:
                System.out.println("Num is equale somesing");
        }

    }
}
