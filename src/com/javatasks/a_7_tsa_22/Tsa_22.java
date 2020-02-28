package com.javatasks.a_7_tsa_22;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Найти все простые числа от 1 до N, используя алгоритм "Решето Эратосфена".
 */
public class Tsa_22 {
    public static void main(String[] args) {
        int m = 1;
        int n = 30;
        int divider = 0;
        int[] array = new int[n+1];
        for (int i = m; i < array.length; i++) {
            array[i] = i;

        }
        for (int j = 2; j < array.length; j++) {
            if ((int)Math.pow(array[j],2) < array.length && array[j] != 0) {
                divider = array[j];
            } else if((int)Math.pow(array[j],2) > array.length) {
                break;
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] % divider == 0 && array[i] != divider) {
                    array[i] = 0;
                }
            }
        }

        for (int show:array
             ) {
            if (show != 0) System.out.print(show+" ");
        }




//        for (int x : array
//        ) {
//            if(x != 0){
//                System.out.print(x + " ");
//            }
//
//        }


    }
}
