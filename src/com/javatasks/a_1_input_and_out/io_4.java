package com.javatasks.a_1_input_and_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Составить программу, вычисляющую расстояние L между двумя точками на плоскости,
заданных своими координатами. Если даны A(x1,y1) и B(x2,y2), то L =√︀(x1 −x2)2 + (y1 −y2)2. */
public class io_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите A(x1,y1)");
        System.out.print("x1 = ");
        int x1 = Integer.parseInt(reader.readLine());
        System.out.print("y1 = ");
        int y1 = Integer.parseInt(reader.readLine());
        System.out.println("введите B(x2,y2)");
        System.out.print("x2 = ");
        int x2 = Integer.parseInt(reader.readLine());
        System.out.print("y2 = ");
        int y2 = Integer.parseInt(reader.readLine());
        double result = Math.sqrt(Math.pow((x1 - x2), 2)) + (Math.pow((y1 - y2),2));
        System.out.println("Расстояние между двумя точками составляет: "+result+" единиц");
    }
}
