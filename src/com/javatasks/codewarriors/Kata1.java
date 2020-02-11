package com.javatasks.codewarriors;
/*
Convert number to reversed array of digits
 */
import java.util.Arrays;

public class Kata1 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(digitize(123456789)));
    }

    public static int[] digitize(long n) {
        long buffer = n;
        int count = 0;

        while (buffer > 0) {
            buffer /= 10;
            count++;
        }

        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (n % 10);
            n /= 10;
        }
        return array;
    }
}





