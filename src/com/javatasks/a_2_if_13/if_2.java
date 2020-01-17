package com.javatasks.a_2_if_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("x = ");
        double x = Double.parseDouble(reader.readLine());
        System.out.print("y = ");
        double y = Double.parseDouble(reader.readLine());

        compare(x,y);

    }

    public static void compare(double x, double y){
        if (x > y){
            System.out.println("х больше чем y");
        } else {
            System.out.println("y больше чем x");
        }
    }
}
