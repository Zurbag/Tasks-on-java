package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Даны три действительных числа. Выбрать из них те, которые принадлежат интервалу (1; 3)
*/
public class if_4 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numers = new int[3];
        for (int i = 0; i < numers.length ; i++) {
            numers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < numers.length; i++) {
            if (numers[i] <= 3 && numers[i] >= 0 ){
                System.out.println(numers[i]);
            }
        }
    }
}
