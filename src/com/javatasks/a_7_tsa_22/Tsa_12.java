package com.javatasks.a_7_tsa_22;

/*
Самовлюбленные числа - это числа, которые равны сумме своих
цифр, возведенных в степень, равную количеству цифр в числе.
Например, 153 - самовлюбленное число, так как
153 = 13 + 53 + 33 = 1 + 125 + 27 = 153.
Также самовлюбленным числом является 8208 = 84 + 24 + 04 + 84
.
14
Найти самовлюбленные числа от 1 до 99 999
 */

public class Tsa_12 {
    public static void main(String[] args) {

        for (int i = 1; i < 100000; i++) {
            int number = i;
            int[] numbers = getAnArrayFromNumber(number);
            int y = 0;
            int z = 0;
            for (int x : numbers
            ) {
                z = (int) Math.pow(x, numbers.length);
                y += z;
            }
            if ((y - number) == 0) {
                System.out.println(number);
            }
        }

    }

    public static int[] getAnArrayFromNumber(int number) {
        int length = 0;
        int buffer = number;
        while (buffer > 0) {
            buffer /= 10;
            length++;
        }
        int[] numbers = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            numbers[i] = number % 10;
            number /= 10;
        }
        return numbers;
    }
}

