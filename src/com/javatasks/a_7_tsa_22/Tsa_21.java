package com.javatasks.a_7_tsa_22;
/*
Вывести на печать все совершенные числа в диапазоне от L до R.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Tsa_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите L: ");
        int numberStart = Integer.parseInt(reader.readLine());
        System.out.print("Введите R: ");
        int numberFinish = Integer.parseInt(reader.readLine());
        PerfectNumber perfectNumber = new PerfectNumber();
        System.out.println(perfectNumber.perfectNumbers(numberStart, numberFinish));
    }

    static class PerfectNumber {

        public ArrayList perfectNumbers(int numberStart, int numberFinish) {
            ArrayList numbers = new ArrayList();
            for (int i = numberStart; i < numberFinish; i++) {
                if (isPerfectNumber(i)) {
                    numbers.add(i);
                }

            }
            return numbers;
        }

        public boolean isPerfectNumber(int number) {
            int sumDivider = 0;
            double divider = 0;
            int temp;
            for (int i = 2; i <= number; i++) {
                divider = (double) number / i;
                temp = (int) divider;
                if (divider - temp == 0) {
                    sumDivider = sumDivider + (int) divider;
                }
            }
            if (sumDivider == number) {
                return true;
            } else {
                return false;
            }
        }
    }
}



