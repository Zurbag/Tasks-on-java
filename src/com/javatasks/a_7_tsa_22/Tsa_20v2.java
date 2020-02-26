package com.javatasks.a_7_tsa_22;

/*
Разработать программу поиска и печати всех "близнецов", принадлежащих заданному диапазону [N; M].
 */


/*
(3, 5), (5, 7), (11, 13), (17, 19), (29, 31), (41, 43), (59, 61), (71, 73), (101, 103), (107, 109), (137, 139),
(149, 151), (179, 181), (191, 193), (197, 199), (227, 229), (239, 241), (269, 271), (281, 283), (311, 313),
(347, 349), (419, 421), (431, 433), (461, 463), (521, 523), (569, 571), (599, 601), (617, 619),
(641, 643), (659, 661), (809, 811), (821, 823), (827, 829), (857, 859), (881, 883)
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Tsa_20v2 {
    static int numberStart;
    static int numberNext;
    static int numberFinish;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N");
        numberStart = scanner.nextInt();
        System.out.print("Введите M");
        numberFinish = scanner.nextInt();
        for (int i = numberStart; i < numberFinish; i++) {
            if (isPrimeNumber(i) == true) {
                numberNext = i + 2;
                if (isPrimeNumber(numberNext) == true) {
                    System.out.println(i + " " + numberNext);
                }
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        BigInteger integer = BigInteger.valueOf(number);
        return integer.isProbablePrime(number);
    }

}
