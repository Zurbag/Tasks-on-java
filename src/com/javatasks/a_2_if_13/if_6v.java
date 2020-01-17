package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if_6v {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());

        if (a >  b){
            if (a > c){
                System.out.println(a);
            }
        } else if (b > c){
            if (b > a){
                System.out.println(b);
            }
        } else {
            System.out.println(c);
        }
    }
}
