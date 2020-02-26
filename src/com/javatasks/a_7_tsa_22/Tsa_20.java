package com.javatasks.a_7_tsa_22;

import java.util.Scanner;

/*
Разработать программу поиска и печати всех "близнецов", принадлежащих заданному диапазону [N; M].
 */

/*
(3, 5), (5, 7), (11, 13), (17, 19), (29, 31), (41, 43), (59, 61), (71, 73), (101, 103), (107, 109), (137, 139),
(149, 151), (179, 181), (191, 193), (197, 199), (227, 229), (239, 241), (269, 271), (281, 283), (311, 313),
(347, 349), (419, 421), (431, 433), (461, 463), (521, 523), (569, 571), (599, 601), (617, 619),
(641, 643), (659, 661), (809, 811), (821, 823), (827, 829), (857, 859), (881, 883)
 */

public class Tsa_20 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало интервала N: ");
        double intervalStart = scanner.nextInt();
        System.out.print("Введите конец интервала M: ");
        int intervalFinish = scanner.nextInt();
        boolean isPrimeOne;
        boolean isPrimeTwo;
        int numberTwo;

        for (double i = intervalStart; i <= intervalFinish; i++) {
            isPrimeOne = isPrimeNumber(i); //Проверяем простое ли число
            if (isPrimeOne){ //Если простое то
                numberTwo =(int)i+2; // Созжаем его число близнец
                isPrimeTwo = isPrimeNumber(numberTwo); //Проверяем его число близнец
                if (isPrimeTwo){ //Если простое по показываем первое число и его число близнец
                    System.out.print("("+(int)i+", "+numberTwo+") ");
                }
            }
        }




    }
    public  static boolean isPrimeNumber(double number){
        double devider = 0;
        int temp = 0;
        int count = 0;
        for (int i = 1; i <= number ; i++) {
            devider = number/i;
            temp = (int)devider; //число приведенное к инту поможет отсечь числа у которые есть остатое
            if (devider - temp == 0){ // если остатка нет то можно счиать что делили нацело
                count++; // считаем сколько раз произошло деление нацело
            }
        }
        if (count == 2){ // Если деление нацело произошло только два раза то число простое
            return true;
        } else {
            return false;
        }
    }
}
