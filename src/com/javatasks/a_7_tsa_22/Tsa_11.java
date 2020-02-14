package com.javatasks.a_7_tsa_22;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tsa_11 {
    public static void main(String[] args) {
        int num = 123;
        int numberLength = getNumsLength(num);
        int[] nums = getNumsArray(num, numberLength);
        System.out.println(Arrays.toString(nums));
        System.out.println(getNumbersOfOptions(num,numberLength));


    }

    public static int getNumbersOfOptions(int num, int numberLength){
        int n = numberLength;
        int x = 0;
        int result = 1;
        while (x < numberLength){
            result = result*(n - x);
            x++;
        }

        return result;
    }

    public static int getNumsLength(int num) {
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        return length;
    }

    public static int[] getNumsArray(int num, int numberLength) {
        int[] nums = new int[numberLength];
        for (int i = numberLength - 1; i >= 0; i--) {
            nums[i] = num % 10;
            num /= 10;
        }
        return nums;
    }


}
