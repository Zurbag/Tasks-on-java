package com.javatasks.a_7_tsa_22;

/*
Разработать программу поиска и печати всех пар дружественных
чисел, меньших 10000.

Например:

Список делителей для 220: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 и 110, сумма делителей равна 284.
Список делителей для 284: 1, 2, 4, 71 и 142, сумма делителей равна 220.
 */
public class Tsa_19 {
    public static void main(String[] args) {
        int numberOne;
        for (int i = 0; i < 10000 ; i++) {
            numberOne = i;
            int numberTwo = summDivider(numberOne);
            int summDividerTwo = summDivider(numberTwo);

            if (numberOne == summDividerTwo && numberTwo == summDivider(numberOne)) {
                System.out.println(numberOne + " и " + numberTwo + " дружественные числа");
            }
        }

    }

    public static int summDivider(int number) {
        int summDivider = 0;
        double divider;
        int fractionСutter;
        for (int i = 2; i <= number; i++) {
            divider = (double) number / i;
            fractionСutter = (int) divider;
            if (divider - fractionСutter == 0) {
                divider = (double) number / i;
                summDivider = summDivider + (int) divider;
            }
        }
        return summDivider;
    }


}
