package com.javatasks.a_6_pf_13;

/*
Даны координаты вершин треугольника ABC и точки O внутри него. Найти расстояние от точки O до ближайшей стороны треугольника.
 */

public class pf_1 {
    public static void main(String[] args) {


        Triandle triandle = new Triandle(3,4,5,1,1,1);
        Point point = new Point(3.5, 2.4);

        double distanceAO = distanceBetweenPoints(point.xO, point.yO, triandle.xA, triandle.yA);
        double distanceBO = distanceBetweenPoints(point.xO, point.yO, triandle.xB, triandle.yB);
        double distanceCO = distanceBetweenPoints(point.xO, point.yO, triandle.xC, triandle.yC);

        distansCompair(distanceAO, distanceBO, distanceCO );

    }

    public static class Triandle{
        double xA,yA;
        double xB,yB;
        double xC,yC;

        Triandle(double xA,double yA, double xB, double yB, double xC, double yC  ){
            this.xA = xA;
            this.yA = yA;
            this.xB = xB;
            this.yB = yB;
            this.xC = xC;
            this.yC = yC;
        }
    }

    public static class Point{
        double xO;
        double yO;

        Point(double xO, double yO){
            this.xO = xO;
            this.yO = yO;
        }
    }


    public static double distanceBetweenPoints(double xO, double yO, double xDots, double yDots) {
        double distance = Math.sqrt(Math.pow((xO - xDots), 2) + Math.pow((yO - yDots), 2));
        return distance;
    }

    public static void distansCompair(double distanceAO, double distanceBO, double distanceCO){
        if (distanceAO > distanceBO && distanceAO > distanceCO) {
            System.out.println("Точка ближе к вершине A");
        } else if (distanceBO > distanceAO && distanceBO > distanceCO) {
            System.out.println("Точка ближе к вершине B");
        } else {
            System.out.println("Точка ближе к вершине С");
        }
    }
}
