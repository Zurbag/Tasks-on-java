package com.javatasks.a_6_pf_13;

import java.awt.geom.Area;

/*
 Даны отрезки A, B, C и D. Для каждой тройки этих отрезков, из которых можно построить треугольник,
 напечатать площадь данного треугольника (определить процедуру, печатающую площадь треугольника со
 сторонами x, y и z, если такой треугольник существует).
 */
public class pf_6 {
    public static void main(String[] args) {
        double lengthA = (Math.random() * 1000);
        double lengthB = (Math.random() * 1000);
        double lengthC = (Math.random() * 1000);
        double lengthD = (Math.random() * 1000);


        Area(lengthA,lengthB,lengthC);
        Area(lengthA,lengthB,lengthD);
        Area(lengthA,lengthC,lengthD);
        Area(lengthB,lengthC,lengthD);

    }

    public static void Area(double a, double b, double c) {
        double area = 0;
        double p = 0;

        if (a + b > c && a + c > b && c + b > a) {
            p = 0.5*(a+b+c);
            area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Треугольник со сторонами: x = "+a+", "+", y= "+b+", z= "+c+" Имеет площадь: "+area);
        }


    }
}
