package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Написать программу расположения чисел n1, n2, n3 в возрастающем порядке.
*/
public class if_11 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1,n2,n3,nBuffer;
        n1 = Integer.parseInt(reader.readLine());
        n2 = Integer.parseInt(reader.readLine());
        n3 = Integer.parseInt(reader.readLine());

        if (n1 > n2){
            nBuffer = n2;
            n2 = n1;
            n1 = nBuffer;
        }
        if (n2 > n3){
            nBuffer = n2;
            n2 = n3;
            n3 = nBuffer;
        }

        if (n1 > n2){
            nBuffer = n2;
            n2 = n1;
            n1 = nBuffer;
        }

        System.out.println(n1+", "+n2+ ", "+n3);
    }
}
