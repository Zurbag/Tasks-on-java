package com.javatasks.a_2_if_13;

import javax.swing.plaf.basic.BasicIconFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if_1 {
    public static void main(String[] args) throws IOException {
        int h,m;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты часовой стрелки");
        double f = Double.parseDouble(reader.readLine());
        if (0 <= f && f <=360){
            double hour = f/30;
            double minute = 60*(hour%1);
            System.out.println("час: "+(h = (int)hour)+" минута: "+(m = (int)minute));
        } else {
            System.out.println("Введите число от 0 до 360");
        }
    }
}
