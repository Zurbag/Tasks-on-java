package com.javatasks.a_7_tsa_22;

import java.util.Arrays;
import java.util.Scanner;

/*
Вычеркнуть максимальную и минимальную цифры из натурального числа.
 */
/*
Два решения. Некрасивое закоментировал
 */

public class tsa_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int max = numberMax(number);
        int min = numberMin(number);
        int result = numberResult(number, min, max);
        System.out.print("Результат после удаления min и max цифр: " + result);

    }

    public static int numberMin(int number) {
        int max = number % 10;
        int compare;
        while (number > 0) {
            compare = number % 10;
            if (max > compare) {
                max = compare;
            }
            number /= 10;
        }
        return max;
    }

    public static int numberMax(int number) {
        int max = number % 10;
        int compare;
        while (number > 0) {
            compare = number % 10;
            if (max < compare) {
                max = compare;
            }
            number /= 10;
        }
        return max;
    }

    private static int numberResult(int number, int min, int max) {
        int x = 0;
        int numberResult = 0;
        int length = 0;
        while (number > 0) {
            if (max != number % 10 && min != number % 10) {
                x = number % 10;
                numberResult = numberResult + (x * (int) Math.pow(10, length));
                length++;
            }
            number /= 10;

        }
        return numberResult;
    }

}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        String str = scanner.nextLine();
//
//        int[] nums = new int[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            nums[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
//        }
//
//        int[] numsSort = new int[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            numsSort[i] = nums[i];
//        }
//
//        Arrays.sort(numsSort);
//        int numMin = numsSort[0];
//        int numMax = numsSort[numsSort.length - 1];
//
//        String result = "0";
//        for (int x : nums
//        ) {
//            if ((x != numMax) && (x != numMin)) {
//                result = result+x;
//            }
//        }
//
//        int res = Integer.parseInt(result);
//
//        System.out.println("После удаления минимальных и максимальных значений: "+ res);
//
//
//    }
