package com.javatasks.a_4_ts_17;

/* Найдите все двузначные числа, сумма цифр которых не меняется при умножении числа на 2, 3, 4, 5, 6, 7.
 */
public class ts_14 {
    public static void main(String[] args) {
        int[] multipletr = {2, 3, 4, 5, 6, 7};
        int sum1 = 0;
        int buffer = 0;
        int sum2 = 0;

        for (int i = 0; i < multipletr.length; i++) {
            System.out.print("Не меняется при умножении на " + multipletr[i] + ": ");
            for (int j = 10; j < 100; j++) {
                sum1 = (j % 10 + j / 10);
                buffer = (j) * multipletr[i];
                int test = buffer;
                int count = 0;
                while (test > 0) {
                    test = test / 10;
                    count++;
                }
                if (count == 3) {
                    sum2 = buffer / 100 + buffer / 10 % 10 + buffer % 10;
                } else if (count == 2) {
                    sum2 = buffer % 10 + buffer / 10;
                } else {
                    sum2 = buffer;
                }
                if (sum1 == sum2) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }

    }
}
